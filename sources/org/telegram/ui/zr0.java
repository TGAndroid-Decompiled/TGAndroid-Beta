package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

public final class zr0 extends org.telegram.ui.Components.xc {

    public final Path f45243p1;

    public final PhotoViewer f45244q1;

    public zr0(PhotoViewer photoViewer, Context context, bu0 bu0Var, org.telegram.ui.Components.zu0 zu0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.z9 z9Var, hq0 hq0Var) {
        super(context, bu0Var, zu0Var, frameLayout, c6Var, z9Var, hq0Var);
        this.f45244q1 = photoViewer;
        this.f45243p1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.W(this.f45244q1);
    }

    @Override
    public final void B() {
        z();
        as0 as0Var = this.f45244q1.R1;
        if (as0Var != null) {
            as0Var.z();
        }
    }

    @Override
    public final boolean G() {
        au0 au0Var = this.f45244q1.d;
        return au0Var != null && au0Var.l();
    }

    public final void I() {
        PhotoViewer photoViewer = this.f45244q1;
        au0 au0Var = photoViewer.d;
        D(au0Var != null && au0Var.l() && (photoViewer.Q1.H.c() || !(photoViewer.f35702n1 || TextUtils.isEmpty(photoViewer.f1().getText()))), true);
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f45244q1;
        org.telegram.ui.Components.ec ecVar = photoViewer.f35673j7;
        if (ecVar == null || org.telegram.ui.Components.ec.f28012w != ecVar) {
            return photoViewer.T2(photoViewer.f35583a0);
        }
        return false;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void h(org.telegram.ui.Components.da daVar, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11) {
        int i10;
        canvas.save();
        Path path = this.f45243p1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f45244q1;
        if (z11) {
            canvas.translate(((-getX()) - photoViewer.T1.getX()) + f11, ((-getY()) - photoViewer.T1.getY()) + f12);
        } else {
            canvas.translate(f11, f12);
        }
        int iL1 = org.telegram.ui.ActionBar.g6.l1(1.0f, z10 ? -8882056 : -14277082);
        if (z11) {
            i10 = z10 ? 0 : 855638016;
        } else {
            i10 = 1140850688;
        }
        photoViewer.T0(canvas, daVar, iL1, org.telegram.ui.ActionBar.g6.l1(1.0f, i10), false, !z10, !z10 && z11);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.f45244q1.f35670j4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f10, float f11) {
        return (this.f16345l0 || this.f45244q1.f35731q4 == 0) ? false : true;
    }

    @Override
    public final void setText(CharSequence charSequence) {
        super.setText(charSequence);
        I();
    }

    @Override
    public final void u(float f10) {
        super.u(f10);
        PhotoViewer photoViewer = this.f45244q1;
        org.telegram.ui.ActionBar.l0 l0Var = photoViewer.f35584a1;
        float f11 = 1.0f - f10;
        l0Var.setAlpha((l0Var.getTag() != null ? 1 : 0) * f11);
        org.telegram.ui.Components.r80 r80Var = photoViewer.f35592b1;
        r80Var.setAlpha((r80Var.getTag() != null ? 1 : 0) * f11);
        FrameLayout frameLayout = photoViewer.M7;
        frameLayout.setAlpha(f11 * (frameLayout.getTag() != null ? 1 : 0));
    }

    @Override
    public final void w() {
        this.I.getAdapter().f45923c = false;
        this.I.getAdapter().d = false;
        this.I.getAdapter().f45926e = false;
        PhotoViewer photoViewer = this.f45244q1;
        if (photoViewer.f35652h4 != null) {
            this.I.getAdapter().f45932i0 = false;
            this.I.getAdapter().W(photoViewer.f35652h4.V7);
            this.I.getAdapter().f45921a0 = photoViewer.f35652h4.f42026e != null;
        } else {
            this.I.getAdapter().f45932i0 = true;
            this.I.getAdapter().W(null);
            this.I.getAdapter().f45921a0 = false;
        }
        this.I.getAdapter().f45922b0 = false;
    }

    @Override
    public final void x(int i10) {
        float f10;
        PhotoViewer photoViewer = this.f45244q1;
        Rect rect = photoViewer.f35712o2;
        super.x(i10 - rect.bottom);
        org.telegram.ui.Components.ec ecVar = org.telegram.ui.Components.ec.f28012w;
        if (ecVar != null) {
            ecVar.l();
        }
        I();
        FrameLayout frameLayout = photoViewer.N0;
        boolean z10 = false;
        if (frameLayout != null) {
            frameLayout.animate().translationY(-Math.max(0, (i10 - rect.bottom) - photoViewer.L0.getHeight())).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.f23706w).start();
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = photoViewer.B.animate();
        if (photoViewer.F) {
            org.telegram.ui.Components.xc xcVarF1 = photoViewer.f1();
            as0 as0Var = photoViewer.R1;
            if (xcVarF1 == as0Var && as0Var.H.c()) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
        } else {
            f10 = 0.0f;
        }
        viewPropertyAnimatorAnimate.alpha(f10).start();
        if (photoViewer.L0.getVisibility() == 0) {
            if (photoViewer.F) {
                org.telegram.ui.Components.xc xcVarF2 = photoViewer.f1();
                as0 as0Var2 = photoViewer.R1;
                if (xcVarF2 != as0Var2 || !as0Var2.H.c()) {
                    z10 = true;
                }
            }
            photoViewer.o3(z10);
        }
    }

    @Override
    public final void y() {
        lh.i iVar = this.I;
        if (iVar != null) {
            iVar.setTranslationY(((-getEditTextHeight()) - AndroidUtilities.dp(14.0f)) - this.H.f15642l);
        }
    }
}
