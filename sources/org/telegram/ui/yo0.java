package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class yo0 extends org.telegram.ui.Components.uc {
    public final Path f52278s1;
    public final PhotoViewer f52279t1;

    public yo0(PhotoViewer photoViewer, Context context, uq0 uq0Var, org.telegram.ui.Components.rt0 rt0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.y9 y9Var, cn0 cn0Var) {
        super(context, uq0Var, rt0Var, frameLayout, f6Var, y9Var, cn0Var);
        this.f52279t1 = photoViewer;
        this.f52278s1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.O(this.f52279t1);
    }

    @Override
    public final void B() {
        z();
        zo0 zo0Var = this.f52279t1.V1;
        if (zo0Var != null) {
            zo0Var.z();
        }
    }

    @Override
    public final boolean G() {
        tq0 tq0Var = this.f52279t1.d;
        if (tq0Var != null && tq0Var.l()) {
            return true;
        }
        return false;
    }

    public final void I() {
        boolean z9;
        PhotoViewer photoViewer = this.f52279t1;
        tq0 tq0Var = photoViewer.d;
        if (tq0Var != null && tq0Var.l() && (photoViewer.U1.L.c() || (!photoViewer.f41470r1 && !TextUtils.isEmpty(photoViewer.a1().getText())))) {
            z9 = true;
        } else {
            z9 = false;
        }
        D(z9, true);
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f52279t1;
        org.telegram.ui.Components.cc ccVar = photoViewer.f41431m7;
        if (ccVar != null && org.telegram.ui.Components.cc.f32515w == ccVar) {
            return false;
        }
        return photoViewer.Q2(photoViewer.f41356e0);
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void h(org.telegram.ui.Components.ca caVar, Canvas canvas, RectF rectF, float f10, boolean z9, float f11, float f12, boolean z10) {
        int i7;
        int i10;
        boolean z11;
        canvas.save();
        Path path = this.f52278s1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f52279t1;
        if (z10) {
            canvas.translate(((-getX()) - photoViewer.X1.getX()) + f11, ((-getY()) - photoViewer.X1.getY()) + f12);
        } else {
            canvas.translate(f11, f12);
        }
        if (z9) {
            i7 = -8882056;
        } else {
            i7 = -14277082;
        }
        int r12 = org.telegram.ui.ActionBar.k6.r1(1.0f, i7);
        if (z10) {
            if (z9) {
                i10 = 0;
            } else {
                i10 = 855638016;
            }
        } else {
            i10 = 1140850688;
        }
        int r13 = org.telegram.ui.ActionBar.k6.r1(1.0f, i10);
        boolean z12 = !z9;
        if (!z9 && z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        photoViewer.N0(canvas, caVar, r12, r13, false, z12, z11);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i7;
        if (org.telegram.messenger.iz.f23364c0 && ((i7 = this.f52279t1.f41428m4) == 1 || i7 == 2 || i7 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f10, float f11) {
        if (!this.f12375o0 && this.f52279t1.f41491t4 != 0) {
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
        PhotoViewer photoViewer = this.f52279t1;
        org.telegram.ui.ActionBar.f0 f0Var = photoViewer.f41357e1;
        float f11 = 1.0f - f10;
        int i11 = 0;
        if (f0Var.getTag() != null) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        f0Var.setAlpha(i7 * f11);
        org.telegram.ui.Components.y70 y70Var = photoViewer.f41367f1;
        if (y70Var.getTag() != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        y70Var.setAlpha(i10 * f11);
        FrameLayout frameLayout = photoViewer.Q7;
        if (frameLayout.getTag() != null) {
            i11 = 1;
        }
        frameLayout.setAlpha(f11 * i11);
    }

    @Override
    public final void w() {
        this.M.getAdapter().f16773c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().f16776e = false;
        PhotoViewer photoViewer = this.f52279t1;
        boolean z9 = true;
        if (photoViewer.f41412k4 != null) {
            this.M.getAdapter().m0 = false;
            this.M.getAdapter().W(photoViewer.f41412k4.f43892p8);
            jg.i1 adapter = this.M.getAdapter();
            if (photoViewer.f41412k4.f43747e == null) {
                z9 = false;
            }
            adapter.f16777e0 = z9;
        } else {
            this.M.getAdapter().m0 = true;
            this.M.getAdapter().W(null);
            this.M.getAdapter().f16777e0 = false;
        }
        this.M.getAdapter().f16779f0 = false;
    }

    @Override
    public final void x(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yo0.x(int):void");
    }

    @Override
    public final void y() {
        fi.i iVar = this.M;
        if (iVar != null) {
            iVar.setTranslationY(((-getEditTextHeight()) - org.telegram.messenger.g0.L(14.0f)) - this.L.f12658l);
        }
    }
}
