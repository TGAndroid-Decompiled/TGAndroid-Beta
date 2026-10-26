package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class z71 extends org.telegram.ui.Components.s61 {
    static {
        org.telegram.ui.Components.s61.setup(new org.telegram.ui.Components.s61());
    }

    public static org.telegram.ui.Components.t61 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.t61 K = org.telegram.ui.Components.t61.K(z71.class);
        K.d = i10;
        K.f32874k = i13;
        K.f32875l = charSequence;
        K.f32876m = charSequence2;
        K.f32877n = charSequence3;
        K.B = (i11 & 4294967295L) | (i12 << 32);
        return K;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.t61 t61Var, boolean z10, org.telegram.ui.Components.j71 j71Var, org.telegram.ui.Components.r71 r71Var) {
        boolean z11;
        int i10;
        float f7;
        long j10 = t61Var.B;
        int i11 = (int) j10;
        int i12 = (int) (j10 >>> 32);
        a81 a81Var = (a81) view;
        int i13 = t61Var.f32874k;
        CharSequence charSequence = t61Var.f32875l;
        CharSequence charSequence2 = t61Var.f32876m;
        CharSequence charSequence3 = t61Var.f32877n;
        TextView textView = a81Var.e;
        TextView textView2 = a81Var.f37670f;
        int i14 = 0;
        if (i11 == 0 && i12 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        a81Var.f37671n = z11;
        FrameLayout frameLayout = a81Var.f37669c;
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
        a81Var.f37668b.b(i11, i12);
        a81Var.d.setImageResource(i13);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        a81Var.f37672r = !isEmpty;
        if (isEmpty) {
            i14 = 8;
        }
        textView2.setVisibility(i14);
        textView2.setText(charSequence2);
        a81Var.setValue(charSequence3);
        a81Var.updateColors();
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new a81(context, u6Var);
    }
}
