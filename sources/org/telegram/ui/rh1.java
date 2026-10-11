package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class rh1 extends org.telegram.ui.Components.p61 {
    public static final int f41480a = 0;

    static {
        org.telegram.ui.Components.p61.setup(new org.telegram.ui.Components.p61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.q61 q61Var, boolean z10, org.telegram.ui.Components.d71 d71Var, org.telegram.ui.Components.l71 l71Var) {
        float f7;
        int i10;
        int i11;
        int i12;
        int i13;
        sh1 sh1Var = (sh1) view;
        int i14 = q61Var.f30166k;
        CharSequence charSequence = q61Var.f30167l;
        CharSequence charSequence2 = q61Var.f30168m;
        boolean z11 = q61Var.f30172q;
        boolean z12 = q61Var.f30173r;
        int i15 = q61Var.f30180z;
        TextView textView = sh1Var.d;
        TextView textView2 = sh1Var.f41785e;
        ImageView imageView = sh1Var.f41786f;
        sh1Var.h = z11;
        sh1Var.f41787n = z12;
        ImageView imageView2 = sh1Var.f41783b;
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
        sh1Var.f41784c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.d6 d6Var = sh1Var.f41782a;
        if (sh1Var.f41787n) {
            i10 = org.telegram.ui.ActionBar.h6.f21062q7;
        } else if (sh1Var.h) {
            i10 = org.telegram.ui.ActionBar.h6.f21007n6;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.G6;
        }
        int w02 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
        if (sh1Var.f41787n) {
            i11 = org.telegram.ui.ActionBar.h6.f21062q7;
        } else if (sh1Var.h) {
            i11 = org.telegram.ui.ActionBar.h6.f21007n6;
        } else {
            i11 = org.telegram.ui.ActionBar.h6.G6;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, d6Var), mode));
        if (sh1Var.f41787n) {
            i12 = org.telegram.ui.ActionBar.h6.f21043p7;
        } else if (sh1Var.h) {
            i12 = org.telegram.ui.ActionBar.h6.f21007n6;
        } else {
            i12 = org.telegram.ui.ActionBar.h6.G6;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        if (sh1Var.f41787n) {
            i13 = org.telegram.ui.ActionBar.h6.f21043p7;
        } else if (sh1Var.h) {
            i13 = org.telegram.ui.ActionBar.h6.f21007n6;
        } else {
            i13 = org.telegram.ui.ActionBar.h6.f21207y6;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new sh1(context, d6Var);
    }
}
