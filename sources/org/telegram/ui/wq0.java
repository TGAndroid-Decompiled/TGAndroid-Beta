package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class wq0 implements org.telegram.ui.Components.sm0 {
    public final br0 f43790a;

    public wq0(br0 br0Var) {
        this.f43790a = br0Var;
    }

    @Override
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        br0 br0Var = this.f43790a;
        br0Var.W = z10 ? 1 : 0;
        if (z10) {
            d5Var = ((org.telegram.ui.ActionBar.n2) br0Var).parentLayout;
            d5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        br0Var.K.d1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f43790a.L.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f43790a.X && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.f23060w.b(t5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        Object obj;
        br0 br0Var = this.f43790a;
        MediaController.AlbumEntry albumEntry = br0Var.J;
        if (albumEntry != null) {
            obj = Integer.valueOf(albumEntry.photos.get(i10).imageId);
        } else {
            obj = ((MediaController.SearchImage) br0Var.f36442f.get(i10)).f17250id;
        }
        return br0Var.f36435b.containsKey(obj);
    }
}
