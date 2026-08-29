package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedConfig;
public final class yr0 extends org.telegram.ui.Components.ed {
    public final Path f44960p1;
    public final PhotoViewer f44961q1;

    public yr0(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, yt0 yt0Var, org.telegram.ui.Components.hv0 hv0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.ga gaVar, gq0 gq0Var) {
        super(contextThemeWrapper, yt0Var, hv0Var, frameLayout, c6Var, gaVar, gq0Var);
        this.f44961q1 = photoViewer;
        this.f44960p1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.W(this.f44961q1);
    }

    @Override
    public final void B() {
        z();
        xr0 xr0Var = this.f44961q1.Q1;
        if (xr0Var != null) {
            xr0Var.z();
        }
    }

    @Override
    public final boolean G() {
        xt0 xt0Var = this.f44961q1.d;
        if (xt0Var != null && xt0Var.l()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f44961q1;
        org.telegram.ui.Components.mc mcVar = photoViewer.f35736j7;
        if (mcVar != null && org.telegram.ui.Components.mc.f30644w == mcVar) {
            return false;
        }
        return photoViewer.T2(photoViewer.f35647a0);
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void h(org.telegram.ui.Components.ka kaVar, Canvas canvas, RectF rectF, float f9, boolean z10, float f10, float f11, boolean z11) {
        int i10;
        int i11;
        boolean z12;
        canvas.save();
        Path path = this.f44960p1;
        path.rewind();
        path.addRoundRect(rectF, f9, f9, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f44961q1;
        if (z11) {
            canvas.translate(((-getX()) - photoViewer.U1.getX()) + f10, ((-getY()) - photoViewer.U1.getY()) + f11);
        } else {
            canvas.translate(f10, f11);
        }
        if (z10) {
            i10 = -8882056;
        } else {
            i10 = -14277082;
        }
        int l1 = org.telegram.ui.ActionBar.g6.l1(1.0f, i10);
        if (z11) {
            if (z10) {
                i11 = 0;
            } else {
                i11 = 855638016;
            }
        } else {
            i11 = 1140850688;
        }
        int l12 = org.telegram.ui.ActionBar.g6.l1(1.0f, i11);
        boolean z13 = !z10;
        if (!z10 && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        photoViewer.T0(canvas, kaVar, l1, l12, false, z13, z12);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.f44961q1.f35733j4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f9, float f10) {
        if (!this.f18083l0 && this.f44961q1.f35795q4 != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void w() {
        boolean z10 = true;
        this.I.setReversed(true);
        this.I.getAdapter().f47364c = false;
        this.I.getAdapter().d = false;
        this.I.getAdapter().f47367e = false;
        PhotoViewer photoViewer = this.f44961q1;
        if (photoViewer.f35715h4 != null) {
            this.I.getAdapter().f47373i0 = false;
            this.I.getAdapter().W(photoViewer.f35715h4.V7);
            rf.v0 adapter = this.I.getAdapter();
            if (photoViewer.f35715h4.f42787e == null) {
                z10 = false;
            }
            adapter.f47362a0 = z10;
        } else {
            this.I.getAdapter().f47373i0 = true;
            this.I.getAdapter().W(null);
            this.I.getAdapter().f47362a0 = false;
        }
        this.I.getAdapter().f47363b0 = false;
        this.I.setLayoutParams(i7.f6.e(-1, -1, 51));
    }

    @Override
    public final void x(int r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yr0.x(int):void");
    }

    @Override
    public final void y() {
        nh.i iVar = this.I;
        if (iVar != null) {
            iVar.setTranslationY(getEditTextHeight());
        }
    }
}
