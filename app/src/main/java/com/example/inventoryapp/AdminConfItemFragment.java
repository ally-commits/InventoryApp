package com.example.inventoryapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AdminConfItemFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AdminConfItemFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AdminConfItemFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AdminConfItemFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AdminConfItemFragment newInstance(String param1, String param2) {
        AdminConfItemFragment fragment = new AdminConfItemFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    String[] categories = {"Paper", "Books","Pen","Pencil"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_admin_conf_item, container, false);
        Spinner spinElement = view.findViewById(R.id.spinner);
        Button btn = view.findViewById(R.id.add_item);

        ArrayAdapter arrayAdap = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item, categories);
        arrayAdap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinElement.setAdapter(arrayAdap);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((AdminMain) getActivity()).loadFragment(new AdminItemListFragment());
            }
        });

        return view;
    }
}