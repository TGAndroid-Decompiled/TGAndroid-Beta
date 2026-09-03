package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class t81 extends org.telegram.ui.Components.g51 {
    static {
        org.telegram.ui.Components.g51.setup(new org.telegram.ui.Components.g51());
    }

    public static org.telegram.ui.Components.h51 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.h51 J = org.telegram.ui.Components.h51.J(t81.class);
        J.f27375l = str;
        J.f27376m = charSequence;
        J.f27377n = str2;
        J.D = onClickListener;
        J.f27378o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h51 h51Var, boolean z4, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.h61 h61Var) {
        u81 u81Var = (u81) view;
        CharSequence charSequence = h51Var.f27375l;
        CharSequence charSequence2 = h51Var.f27376m;
        CharSequence charSequence3 = h51Var.f27377n;
        View.OnClickListener onClickListener = h51Var.D;
        CharSequence charSequence4 = h51Var.f27378o;
        View.OnClickListener onClickListener2 = h51Var.E;
        qh.d dVar = u81Var.f41770e;
        org.telegram.ui.Components.g90 g90Var = u81Var.f41768b;
        int i10 = 0;
        g90Var.setText(Emoji.replaceEmoji(charSequence, g90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.g90 g90Var2 = u81Var.f41769c;
        g90Var2.setText(Emoji.replaceEmoji(charSequence2, g90Var2.getPaint().getFontMetricsInt(), false));
        qh.d dVar2 = u81Var.d;
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
    public final View createView(Context context, org.telegram.ui.Components.sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new u81(context, g6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
