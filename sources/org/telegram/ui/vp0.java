package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class vp0 implements org.telegram.ui.Components.kl0 {
    public final zp0 f43711a;

    public vp0(zp0 zp0Var) {
        this.f43711a = zp0Var;
    }

    @Override
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        zp0 zp0Var = this.f43711a;
        zp0Var.S = z10 ? 1 : 0;
        if (z10) {
            b5Var = ((org.telegram.ui.ActionBar.o2) zp0Var).parentLayout;
            b5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        zp0Var.G.d1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f43711a.H.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f43711a.T && (view instanceof org.telegram.ui.Cells.r5)) {
            org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
            r5Var.f25223w.d(r5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        Object obj;
        zp0 zp0Var = this.f43711a;
        MediaController.AlbumEntry albumEntry = zp0Var.F;
        if (albumEntry != null) {
            obj = Integer.valueOf(albumEntry.photos.get(i10).imageId);
        } else {
            obj = ((MediaController.SearchImage) zp0Var.f45280f.get(i10)).f19614id;
        }
        return zp0Var.f45273b.containsKey(obj);
    }
}
