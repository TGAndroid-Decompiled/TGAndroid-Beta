package org.telegram.ui.web;

import android.content.Context;
import org.telegram.ui.Components.r61;
public final class c extends r61 {
    public final k f39035f3;

    public c(k kVar, Context context, int i10, hi.a aVar, a aVar2, o0.a aVar3) {
        super(context, i10, 0, false, aVar, aVar2, null, aVar3);
        this.f39035f3 = kVar;
    }

    @Override
    public final void k0(int i10, int i11) {
        i iVar;
        if (!canScrollVertically(1) && (iVar = this.f39035f3.f39125y) != null && iVar.h) {
            iVar.d();
        }
    }
}
