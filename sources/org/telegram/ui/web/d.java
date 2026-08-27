package org.telegram.ui.web;

import android.content.Context;
import lh.a8;
import org.telegram.ui.Components.k51;
import org.telegram.ui.i6;

public final class d extends k51 {

    public final l f43805b3;

    public d(l lVar, Context context, int i10, a8 a8Var, a aVar, i6 i6Var) {
        super(context, i10, 0, false, a8Var, aVar, null, i6Var);
        this.f43805b3 = lVar;
    }

    @Override
    public final void k0(int i10, int i11) {
        j jVar;
        if (canScrollVertically(1) || (jVar = this.f43805b3.f43902y) == null || !jVar.h) {
            return;
        }
        jVar.d();
    }
}
