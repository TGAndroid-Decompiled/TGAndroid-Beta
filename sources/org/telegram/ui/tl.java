package org.telegram.ui;

import android.content.Context;
public abstract class tl extends org.telegram.ui.Components.ek0 implements fi.w6 {
    public final bn f52422f3;

    public tl(bn bnVar, Context context, zm zmVar) {
        super(context, zmVar);
        this.f52422f3 = bnVar;
    }

    @Override
    public final void a(int[] iArr) {
        bn bnVar = this.f52422f3;
        iArr[0] = ((int) bnVar.P9) - org.telegram.messenger.g0.L(4.0f);
        iArr[1] = org.telegram.messenger.f3.B(3.0f, bnVar.A0.getPaddingBottom(), bnVar.A0.getMeasuredHeight());
    }
}
