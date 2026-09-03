package org.telegram.ui.web;

import android.content.Context;
import n7.qa;
import org.telegram.ui.Components.g61;
public final class c extends g61 {
    public final k c3;

    public c(k kVar, Context context, int i10, dg.r1 r1Var, a aVar, qa qaVar) {
        super(context, i10, 0, false, r1Var, aVar, null, qaVar);
        this.c3 = kVar;
    }

    @Override
    public final void k0(int i10, int i11) {
        i iVar;
        if (!canScrollVertically(1) && (iVar = this.c3.f39505y) != null && iVar.h) {
            iVar.d();
        }
    }
}
