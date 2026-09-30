package org.telegram.ui.web;

import android.content.Context;
import org.telegram.ui.Components.u61;
public final class c extends u61 {
    public final k f39124m3;

    public c(k kVar, Context context, int i10, hi.a aVar, a aVar2, o0.a aVar3) {
        super(context, i10, 0, false, aVar, aVar2, null, aVar3);
        this.f39124m3 = kVar;
    }

    @Override
    public final void l0(int i10, int i11) {
        i iVar;
        if (!canScrollVertically(1) && (iVar = this.f39124m3.f39214y) != null && iVar.h) {
            iVar.d();
        }
    }
}
