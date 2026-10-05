package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class u81 extends org.telegram.ui.Components.g61 {
    static {
        org.telegram.ui.Components.g61.setup(new org.telegram.ui.Components.g61());
    }

    public static org.telegram.ui.Components.h61 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.h61 K = org.telegram.ui.Components.h61.K(u81.class);
        K.d = i10;
        K.f27092k = i13;
        K.f27093l = charSequence;
        K.f27094m = charSequence2;
        K.f27095n = charSequence3;
        K.B = (i11 & 4294967295L) | (i12 << 32);
        return K;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h61 h61Var, boolean z10, org.telegram.ui.Components.w61 w61Var, org.telegram.ui.Components.e71 e71Var) {
        int i10;
        float f7;
        long j3 = h61Var.B;
        int i11 = (int) j3;
        int i12 = (int) (j3 >>> 32);
        v81 v81Var = (v81) view;
        int i13 = h61Var.f27092k;
        CharSequence charSequence = h61Var.f27093l;
        CharSequence charSequence2 = h61Var.f27094m;
        CharSequence charSequence3 = h61Var.f27095n;
        TextView textView = v81Var.f41649e;
        TextView textView2 = v81Var.f41650f;
        FrameLayout frameLayout = v81Var.f41648c;
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
        v81Var.f41647b.b(i11, i12);
        v81Var.d.setImageResource(i13);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        v81Var.f41651n = !isEmpty;
        if (!isEmpty) {
            i14 = 0;
        }
        textView2.setVisibility(i14);
        textView2.setText(charSequence2);
        v81Var.setValue(charSequence3);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new v81(context, d6Var);
    }
}
