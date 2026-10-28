package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class qs0 extends org.telegram.ui.Components.jd {
    public final Path f42780t1;
    public final PhotoViewer f42781u1;

    public qs0(PhotoViewer photoViewer, Context context, ru0 ru0Var, org.telegram.ui.Components.ww0 ww0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.Components.la laVar, zq0 zq0Var) {
        super(context, ru0Var, ww0Var, frameLayout, u6Var, laVar, zq0Var);
        this.f42781u1 = photoViewer;
        this.f42780t1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.X(this.f42781u1);
    }

    @Override
    public final void B() {
        z();
        rs0 rs0Var = this.f42781u1.V1;
        if (rs0Var != null) {
            rs0Var.z();
        }
    }

    @Override
    public final boolean G() {
        qu0 qu0Var = this.f42781u1.d;
        if (qu0Var != null && qu0Var.l()) {
            return true;
        }
        return false;
    }

    public final void I() {
        boolean z10;
        PhotoViewer photoViewer = this.f42781u1;
        qu0 qu0Var = photoViewer.d;
        if (qu0Var != null && qu0Var.l() && (photoViewer.U1.L.c() || (!photoViewer.f35785r1 && !TextUtils.isEmpty(photoViewer.h1().getText())))) {
            z10 = true;
        } else {
            z10 = false;
        }
        D(z10, true);
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f42781u1;
        org.telegram.ui.Components.qc qcVar = photoViewer.f35755n7;
        if (qcVar != null && org.telegram.ui.Components.qc.f31854x == qcVar) {
            return false;
        }
        return photoViewer.W2(photoViewer.f35670e0);
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void h(org.telegram.ui.Components.pa paVar, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11) {
        int i10;
        int i11;
        boolean z12;
        canvas.save();
        Path path = this.f42780t1;
        path.rewind();
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f42781u1;
        if (z11) {
            canvas.translate(((-getX()) - photoViewer.X1.getX()) + f10, ((-getY()) - photoViewer.X1.getY()) + f11);
        } else {
            canvas.translate(f10, f11);
        }
        if (z10) {
            i10 = -8882056;
        } else {
            i10 = -14277082;
        }
        int o12 = org.telegram.ui.ActionBar.y6.o1(1.0f, i10);
        if (z11) {
            if (z10) {
                i11 = 0;
            } else {
                i11 = 855638016;
            }
        } else {
            i11 = 1140850688;
        }
        int o13 = org.telegram.ui.ActionBar.y6.o1(1.0f, i11);
        boolean z13 = !z10;
        if (!z10 && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        photoViewer.U0(canvas, paVar, o12, o13, false, z13, z12);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.f42781u1.f35752n4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f7, float f10) {
        if (!this.f11209p0 && this.f42781u1.f35815u4 != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void setText(CharSequence charSequence) {
        super.setText(charSequence);
        I();
    }

    @Override
    public final void u(float f7) {
        int i10;
        int i11;
        super.u(f7);
        PhotoViewer photoViewer = this.f42781u1;
        org.telegram.ui.ActionBar.k0 k0Var = photoViewer.f35671e1;
        float f10 = 1.0f - f7;
        int i12 = 0;
        if (k0Var.getTag() != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        k0Var.setAlpha(i10 * f10);
        org.telegram.ui.Components.ca0 ca0Var = photoViewer.f35681f1;
        if (ca0Var.getTag() != null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        ca0Var.setAlpha(i11 * f10);
        FrameLayout frameLayout = photoViewer.R7;
        if (frameLayout.getTag() != null) {
            i12 = 1;
        }
        frameLayout.setAlpha(f10 * i12);
    }

    @Override
    public final void w() {
        this.M.getAdapter().f14111c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().e = false;
        PhotoViewer photoViewer = this.f42781u1;
        boolean z10 = true;
        if (photoViewer.l4 != null) {
            this.M.getAdapter().m0 = false;
            this.M.getAdapter().W(photoViewer.l4.f45245p8);
            ig.j1 adapter = this.M.getAdapter();
            if (photoViewer.l4.e == null) {
                z10 = false;
            }
            adapter.f14114e0 = z10;
        } else {
            this.M.getAdapter().m0 = true;
            this.M.getAdapter().W(null);
            this.M.getAdapter().f14114e0 = false;
        }
        this.M.getAdapter().f14116f0 = false;
    }

    @Override
    public final void x(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qs0.x(int):void");
    }

    @Override
    public final void y() {
        fi.i iVar = this.M;
        if (iVar != null) {
            iVar.setTranslationY(((-getEditTextHeight()) - AndroidUtilities.dp(14.0f)) - this.L.f12064l);
        }
    }
}
