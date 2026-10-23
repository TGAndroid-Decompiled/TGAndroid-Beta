package org.telegram.ui.web;

import android.content.Context;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.Components.j71;
public final class d extends j71 {
    public final l f43090g3;

    public d(l lVar, Context context, int i10, hg.o oVar, a aVar, f5 f5Var) {
        super(context, i10, 0, false, oVar, aVar, null, f5Var);
        this.f43090g3 = lVar;
    }

    @Override
    public final void k0(int i10, int i11) {
        j jVar;
        if (!canScrollVertically(1) && (jVar = this.f43090g3.f43186y) != null && jVar.h) {
            jVar.d();
        }
    }
}
