package org.telegram.ui.web;

import android.content.Context;
import org.telegram.ui.Components.l71;
public final class c extends l71 {
    public final k f43496d3;

    public c(k kVar, Context context, int i10, hi.a aVar, a aVar2, n7.z0 z0Var) {
        super(context, i10, 0, false, aVar, aVar2, null, z0Var);
        this.f43496d3 = kVar;
    }

    @Override
    public final void k0(int i10, int i11) {
        i iVar;
        if (!canScrollVertically(1) && (iVar = this.f43496d3.f43598y) != null && iVar.h) {
            iVar.d();
        }
    }
}
