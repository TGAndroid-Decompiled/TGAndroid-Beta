package org.telegram.ui.web;

import android.content.Context;
import org.telegram.ui.Components.i71;
public final class c extends i71 {
    public final k f40977d3;

    public c(k kVar, Context context, int i10, ii.a aVar, a aVar2, m2.t tVar) {
        super(context, i10, 0, false, aVar, aVar2, null, tVar);
        this.f40977d3 = kVar;
    }

    @Override
    public final void k0(int i10, int i11) {
        i iVar;
        if (!canScrollVertically(1) && (iVar = this.f40977d3.f41101y) != null && iVar.h) {
            iVar.d();
        }
    }
}
