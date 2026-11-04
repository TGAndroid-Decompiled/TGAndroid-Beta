package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class y21 extends org.telegram.ui.Components.q31 {
    static {
        org.telegram.ui.Components.q31.h(new org.telegram.ui.Components.q31());
    }

    public static org.telegram.ui.Components.r31 i(int i3, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.r31 K = org.telegram.ui.Components.r31.K(y21.class);
        K.d = i3;
        K.f37626k = i12;
        K.f37627l = charSequence;
        K.f37628m = charSequence2;
        K.f37629n = charSequence3;
        K.B = (i10 & 4294967295L) | (i11 << 32);
        return K;
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.r31 r31Var, boolean z10, org.telegram.ui.Components.f41 f41Var, org.telegram.ui.Components.l41 l41Var) {
        boolean z11;
        int i3;
        float f10;
        long j10 = r31Var.B;
        int i10 = (int) j10;
        int i11 = (int) (j10 >>> 32);
        z21 z21Var = (z21) view;
        int i12 = r31Var.f37626k;
        CharSequence charSequence = r31Var.f37627l;
        CharSequence charSequence2 = r31Var.f37628m;
        CharSequence charSequence3 = r31Var.f37629n;
        TextView textView = z21Var.f52512e;
        TextView textView2 = z21Var.f52513f;
        int i13 = 0;
        if (i10 == 0 && i11 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        z21Var.f52514n = z11;
        FrameLayout frameLayout = z21Var.f52511c;
        if (i12 != 0) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        frameLayout.setVisibility(i3);
        float f11 = 0.0f;
        if (i12 == 0) {
            f10 = org.telegram.messenger.g0.L(2.0f);
        } else {
            f10 = 0.0f;
        }
        textView.setTranslationX(f10);
        if (i12 == 0) {
            f11 = org.telegram.messenger.g0.L(2.0f);
        }
        textView2.setTranslationX(f11);
        z21Var.f52510b.b(i10, i11);
        z21Var.d.setImageResource(i12);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        z21Var.f52515r = !isEmpty;
        if (isEmpty) {
            i13 = 8;
        }
        textView2.setVisibility(i13);
        textView2.setText(charSequence2);
        z21Var.setValue(charSequence3);
        z21Var.updateColors();
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new z21(context, e6Var);
    }
}
