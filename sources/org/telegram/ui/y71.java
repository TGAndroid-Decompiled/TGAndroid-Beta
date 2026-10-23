package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class y71 extends org.telegram.ui.Components.l61 {
    static {
        org.telegram.ui.Components.l61.setup(new org.telegram.ui.Components.l61());
    }

    public static org.telegram.ui.Components.m61 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.m61 J = org.telegram.ui.Components.m61.J(y71.class);
        J.d = i10;
        J.f28558k = i13;
        J.f28559l = charSequence;
        J.f28560m = charSequence2;
        J.f28561n = charSequence3;
        J.B = (i11 & 4294967295L) | (i12 << 32);
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.m61 m61Var, boolean z10, org.telegram.ui.Components.b71 b71Var, org.telegram.ui.Components.j71 j71Var) {
        boolean z11;
        int i10;
        float f7;
        long j10 = m61Var.B;
        int i11 = (int) j10;
        int i12 = (int) (j10 >>> 32);
        z71 z71Var = (z71) view;
        int i13 = m61Var.f28558k;
        CharSequence charSequence = m61Var.f28559l;
        CharSequence charSequence2 = m61Var.f28560m;
        CharSequence charSequence3 = m61Var.f28561n;
        TextView textView = z71Var.e;
        TextView textView2 = z71Var.f44070f;
        int i14 = 0;
        if (i11 == 0 && i12 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        z71Var.f44071n = z11;
        FrameLayout frameLayout = z71Var.f44069c;
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
        z71Var.f44068b.b(i11, i12);
        z71Var.d.setImageResource(i13);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        z71Var.f44072r = !isEmpty;
        if (isEmpty) {
            i14 = 8;
        }
        textView2.setVisibility(i14);
        textView2.setText(charSequence2);
        z71Var.setValue(charSequence3);
        z71Var.updateColors();
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new z71(context, g6Var);
    }
}
