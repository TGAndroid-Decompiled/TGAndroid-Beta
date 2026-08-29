package org.telegram.ui.web;

import android.content.Context;
import nh.t4;
import org.telegram.ui.Components.u51;
public final class d extends u51 {
    public final l f43998b3;

    public d(l lVar, Context context, int i10, t4 t4Var, a aVar, oc.i iVar) {
        super(context, i10, 0, false, t4Var, aVar, null, iVar);
        this.f43998b3 = lVar;
    }

    @Override
    public final void k0(int i10, int i11) {
        j jVar;
        if (!canScrollVertically(1) && (jVar = this.f43998b3.f44105y) != null && jVar.h) {
            jVar.d();
        }
    }
}
