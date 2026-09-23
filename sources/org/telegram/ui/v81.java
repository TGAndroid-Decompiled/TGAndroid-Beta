package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class v81 extends org.telegram.ui.Components.g51 {
    static {
        org.telegram.ui.Components.g51.setup(new org.telegram.ui.Components.g51());
    }

    public static org.telegram.ui.Components.h51 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.h51 J = org.telegram.ui.Components.h51.J(v81.class);
        J.f24507l = str;
        J.f24508m = charSequence;
        J.f24509n = str2;
        J.D = onClickListener;
        J.f24510o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h51 h51Var, boolean z10, org.telegram.ui.Components.v51 v51Var, org.telegram.ui.Components.d61 d61Var) {
        w81 w81Var = (w81) view;
        CharSequence charSequence = h51Var.f24507l;
        CharSequence charSequence2 = h51Var.f24508m;
        CharSequence charSequence3 = h51Var.f24509n;
        View.OnClickListener onClickListener = h51Var.D;
        CharSequence charSequence4 = h51Var.f24510o;
        View.OnClickListener onClickListener2 = h51Var.E;
        ci.d dVar = w81Var.e;
        org.telegram.ui.Components.d90 d90Var = w81Var.f38562b;
        int i10 = 0;
        d90Var.setText(Emoji.replaceEmoji(charSequence, d90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.d90 d90Var2 = w81Var.f38563c;
        d90Var2.setText(Emoji.replaceEmoji(charSequence2, d90Var2.getPaint().getFontMetricsInt(), false));
        ci.d dVar2 = w81Var.d;
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
    public final View createView(Context context, org.telegram.ui.Components.ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new w81(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
