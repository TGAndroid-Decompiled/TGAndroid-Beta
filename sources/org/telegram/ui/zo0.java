package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class zo0 extends org.telegram.ui.Components.yc {
    public final Path f54676t1;
    public final PhotoViewer f54677u1;

    public zo0(PhotoViewer photoViewer, Context context, vq0 vq0Var, org.telegram.ui.Components.cu0 cu0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.Components.ba baVar, kn0 kn0Var) {
        super(context, vq0Var, cu0Var, frameLayout, i6Var, baVar, kn0Var);
        this.f54677u1 = photoViewer;
        this.f54676t1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.P(this.f54677u1);
    }

    @Override
    public final void B() {
        z();
        ap0 ap0Var = this.f54677u1.W1;
        if (ap0Var != null) {
            ap0Var.z();
        }
    }

    @Override
    public final boolean G() {
        uq0 uq0Var = this.f54677u1.d;
        if (uq0Var != null && uq0Var.l()) {
            return true;
        }
        return false;
    }

    public final void I() {
        boolean z10;
        PhotoViewer photoViewer = this.f54677u1;
        uq0 uq0Var = photoViewer.d;
        if (uq0Var != null && uq0Var.l() && (photoViewer.V1.M.c() || (!photoViewer.f43448s1 && !TextUtils.isEmpty(photoViewer.b1().getText())))) {
            z10 = true;
        } else {
            z10 = false;
        }
        D(z10, true);
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f54677u1;
        org.telegram.ui.Components.fc fcVar = photoViewer.f43461t7;
        if (fcVar != null && org.telegram.ui.Components.fc.f35083w == fcVar) {
            return false;
        }
        return photoViewer.S2(photoViewer.f43334f0);
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void h(org.telegram.ui.Components.fa faVar, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11) {
        int i7;
        int i10;
        boolean z12;
        canvas.save();
        Path path = this.f54676t1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f54677u1;
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
        int r12 = org.telegram.ui.ActionBar.n6.r1(1.0f, i7);
        if (z11) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 855638016;
            }
        } else {
            i10 = 1140850688;
        }
        int r13 = org.telegram.ui.ActionBar.n6.r1(1.0f, i10);
        boolean z13 = !z10;
        if (!z10 && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        photoViewer.N0(canvas, faVar, r12, r13, false, z13, z12);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i7;
        if (org.telegram.messenger.bz.f23277c0 && ((i7 = this.f54677u1.f43405n4) == 1 || i7 == 2 || i7 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f10, float f11) {
        if (!this.f14947p0 && this.f54677u1.f43467u4 != 0) {
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
        PhotoViewer photoViewer = this.f54677u1;
        org.telegram.ui.ActionBar.f0 f0Var = photoViewer.f43335f1;
        float f11 = 1.0f - f10;
        int i11 = 0;
        if (f0Var.getTag() != null) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        f0Var.setAlpha(i7 * f11);
        org.telegram.ui.Components.l80 l80Var = photoViewer.f43344g1;
        if (l80Var.getTag() != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        l80Var.setAlpha(i10 * f11);
        FrameLayout frameLayout = photoViewer.X7;
        if (frameLayout.getTag() != null) {
            i11 = 1;
        }
        frameLayout.setAlpha(f11 * i11);
    }

    @Override
    public final void w() {
        this.N.getAdapter().f17598c = false;
        this.N.getAdapter().d = false;
        this.N.getAdapter().f17601e = false;
        PhotoViewer photoViewer = this.f54677u1;
        boolean z10 = true;
        if (photoViewer.f43388l4 != null) {
            this.N.getAdapter().f17612n0 = false;
            this.N.getAdapter().W(photoViewer.f43388l4.f46349r8);
            jg.h1 adapter = this.N.getAdapter();
            if (photoViewer.f43388l4.f46173e == null) {
                z10 = false;
            }
            adapter.f17604f0 = z10;
        } else {
            this.N.getAdapter().f17612n0 = true;
            this.N.getAdapter().W(null);
            this.N.getAdapter().f17604f0 = false;
        }
        this.N.getAdapter().f17605g0 = false;
    }

    @Override
    public final void x(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zo0.x(int):void");
    }

    @Override
    public final void y() {
        hi.j jVar = this.N;
        if (jVar != null) {
            jVar.setTranslationY(((-getEditTextHeight()) - org.telegram.messenger.g0.L(14.0f)) - this.M.f15717l);
        }
    }
}
