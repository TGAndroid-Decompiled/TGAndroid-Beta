package org.telegram.ui.web;

import android.content.Context;
import org.telegram.ui.Components.d61;
public final class d extends d61 {
    public final l f42030f3;

    public d(l lVar, Context context, int i10, ii.a aVar, a aVar2, o0.a aVar3) {
        super(context, i10, 0, false, aVar, aVar2, null, aVar3);
        this.f42030f3 = lVar;
    }

    @Override
    public final void k0(int i10, int i11) {
        j jVar;
        if (!canScrollVertically(1) && (jVar = this.f42030f3.f42168y) != null && jVar.h) {
            jVar.d();
        }
    }
}
