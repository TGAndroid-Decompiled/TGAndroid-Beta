package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class v71 extends org.telegram.ui.Components.e61 {
    static {
        org.telegram.ui.Components.e61.setup(new org.telegram.ui.Components.e61());
    }

    public static org.telegram.ui.Components.f61 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.f61 J = org.telegram.ui.Components.f61.J(v71.class);
        J.d = i10;
        J.f26146k = i13;
        J.f26147l = charSequence;
        J.f26148m = charSequence2;
        J.f26149n = charSequence3;
        J.B = (i11 & 4294967295L) | (i12 << 32);
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.f61 f61Var, boolean z10, org.telegram.ui.Components.s61 s61Var, org.telegram.ui.Components.a71 a71Var) {
        boolean z11;
        int i10;
        float f7;
        long j10 = f61Var.B;
        int i11 = (int) j10;
        int i12 = (int) (j10 >>> 32);
        w71 w71Var = (w71) view;
        int i13 = f61Var.f26146k;
        CharSequence charSequence = f61Var.f26147l;
        CharSequence charSequence2 = f61Var.f26148m;
        CharSequence charSequence3 = f61Var.f26149n;
        TextView textView = w71Var.e;
        TextView textView2 = w71Var.f42408f;
        int i14 = 0;
        if (i11 == 0 && i12 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        w71Var.f42409n = z11;
        FrameLayout frameLayout = w71Var.f42407c;
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
        w71Var.f42406b.b(i11, i12);
        w71Var.d.setImageResource(i13);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        w71Var.f42410r = !isEmpty;
        if (isEmpty) {
            i14 = 8;
        }
        textView2.setVisibility(i14);
        textView2.setText(charSequence2);
        w71Var.setValue(charSequence3);
        w71Var.d();
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new w71(context, d6Var);
    }
}
