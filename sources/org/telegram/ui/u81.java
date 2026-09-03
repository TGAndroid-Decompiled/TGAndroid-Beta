package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class u81 extends org.telegram.ui.Components.h51 {
    static {
        org.telegram.ui.Components.h51.setup(new org.telegram.ui.Components.h51());
    }

    public static org.telegram.ui.Components.i51 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.i51 J = org.telegram.ui.Components.i51.J(u81.class);
        J.f25585l = str;
        J.f25586m = charSequence;
        J.f25587n = str2;
        J.D = onClickListener;
        J.f25588o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z4, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.g61 g61Var) {
        v81 v81Var = (v81) view;
        CharSequence charSequence = i51Var.f25585l;
        CharSequence charSequence2 = i51Var.f25586m;
        CharSequence charSequence3 = i51Var.f25587n;
        View.OnClickListener onClickListener = i51Var.D;
        CharSequence charSequence4 = i51Var.f25588o;
        View.OnClickListener onClickListener2 = i51Var.E;
        ph.d dVar = v81Var.e;
        org.telegram.ui.Components.f90 f90Var = v81Var.f39042b;
        int i10 = 0;
        f90Var.setText(Emoji.replaceEmoji(charSequence, f90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.f90 f90Var2 = v81Var.f39043c;
        f90Var2.setText(Emoji.replaceEmoji(charSequence2, f90Var2.getPaint().getFontMetricsInt(), false));
        ph.d dVar2 = v81Var.d;
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
    public final View createView(Context context, org.telegram.ui.Components.rl0 rl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new v81(context, f6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
