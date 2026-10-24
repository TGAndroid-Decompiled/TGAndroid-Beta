package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class x71 extends org.telegram.ui.Components.k61 {
    static {
        org.telegram.ui.Components.k61.setup(new org.telegram.ui.Components.k61());
    }

    public static org.telegram.ui.Components.l61 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.l61 J = org.telegram.ui.Components.l61.J(x71.class);
        J.d = i10;
        J.f28226k = i13;
        J.f28227l = charSequence;
        J.f28228m = charSequence2;
        J.f28229n = charSequence3;
        J.B = (i11 & 4294967295L) | (i12 << 32);
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.l61 l61Var, boolean z10, org.telegram.ui.Components.a71 a71Var, org.telegram.ui.Components.i71 i71Var) {
        boolean z11;
        int i10;
        float f7;
        long j10 = l61Var.B;
        int i11 = (int) j10;
        int i12 = (int) (j10 >>> 32);
        y71 y71Var = (y71) view;
        int i13 = l61Var.f28226k;
        CharSequence charSequence = l61Var.f28227l;
        CharSequence charSequence2 = l61Var.f28228m;
        CharSequence charSequence3 = l61Var.f28229n;
        TextView textView = y71Var.e;
        TextView textView2 = y71Var.f43779f;
        int i14 = 0;
        if (i11 == 0 && i12 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        y71Var.f43780n = z11;
        FrameLayout frameLayout = y71Var.f43778c;
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
        y71Var.f43777b.b(i11, i12);
        y71Var.d.setImageResource(i13);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        y71Var.f43781r = !isEmpty;
        if (isEmpty) {
            i14 = 8;
        }
        textView2.setVisibility(i14);
        textView2.setText(charSequence2);
        y71Var.setValue(charSequence3);
        y71Var.updateColors();
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new y71(context, g6Var);
    }
}
