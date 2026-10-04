package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedConfig;
public final class xs0 extends org.telegram.ui.Components.md {
    public final Path f42939t1;
    public final PhotoViewer f42940u1;

    public xs0(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, xu0 xu0Var, org.telegram.ui.Components.lw0 lw0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.ka kaVar, dr0 dr0Var) {
        super(contextThemeWrapper, xu0Var, lw0Var, frameLayout, d6Var, kaVar, dr0Var);
        this.f42940u1 = photoViewer;
        this.f42939t1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.U(this.f42940u1);
    }

    @Override
    public final void B() {
        z();
        ws0 ws0Var = this.f42940u1.U1;
        if (ws0Var != null) {
            ws0Var.z();
        }
    }

    @Override
    public final boolean G() {
        wu0 wu0Var = this.f42940u1.d;
        if (wu0Var != null && wu0Var.l()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f42940u1;
        org.telegram.ui.Components.rc rcVar = photoViewer.f33978n7;
        if (rcVar != null && org.telegram.ui.Components.rc.f30330w == rcVar) {
            return false;
        }
        return photoViewer.T2(photoViewer.f33894e0);
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void h(org.telegram.ui.Components.oa oaVar, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11) {
        int i10;
        int i11;
        boolean z12;
        canvas.save();
        Path path = this.f42939t1;
        path.rewind();
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f42940u1;
        if (z11) {
            canvas.translate(((-getX()) - photoViewer.Y1.getX()) + f10, ((-getY()) - photoViewer.Y1.getY()) + f11);
        } else {
            canvas.translate(f10, f11);
        }
        if (z10) {
            i10 = -8882056;
        } else {
            i10 = -14277082;
        }
        int l1 = org.telegram.ui.ActionBar.i6.l1(1.0f, i10);
        if (z11) {
            if (z10) {
                i11 = 0;
            } else {
                i11 = 855638016;
            }
        } else {
            i11 = 1140850688;
        }
        int l12 = org.telegram.ui.ActionBar.i6.l1(1.0f, i11);
        boolean z13 = !z10;
        if (!z10 && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        photoViewer.T0(canvas, oaVar, l1, l12, false, z13, z12);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.f42940u1.f33975n4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f7, float f10) {
        if (!this.f5528p0 && this.f42940u1.f34038u4 != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void w() {
        boolean z10 = true;
        this.M.setReversed(true);
        this.M.getAdapter().f10669c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().f10672e = false;
        PhotoViewer photoViewer = this.f42940u1;
        if (photoViewer.l4 != null) {
            this.M.getAdapter().m0 = false;
            this.M.getAdapter().W(photoViewer.l4.X7);
            gg.k1 adapter = this.M.getAdapter();
            if (photoViewer.l4.f43314e == null) {
                z10 = false;
            }
            adapter.f10673e0 = z10;
        } else {
            this.M.getAdapter().m0 = true;
            this.M.getAdapter().W(null);
            this.M.getAdapter().f10673e0 = false;
        }
        this.M.getAdapter().f10675f0 = false;
        this.M.setLayoutParams(w7.z5.e(-1, -1, 51));
    }

    @Override
    public final void x(int r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xs0.x(int):void");
    }

    @Override
    public final void y() {
        ci.i iVar = this.M;
        if (iVar != null) {
            iVar.setTranslationY(getEditTextHeight());
        }
    }
}
