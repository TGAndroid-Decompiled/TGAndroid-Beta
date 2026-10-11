package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class rh1 extends org.telegram.ui.Components.q61 {
    public static final int f41446a = 0;

    static {
        org.telegram.ui.Components.q61.setup(new org.telegram.ui.Components.q61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.r61 r61Var, boolean z10, org.telegram.ui.Components.e71 e71Var, org.telegram.ui.Components.m71 m71Var) {
        float f7;
        int i10;
        int i11;
        int i12;
        int i13;
        sh1 sh1Var = (sh1) view;
        int i14 = r61Var.f30360k;
        CharSequence charSequence = r61Var.f30361l;
        CharSequence charSequence2 = r61Var.f30362m;
        boolean z11 = r61Var.f30366q;
        boolean z12 = r61Var.f30367r;
        int i15 = r61Var.f30374z;
        TextView textView = sh1Var.d;
        TextView textView2 = sh1Var.f41751e;
        ImageView imageView = sh1Var.f41752f;
        sh1Var.h = z11;
        sh1Var.f41753n = z12;
        ImageView imageView2 = sh1Var.f41749b;
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
        sh1Var.f41750c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.d6 d6Var = sh1Var.f41748a;
        if (sh1Var.f41753n) {
            i10 = org.telegram.ui.ActionBar.h6.f21026q7;
        } else if (sh1Var.h) {
            i10 = org.telegram.ui.ActionBar.h6.f20971n6;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.G6;
        }
        int w02 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
        if (sh1Var.f41753n) {
            i11 = org.telegram.ui.ActionBar.h6.f21026q7;
        } else if (sh1Var.h) {
            i11 = org.telegram.ui.ActionBar.h6.f20971n6;
        } else {
            i11 = org.telegram.ui.ActionBar.h6.G6;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, d6Var), mode));
        if (sh1Var.f41753n) {
            i12 = org.telegram.ui.ActionBar.h6.f21007p7;
        } else if (sh1Var.h) {
            i12 = org.telegram.ui.ActionBar.h6.f20971n6;
        } else {
            i12 = org.telegram.ui.ActionBar.h6.G6;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        if (sh1Var.f41753n) {
            i13 = org.telegram.ui.ActionBar.h6.f21007p7;
        } else if (sh1Var.h) {
            i13 = org.telegram.ui.ActionBar.h6.f20971n6;
        } else {
            i13 = org.telegram.ui.ActionBar.h6.f21171y6;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.sm0 sm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new sh1(context, d6Var);
    }
}
