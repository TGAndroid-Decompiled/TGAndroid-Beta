package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class v71 extends org.telegram.ui.Components.f61 {
    static {
        org.telegram.ui.Components.f61.setup(new org.telegram.ui.Components.f61());
    }

    public static org.telegram.ui.Components.g61 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.g61 J = org.telegram.ui.Components.g61.J(v71.class);
        J.f26497l = str;
        J.f26498m = charSequence;
        J.f26499n = str2;
        J.D = onClickListener;
        J.f26500o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.g61 g61Var, boolean z10, org.telegram.ui.Components.t61 t61Var, org.telegram.ui.Components.b71 b71Var) {
        w71 w71Var = (w71) view;
        CharSequence charSequence = g61Var.f26497l;
        CharSequence charSequence2 = g61Var.f26498m;
        CharSequence charSequence3 = g61Var.f26499n;
        View.OnClickListener onClickListener = g61Var.D;
        CharSequence charSequence4 = g61Var.f26500o;
        View.OnClickListener onClickListener2 = g61Var.E;
        ei.d dVar = w71Var.e;
        org.telegram.ui.Components.x90 x90Var = w71Var.f42482b;
        int i10 = 0;
        x90Var.setText(Emoji.replaceEmoji(charSequence, x90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.x90 x90Var2 = w71Var.f42483c;
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
    public final View createView(Context context, org.telegram.ui.Components.im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new w71(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
