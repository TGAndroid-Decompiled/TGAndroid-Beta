package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class x71 extends org.telegram.ui.Components.k41 {
    static {
        org.telegram.ui.Components.k41.setup(new org.telegram.ui.Components.k41());
    }

    public static org.telegram.ui.Components.l41 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.l41 J = org.telegram.ui.Components.l41.J(x71.class);
        J.f30339l = str;
        J.f30340m = charSequence;
        J.f30341n = str2;
        J.D = onClickListener;
        J.f30342o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.l41 l41Var, boolean z10, org.telegram.ui.Components.z41 z41Var, org.telegram.ui.Components.i51 i51Var) {
        y71 y71Var = (y71) view;
        CharSequence charSequence = l41Var.f30339l;
        CharSequence charSequence2 = l41Var.f30340m;
        CharSequence charSequence3 = l41Var.f30341n;
        View.OnClickListener onClickListener = l41Var.D;
        CharSequence charSequence4 = l41Var.f30342o;
        View.OnClickListener onClickListener2 = l41Var.E;
        kh.d dVar = y71Var.f44769e;
        org.telegram.ui.Components.l80 l80Var = y71Var.f44767b;
        int i9 = 0;
        l80Var.setText(Emoji.replaceEmoji(charSequence, l80Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.l80 l80Var2 = y71Var.f44768c;
        l80Var2.setText(Emoji.replaceEmoji(charSequence2, l80Var2.getPaint().getFontMetricsInt(), false));
        kh.d dVar2 = y71Var.d;
        if (TextUtils.isEmpty(charSequence3)) {
            i9 = 8;
        }
        dVar2.setVisibility(i9);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new y71(context, b6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
