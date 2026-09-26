package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class ts0 extends org.telegram.ui.Components.md {
    public final Path f38232t1;
    public final PhotoViewer f38233u1;

    public ts0(PhotoViewer photoViewer, Context context, uu0 uu0Var, org.telegram.ui.Components.bw0 bw0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.ja jaVar, ar0 ar0Var) {
        super(context, uu0Var, bw0Var, frameLayout, d6Var, jaVar, ar0Var);
        this.f38233u1 = photoViewer;
        this.f38232t1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.W(this.f38233u1);
    }

    @Override
    public final void B() {
        z();
        us0 us0Var = this.f38233u1.V1;
        if (us0Var != null) {
            us0Var.z();
        }
    }

    @Override
    public final boolean G() {
        tu0 tu0Var = this.f38233u1.d;
        if (tu0Var != null && tu0Var.l()) {
            return true;
        }
        return false;
    }

    public final void I() {
        boolean z10;
        PhotoViewer photoViewer = this.f38233u1;
        tu0 tu0Var = photoViewer.d;
        if (tu0Var != null && tu0Var.l() && (photoViewer.U1.L.c() || (!photoViewer.f31335r1 && !TextUtils.isEmpty(photoViewer.f1().getText())))) {
            z10 = true;
        } else {
            z10 = false;
        }
        D(z10, true);
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f38233u1;
        org.telegram.ui.Components.qc qcVar = photoViewer.f31306n7;
        if (qcVar != null && org.telegram.ui.Components.qc.f27628w == qcVar) {
            return false;
        }
        return photoViewer.S2(photoViewer.f31222e0);
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
        Path path = this.f38232t1;
        path.rewind();
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f38233u1;
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
        int l1 = org.telegram.ui.ActionBar.h6.l1(1.0f, i10);
        if (z11) {
            if (z10) {
                i11 = 0;
            } else {
                i11 = 855638016;
            }
        } else {
            i11 = 1140850688;
        }
        int l12 = org.telegram.ui.ActionBar.h6.l1(1.0f, i11);
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
        if (SharedConfig.photoViewerBlur && ((i10 = this.f38233u1.f31303n4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f7, float f10) {
        if (!this.f5132p0 && this.f38233u1.f31366u4 != 0) {
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
        PhotoViewer photoViewer = this.f38233u1;
        org.telegram.ui.ActionBar.j0 j0Var = photoViewer.f31223e1;
        float f10 = 1.0f - f7;
        int i12 = 0;
        if (j0Var.getTag() != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        j0Var.setAlpha(i10 * f10);
        org.telegram.ui.Components.q90 q90Var = photoViewer.f31232f1;
        if (q90Var.getTag() != null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        q90Var.setAlpha(i11 * f10);
        FrameLayout frameLayout = photoViewer.R7;
        if (frameLayout.getTag() != null) {
            i12 = 1;
        }
        frameLayout.setAlpha(f10 * i12);
    }

    @Override
    public final void w() {
        this.M.getAdapter().f9798c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().e = false;
        PhotoViewer photoViewer = this.f38233u1;
        boolean z10 = true;
        if (photoViewer.l4 != null) {
            this.M.getAdapter().m0 = false;
            this.M.getAdapter().W(photoViewer.l4.Z7);
            gg.k1 adapter = this.M.getAdapter();
            if (photoViewer.l4.e == null) {
                z10 = false;
            }
            adapter.f9801e0 = z10;
        } else {
            this.M.getAdapter().m0 = true;
            this.M.getAdapter().W(null);
            this.M.getAdapter().f9801e0 = false;
        }
        this.M.getAdapter().f9803f0 = false;
    }

    @Override
    public final void x(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ts0.x(int):void");
    }

    @Override
    public final void y() {
        ci.i iVar = this.M;
        if (iVar != null) {
            iVar.setTranslationY(((-getEditTextHeight()) - AndroidUtilities.dp(14.0f)) - this.L.f4782l);
        }
    }
}
