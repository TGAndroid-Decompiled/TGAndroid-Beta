package org.telegram.ui.web;

import android.content.Context;
import org.telegram.ui.Components.b71;
public final class c extends b71 {
    public final k f42602d3;

    public c(k kVar, Context context, int i10, hg.o oVar, a aVar, mi.q qVar) {
        super(context, i10, 0, false, oVar, aVar, null, qVar);
        this.f42602d3 = kVar;
    }

    @Override
    public final void k0(int i10, int i11) {
        i iVar;
        if (!canScrollVertically(1) && (iVar = this.f42602d3.f42696y) != null && iVar.h) {
            iVar.d();
        }
    }
}
