package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class yh1 extends org.telegram.ui.Components.k61 {
    public static final int f42169a = 0;

    static {
        org.telegram.ui.Components.k61.setup(new org.telegram.ui.Components.k61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.l61 l61Var, boolean z10, org.telegram.ui.Components.z61 z61Var, org.telegram.ui.Components.h71 h71Var) {
        float f7;
        int i10;
        int i11;
        int i12;
        int i13;
        zh1 zh1Var = (zh1) view;
        int i14 = l61Var.f26953k;
        CharSequence charSequence = l61Var.f26954l;
        CharSequence charSequence2 = l61Var.f26955m;
        boolean z11 = l61Var.f26959q;
        boolean z12 = l61Var.f26960r;
        int i15 = l61Var.f26967z;
        TextView textView = zh1Var.d;
        TextView textView2 = zh1Var.e;
        ImageView imageView = zh1Var.f42627f;
        zh1Var.h = z11;
        zh1Var.f42628n = z12;
        ImageView imageView2 = zh1Var.f42625b;
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
        zh1Var.f42626c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.c6 c6Var = zh1Var.f42624a;
        if (zh1Var.f42628n) {
            i10 = org.telegram.ui.ActionBar.g6.f20139q7;
        } else if (zh1Var.h) {
            i10 = org.telegram.ui.ActionBar.g6.f20084n6;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.G6;
        }
        int w02 = org.telegram.ui.ActionBar.g6.w0(i10, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
        if (zh1Var.f42628n) {
            i11 = org.telegram.ui.ActionBar.g6.f20139q7;
        } else if (zh1Var.h) {
            i11 = org.telegram.ui.ActionBar.g6.f20084n6;
        } else {
            i11 = org.telegram.ui.ActionBar.g6.G6;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i11, c6Var), mode));
        if (zh1Var.f42628n) {
            i12 = org.telegram.ui.ActionBar.g6.f20122p7;
        } else if (zh1Var.h) {
            i12 = org.telegram.ui.ActionBar.g6.f20084n6;
        } else {
            i12 = org.telegram.ui.ActionBar.g6.G6;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i12, c6Var));
        if (zh1Var.f42628n) {
            i13 = org.telegram.ui.ActionBar.g6.f20122p7;
        } else if (zh1Var.h) {
            i13 = org.telegram.ui.ActionBar.g6.f20084n6;
        } else {
            i13 = org.telegram.ui.ActionBar.g6.f20288y6;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i13, c6Var));
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new zh1(context, c6Var);
    }
}
