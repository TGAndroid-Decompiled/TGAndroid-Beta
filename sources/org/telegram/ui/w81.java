package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class w81 extends org.telegram.ui.Components.g61 {
    static {
        org.telegram.ui.Components.g61.setup(new org.telegram.ui.Components.g61());
    }

    public static org.telegram.ui.Components.h61 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.h61 K = org.telegram.ui.Components.h61.K(w81.class);
        K.f27093l = str;
        K.f27094m = charSequence;
        K.f27095n = str2;
        K.D = onClickListener;
        K.f27096o = charSequence2;
        K.E = onClickListener2;
        return K;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h61 h61Var, boolean z10, org.telegram.ui.Components.w61 w61Var, org.telegram.ui.Components.e71 e71Var) {
        x81 x81Var = (x81) view;
        CharSequence charSequence = h61Var.f27093l;
        CharSequence charSequence2 = h61Var.f27094m;
        CharSequence charSequence3 = h61Var.f27095n;
        View.OnClickListener onClickListener = h61Var.D;
        CharSequence charSequence4 = h61Var.f27096o;
        View.OnClickListener onClickListener2 = h61Var.E;
        ci.d dVar = x81Var.f42836e;
        org.telegram.ui.Components.q90 q90Var = x81Var.f42834b;
        int i10 = 0;
        q90Var.setText(Emoji.replaceEmoji(charSequence, q90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.q90 q90Var2 = x81Var.f42835c;
        q90Var2.setText(Emoji.replaceEmoji(charSequence2, q90Var2.getPaint().getFontMetricsInt(), false));
        ci.d dVar2 = x81Var.d;
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
        return new x81(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
