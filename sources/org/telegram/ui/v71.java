package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class v71 extends org.telegram.ui.Components.g61 {
    static {
        org.telegram.ui.Components.g61.setup(new org.telegram.ui.Components.g61());
    }

    public static org.telegram.ui.Components.h61 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.h61 J = org.telegram.ui.Components.h61.J(v71.class);
        J.f26785l = str;
        J.f26786m = charSequence;
        J.f26787n = str2;
        J.D = onClickListener;
        J.f26788o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h61 h61Var, boolean z10, org.telegram.ui.Components.u61 u61Var, org.telegram.ui.Components.c71 c71Var) {
        w71 w71Var = (w71) view;
        CharSequence charSequence = h61Var.f26785l;
        CharSequence charSequence2 = h61Var.f26786m;
        CharSequence charSequence3 = h61Var.f26787n;
        View.OnClickListener onClickListener = h61Var.D;
        CharSequence charSequence4 = h61Var.f26788o;
        View.OnClickListener onClickListener2 = h61Var.E;
        ei.d dVar = w71Var.e;
        org.telegram.ui.Components.x90 x90Var = w71Var.f42491b;
        int i10 = 0;
        x90Var.setText(Emoji.replaceEmoji(charSequence, x90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.x90 x90Var2 = w71Var.f42492c;
        x90Var2.setText(Emoji.replaceEmoji(charSequence2, x90Var2.getPaint().getFontMetricsInt(), false));
        ei.d dVar2 = w71Var.d;
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
    public final View createView(Context context, org.telegram.ui.Components.jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new w71(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
