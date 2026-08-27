package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;

public final class v71 extends org.telegram.ui.Components.m41 {
    static {
        org.telegram.ui.Components.m41.setup(new v71());
    }

    public static org.telegram.ui.Components.n41 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.n41 n41VarJ = org.telegram.ui.Components.n41.J(v71.class);
        n41VarJ.f30844l = str;
        n41VarJ.f30845m = charSequence;
        n41VarJ.f30846n = str2;
        n41VarJ.D = onClickListener;
        n41VarJ.f30847o = charSequence2;
        n41VarJ.E = onClickListener2;
        return n41VarJ;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.n41 n41Var, boolean z10, org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.k51 k51Var) {
        w71 w71Var = (w71) view;
        CharSequence charSequence = n41Var.f30844l;
        CharSequence charSequence2 = n41Var.f30845m;
        CharSequence charSequence3 = n41Var.f30846n;
        View.OnClickListener onClickListener = n41Var.D;
        CharSequence charSequence4 = n41Var.f30847o;
        View.OnClickListener onClickListener2 = n41Var.E;
        lh.d dVar = w71Var.f43640e;
        org.telegram.ui.Components.p80 p80Var = w71Var.f43638b;
        p80Var.setText(Emoji.replaceEmoji(charSequence, p80Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.p80 p80Var2 = w71Var.f43639c;
        p80Var2.setText(Emoji.replaceEmoji(charSequence2, p80Var2.getPaint().getFontMetricsInt(), false));
        lh.d dVar2 = w71Var.d;
        dVar2.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new w71(context, c6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
