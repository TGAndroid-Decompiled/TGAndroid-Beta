package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class wq0 implements org.telegram.ui.Components.ml0 {
    public final br0 f42461a;

    public wq0(br0 br0Var) {
        this.f42461a = br0Var;
    }

    @Override
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        br0 br0Var = this.f42461a;
        br0Var.W = z10 ? 1 : 0;
        if (z10) {
            d5Var = ((org.telegram.ui.ActionBar.n2) br0Var).parentLayout;
            d5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        br0Var.K.c1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f42461a.L.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f42461a.X && (view instanceof org.telegram.ui.Cells.s5)) {
            org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
            s5Var.f22839w.c(s5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        Object obj;
        br0 br0Var = this.f42461a;
        MediaController.AlbumEntry albumEntry = br0Var.J;
        if (albumEntry != null) {
            obj = Integer.valueOf(albumEntry.photos.get(i10).imageId);
        } else {
            obj = ((MediaController.SearchImage) br0Var.f34890f.get(i10)).f17074id;
        }
        return br0Var.f34883b.containsKey(obj);
    }
}
