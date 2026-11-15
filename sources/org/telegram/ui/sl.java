package org.telegram.ui;

import android.content.Context;
public abstract class sl extends org.telegram.ui.Components.uj0 implements fi.z6 {
    public final an f51236f3;

    public sl(an anVar, Context context, ym ymVar) {
        super(context, ymVar);
        this.f51236f3 = anVar;
    }

    @Override
    public final void a(int[] iArr) {
        an anVar = this.f51236f3;
        iArr[0] = ((int) anVar.O9) - org.telegram.messenger.g0.L(4.0f);
        iArr[1] = org.telegram.messenger.k5.B(3.0f, anVar.A0.getPaddingBottom(), anVar.A0.getMeasuredHeight());
    }
}
