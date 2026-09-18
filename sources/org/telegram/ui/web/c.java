package org.telegram.ui.web;

import android.content.Context;
import org.telegram.ui.Components.t61;
public final class c extends t61 {
    public final k f38840f3;

    public c(k kVar, Context context, int i10, hi.a aVar, a aVar2, o0.a aVar3) {
        super(context, i10, 0, false, aVar, aVar2, null, aVar3);
        this.f38840f3 = kVar;
    }

    @Override
    public final void l0(int i10, int i11) {
        i iVar;
        if (!canScrollVertically(1) && (iVar = this.f38840f3.f38965y) != null && iVar.h) {
            iVar.d();
        }
    }
}
