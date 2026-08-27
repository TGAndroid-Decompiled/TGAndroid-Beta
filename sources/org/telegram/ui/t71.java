package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class t71 extends org.telegram.ui.Components.m41 {
    static {
        org.telegram.ui.Components.m41.setup(new t71());
    }

    public static org.telegram.ui.Components.n41 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.n41 n41VarJ = org.telegram.ui.Components.n41.J(t71.class);
        n41VarJ.d = i10;
        n41VarJ.f30843k = i13;
        n41VarJ.f30844l = charSequence;
        n41VarJ.f30845m = charSequence2;
        n41VarJ.f30846n = charSequence3;
        n41VarJ.B = (((long) i11) & 4294967295L) | (((long) i12) << 32);
        return n41VarJ;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.n41 n41Var, boolean z10, org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.k51 k51Var) {
        long j10 = n41Var.B;
        int i10 = (int) j10;
        int i11 = (int) (j10 >>> 32);
        u71 u71Var = (u71) view;
        int i12 = n41Var.f30843k;
        CharSequence charSequence = n41Var.f30844l;
        CharSequence charSequence2 = n41Var.f30845m;
        CharSequence charSequence3 = n41Var.f30846n;
        TextView textView = u71Var.f43156e;
        TextView textView2 = u71Var.f43157f;
        u71Var.f43155c.setVisibility(i12 != 0 ? 0 : 8);
        textView.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        textView2.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        u71Var.f43154b.b(i10, i11);
        u71Var.d.setImageResource(i12);
        textView.setText(charSequence);
        boolean zIsEmpty = TextUtils.isEmpty(charSequence2);
        u71Var.f43158n = !zIsEmpty;
        textView2.setVisibility(zIsEmpty ? 8 : 0);
        textView2.setText(charSequence2);
        u71Var.setValue(charSequence3);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new u71(context, c6Var);
    }
}
