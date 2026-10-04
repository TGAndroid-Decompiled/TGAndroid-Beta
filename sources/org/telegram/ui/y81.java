package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class y81 extends org.telegram.ui.Components.f61 {
    static {
        org.telegram.ui.Components.f61.setup(new org.telegram.ui.Components.f61());
    }

    public static org.telegram.ui.Components.g61 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.g61 J = org.telegram.ui.Components.g61.J(y81.class);
        J.f26668l = str;
        J.f26669m = charSequence;
        J.f26670n = str2;
        J.D = onClickListener;
        J.f26671o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.g61 g61Var, boolean z10, org.telegram.ui.Components.u61 u61Var, org.telegram.ui.Components.c71 c71Var) {
        z81 z81Var = (z81) view;
        CharSequence charSequence = g61Var.f26668l;
        CharSequence charSequence2 = g61Var.f26669m;
        CharSequence charSequence3 = g61Var.f26670n;
        View.OnClickListener onClickListener = g61Var.D;
        CharSequence charSequence4 = g61Var.f26671o;
        View.OnClickListener onClickListener2 = g61Var.E;
        ci.d dVar = z81Var.f43725e;
        org.telegram.ui.Components.q90 q90Var = z81Var.f43723b;
        int i10 = 0;
        q90Var.setText(Emoji.replaceEmoji(charSequence, q90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.q90 q90Var2 = z81Var.f43724c;
        q90Var2.setText(Emoji.replaceEmoji(charSequence2, q90Var2.getPaint().getFontMetricsInt(), false));
        ci.d dVar2 = z81Var.d;
        if (TextUtils.isEmpty(charSequence3)) {
            i10 = 8;
        }
        dVar2.setVisibility(i10);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new z81(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
