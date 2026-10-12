package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class uh1 extends org.telegram.ui.Components.t61 {
    public static final int f42526a = 0;

    static {
        org.telegram.ui.Components.t61.setup(new org.telegram.ui.Components.t61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.u61 u61Var, boolean z10, org.telegram.ui.Components.h71 h71Var, org.telegram.ui.Components.p71 p71Var) {
        float f7;
        int i10;
        int i11;
        int i12;
        int i13;
        vh1 vh1Var = (vh1) view;
        int i14 = u61Var.f31070k;
        CharSequence charSequence = u61Var.f31071l;
        CharSequence charSequence2 = u61Var.f31072m;
        boolean z11 = u61Var.f31076q;
        boolean z12 = u61Var.f31077r;
        int i15 = u61Var.f31084z;
        TextView textView = vh1Var.d;
        TextView textView2 = vh1Var.f42801e;
        ImageView imageView = vh1Var.f42802f;
        vh1Var.h = z11;
        vh1Var.f42803n = z12;
        ImageView imageView2 = vh1Var.f42799b;
        imageView2.setImageResource(i14);
        int i16 = 8;
        if (i15 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i15);
        } else {
            imageView.setVisibility(8);
        }
        textView.setText(charSequence);
        textView2.setText(charSequence2);
        if (!TextUtils.isEmpty(charSequence2)) {
            i16 = 0;
        }
        textView2.setVisibility(i16);
        if (TextUtils.isEmpty(charSequence2)) {
            f7 = 15.0f;
        } else {
            f7 = 10.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        vh1Var.f42800c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.c6 c6Var = vh1Var.f42798a;
        if (vh1Var.f42803n) {
            i10 = org.telegram.ui.ActionBar.h6.f20800q7;
        } else if (vh1Var.h) {
            i10 = org.telegram.ui.ActionBar.h6.f20745n6;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.G6;
        }
        int w02 = org.telegram.ui.ActionBar.h6.w0(i10, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
        if (vh1Var.f42803n) {
            i11 = org.telegram.ui.ActionBar.h6.f20800q7;
        } else if (vh1Var.h) {
            i11 = org.telegram.ui.ActionBar.h6.f20745n6;
        } else {
            i11 = org.telegram.ui.ActionBar.h6.G6;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, c6Var), mode));
        if (vh1Var.f42803n) {
            i12 = org.telegram.ui.ActionBar.h6.f20781p7;
        } else if (vh1Var.h) {
            i12 = org.telegram.ui.ActionBar.h6.f20745n6;
        } else {
            i12 = org.telegram.ui.ActionBar.h6.G6;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, c6Var));
        if (vh1Var.f42803n) {
            i13 = org.telegram.ui.ActionBar.h6.f20781p7;
        } else if (vh1Var.h) {
            i13 = org.telegram.ui.ActionBar.h6.f20745n6;
        } else {
            i13 = org.telegram.ui.ActionBar.h6.f20946y6;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i13, c6Var));
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.wm0 wm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new vh1(context, c6Var);
    }
}
