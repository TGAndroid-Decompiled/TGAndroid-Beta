package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
public final class yc1 extends org.telegram.ui.Components.a51 {
    public static final int f43639b = 0;

    static {
        org.telegram.ui.Components.a51.h(new org.telegram.ui.Components.a51());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.b51 b51Var, boolean z10, org.telegram.ui.Components.q51 q51Var, org.telegram.ui.Components.v51 v51Var) {
        float f7;
        zc1 zc1Var = (zc1) view;
        int i10 = b51Var.f24642k;
        CharSequence charSequence = b51Var.f24643l;
        CharSequence charSequence2 = b51Var.f24644m;
        boolean z11 = b51Var.f24648q;
        boolean z12 = b51Var.f24649r;
        int i11 = b51Var.f24656z;
        TextView textView = zc1Var.e;
        ImageView imageView = zc1Var.f43929f;
        zc1Var.h = z11;
        zc1Var.f43930n = z12;
        zc1Var.f43927b.setImageResource(i10);
        int i12 = 8;
        if (i11 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i11);
        } else {
            imageView.setVisibility(8);
        }
        zc1Var.d.setText(charSequence);
        textView.setText(charSequence2);
        if (!TextUtils.isEmpty(charSequence2)) {
            i12 = 0;
        }
        textView.setVisibility(i12);
        if (TextUtils.isEmpty(charSequence2)) {
            f7 = 15.0f;
        } else {
            f7 = 10.0f;
        }
        int L = org.telegram.messenger.i0.L(f7);
        zc1Var.f43928c.setPadding(0, L, 0, L);
        zc1Var.updateColors();
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new zc1(context, p6Var);
    }
}
