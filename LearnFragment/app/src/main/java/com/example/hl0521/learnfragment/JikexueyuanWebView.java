package com.example.hl0521.learnfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by HL0521 on 2015/10/1.
 */
public class JikexueyuanWebView extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.jikexueyuan_webview,container,false);

        WebView wv = (WebView) root.findViewById(R.id.wv);
        wv.loadUrl("http://www.jikexueyuan.com");
        return root;
    }
}
