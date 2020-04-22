package ke.co.afixus.shuleplus;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class std_frag extends Fragment {
Button testing_button;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_std, container, false);
        //TODO Pass admission number from this frag to the nav activity,
        // to be used in
        // querying the specific student info

        testing_button = view.findViewById(R.id.testing_btn1);
        testing_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.addToBackStack(null);
                ft.add(R.id.fragment_main_std, new nav_frag());
                ft.commit();

                testing_button.setVisibility(View.GONE);
            }
        });






       return  view;
    }
}
