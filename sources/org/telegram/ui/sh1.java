package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class sh1 extends org.telegram.ui.Components.o61 {
    public static final int f41701a = 0;

    static {
        org.telegram.ui.Components.o61.setup(new org.telegram.ui.Components.o61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.p61 p61Var, boolean z10, org.telegram.ui.Components.c71 c71Var, org.telegram.ui.Components.k71 k71Var) {
        float f7;
        int i10;
        int i11;
        int i12;
        int i13;
        th1 th1Var = (th1) view;
        int i14 = p61Var.f29733k;
        CharSequence charSequence = p61Var.f29734l;
        CharSequence charSequence2 = p61Var.f29735m;
        boolean z11 = p61Var.f29739q;
        boolean z12 = p61Var.f29740r;
        int i15 = p61Var.f29747z;
        TextView textView = th1Var.d;
        TextView textView2 = th1Var.f42016e;
        ImageView imageView = th1Var.f42017f;
        th1Var.h = z11;
        th1Var.f42018n = z12;
        ImageView imageView2 = th1Var.f42014b;
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
        th1Var.f42015c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.e6 e6Var = th1Var.f42013a;
        if (th1Var.f42018n) {
            i10 = org.telegram.ui.ActionBar.i6.f21037q7;
        } else if (th1Var.h) {
            i10 = org.telegram.ui.ActionBar.i6.f20982n6;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.G6;
        }
        int w02 = org.telegram.ui.ActionBar.i6.w0(i10, e6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
        if (th1Var.f42018n) {
            i11 = org.telegram.ui.ActionBar.i6.f21037q7;
        } else if (th1Var.h) {
            i11 = org.telegram.ui.ActionBar.i6.f20982n6;
        } else {
            i11 = org.telegram.ui.ActionBar.i6.G6;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i11, e6Var), mode));
        if (th1Var.f42018n) {
            i12 = org.telegram.ui.ActionBar.i6.f21018p7;
        } else if (th1Var.h) {
            i12 = org.telegram.ui.ActionBar.i6.f20982n6;
        } else {
            i12 = org.telegram.ui.ActionBar.i6.G6;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
        if (th1Var.f42018n) {
            i13 = org.telegram.ui.ActionBar.i6.f21018p7;
        } else if (th1Var.h) {
            i13 = org.telegram.ui.ActionBar.i6.f20982n6;
        } else {
            i13 = org.telegram.ui.ActionBar.i6.f21181y6;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(i13, e6Var));
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new th1(context, e6Var);
    }
}
