package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedConfig;
public final class zr0 extends org.telegram.ui.Components.ad {
    public final Path f45241p1;
    public final PhotoViewer f45242q1;

    public zr0(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, au0 au0Var, org.telegram.ui.Components.xu0 xu0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.Components.ba baVar, gq0 gq0Var) {
        super(contextThemeWrapper, au0Var, xu0Var, frameLayout, b6Var, baVar, gq0Var);
        this.f45242q1 = photoViewer;
        this.f45241p1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.V(this.f45242q1);
    }

    @Override
    public final void B() {
        z();
        yr0 yr0Var = this.f45242q1.Q1;
        if (yr0Var != null) {
            yr0Var.z();
        }
    }

    @Override
    public final boolean G() {
        zt0 zt0Var = this.f45242q1.d;
        if (zt0Var != null && zt0Var.l()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f45242q1;
        org.telegram.ui.Components.gc gcVar = photoViewer.f35670j7;
        if (gcVar != null && org.telegram.ui.Components.gc.f28729w == gcVar) {
            return false;
        }
        return photoViewer.T2(photoViewer.f35580a0);
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void h(org.telegram.ui.Components.fa faVar, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11) {
        int i9;
        int i10;
        boolean z12;
        canvas.save();
        Path path = this.f45241p1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f45242q1;
        if (z11) {
            canvas.translate(((-getX()) - photoViewer.U1.getX()) + f11, ((-getY()) - photoViewer.U1.getY()) + f12);
        } else {
            canvas.translate(f11, f12);
        }
        if (z10) {
            i9 = -8882056;
        } else {
            i9 = -14277082;
        }
        int l1 = org.telegram.ui.ActionBar.f6.l1(1.0f, i9);
        if (z11) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 855638016;
            }
        } else {
            i10 = 1140850688;
        }
        int l12 = org.telegram.ui.ActionBar.f6.l1(1.0f, i10);
        boolean z13 = !z10;
        if (!z10 && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        photoViewer.T0(canvas, faVar, l1, l12, false, z13, z12);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i9;
        if (SharedConfig.photoViewerBlur && ((i9 = this.f45242q1.f35667j4) == 1 || i9 == 2 || i9 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f10, float f11) {
        if (!this.f15639l0 && this.f45242q1.f35727q4 != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void w() {
        boolean z10 = true;
        this.I.setReversed(true);
        this.I.getAdapter().f19322c = false;
        this.I.getAdapter().d = false;
        this.I.getAdapter().f19325e = false;
        PhotoViewer photoViewer = this.f45242q1;
        if (photoViewer.f35649h4 != null) {
            this.I.getAdapter().f19331i0 = false;
            this.I.getAdapter().W(photoViewer.f35649h4.V7);
            of.f1 adapter = this.I.getAdapter();
            if (photoViewer.f35649h4.f41890e == null) {
                z10 = false;
            }
            adapter.f19320a0 = z10;
        } else {
            this.I.getAdapter().f19331i0 = true;
            this.I.getAdapter().W(null);
            this.I.getAdapter().f19320a0 = false;
        }
        this.I.getAdapter().f19321b0 = false;
        this.I.setLayoutParams(g7.e6.e(-1, -1, 51));
    }

    @Override
    public final void x(int r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zr0.x(int):void");
    }

    @Override
    public final void y() {
        kh.i iVar = this.I;
        if (iVar != null) {
            iVar.setTranslationY(getEditTextHeight());
        }
    }
}
