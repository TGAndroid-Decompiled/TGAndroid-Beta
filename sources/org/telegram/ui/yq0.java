package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class yq0 implements org.telegram.ui.Components.xm0 {
    public final dr0 f44545a;

    public yq0(dr0 dr0Var) {
        this.f44545a = dr0Var;
    }

    @Override
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        dr0 dr0Var = this.f44545a;
        dr0Var.W = z10 ? 1 : 0;
        if (z10) {
            b5Var = ((org.telegram.ui.ActionBar.m2) dr0Var).parentLayout;
            b5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        dr0Var.K.d1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f44545a.L.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f44545a.X && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.f22820w.b(t5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        Object obj;
        dr0 dr0Var = this.f44545a;
        MediaController.AlbumEntry albumEntry = dr0Var.J;
        if (albumEntry != null) {
            obj = Integer.valueOf(albumEntry.photos.get(i10).imageId);
        } else {
            obj = ((MediaController.SearchImage) dr0Var.f36878f.get(i10)).f16998id;
        }
        return dr0Var.f36871b.containsKey(obj);
    }
}
