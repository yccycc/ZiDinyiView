package com.yctech.zidinyiview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class MyLinearLayout extends LinearLayout{
    private Button upBtn;
    private Button downBtn;
    private String upBtnText;
    private String downBtnText;
    private LayoutParams upBtnlayoutParams;
    private LayoutParams downBtnlayoutParams;
    public MyLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        setOrientation(LinearLayout.HORIZONTAL);
        upBtn = new Button(context);
        downBtn = new Button(context);
        TypedArray typedArray = context.obtainStyledAttributes(attrs,R.styleable.mycustom);
        upBtnText = typedArray.getString(R.styleable.mycustom_upBtnText);
        upBtn.setText(upBtnText);
        downBtnText = typedArray.getString(R.styleable.mycustom_downBtnText);
        downBtn.setText(downBtnText);
        downBtnText = typedArray.getString(R.styleable.mycustom_downBtnText);
        upBtnlayoutParams = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,60);
        //upBtnlayoutParams.topMargin=30;
        addView(upBtn,upBtnlayoutParams);
        downBtnlayoutParams = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,60);
        addView(downBtn,downBtnlayoutParams);
    }
}
