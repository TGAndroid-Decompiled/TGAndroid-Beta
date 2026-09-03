package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class r81 extends org.telegram.ui.Components.g51 {
    static {
        org.telegram.ui.Components.g51.setup(new org.telegram.ui.Components.g51());
    }

    public static org.telegram.ui.Components.h51 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.h51 J = org.telegram.ui.Components.h51.J(r81.class);
        J.d = i10;
        J.f27374k = i13;
        J.f27375l = charSequence;
        J.f27376m = charSequence2;
        J.f27377n = charSequence3;
        J.B = (i11 & 4294967295L) | (i12 << 32);
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h51 h51Var, boolean z4, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.h61 h61Var) {
        int i10;
        float f10;
        long j10 = h51Var.B;
        int i11 = (int) j10;
        int i12 = (int) (j10 >>> 32);
        s81 s81Var = (s81) view;
        int i13 = h51Var.f27374k;
        CharSequence charSequence = h51Var.f27375l;
        CharSequence charSequence2 = h51Var.f27376m;
        CharSequence charSequence3 = h51Var.f27377n;
        TextView textView = s81Var.f41056e;
        TextView textView2 = s81Var.f41057f;
        FrameLayout frameLayout = s81Var.f41055c;
        int i14 = 8;
        if (i13 != 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        float f11 = 0.0f;
        if (i13 == 0) {
            f10 = AndroidUtilities.dp(2.0f);
        } else {
            f10 = 0.0f;
        }
        textView.setTranslationX(f10);
        if (i13 == 0) {
            f11 = AndroidUtilities.dp(2.0f);
        }
        textView2.setTranslationX(f11);
        s81Var.f41054b.b(i11, i12);
        s81Var.d.setImageResource(i13);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        s81Var.f41058n = !isEmpty;
        if (!isEmpty) {
            i14 = 0;
        }
        textView2.setVisibility(i14);
        textView2.setText(charSequence2);
        s81Var.setValue(charSequence3);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new s81(context, g6Var);
    }
}
