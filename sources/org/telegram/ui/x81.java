package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class x81 extends org.telegram.ui.Components.v51 {
    static {
        org.telegram.ui.Components.v51.setup(new org.telegram.ui.Components.v51());
    }

    public static org.telegram.ui.Components.w51 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.w51 J = org.telegram.ui.Components.w51.J(x81.class);
        J.f29895l = str;
        J.f29896m = charSequence;
        J.f29897n = str2;
        J.D = onClickListener;
        J.f29898o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.w51 w51Var, boolean z10, org.telegram.ui.Components.k61 k61Var, org.telegram.ui.Components.s61 s61Var) {
        y81 y81Var = (y81) view;
        CharSequence charSequence = w51Var.f29895l;
        CharSequence charSequence2 = w51Var.f29896m;
        CharSequence charSequence3 = w51Var.f29897n;
        View.OnClickListener onClickListener = w51Var.D;
        CharSequence charSequence4 = w51Var.f29898o;
        View.OnClickListener onClickListener2 = w51Var.E;
        ci.d dVar = y81Var.e;
        org.telegram.ui.Components.o90 o90Var = y81Var.f40087b;
        int i10 = 0;
        o90Var.setText(Emoji.replaceEmoji(charSequence, o90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.o90 o90Var2 = y81Var.f40088c;
        o90Var2.setText(Emoji.replaceEmoji(charSequence2, o90Var2.getPaint().getFontMetricsInt(), false));
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
    public final View createView(Context context, org.telegram.ui.Components.xl0 xl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new y81(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
