package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class yr0 extends org.telegram.ui.Components.ad {
    public final Path f44936p1;
    public final PhotoViewer f44937q1;

    public yr0(PhotoViewer photoViewer, Context context, au0 au0Var, org.telegram.ui.Components.xu0 xu0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.Components.ba baVar, gq0 gq0Var) {
        super(context, au0Var, xu0Var, frameLayout, b6Var, baVar, gq0Var);
        this.f44937q1 = photoViewer;
        this.f44936p1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.V(this.f44937q1);
    }

    @Override
    public final void B() {
        z();
        zr0 zr0Var = this.f44937q1.R1;
        if (zr0Var != null) {
            zr0Var.z();
        }
    }

    @Override
    public final boolean G() {
        zt0 zt0Var = this.f44937q1.d;
        if (zt0Var != null && zt0Var.l()) {
            return true;
        }
        return false;
    }

    public final void I() {
        boolean z10;
        PhotoViewer photoViewer = this.f44937q1;
        zt0 zt0Var = photoViewer.d;
        if (zt0Var != null && zt0Var.l() && (photoViewer.Q1.H.c() || (!photoViewer.f35699n1 && !TextUtils.isEmpty(photoViewer.f1().getText())))) {
            z10 = true;
        } else {
            z10 = false;
        }
        D(z10, true);
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f44937q1;
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
        Path path = this.f44936p1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f44937q1;
        if (z11) {
            canvas.translate(((-getX()) - photoViewer.T1.getX()) + f11, ((-getY()) - photoViewer.T1.getY()) + f12);
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
        if (SharedConfig.photoViewerBlur && ((i9 = this.f44937q1.f35667j4) == 1 || i9 == 2 || i9 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f10, float f11) {
        if (!this.f15639l0 && this.f44937q1.f35727q4 != 0) {
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
        int i9;
        int i10;
        super.u(f10);
        PhotoViewer photoViewer = this.f44937q1;
        org.telegram.ui.ActionBar.l0 l0Var = photoViewer.f35581a1;
        float f11 = 1.0f - f10;
        int i11 = 0;
        if (l0Var.getTag() != null) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        l0Var.setAlpha(i9 * f11);
        org.telegram.ui.Components.n80 n80Var = photoViewer.f35589b1;
        if (n80Var.getTag() != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        n80Var.setAlpha(i10 * f11);
        FrameLayout frameLayout = photoViewer.M7;
        if (frameLayout.getTag() != null) {
            i11 = 1;
        }
        frameLayout.setAlpha(f11 * i11);
    }

    @Override
    public final void w() {
        this.I.getAdapter().f19322c = false;
        this.I.getAdapter().d = false;
        this.I.getAdapter().f19325e = false;
        PhotoViewer photoViewer = this.f44937q1;
        boolean z10 = true;
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
    }

    @Override
    public final void x(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yr0.x(int):void");
    }

    @Override
    public final void y() {
        kh.i iVar = this.I;
        if (iVar != null) {
            iVar.setTranslationY(((-getEditTextHeight()) - AndroidUtilities.dp(14.0f)) - this.H.f14999l);
        }
    }
}
