package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class v71 extends org.telegram.ui.Components.k41 {
    static {
        org.telegram.ui.Components.k41.setup(new org.telegram.ui.Components.k41());
    }

    public static org.telegram.ui.Components.l41 a(int i9, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.l41 J = org.telegram.ui.Components.l41.J(v71.class);
        J.d = i9;
        J.f30338k = i12;
        J.f30339l = charSequence;
        J.f30340m = charSequence2;
        J.f30341n = charSequence3;
        J.B = (i10 & 4294967295L) | (i11 << 32);
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.l41 l41Var, boolean z10, org.telegram.ui.Components.z41 z41Var, org.telegram.ui.Components.i51 i51Var) {
        int i9;
        float f10;
        long j10 = l41Var.B;
        int i10 = (int) j10;
        int i11 = (int) (j10 >>> 32);
        w71 w71Var = (w71) view;
        int i12 = l41Var.f30338k;
        CharSequence charSequence = l41Var.f30339l;
        CharSequence charSequence2 = l41Var.f30340m;
        CharSequence charSequence3 = l41Var.f30341n;
        TextView textView = w71Var.f43699e;
        TextView textView2 = w71Var.f43700f;
        FrameLayout frameLayout = w71Var.f43698c;
        int i13 = 8;
        if (i12 != 0) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        frameLayout.setVisibility(i9);
        float f11 = 0.0f;
        if (i12 == 0) {
            f10 = AndroidUtilities.dp(2.0f);
        } else {
            f10 = 0.0f;
        }
        textView.setTranslationX(f10);
        if (i12 == 0) {
            f11 = AndroidUtilities.dp(2.0f);
        }
        textView2.setTranslationX(f11);
        w71Var.f43697b.b(i10, i11);
        w71Var.d.setImageResource(i12);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        w71Var.f43701n = !isEmpty;
        if (!isEmpty) {
            i13 = 0;
        }
        textView2.setVisibility(i13);
        textView2.setText(charSequence2);
        w71Var.setValue(charSequence3);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new w71(context, b6Var);
    }
}
