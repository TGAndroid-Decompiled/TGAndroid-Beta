package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class w81 extends org.telegram.ui.Components.f61 {
    static {
        org.telegram.ui.Components.f61.setup(new org.telegram.ui.Components.f61());
    }

    public static org.telegram.ui.Components.g61 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.g61 J = org.telegram.ui.Components.g61.J(w81.class);
        J.d = i10;
        J.f26667k = i13;
        J.f26668l = charSequence;
        J.f26669m = charSequence2;
        J.f26670n = charSequence3;
        J.B = (i11 & 4294967295L) | (i12 << 32);
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.g61 g61Var, boolean z10, org.telegram.ui.Components.u61 u61Var, org.telegram.ui.Components.c71 c71Var) {
        int i10;
        float f7;
        long j3 = g61Var.B;
        int i11 = (int) j3;
        int i12 = (int) (j3 >>> 32);
        x81 x81Var = (x81) view;
        int i13 = g61Var.f26667k;
        CharSequence charSequence = g61Var.f26668l;
        CharSequence charSequence2 = g61Var.f26669m;
        CharSequence charSequence3 = g61Var.f26670n;
        TextView textView = x81Var.f42774e;
        TextView textView2 = x81Var.f42775f;
        FrameLayout frameLayout = x81Var.f42773c;
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
        x81Var.f42772b.b(i11, i12);
        x81Var.d.setImageResource(i13);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        x81Var.f42776n = !isEmpty;
        if (!isEmpty) {
            i14 = 0;
        }
        textView2.setVisibility(i14);
        textView2.setText(charSequence2);
        x81Var.setValue(charSequence3);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new x81(context, d6Var);
    }
}
