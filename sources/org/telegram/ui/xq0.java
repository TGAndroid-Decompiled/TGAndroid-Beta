package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class xq0 implements org.telegram.ui.Components.xl0 {
    public final cr0 f39612a;

    public xq0(cr0 cr0Var) {
        this.f39612a = cr0Var;
    }

    @Override
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        cr0 cr0Var = this.f39612a;
        cr0Var.W = z10 ? 1 : 0;
        if (z10) {
            d5Var = ((org.telegram.ui.ActionBar.n2) cr0Var).parentLayout;
            d5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        cr0Var.K.e1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f39612a.L.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f39612a.X && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.f21169w.a(t5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        Object obj;
        cr0 cr0Var = this.f39612a;
        MediaController.AlbumEntry albumEntry = cr0Var.J;
        if (albumEntry != null) {
            obj = Integer.valueOf(albumEntry.photos.get(i10).imageId);
        } else {
            obj = ((MediaController.SearchImage) cr0Var.f32768f.get(i10)).f15784id;
        }
        return cr0Var.f32762b.containsKey(obj);
    }
}
