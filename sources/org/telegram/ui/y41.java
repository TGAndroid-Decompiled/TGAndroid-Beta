package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class y41 extends org.telegram.ui.Components.a51 {
    static {
        org.telegram.ui.Components.a51.h(new org.telegram.ui.Components.a51());
    }

    public static org.telegram.ui.Components.b51 i(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.b51 K = org.telegram.ui.Components.b51.K(y41.class);
        K.d = i10;
        K.f24642k = i13;
        K.f24643l = charSequence;
        K.f24644m = charSequence2;
        K.f24645n = charSequence3;
        K.B = (i11 & 4294967295L) | (i12 << 32);
        return K;
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.b51 b51Var, boolean z10, org.telegram.ui.Components.q51 q51Var, org.telegram.ui.Components.v51 v51Var) {
        boolean z11;
        int i10;
        float f7;
        long j10 = b51Var.B;
        int i11 = (int) j10;
        int i12 = (int) (j10 >>> 32);
        z41 z41Var = (z41) view;
        int i13 = b51Var.f24642k;
        CharSequence charSequence = b51Var.f24643l;
        CharSequence charSequence2 = b51Var.f24644m;
        CharSequence charSequence3 = b51Var.f24645n;
        TextView textView = z41Var.e;
        TextView textView2 = z41Var.f43823f;
        int i14 = 0;
        if (i11 == 0 && i12 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        z41Var.f43824n = z11;
        FrameLayout frameLayout = z41Var.f43822c;
        if (i13 != 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        float f10 = 0.0f;
        if (i13 == 0) {
            f7 = org.telegram.messenger.i0.L(2.0f);
        } else {
            f7 = 0.0f;
        }
        textView.setTranslationX(f7);
        if (i13 == 0) {
            f10 = org.telegram.messenger.i0.L(2.0f);
        }
        textView2.setTranslationX(f10);
        z41Var.f43821b.b(i11, i12);
        z41Var.d.setImageResource(i13);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        z41Var.f43825r = !isEmpty;
        if (isEmpty) {
            i14 = 8;
        }
        textView2.setVisibility(i14);
        textView2.setText(charSequence2);
        z41Var.setValue(charSequence3);
        z41Var.updateColors();
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new z41(context, p6Var);
    }
}
