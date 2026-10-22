package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class t71 extends org.telegram.ui.Components.g61 {
    static {
        org.telegram.ui.Components.g61.setup(new org.telegram.ui.Components.g61());
    }

    public static org.telegram.ui.Components.h61 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.h61 J = org.telegram.ui.Components.h61.J(t71.class);
        J.d = i10;
        J.f26784k = i13;
        J.f26785l = charSequence;
        J.f26786m = charSequence2;
        J.f26787n = charSequence3;
        J.B = (i11 & 4294967295L) | (i12 << 32);
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h61 h61Var, boolean z10, org.telegram.ui.Components.u61 u61Var, org.telegram.ui.Components.c71 c71Var) {
        boolean z11;
        int i10;
        float f7;
        long j10 = h61Var.B;
        int i11 = (int) j10;
        int i12 = (int) (j10 >>> 32);
        u71 u71Var = (u71) view;
        int i13 = h61Var.f26784k;
        CharSequence charSequence = h61Var.f26785l;
        CharSequence charSequence2 = h61Var.f26786m;
        CharSequence charSequence3 = h61Var.f26787n;
        TextView textView = u71Var.e;
        TextView textView2 = u71Var.f41831f;
        int i14 = 0;
        if (i11 == 0 && i12 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        u71Var.f41832n = z11;
        FrameLayout frameLayout = u71Var.f41830c;
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
        u71Var.f41829b.b(i11, i12);
        u71Var.d.setImageResource(i13);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        u71Var.f41833r = !isEmpty;
        if (isEmpty) {
            i14 = 8;
        }
        textView2.setVisibility(i14);
        textView2.setText(charSequence2);
        u71Var.setValue(charSequence3);
        u71Var.d();
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new u71(context, d6Var);
    }
}
