package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class wq0 implements org.telegram.ui.Components.wl0 {
    public final br0 f38316a;

    public wq0(br0 br0Var) {
        this.f38316a = br0Var;
    }

    @Override
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.f5 f5Var;
        br0 br0Var = this.f38316a;
        br0Var.W = z10 ? 1 : 0;
        if (z10) {
            f5Var = ((org.telegram.ui.ActionBar.p2) br0Var).parentLayout;
            f5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        br0Var.K.c1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f38316a.L.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f38316a.X && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.f20441w.a(t5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        Object obj;
        br0 br0Var = this.f38316a;
        MediaController.AlbumEntry albumEntry = br0Var.J;
        if (albumEntry != null) {
            obj = Integer.valueOf(albumEntry.photos.get(i10).imageId);
        } else {
            obj = ((MediaController.SearchImage) br0Var.f31371f.get(i10)).f14639id;
        }
        return br0Var.f31365b.containsKey(obj);
    }
}
