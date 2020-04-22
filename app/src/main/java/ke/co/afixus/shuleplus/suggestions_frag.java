package ke.co.afixus.shuleplus;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class suggestions_frag extends Fragment {
EditText suggestion;
Button button_suggestions;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_suggestions, container, false);
       suggestion = view.findViewById(R.id.suggestion_txt);
       button_suggestions = view.findViewById(R.id.button_suggestion);
        final String message = suggestion.getText().toString();

        button_suggestions.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(message.length()> 50)
               {
                   Toast.makeText(getContext(), "Sorry, the text is too long.\nPlease use at least 50 characters", Toast.LENGTH_SHORT).show();

               }
               else if (suggestion.equals("")||message.length()<1)
               {

                   Toast.makeText(getContext(), "Sorry, Empty Text", Toast.LENGTH_SHORT).show();
               }
           }
       });




       return  view;
    }
}
