package org.telegram.ui.web;

import android.content.Context;
import org.telegram.ui.Components.c71;
public final class c extends c71 {
    public final k f42612d3;

    public c(k kVar, Context context, int i10, hg.o oVar, a aVar, mi.q qVar) {
        super(context, i10, 0, false, oVar, aVar, null, qVar);
        this.f42612d3 = kVar;
    }

    @Override
    public final void k0(int i10, int i11) {
        i iVar;
        if (!canScrollVertically(1) && (iVar = this.f42612d3.f42706y) != null && iVar.h) {
            iVar.d();
        }
    }
}
