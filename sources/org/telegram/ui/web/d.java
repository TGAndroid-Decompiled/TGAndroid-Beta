package org.telegram.ui.web;

import android.content.Context;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.r71;
public final class d extends r71 {
    public final l f45211n3;

    public d(l lVar, Context context, int i10, hi.e2 e2Var, a aVar, h5 h5Var) {
        super(context, i10, 0, false, e2Var, aVar, null, h5Var);
        this.f45211n3 = lVar;
    }

    @Override
    public final void l0(int i10) {
        j jVar;
        if (!canScrollVertically(1) && (jVar = this.f45211n3.f45305y) != null && jVar.h) {
            jVar.d();
        }
    }
}
