package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class x81 extends org.telegram.ui.Components.w51 {
    static {
        org.telegram.ui.Components.w51.setup(new org.telegram.ui.Components.w51());
    }

    public static org.telegram.ui.Components.x51 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.x51 J = org.telegram.ui.Components.x51.J(x81.class);
        J.f30293l = str;
        J.f30294m = charSequence;
        J.f30295n = str2;
        J.D = onClickListener;
        J.f30296o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.x51 x51Var, boolean z10, org.telegram.ui.Components.l61 l61Var, org.telegram.ui.Components.t61 t61Var) {
        y81 y81Var = (y81) view;
        CharSequence charSequence = x51Var.f30293l;
        CharSequence charSequence2 = x51Var.f30294m;
        CharSequence charSequence3 = x51Var.f30295n;
        View.OnClickListener onClickListener = x51Var.D;
        CharSequence charSequence4 = x51Var.f30296o;
        View.OnClickListener onClickListener2 = x51Var.E;
        ci.d dVar = y81Var.e;
        org.telegram.ui.Components.p90 p90Var = y81Var.f40089b;
        int i10 = 0;
        p90Var.setText(Emoji.replaceEmoji(charSequence, p90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.p90 p90Var2 = y81Var.f40090c;
        p90Var2.setText(Emoji.replaceEmoji(charSequence2, p90Var2.getPaint().getFontMetricsInt(), false));
        ci.d dVar2 = y81Var.d;
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
    public final View createView(Context context, org.telegram.ui.Components.yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new y81(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
