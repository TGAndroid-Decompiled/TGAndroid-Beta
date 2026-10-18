package org.telegram.ui.web;

import android.content.Context;
import org.telegram.ui.Components.a71;
public final class d extends a71 {
    public final l f42567d3;

    public d(l lVar, Context context, int i10, hg.o oVar, a aVar, mi.q qVar) {
        super(context, i10, 0, false, oVar, aVar, null, qVar);
        this.f42567d3 = lVar;
    }

    @Override
    public final void k0(int i10, int i11) {
        j jVar;
        if (!canScrollVertically(1) && (jVar = this.f42567d3.f42661y) != null && jVar.h) {
            jVar.d();
        }
    }
}
