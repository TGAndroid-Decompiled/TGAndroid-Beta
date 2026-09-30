package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class x81 extends org.telegram.ui.Components.x51 {
    static {
        org.telegram.ui.Components.x51.setup(new org.telegram.ui.Components.x51());
    }

    public static org.telegram.ui.Components.y51 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.y51 J = org.telegram.ui.Components.y51.J(x81.class);
        J.f30637l = str;
        J.f30638m = charSequence;
        J.f30639n = str2;
        J.D = onClickListener;
        J.f30640o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.y51 y51Var, boolean z10, org.telegram.ui.Components.m61 m61Var, org.telegram.ui.Components.u61 u61Var) {
        y81 y81Var = (y81) view;
        CharSequence charSequence = y51Var.f30637l;
        CharSequence charSequence2 = y51Var.f30638m;
        CharSequence charSequence3 = y51Var.f30639n;
        View.OnClickListener onClickListener = y51Var.D;
        CharSequence charSequence4 = y51Var.f30640o;
        View.OnClickListener onClickListener2 = y51Var.E;
        ci.d dVar = y81Var.e;
        org.telegram.ui.Components.q90 q90Var = y81Var.f40194b;
        int i10 = 0;
        q90Var.setText(Emoji.replaceEmoji(charSequence, q90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.q90 q90Var2 = y81Var.f40195c;
        q90Var2.setText(Emoji.replaceEmoji(charSequence2, q90Var2.getPaint().getFontMetricsInt(), false));
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
    public final View createView(Context context, org.telegram.ui.Components.zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new y81(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
