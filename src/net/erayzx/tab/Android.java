package net.erayzx.tab;

import net.erayzx.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Android extends Fragment {
	@Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
	 
	        View android = inflater.inflate(R.layout.android_frag, container, false);
	        ((TextView)android.findViewById(R.id.textView)).setText("Yolo");
	        return android;
}}
