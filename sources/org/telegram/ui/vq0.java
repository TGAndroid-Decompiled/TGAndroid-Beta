package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class vq0 implements org.telegram.ui.Components.ml0 {
    public final ar0 f38610a;

    public vq0(ar0 ar0Var) {
        this.f38610a = ar0Var;
    }

    @Override
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        ar0 ar0Var = this.f38610a;
        ar0Var.W = z10 ? 1 : 0;
        if (z10) {
            d5Var = ((org.telegram.ui.ActionBar.n2) ar0Var).parentLayout;
            d5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        ar0Var.K.d1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f38610a.L.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f38610a.X && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.f21344w.b(t5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        Object obj;
        ar0 ar0Var = this.f38610a;
        MediaController.AlbumEntry albumEntry = ar0Var.J;
        if (albumEntry != null) {
            obj = Integer.valueOf(albumEntry.photos.get(i10).imageId);
        } else {
            obj = ((MediaController.SearchImage) ar0Var.f31901f.get(i10)).f15595id;
        }
        return ar0Var.f31895b.containsKey(obj);
    }
}
