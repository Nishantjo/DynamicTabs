package info.androidhive.materialtabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import info.androidhive.materialtabs.R;


public class OneFragment extends Fragment{
    private static final String ARG_SECTION_NUMBER = "section_number";
    private int sectionNumber;
        // Required empty public constructor

    public static OneFragment newInstance(int sectionNumber) {
        OneFragment fragment = new OneFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,

                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_one, container, false);

        sectionNumber = getArguments().getInt(ARG_SECTION_NUMBER);
        TextView textView = (TextView) rootView.findViewById(R.id.txtTabItemNumber);
        textView.setText("TAB " + sectionNumber);
        return rootView;
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_one, container, false);
    }

}
