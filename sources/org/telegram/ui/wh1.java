package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class wh1 extends org.telegram.ui.Components.u51 {
    public static final int f38206a = 0;

    static {
        org.telegram.ui.Components.u51.setup(new org.telegram.ui.Components.u51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.v51 v51Var, boolean z10, org.telegram.ui.Components.j61 j61Var, org.telegram.ui.Components.r61 r61Var) {
        float f7;
        int i10;
        int i11;
        int i12;
        int i13;
        xh1 xh1Var = (xh1) view;
        int i14 = v51Var.f27828k;
        CharSequence charSequence = v51Var.f27829l;
        CharSequence charSequence2 = v51Var.f27830m;
        boolean z11 = v51Var.f27834q;
        boolean z12 = v51Var.f27835r;
        int i15 = v51Var.f27842z;
        TextView textView = xh1Var.d;
        TextView textView2 = xh1Var.e;
        ImageView imageView = xh1Var.f38756f;
        xh1Var.h = z11;
        xh1Var.f38757n = z12;
        ImageView imageView2 = xh1Var.f38754b;
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
        xh1Var.f38755c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.f6 f6Var = xh1Var.f38753a;
        if (xh1Var.f38757n) {
            i10 = org.telegram.ui.ActionBar.j6.f18162q7;
        } else if (xh1Var.h) {
            i10 = org.telegram.ui.ActionBar.j6.f18110n6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.G6;
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        if (xh1Var.f38757n) {
            i11 = org.telegram.ui.ActionBar.j6.f18162q7;
        } else if (xh1Var.h) {
            i11 = org.telegram.ui.ActionBar.j6.f18110n6;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.G6;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), mode));
        if (xh1Var.f38757n) {
            i12 = org.telegram.ui.ActionBar.j6.f18144p7;
        } else if (xh1Var.h) {
            i12 = org.telegram.ui.ActionBar.j6.f18110n6;
        } else {
            i12 = org.telegram.ui.ActionBar.j6.G6;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        if (xh1Var.f38757n) {
            i13 = org.telegram.ui.ActionBar.j6.f18144p7;
        } else if (xh1Var.h) {
            i13 = org.telegram.ui.ActionBar.j6.f18110n6;
        } else {
            i13 = org.telegram.ui.ActionBar.j6.f18306y6;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new xh1(context, f6Var);
    }
}
