package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class xq0 implements org.telegram.ui.Components.nl0 {
    public final cr0 f39689a;

    public xq0(cr0 cr0Var) {
        this.f39689a = cr0Var;
    }

    @Override
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.e5 e5Var;
        cr0 cr0Var = this.f39689a;
        cr0Var.W = z10 ? 1 : 0;
        if (z10) {
            e5Var = ((org.telegram.ui.ActionBar.o2) cr0Var).parentLayout;
            e5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        cr0Var.K.e1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f39689a.L.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f39689a.X && (view instanceof org.telegram.ui.Cells.s5)) {
            org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
            s5Var.f20966w.b(s5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        Object obj;
        cr0 cr0Var = this.f39689a;
        MediaController.AlbumEntry albumEntry = cr0Var.J;
        if (albumEntry != null) {
            obj = Integer.valueOf(albumEntry.photos.get(i10).imageId);
        } else {
            obj = ((MediaController.SearchImage) cr0Var.f32879f.get(i10)).f15607id;
        }
        return cr0Var.f32873b.containsKey(obj);
    }
}
