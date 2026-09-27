package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class rq0 implements org.telegram.ui.Components.zl0 {
    public final wq0 f37221a;

    public rq0(wq0 wq0Var) {
        this.f37221a = wq0Var;
    }

    @Override
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        wq0 wq0Var = this.f37221a;
        wq0Var.W = z10 ? 1 : 0;
        if (z10) {
            d5Var = ((org.telegram.ui.ActionBar.o2) wq0Var).parentLayout;
            d5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        wq0Var.K.e1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f37221a.L.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f37221a.X && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.f21207w.a(t5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        Object obj;
        wq0 wq0Var = this.f37221a;
        MediaController.AlbumEntry albumEntry = wq0Var.J;
        if (albumEntry != null) {
            obj = Integer.valueOf(albumEntry.photos.get(i10).imageId);
        } else {
            obj = ((MediaController.SearchImage) wq0Var.f39419f.get(i10)).f15820id;
        }
        return wq0Var.f39413b.containsKey(obj);
    }
}
