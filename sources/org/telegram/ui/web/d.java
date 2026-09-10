package org.telegram.ui.web;

import android.content.Context;
import org.telegram.ui.Components.r61;
public final class d extends r61 {
    public final l f37915f3;

    public d(l lVar, Context context, int i10, gi.a aVar, a aVar2, n7.a1 a1Var) {
        super(context, i10, 0, false, aVar, aVar2, null, a1Var);
        this.f37915f3 = lVar;
    }

    @Override
    public final void k0(int i10, int i11) {
        j jVar;
        if (!canScrollVertically(1) && (jVar = this.f37915f3.f38006y) != null && jVar.h) {
            jVar.d();
        }
    }
}
