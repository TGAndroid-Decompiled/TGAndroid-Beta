package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class t81 extends org.telegram.ui.Components.g51 {
    static {
        org.telegram.ui.Components.g51.setup(new org.telegram.ui.Components.g51());
    }

    public static org.telegram.ui.Components.h51 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.h51 J = org.telegram.ui.Components.h51.J(t81.class);
        J.d = i10;
        J.f24506k = i13;
        J.f24507l = charSequence;
        J.f24508m = charSequence2;
        J.f24509n = charSequence3;
        J.B = (i11 & 4294967295L) | (i12 << 32);
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h51 h51Var, boolean z10, org.telegram.ui.Components.v51 v51Var, org.telegram.ui.Components.d61 d61Var) {
        int i10;
        float f7;
        long j3 = h51Var.B;
        int i11 = (int) j3;
        int i12 = (int) (j3 >>> 32);
        u81 u81Var = (u81) view;
        int i13 = h51Var.f24506k;
        CharSequence charSequence = h51Var.f24507l;
        CharSequence charSequence2 = h51Var.f24508m;
        CharSequence charSequence3 = h51Var.f24509n;
        TextView textView = u81Var.e;
        TextView textView2 = u81Var.f37953f;
        FrameLayout frameLayout = u81Var.f37952c;
        int i14 = 8;
        if (i13 != 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        float f10 = 0.0f;
        if (i13 == 0) {
            f7 = AndroidUtilities.dp(2.0f);
        } else {
            f7 = 0.0f;
        }
        textView.setTranslationX(f7);
        if (i13 == 0) {
            f10 = AndroidUtilities.dp(2.0f);
        }
        textView2.setTranslationX(f10);
        u81Var.f37951b.b(i11, i12);
        u81Var.d.setImageResource(i13);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        u81Var.f37954n = !isEmpty;
        if (!isEmpty) {
            i14 = 0;
        }
        textView2.setVisibility(i14);
        textView2.setText(charSequence2);
        u81Var.setValue(charSequence3);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new u81(context, d6Var);
    }
}
