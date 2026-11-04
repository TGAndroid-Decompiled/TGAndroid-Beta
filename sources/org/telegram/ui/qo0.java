package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class qo0 extends org.telegram.ui.Components.sc {
    public final Path f48931t1;
    public final PhotoViewer f48932u1;

    public qo0(PhotoViewer photoViewer, Context context, lq0 lq0Var, org.telegram.ui.Components.qt0 qt0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.x9 x9Var, xm0 xm0Var) {
        super(context, lq0Var, qt0Var, frameLayout, e6Var, x9Var, xm0Var);
        this.f48932u1 = photoViewer;
        this.f48931t1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.W(this.f48932u1);
    }

    @Override
    public final void B() {
        z();
        ro0 ro0Var = this.f48932u1.W1;
        if (ro0Var != null) {
            ro0Var.z();
        }
    }

    @Override
    public final boolean G() {
        kq0 kq0Var = this.f48932u1.d;
        if (kq0Var != null && kq0Var.l()) {
            return true;
        }
        return false;
    }

    public final void I() {
        boolean z10;
        PhotoViewer photoViewer = this.f48932u1;
        kq0 kq0Var = photoViewer.d;
        if (kq0Var != null && kq0Var.l() && (photoViewer.V1.M.c() || (!photoViewer.f41533s1 && !TextUtils.isEmpty(photoViewer.h1().getText())))) {
            z10 = true;
        } else {
            z10 = false;
        }
        D(z10, true);
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f48932u1;
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
        Path path = this.f48931t1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f48932u1;
        if (z11) {
            canvas.translate(((-getX()) - photoViewer.Y1.getX()) + f11, ((-getY()) - photoViewer.Y1.getY()) + f12);
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
        if (org.telegram.messenger.az.f21619c0 && ((i3 = this.f48932u1.f41499o4) == 1 || i3 == 2 || i3 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f10, float f11) {
        if (!this.f13155p0 && this.f48932u1.f41562v4 != 0) {
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
    public final void u(float f10) {
        int i3;
        int i10;
        super.u(f10);
        PhotoViewer photoViewer = this.f48932u1;
        org.telegram.ui.ActionBar.e0 e0Var = photoViewer.f41421f1;
        float f11 = 1.0f - f10;
        int i11 = 0;
        if (e0Var.getTag() != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        e0Var.setAlpha(i3 * f11);
        org.telegram.ui.Components.u70 u70Var = photoViewer.f41430g1;
        if (u70Var.getTag() != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        u70Var.setAlpha(i10 * f11);
        FrameLayout frameLayout = photoViewer.S7;
        if (frameLayout.getTag() != null) {
            i11 = 1;
        }
        frameLayout.setAlpha(f11 * i11);
    }

    @Override
    public final void w() {
        this.N.getAdapter().f16992c = false;
        this.N.getAdapter().d = false;
        this.N.getAdapter().f16995e = false;
        PhotoViewer photoViewer = this.f48932u1;
        boolean z10 = true;
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
    }

    @Override
    public final void x(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qo0.x(int):void");
    }

    @Override
    public final void y() {
        gi.i iVar = this.N;
        if (iVar != null) {
            iVar.setTranslationY(((-getEditTextHeight()) - org.telegram.messenger.g0.L(14.0f)) - this.M.f13367l);
        }
    }
}
