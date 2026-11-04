package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
public final class ro0 extends org.telegram.ui.Components.sc {
    public final Path f49252t1;
    public final PhotoViewer f49253u1;

    public ro0(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, lq0 lq0Var, org.telegram.ui.Components.qt0 qt0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.x9 x9Var, xm0 xm0Var) {
        super(contextThemeWrapper, lq0Var, qt0Var, frameLayout, e6Var, x9Var, xm0Var);
        this.f49253u1 = photoViewer;
        this.f49252t1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.W(this.f49253u1);
    }

    @Override
    public final void B() {
        z();
        qo0 qo0Var = this.f49253u1.V1;
        if (qo0Var != null) {
            qo0Var.z();
        }
    }

    @Override
    public final boolean G() {
        kq0 kq0Var = this.f49253u1.d;
        if (kq0Var != null && kq0Var.l()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f49253u1;
        org.telegram.ui.Components.ac acVar = photoViewer.f41502o7;
        if (acVar != null && org.telegram.ui.Components.ac.f31784w == acVar) {
            return false;
        }
        return photoViewer.W2(photoViewer.f41420f0);
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void h(org.telegram.ui.Components.ba baVar, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11) {
        int i3;
        int i10;
        boolean z12;
        canvas.save();
        Path path = this.f49252t1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f49253u1;
        if (z11) {
            canvas.translate(((-getX()) - photoViewer.Z1.getX()) + f11, ((-getY()) - photoViewer.Z1.getY()) + f12);
        } else {
            canvas.translate(f11, f12);
        }
        if (z10) {
            i3 = -8882056;
        } else {
            i3 = -14277082;
        }
        int r12 = org.telegram.ui.ActionBar.k6.r1(1.0f, i3);
        if (z11) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 855638016;
            }
        } else {
            i10 = 1140850688;
        }
        int r13 = org.telegram.ui.ActionBar.k6.r1(1.0f, i10);
        boolean z13 = !z10;
        if (!z10 && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        photoViewer.U0(canvas, baVar, r12, r13, false, z13, z12);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i3;
        if (org.telegram.messenger.az.f21619c0 && ((i3 = this.f49253u1.f41499o4) == 1 || i3 == 2 || i3 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f10, float f11) {
        if (!this.f13155p0 && this.f49253u1.f41562v4 != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void w() {
        boolean z10 = true;
        this.N.setReversed(true);
        this.N.getAdapter().f16992c = false;
        this.N.getAdapter().d = false;
        this.N.getAdapter().f16995e = false;
        PhotoViewer photoViewer = this.f49253u1;
        if (photoViewer.f41481m4 != null) {
            this.N.getAdapter().f17006n0 = false;
            this.N.getAdapter().W(photoViewer.f41481m4.f51453q8);
            kg.e1 adapter = this.N.getAdapter();
            if (photoViewer.f41481m4.f51292e == null) {
                z10 = false;
            }
            adapter.f16998f0 = z10;
        } else {
            this.N.getAdapter().f17006n0 = true;
            this.N.getAdapter().W(null);
            this.N.getAdapter().f16998f0 = false;
        }
        this.N.getAdapter().f16999g0 = false;
        this.N.setLayoutParams(b8.mf.e(-1, -1, 51));
    }

    @Override
    public final void x(int r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ro0.x(int):void");
    }

    @Override
    public final void y() {
        gi.i iVar = this.N;
        if (iVar != null) {
            iVar.setTranslationY(getEditTextHeight());
        }
    }
}
