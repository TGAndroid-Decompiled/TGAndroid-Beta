package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class ws0 extends org.telegram.ui.Components.ld {
    public final Path f39454t1;
    public final PhotoViewer f39455u1;

    public ws0(PhotoViewer photoViewer, Context context, xu0 xu0Var, org.telegram.ui.Components.cw0 cw0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.ja jaVar, dr0 dr0Var) {
        super(context, xu0Var, cw0Var, frameLayout, e6Var, jaVar, dr0Var);
        this.f39455u1 = photoViewer;
        this.f39454t1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.W(this.f39455u1);
    }

    @Override
    public final void B() {
        z();
        xs0 xs0Var = this.f39455u1.V1;
        if (xs0Var != null) {
            xs0Var.z();
        }
    }

    @Override
    public final boolean G() {
        wu0 wu0Var = this.f39455u1.d;
        if (wu0Var != null && wu0Var.l()) {
            return true;
        }
        return false;
    }

    public final void I() {
        boolean z10;
        PhotoViewer photoViewer = this.f39455u1;
        wu0 wu0Var = photoViewer.d;
        if (wu0Var != null && wu0Var.l() && (photoViewer.U1.L.c() || (!photoViewer.f31338r1 && !TextUtils.isEmpty(photoViewer.f1().getText())))) {
            z10 = true;
        } else {
            z10 = false;
        }
        D(z10, true);
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f39455u1;
        org.telegram.ui.Components.qc qcVar = photoViewer.f31309n7;
        if (qcVar != null && org.telegram.ui.Components.qc.f27684w == qcVar) {
            return false;
        }
        return photoViewer.S2(photoViewer.f31225e0);
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void h(org.telegram.ui.Components.na naVar, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11) {
        int i10;
        int i11;
        boolean z12;
        canvas.save();
        Path path = this.f39454t1;
        path.rewind();
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f39455u1;
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
        photoViewer.T0(canvas, naVar, l1, l12, false, z13, z12);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.f39455u1.f31306n4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f7, float f10) {
        if (!this.f5133p0 && this.f39455u1.f31369u4 != 0) {
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
        PhotoViewer photoViewer = this.f39455u1;
        org.telegram.ui.ActionBar.l0 l0Var = photoViewer.f31226e1;
        float f10 = 1.0f - f7;
        int i12 = 0;
        if (l0Var.getTag() != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        l0Var.setAlpha(i10 * f10);
        org.telegram.ui.Components.r90 r90Var = photoViewer.f31235f1;
        if (r90Var.getTag() != null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        r90Var.setAlpha(i11 * f10);
        FrameLayout frameLayout = photoViewer.R7;
        if (frameLayout.getTag() != null) {
            i12 = 1;
        }
        frameLayout.setAlpha(f10 * i12);
    }

    @Override
    public final void w() {
        this.M.getAdapter().f9804c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().e = false;
        PhotoViewer photoViewer = this.f39455u1;
        boolean z10 = true;
        if (photoViewer.l4 != null) {
            this.M.getAdapter().m0 = false;
            this.M.getAdapter().W(photoViewer.l4.Z7);
            gg.k1 adapter = this.M.getAdapter();
            if (photoViewer.l4.e == null) {
                z10 = false;
            }
            adapter.f9807e0 = z10;
        } else {
            this.M.getAdapter().m0 = true;
            this.M.getAdapter().W(null);
            this.M.getAdapter().f9807e0 = false;
        }
        this.M.getAdapter().f9809f0 = false;
    }

    @Override
    public final void x(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ws0.x(int):void");
    }

    @Override
    public final void y() {
        ci.i iVar = this.M;
        if (iVar != null) {
            iVar.setTranslationY(((-getEditTextHeight()) - AndroidUtilities.dp(14.0f)) - this.L.f4784l);
        }
    }
}
