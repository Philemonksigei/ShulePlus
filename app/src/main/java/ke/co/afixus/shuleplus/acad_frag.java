package ke.co.afixus.shuleplus;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class acad_frag extends Fragment {
Spinner spinner_acad;
Button button_acad_yr;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_acad, container, false);
    spinner_acad = view.findViewById(R.id.spinner_acad_yr);

        String [] academic_year;
        academic_year = getResources().getStringArray(R.array.academic_yr);
        ArrayAdapter<String> adaptercourselevel = new ArrayAdapter<String>(this.getContext(), android.R.layout.simple_spinner_item, academic_year);
        adaptercourselevel.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner_acad.setAdapter(adaptercourselevel);

        String selected_yr = spinner_acad.getSelectedItem().toString();
        //TODO use this year to query for specific year acade
        return view;
    }
}
