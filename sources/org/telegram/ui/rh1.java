package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class rh1 extends org.telegram.ui.Components.g51 {
    public static final int f40178a = 0;

    static {
        org.telegram.ui.Components.g51.setup(new org.telegram.ui.Components.g51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h51 h51Var, boolean z10, org.telegram.ui.Components.v51 v51Var, org.telegram.ui.Components.d61 d61Var) {
        float f7;
        int i10;
        int i11;
        int i12;
        int i13;
        sh1 sh1Var = (sh1) view;
        int i14 = h51Var.f26593k;
        CharSequence charSequence = h51Var.f26594l;
        CharSequence charSequence2 = h51Var.f26595m;
        boolean z11 = h51Var.f26599q;
        boolean z12 = h51Var.f26600r;
        int i15 = h51Var.f26607z;
        TextView textView = sh1Var.d;
        TextView textView2 = sh1Var.f40456e;
        ImageView imageView = sh1Var.f40457f;
        sh1Var.h = z11;
        sh1Var.f40458n = z12;
        ImageView imageView2 = sh1Var.f40454b;
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
        sh1Var.f40455c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.f6 f6Var = sh1Var.f40453a;
        if (sh1Var.f40458n) {
            i10 = org.telegram.ui.ActionBar.j6.f20898q7;
        } else if (sh1Var.h) {
            i10 = org.telegram.ui.ActionBar.j6.f20846n6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.G6;
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        if (sh1Var.f40458n) {
            i11 = org.telegram.ui.ActionBar.j6.f20898q7;
        } else if (sh1Var.h) {
            i11 = org.telegram.ui.ActionBar.j6.f20846n6;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.G6;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), mode));
        if (sh1Var.f40458n) {
            i12 = org.telegram.ui.ActionBar.j6.f20880p7;
        } else if (sh1Var.h) {
            i12 = org.telegram.ui.ActionBar.j6.f20846n6;
        } else {
            i12 = org.telegram.ui.ActionBar.j6.G6;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        if (sh1Var.f40458n) {
            i13 = org.telegram.ui.ActionBar.j6.f20880p7;
        } else if (sh1Var.h) {
            i13 = org.telegram.ui.ActionBar.j6.f20846n6;
        } else {
            i13 = org.telegram.ui.ActionBar.j6.f21042y6;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new sh1(context, f6Var);
    }
}
