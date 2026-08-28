package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class vp0 implements org.telegram.ui.Components.xk0 {
    public final zp0 f43560a;

    public vp0(zp0 zp0Var) {
        this.f43560a = zp0Var;
    }

    @Override
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        zp0 zp0Var = this.f43560a;
        zp0Var.S = z10 ? 1 : 0;
        if (z10) {
            b5Var = ((org.telegram.ui.ActionBar.o2) zp0Var).parentLayout;
            b5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        zp0Var.G.d1(true);
    }

    @Override
    public final boolean b(int i9) {
        if (this.f43560a.H.j(i9) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f43560a.T && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.f25691w.d(t5Var);
        }
    }

    @Override
    public final boolean d(int i9) {
        Object obj;
        zp0 zp0Var = this.f43560a;
        MediaController.AlbumEntry albumEntry = zp0Var.F;
        if (albumEntry != null) {
            obj = Integer.valueOf(albumEntry.photos.get(i9).imageId);
        } else {
            obj = ((MediaController.SearchImage) zp0Var.f45215f.get(i9)).f19643id;
        }
        return zp0Var.f45208b.containsKey(obj);
    }
}
