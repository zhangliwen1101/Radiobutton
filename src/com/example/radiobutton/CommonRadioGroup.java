package com.example.radiobutton;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioGroup;

public class CommonRadioGroup extends RadioGroup
{
	public CommonRadioGroup(Context context) {
		super(context);
	}

	public CommonRadioGroup(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	protected void onFinishInflate() {
		super.onFinishInflate();
		changeButtonsImages();
	}

	private void changeButtonsImages(){
		int count = super.getChildCount();
		//根据RadioButton的个数设置他们不同的样式
		if(count > 1){
			super.getChildAt(0).setBackgroundResource(R.drawable.radiobutton_left);
			for(int i=1; i < count-1; i++){
				super.getChildAt(i).setBackgroundResource(R.drawable.radiobutton_middle);
			}
			super.getChildAt(count-1).setBackgroundResource(R.drawable.radiobutton_right);
		}else if (count == 1){
			super.getChildAt(0).setBackgroundResource(R.drawable.radiobutton_single);
		}
	}
}
