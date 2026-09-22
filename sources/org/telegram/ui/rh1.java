package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class rh1 extends org.telegram.ui.Components.h51 {
    public static final int f37137a = 0;

    static {
        org.telegram.ui.Components.h51.setup(new org.telegram.ui.Components.h51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z10, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.e61 e61Var) {
        float f7;
        int i10;
        int i11;
        int i12;
        int i13;
        sh1 sh1Var = (sh1) view;
        int i14 = i51Var.f24899k;
        CharSequence charSequence = i51Var.f24900l;
        CharSequence charSequence2 = i51Var.f24901m;
        boolean z11 = i51Var.f24905q;
        boolean z12 = i51Var.f24906r;
        int i15 = i51Var.f24913z;
        TextView textView = sh1Var.d;
        TextView textView2 = sh1Var.e;
        ImageView imageView = sh1Var.f37404f;
        sh1Var.h = z11;
        sh1Var.f37405n = z12;
        ImageView imageView2 = sh1Var.f37402b;
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
        sh1Var.f37403c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.e6 e6Var = sh1Var.f37401a;
        if (sh1Var.f37405n) {
            i10 = org.telegram.ui.ActionBar.i6.f19071q7;
        } else if (sh1Var.h) {
            i10 = org.telegram.ui.ActionBar.i6.f19018n6;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.G6;
        }
        int v02 = org.telegram.ui.ActionBar.i6.v0(i10, e6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        if (sh1Var.f37405n) {
            i11 = org.telegram.ui.ActionBar.i6.f19071q7;
        } else if (sh1Var.h) {
            i11 = org.telegram.ui.ActionBar.i6.f19018n6;
        } else {
            i11 = org.telegram.ui.ActionBar.i6.G6;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i11, e6Var), mode));
        if (sh1Var.f37405n) {
            i12 = org.telegram.ui.ActionBar.i6.f19053p7;
        } else if (sh1Var.h) {
            i12 = org.telegram.ui.ActionBar.i6.f19018n6;
        } else {
            i12 = org.telegram.ui.ActionBar.i6.G6;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i12, e6Var));
        if (sh1Var.f37405n) {
            i13 = org.telegram.ui.ActionBar.i6.f19053p7;
        } else if (sh1Var.h) {
            i13 = org.telegram.ui.ActionBar.i6.f19018n6;
        } else {
            i13 = org.telegram.ui.ActionBar.i6.f19215y6;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.v0(i13, e6Var));
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new sh1(context, e6Var);
    }
}
