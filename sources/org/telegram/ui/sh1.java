package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class sh1 extends org.telegram.ui.Components.p61 {
    public static final int f41747a = 0;

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
        th1 th1Var = (th1) view;
        int i14 = q61Var.f30062k;
        CharSequence charSequence = q61Var.f30063l;
        CharSequence charSequence2 = q61Var.f30064m;
        boolean z11 = q61Var.f30068q;
        boolean z12 = q61Var.f30069r;
        int i15 = q61Var.f30076z;
        TextView textView = th1Var.d;
        TextView textView2 = th1Var.f42062e;
        ImageView imageView = th1Var.f42063f;
        th1Var.h = z11;
        th1Var.f42064n = z12;
        ImageView imageView2 = th1Var.f42060b;
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
        th1Var.f42061c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.e6 e6Var = th1Var.f42059a;
        if (th1Var.f42064n) {
            i10 = org.telegram.ui.ActionBar.i6.f21041q7;
        } else if (th1Var.h) {
            i10 = org.telegram.ui.ActionBar.i6.f20986n6;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.G6;
        }
        int w02 = org.telegram.ui.ActionBar.i6.w0(i10, e6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
        if (th1Var.f42064n) {
            i11 = org.telegram.ui.ActionBar.i6.f21041q7;
        } else if (th1Var.h) {
            i11 = org.telegram.ui.ActionBar.i6.f20986n6;
        } else {
            i11 = org.telegram.ui.ActionBar.i6.G6;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i11, e6Var), mode));
        if (th1Var.f42064n) {
            i12 = org.telegram.ui.ActionBar.i6.f21022p7;
        } else if (th1Var.h) {
            i12 = org.telegram.ui.ActionBar.i6.f20986n6;
        } else {
            i12 = org.telegram.ui.ActionBar.i6.G6;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
        if (th1Var.f42064n) {
            i13 = org.telegram.ui.ActionBar.i6.f21022p7;
        } else if (th1Var.h) {
            i13 = org.telegram.ui.ActionBar.i6.f20986n6;
        } else {
            i13 = org.telegram.ui.ActionBar.i6.f21185y6;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(i13, e6Var));
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new th1(context, e6Var);
    }
}
