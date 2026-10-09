package org.telegram.ui.web;

import android.content.Context;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.Components.k71;
public final class c extends k71 {
    public final k f43277d3;

    public c(k kVar, Context context, int i10, hi.a aVar, a aVar2, b5 b5Var) {
        super(context, i10, 0, false, aVar, aVar2, null, b5Var);
        this.f43277d3 = kVar;
    }

    @Override
    public final void k0(int i10, int i11) {
        i iVar;
        if (!canScrollVertically(1) && (iVar = this.f43277d3.f43376y) != null && iVar.h) {
            iVar.d();
        }
    }
}
