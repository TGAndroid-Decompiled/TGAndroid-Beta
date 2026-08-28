package org.telegram.ui.web;

import android.content.Context;
import kh.b8;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Components.i51;
public final class c extends i51 {
    public final k f43818b3;

    public c(k kVar, Context context, int i9, b8 b8Var, a aVar, e3 e3Var) {
        super(context, i9, 0, false, b8Var, aVar, null, e3Var);
        this.f43818b3 = kVar;
    }

    @Override
    public final void k0(int i9, int i10) {
        i iVar;
        if (!canScrollVertically(1) && (iVar = this.f43818b3.f43915y) != null && iVar.h) {
            iVar.d();
        }
    }
}
