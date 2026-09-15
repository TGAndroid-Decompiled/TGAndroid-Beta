package org.telegram.ui.web;

import android.content.Context;
import org.telegram.ui.Components.e61;
public final class c extends e61 {
    public final k f38885f3;

    public c(k kVar, Context context, int i10, hi.a aVar, a aVar2, o0.a aVar3) {
        super(context, i10, 0, false, aVar, aVar2, null, aVar3);
        this.f38885f3 = kVar;
    }

    @Override
    public final void k0(int i10, int i11) {
        i iVar;
        if (!canScrollVertically(1) && (iVar = this.f38885f3.f39009y) != null && iVar.h) {
            iVar.d();
        }
    }
}
