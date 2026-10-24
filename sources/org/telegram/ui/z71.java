package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class z71 extends org.telegram.ui.Components.k61 {
    static {
        org.telegram.ui.Components.k61.setup(new org.telegram.ui.Components.k61());
    }

    public static org.telegram.ui.Components.l61 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.l61 J = org.telegram.ui.Components.l61.J(z71.class);
        J.f28227l = str;
        J.f28228m = charSequence;
        J.f28229n = str2;
        J.D = onClickListener;
        J.f28230o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.l61 l61Var, boolean z10, org.telegram.ui.Components.a71 a71Var, org.telegram.ui.Components.i71 i71Var) {
        a81 a81Var = (a81) view;
        CharSequence charSequence = l61Var.f28227l;
        CharSequence charSequence2 = l61Var.f28228m;
        CharSequence charSequence3 = l61Var.f28229n;
        View.OnClickListener onClickListener = l61Var.D;
        CharSequence charSequence4 = l61Var.f28230o;
        View.OnClickListener onClickListener2 = l61Var.E;
        ei.d dVar = a81Var.e;
        org.telegram.ui.Components.w90 w90Var = a81Var.f35675b;
        int i10 = 0;
        w90Var.setText(Emoji.replaceEmoji(charSequence, w90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.w90 w90Var2 = a81Var.f35676c;
        w90Var2.setText(Emoji.replaceEmoji(charSequence2, w90Var2.getPaint().getFontMetricsInt(), false));
        ei.d dVar2 = a81Var.d;
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
    public final View createView(Context context, org.telegram.ui.Components.lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new a81(context, g6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
