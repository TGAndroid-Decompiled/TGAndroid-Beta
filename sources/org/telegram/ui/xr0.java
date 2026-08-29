package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class xr0 extends org.telegram.ui.Components.ed {
    public final Path f44647p1;
    public final PhotoViewer f44648q1;

    public xr0(PhotoViewer photoViewer, Context context, yt0 yt0Var, org.telegram.ui.Components.hv0 hv0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.ga gaVar, gq0 gq0Var) {
        super(context, yt0Var, hv0Var, frameLayout, c6Var, gaVar, gq0Var);
        this.f44648q1 = photoViewer;
        this.f44647p1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.W(this.f44648q1);
    }

    @Override
    public final void B() {
        z();
        yr0 yr0Var = this.f44648q1.R1;
        if (yr0Var != null) {
            yr0Var.z();
        }
    }

    @Override
    public final boolean G() {
        xt0 xt0Var = this.f44648q1.d;
        if (xt0Var != null && xt0Var.l()) {
            return true;
        }
        return false;
    }

    public final void I() {
        boolean z10;
        PhotoViewer photoViewer = this.f44648q1;
        xt0 xt0Var = photoViewer.d;
        if (xt0Var != null && xt0Var.l() && (photoViewer.Q1.H.c() || (!photoViewer.f35765n1 && !TextUtils.isEmpty(photoViewer.f1().getText())))) {
            z10 = true;
        } else {
            z10 = false;
        }
        D(z10, true);
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f44648q1;
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
        Path path = this.f44647p1;
        path.rewind();
        path.addRoundRect(rectF, f9, f9, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f44648q1;
        if (z11) {
            canvas.translate(((-getX()) - photoViewer.T1.getX()) + f10, ((-getY()) - photoViewer.T1.getY()) + f11);
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
        if (SharedConfig.photoViewerBlur && ((i10 = this.f44648q1.f35733j4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f9, float f10) {
        if (!this.f18083l0 && this.f44648q1.f35795q4 != 0) {
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
    public final void u(float f9) {
        int i10;
        int i11;
        super.u(f9);
        PhotoViewer photoViewer = this.f44648q1;
        org.telegram.ui.ActionBar.m0 m0Var = photoViewer.f35648a1;
        float f10 = 1.0f - f9;
        int i12 = 0;
        if (m0Var.getTag() != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        m0Var.setAlpha(i10 * f10);
        org.telegram.ui.Components.a90 a90Var = photoViewer.f35657b1;
        if (a90Var.getTag() != null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        a90Var.setAlpha(i11 * f10);
        FrameLayout frameLayout = photoViewer.M7;
        if (frameLayout.getTag() != null) {
            i12 = 1;
        }
        frameLayout.setAlpha(f10 * i12);
    }

    @Override
    public final void w() {
        this.I.getAdapter().f47364c = false;
        this.I.getAdapter().d = false;
        this.I.getAdapter().f47367e = false;
        PhotoViewer photoViewer = this.f44648q1;
        boolean z10 = true;
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
    }

    @Override
    public final void x(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xr0.x(int):void");
    }

    @Override
    public final void y() {
        nh.i iVar = this.I;
        if (iVar != null) {
            iVar.setTranslationY(((-getEditTextHeight()) - AndroidUtilities.dp(14.0f)) - this.H.f18786l);
        }
    }
}
