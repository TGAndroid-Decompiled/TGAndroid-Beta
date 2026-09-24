package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class x81 extends org.telegram.ui.Components.u51 {
    static {
        org.telegram.ui.Components.u51.setup(new org.telegram.ui.Components.u51());
    }

    public static org.telegram.ui.Components.v51 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.v51 J = org.telegram.ui.Components.v51.J(x81.class);
        J.f29042l = str;
        J.f29043m = charSequence;
        J.f29044n = str2;
        J.D = onClickListener;
        J.f29045o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.v51 v51Var, boolean z10, org.telegram.ui.Components.j61 j61Var, org.telegram.ui.Components.r61 r61Var) {
        y81 y81Var = (y81) view;
        CharSequence charSequence = v51Var.f29042l;
        CharSequence charSequence2 = v51Var.f29043m;
        CharSequence charSequence3 = v51Var.f29044n;
        View.OnClickListener onClickListener = v51Var.D;
        CharSequence charSequence4 = v51Var.f29045o;
        View.OnClickListener onClickListener2 = v51Var.E;
        ci.d dVar = y81Var.e;
        org.telegram.ui.Components.n90 n90Var = y81Var.f40073b;
        int i10 = 0;
        n90Var.setText(Emoji.replaceEmoji(charSequence, n90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.n90 n90Var2 = y81Var.f40074c;
        n90Var2.setText(Emoji.replaceEmoji(charSequence2, n90Var2.getPaint().getFontMetricsInt(), false));
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
    public final View createView(Context context, org.telegram.ui.Components.wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new y81(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
