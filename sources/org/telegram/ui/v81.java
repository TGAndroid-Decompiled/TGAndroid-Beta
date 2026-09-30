package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class v81 extends org.telegram.ui.Components.w51 {
    static {
        org.telegram.ui.Components.w51.setup(new org.telegram.ui.Components.w51());
    }

    public static org.telegram.ui.Components.x51 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.x51 J = org.telegram.ui.Components.x51.J(v81.class);
        J.d = i10;
        J.f30277k = i13;
        J.f30278l = charSequence;
        J.f30279m = charSequence2;
        J.f30280n = charSequence3;
        J.B = (i11 & 4294967295L) | (i12 << 32);
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.x51 x51Var, boolean z10, org.telegram.ui.Components.l61 l61Var, org.telegram.ui.Components.t61 t61Var) {
        int i10;
        float f7;
        long j3 = x51Var.B;
        int i11 = (int) j3;
        int i12 = (int) (j3 >>> 32);
        w81 w81Var = (w81) view;
        int i13 = x51Var.f30277k;
        CharSequence charSequence = x51Var.f30278l;
        CharSequence charSequence2 = x51Var.f30279m;
        CharSequence charSequence3 = x51Var.f30280n;
        TextView textView = w81Var.e;
        TextView textView2 = w81Var.f38935f;
        FrameLayout frameLayout = w81Var.f38934c;
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
        w81Var.f38933b.b(i11, i12);
        w81Var.d.setImageResource(i13);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        w81Var.f38936n = !isEmpty;
        if (!isEmpty) {
            i14 = 0;
        }
        textView2.setVisibility(i14);
        textView2.setText(charSequence2);
        w81Var.setValue(charSequence3);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new w81(context, d6Var);
    }
}
