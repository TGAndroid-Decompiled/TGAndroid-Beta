package org.telegram.ui.web;

import android.content.Context;
import org.telegram.ui.Components.h71;
public final class c extends h71 {
    public final k f41317d3;

    public c(k kVar, Context context, int i10, ii.a aVar, a aVar2, m4.c cVar) {
        super(context, i10, 0, false, aVar, aVar2, null, cVar);
        this.f41317d3 = kVar;
    }

    @Override
    public final void k0(int i10, int i11) {
        i iVar;
        if (!canScrollVertically(1) && (iVar = this.f41317d3.f41410y) != null && iVar.h) {
            iVar.d();
        }
    }
}
