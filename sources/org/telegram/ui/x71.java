package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class x71 extends org.telegram.ui.Components.v41 {
    static {
        org.telegram.ui.Components.v41.setup(new org.telegram.ui.Components.v41());
    }

    public static org.telegram.ui.Components.w41 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.w41 J = org.telegram.ui.Components.w41.J(x71.class);
        J.d = i10;
        J.f34299k = i13;
        J.f34300l = charSequence;
        J.f34301m = charSequence2;
        J.f34302n = charSequence3;
        J.B = (i11 & 4294967295L) | (i12 << 32);
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.w41 w41Var, boolean z10, org.telegram.ui.Components.k51 k51Var, org.telegram.ui.Components.u51 u51Var) {
        int i10;
        float f9;
        long j10 = w41Var.B;
        int i11 = (int) j10;
        int i12 = (int) (j10 >>> 32);
        y71 y71Var = (y71) view;
        int i13 = w41Var.f34299k;
        CharSequence charSequence = w41Var.f34300l;
        CharSequence charSequence2 = w41Var.f34301m;
        CharSequence charSequence3 = w41Var.f34302n;
        TextView textView = y71Var.f44766e;
        TextView textView2 = y71Var.f44767f;
        FrameLayout frameLayout = y71Var.f44765c;
        int i14 = 8;
        if (i13 != 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        float f10 = 0.0f;
        if (i13 == 0) {
            f9 = AndroidUtilities.dp(2.0f);
        } else {
            f9 = 0.0f;
        }
        textView.setTranslationX(f9);
        if (i13 == 0) {
            f10 = AndroidUtilities.dp(2.0f);
        }
        textView2.setTranslationX(f10);
        y71Var.f44764b.b(i11, i12);
        y71Var.d.setImageResource(i13);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        y71Var.f44768n = !isEmpty;
        if (!isEmpty) {
            i14 = 0;
        }
        textView2.setVisibility(i14);
        textView2.setText(charSequence2);
        y71Var.setValue(charSequence3);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new y71(context, c6Var);
    }
}
