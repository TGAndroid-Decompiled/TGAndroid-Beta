package org.telegram.ui;

import android.content.Context;
public abstract class ul extends org.telegram.ui.Components.qj0 implements di.g7 {
    public final cn f50421e3;

    public ul(cn cnVar, Context context, an anVar) {
        super(context, anVar);
        this.f50421e3 = cnVar;
    }

    @Override
    public final void a(int[] iArr) {
        cn cnVar = this.f50421e3;
        iArr[0] = ((int) cnVar.N9) - org.telegram.messenger.g0.L(4.0f);
        iArr[1] = org.telegram.messenger.k5.B(3.0f, cnVar.f44700z0.getPaddingBottom(), cnVar.f44700z0.getMeasuredHeight());
    }
}
