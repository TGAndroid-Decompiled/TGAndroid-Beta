package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class xo0 extends org.telegram.ui.Components.pc {
    public final Path f53273t1;
    public final PhotoViewer f53274u1;

    public xo0(PhotoViewer photoViewer, Context context, tq0 tq0Var, org.telegram.ui.Components.st0 st0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.u9 u9Var, dn0 dn0Var) {
        super(context, tq0Var, st0Var, frameLayout, e6Var, u9Var, dn0Var);
        this.f53274u1 = photoViewer;
        this.f53273t1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.P(this.f53274u1);
    }

    @Override
    public final void B() {
        z();
        yo0 yo0Var = this.f53274u1.W1;
        if (yo0Var != null) {
            yo0Var.z();
        }
    }

    @Override
    public final boolean G() {
        sq0 sq0Var = this.f53274u1.d;
        if (sq0Var != null && sq0Var.l()) {
            return true;
        }
        return false;
    }

    public final void I() {
        boolean z10;
        PhotoViewer photoViewer = this.f53274u1;
        sq0 sq0Var = photoViewer.d;
        if (sq0Var != null && sq0Var.l() && (photoViewer.V1.M.c() || (!photoViewer.f42877s1 && !TextUtils.isEmpty(photoViewer.b1().getText())))) {
            z10 = true;
        } else {
            z10 = false;
        }
        D(z10, true);
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f53274u1;
        org.telegram.ui.Components.xb xbVar = photoViewer.f42837n7;
        if (xbVar != null && org.telegram.ui.Components.xb.f41635w == xbVar) {
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
        Path path = this.f53273t1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f53274u1;
        if (z11) {
            canvas.translate(((-getX()) - photoViewer.Y1.getX()) + f11, ((-getY()) - photoViewer.Y1.getY()) + f12);
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
        if (org.telegram.messenger.gz.f23936c0 && ((i7 = this.f53274u1.f42834n4) == 1 || i7 == 2 || i7 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f10, float f11) {
        if (!this.f14634p0 && this.f53274u1.f42896u4 != 0) {
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
        int i7;
        int i10;
        super.u(f10);
        PhotoViewer photoViewer = this.f53274u1;
        org.telegram.ui.ActionBar.f0 f0Var = photoViewer.f42764f1;
        float f11 = 1.0f - f10;
        int i11 = 0;
        if (f0Var.getTag() != null) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        f0Var.setAlpha(i7 * f11);
        org.telegram.ui.Components.b80 b80Var = photoViewer.f42773g1;
        if (b80Var.getTag() != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        b80Var.setAlpha(i10 * f11);
        FrameLayout frameLayout = photoViewer.R7;
        if (frameLayout.getTag() != null) {
            i11 = 1;
        }
        frameLayout.setAlpha(f11 * i11);
    }

    @Override
    public final void w() {
        this.N.getAdapter().f17119c = false;
        this.N.getAdapter().d = false;
        this.N.getAdapter().f17122e = false;
        PhotoViewer photoViewer = this.f53274u1;
        boolean z10 = true;
        if (photoViewer.f42817l4 != null) {
            this.N.getAdapter().f17133n0 = false;
            this.N.getAdapter().W(photoViewer.f42817l4.f45334q8);
            jg.h1 adapter = this.N.getAdapter();
            if (photoViewer.f42817l4.f45173e == null) {
                z10 = false;
            }
            adapter.f17125f0 = z10;
        } else {
            this.N.getAdapter().f17133n0 = true;
            this.N.getAdapter().W(null);
            this.N.getAdapter().f17125f0 = false;
        }
        this.N.getAdapter().f17126g0 = false;
    }

    @Override
    public final void x(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xo0.x(int):void");
    }

    @Override
    public final void y() {
        hi.i iVar = this.N;
        if (iVar != null) {
            iVar.setTranslationY(((-getEditTextHeight()) - org.telegram.messenger.g0.L(14.0f)) - this.M.f14851l);
        }
    }
}
