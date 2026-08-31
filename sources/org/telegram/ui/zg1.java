package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class zg1 extends org.telegram.ui.Components.i51 {
    public static final int f43935a = 0;

    static {
        org.telegram.ui.Components.i51.setup(new org.telegram.ui.Components.i51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.j51 j51Var, boolean z4, org.telegram.ui.Components.x51 x51Var, org.telegram.ui.Components.i61 i61Var) {
        float f10;
        int i10;
        int i11;
        int i12;
        int i13;
        ah1 ah1Var = (ah1) view;
        int i14 = j51Var.f28013k;
        CharSequence charSequence = j51Var.f28014l;
        CharSequence charSequence2 = j51Var.f28015m;
        boolean z10 = j51Var.f28019q;
        boolean z11 = j51Var.f28020r;
        int i15 = j51Var.f28027z;
        TextView textView = ah1Var.d;
        TextView textView2 = ah1Var.f35184e;
        ImageView imageView = ah1Var.f35185f;
        ah1Var.h = z10;
        ah1Var.f35186n = z11;
        ImageView imageView2 = ah1Var.f35182b;
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
        ah1Var.f35183c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.g6 g6Var = ah1Var.f35181a;
        if (ah1Var.f35186n) {
            i10 = org.telegram.ui.ActionBar.k6.f21895q7;
        } else if (ah1Var.h) {
            i10 = org.telegram.ui.ActionBar.k6.f21839n6;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.G6;
        }
        int v02 = org.telegram.ui.ActionBar.k6.v0(i10, g6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        if (ah1Var.f35186n) {
            i11 = org.telegram.ui.ActionBar.k6.f21895q7;
        } else if (ah1Var.h) {
            i11 = org.telegram.ui.ActionBar.k6.f21839n6;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.G6;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i11, g6Var), mode));
        if (ah1Var.f35186n) {
            i12 = org.telegram.ui.ActionBar.k6.f21876p7;
        } else if (ah1Var.h) {
            i12 = org.telegram.ui.ActionBar.k6.f21839n6;
        } else {
            i12 = org.telegram.ui.ActionBar.k6.G6;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i12, g6Var));
        if (ah1Var.f35186n) {
            i13 = org.telegram.ui.ActionBar.k6.f21876p7;
        } else if (ah1Var.h) {
            i13 = org.telegram.ui.ActionBar.k6.f21839n6;
        } else {
            i13 = org.telegram.ui.ActionBar.k6.f22036y6;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(i13, g6Var));
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new ah1(context, g6Var);
    }
}
