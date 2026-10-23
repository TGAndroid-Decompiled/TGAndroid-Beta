package org.telegram.ui.web;

import android.content.Context;
import org.telegram.ui.Components.c71;
public final class c extends c71 {
    public final k f42613d3;

    public c(k kVar, Context context, int i10, hg.o oVar, a aVar, mi.q qVar) {
        super(context, i10, 0, false, oVar, aVar, null, qVar);
        this.f42613d3 = kVar;
    }

    @Override
    public final void k0(int i10, int i11) {
        i iVar;
        if (!canScrollVertically(1) && (iVar = this.f42613d3.f42707y) != null && iVar.h) {
            iVar.d();
        }
    }
}
