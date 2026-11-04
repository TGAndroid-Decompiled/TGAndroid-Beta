package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
public final class xa1 extends org.telegram.ui.Components.q31 {
    public static final int f51902b = 0;

    static {
        org.telegram.ui.Components.q31.h(new org.telegram.ui.Components.q31());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.r31 r31Var, boolean z10, org.telegram.ui.Components.f41 f41Var, org.telegram.ui.Components.l41 l41Var) {
        float f10;
        ya1 ya1Var = (ya1) view;
        int i3 = r31Var.f37626k;
        CharSequence charSequence = r31Var.f37627l;
        CharSequence charSequence2 = r31Var.f37628m;
        boolean z11 = r31Var.f37632q;
        boolean z12 = r31Var.f37633r;
        int i10 = r31Var.f37640z;
        TextView textView = ya1Var.f52242e;
        ImageView imageView = ya1Var.f52243f;
        ya1Var.h = z11;
        ya1Var.f52244n = z12;
        ya1Var.f52240b.setImageResource(i3);
        int i11 = 8;
        if (i10 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i10);
        } else {
            imageView.setVisibility(8);
        }
        ya1Var.d.setText(charSequence);
        textView.setText(charSequence2);
        if (!TextUtils.isEmpty(charSequence2)) {
            i11 = 0;
        }
        textView.setVisibility(i11);
        if (TextUtils.isEmpty(charSequence2)) {
            f10 = 15.0f;
        } else {
            f10 = 10.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        ya1Var.f52241c.setPadding(0, L, 0, L);
        ya1Var.updateColors();
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new ya1(context, e6Var);
    }
}
