package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class xg1 extends org.telegram.ui.Components.h51 {
    public static final int f39919a = 0;

    static {
        org.telegram.ui.Components.h51.setup(new org.telegram.ui.Components.h51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z4, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.g61 g61Var) {
        float f10;
        int i10;
        int i11;
        int i12;
        int i13;
        yg1 yg1Var = (yg1) view;
        int i14 = i51Var.f25564k;
        CharSequence charSequence = i51Var.f25565l;
        CharSequence charSequence2 = i51Var.f25566m;
        boolean z10 = i51Var.f25570q;
        boolean z11 = i51Var.f25571r;
        int i15 = i51Var.f25578z;
        TextView textView = yg1Var.d;
        TextView textView2 = yg1Var.e;
        ImageView imageView = yg1Var.f40523f;
        yg1Var.h = z10;
        yg1Var.f40524n = z11;
        ImageView imageView2 = yg1Var.f40521b;
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
            f10 = 15.0f;
        } else {
            f10 = 10.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        yg1Var.f40522c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.f6 f6Var = yg1Var.f40520a;
        if (yg1Var.f40524n) {
            i10 = org.telegram.ui.ActionBar.j6.f20141q7;
        } else if (yg1Var.h) {
            i10 = org.telegram.ui.ActionBar.j6.f20085n6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.G6;
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        if (yg1Var.f40524n) {
            i11 = org.telegram.ui.ActionBar.j6.f20141q7;
        } else if (yg1Var.h) {
            i11 = org.telegram.ui.ActionBar.j6.f20085n6;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.G6;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), mode));
        if (yg1Var.f40524n) {
            i12 = org.telegram.ui.ActionBar.j6.f20122p7;
        } else if (yg1Var.h) {
            i12 = org.telegram.ui.ActionBar.j6.f20085n6;
        } else {
            i12 = org.telegram.ui.ActionBar.j6.G6;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        if (yg1Var.f40524n) {
            i13 = org.telegram.ui.ActionBar.j6.f20122p7;
        } else if (yg1Var.h) {
            i13 = org.telegram.ui.ActionBar.j6.f20085n6;
        } else {
            i13 = org.telegram.ui.ActionBar.j6.f20281y6;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new yg1(context, f6Var);
    }
}
