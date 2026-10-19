package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class t71 extends org.telegram.ui.Components.f61 {
    static {
        org.telegram.ui.Components.f61.setup(new org.telegram.ui.Components.f61());
    }

    public static org.telegram.ui.Components.g61 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.g61 J = org.telegram.ui.Components.g61.J(t71.class);
        J.d = i10;
        J.f26498k = i13;
        J.f26499l = charSequence;
        J.f26500m = charSequence2;
        J.f26501n = charSequence3;
        J.B = (i11 & 4294967295L) | (i12 << 32);
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.g61 g61Var, boolean z10, org.telegram.ui.Components.t61 t61Var, org.telegram.ui.Components.b71 b71Var) {
        boolean z11;
        int i10;
        float f7;
        long j10 = g61Var.B;
        int i11 = (int) j10;
        int i12 = (int) (j10 >>> 32);
        u71 u71Var = (u71) view;
        int i13 = g61Var.f26498k;
        CharSequence charSequence = g61Var.f26499l;
        CharSequence charSequence2 = g61Var.f26500m;
        CharSequence charSequence3 = g61Var.f26501n;
        TextView textView = u71Var.e;
        TextView textView2 = u71Var.f41838f;
        int i14 = 0;
        if (i11 == 0 && i12 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        u71Var.f41839n = z11;
        FrameLayout frameLayout = u71Var.f41837c;
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
        u71Var.f41836b.b(i11, i12);
        u71Var.d.setImageResource(i13);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        u71Var.f41840r = !isEmpty;
        if (isEmpty) {
            i14 = 8;
        }
        textView2.setVisibility(i14);
        textView2.setText(charSequence2);
        u71Var.setValue(charSequence3);
        u71Var.d();
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new u71(context, d6Var);
    }
}
