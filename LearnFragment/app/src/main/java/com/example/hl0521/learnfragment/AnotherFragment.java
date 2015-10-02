package com.example.hl0521.learnfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by HL0521 on 2015/9/13.
 */
public class AnotherFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        System.out.println("AnotherFragment_onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        System.out.println("AnotherFragment_onCreateView");
        View root = inflater.inflate(R.layout.fragment_another,container,false);

        root.findViewById(R.id.btnBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().popBackStack();
            }
        });

        return root;
    }

    @Override
    public void onPause() {
        super.onPause();

        System.out.println("AnotherFragment_onPause");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        System.out.println("AnotherFragment_onDestoryView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        System.out.println("AnotherFragment_onDestroy");
    }
}
