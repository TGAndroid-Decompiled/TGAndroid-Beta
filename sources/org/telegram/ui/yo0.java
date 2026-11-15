package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
public final class yo0 extends org.telegram.ui.Components.pc {
    public final Path f53566t1;
    public final PhotoViewer f53567u1;

    public yo0(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, tq0 tq0Var, org.telegram.ui.Components.st0 st0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.u9 u9Var, en0 en0Var) {
        super(contextThemeWrapper, tq0Var, st0Var, frameLayout, e6Var, u9Var, en0Var);
        this.f53567u1 = photoViewer;
        this.f53566t1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.P(this.f53567u1);
    }

    @Override
    public final void B() {
        z();
        xo0 xo0Var = this.f53567u1.V1;
        if (xo0Var != null) {
            xo0Var.z();
        }
    }

    @Override
    public final boolean G() {
        sq0 sq0Var = this.f53567u1.d;
        if (sq0Var != null && sq0Var.l()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f53567u1;
        org.telegram.ui.Components.xb xbVar = photoViewer.f42837n7;
        if (xbVar != null && org.telegram.ui.Components.xb.f41627w == xbVar) {
            return false;
        }
        return photoViewer.R2(photoViewer.f42763f0);
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void h(org.telegram.ui.Components.y9 y9Var, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11) {
        int i7;
        int i10;
        boolean z12;
        canvas.save();
        Path path = this.f53566t1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f53567u1;
        if (z11) {
            canvas.translate(((-getX()) - photoViewer.Z1.getX()) + f11, ((-getY()) - photoViewer.Z1.getY()) + f12);
        } else {
            canvas.translate(f11, f12);
        }
        if (z10) {
            i7 = -8882056;
        } else {
            i7 = -14277082;
        }
        int r12 = org.telegram.ui.ActionBar.j6.r1(1.0f, i7);
        if (z11) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 855638016;
            }
        } else {
            i10 = 1140850688;
        }
        int r13 = org.telegram.ui.ActionBar.j6.r1(1.0f, i10);
        boolean z13 = !z10;
        if (!z10 && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        photoViewer.N0(canvas, y9Var, r12, r13, false, z13, z12);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i7;
        if (org.telegram.messenger.gz.f23939c0 && ((i7 = this.f53567u1.f42834n4) == 1 || i7 == 2 || i7 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f10, float f11) {
        if (!this.f14634p0 && this.f53567u1.f42896u4 != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void w() {
        boolean z10 = true;
        this.N.setReversed(true);
        this.N.getAdapter().f17119c = false;
        this.N.getAdapter().d = false;
        this.N.getAdapter().f17122e = false;
        PhotoViewer photoViewer = this.f53567u1;
        if (photoViewer.f42817l4 != null) {
            this.N.getAdapter().f17133n0 = false;
            this.N.getAdapter().W(photoViewer.f42817l4.f45333q8);
            jg.h1 adapter = this.N.getAdapter();
            if (photoViewer.f42817l4.f45172e == null) {
                z10 = false;
            }
            adapter.f17125f0 = z10;
        } else {
            this.N.getAdapter().f17133n0 = true;
            this.N.getAdapter().W(null);
            this.N.getAdapter().f17125f0 = false;
        }
        this.N.getAdapter().f17126g0 = false;
        this.N.setLayoutParams(c8.ja.e(-1, -1, 51));
    }

    @Override
    public final void x(int r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yo0.x(int):void");
    }

    @Override
    public final void y() {
        hi.i iVar = this.N;
        if (iVar != null) {
            iVar.setTranslationY(getEditTextHeight());
        }
    }
}
