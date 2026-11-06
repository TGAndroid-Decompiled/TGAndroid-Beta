package org.telegram.ui;

import android.content.Context;
public abstract class sl extends org.telegram.ui.Components.pj0 implements di.f7 {
    public final an f49786e3;

    public sl(an anVar, Context context, ym ymVar) {
        super(context, ymVar);
        this.f49786e3 = anVar;
    }

    @Override
    public final void a(int[] iArr) {
        an anVar = this.f49786e3;
        iArr[0] = ((int) anVar.L9) - org.telegram.messenger.g0.L(4.0f);
        iArr[1] = org.telegram.messenger.k5.B(3.0f, anVar.f44037z0.getPaddingBottom(), anVar.f44037z0.getMeasuredHeight());
    }
}
