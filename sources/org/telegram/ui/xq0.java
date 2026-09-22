package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class xq0 implements org.telegram.ui.Components.zl0 {
    public final cr0 f39737a;

    public xq0(cr0 cr0Var) {
        this.f39737a = cr0Var;
    }

    @Override
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        cr0 cr0Var = this.f39737a;
        cr0Var.W = z10 ? 1 : 0;
        if (z10) {
            d5Var = ((org.telegram.ui.ActionBar.n2) cr0Var).parentLayout;
            d5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        cr0Var.K.e1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f39737a.L.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f39737a.X && (view instanceof org.telegram.ui.Cells.u5)) {
            org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
            u5Var.f21629w.b(u5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        Object obj;
        cr0 cr0Var = this.f39737a;
        MediaController.AlbumEntry albumEntry = cr0Var.J;
        if (albumEntry != null) {
            obj = Integer.valueOf(albumEntry.photos.get(i10).imageId);
        } else {
            obj = ((MediaController.SearchImage) cr0Var.f32861f.get(i10)).f15831id;
        }
        return cr0Var.f32855b.containsKey(obj);
    }
}
