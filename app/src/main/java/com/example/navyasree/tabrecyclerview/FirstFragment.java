package com.example.navyasree.tabrecyclerview;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    RecyclerView recyclerView;
    String[] names={"Apple","Orange","Mango",};
    int[] images={R.drawable.apple,R.drawable.orange,R.drawable.mango};
    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_first, container, false);
        recyclerView=v.findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new RecyclerAdapter((MainActivity) getActivity(),names,images));

        return v;


    }

}
