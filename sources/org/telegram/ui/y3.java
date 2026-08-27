package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class y3 extends org.telegram.ui.Components.zu0 implements org.telegram.ui.ActionBar.k2, org.telegram.ui.ActionBar.t3 {
    public final RectF A0;
    public final Path B0;
    public boolean C0;
    public final z3 D0;

    public final Paint f44689s0;

    public final Paint f44690t0;

    public final Paint f44691u0;

    public final Paint f44692v0;

    public final org.telegram.ui.Components.y5 f44693w0;

    public boolean f44694x0;

    public final Path f44695y0;

    public final RectF f44696z0;

    public y3(z3 z3Var, Context context) {
        super(context, null);
        this.D0 = z3Var;
        this.f44689s0 = new Paint(1);
        this.f44690t0 = new Paint(1);
        this.f44691u0 = new Paint(1);
        this.f44692v0 = new Paint(1);
        new Paint(1);
        this.f44693w0 = new org.telegram.ui.Components.y5(this, 0L, 420L, org.telegram.ui.Components.er.h);
        this.f44695y0 = new Path();
        this.f44696z0 = new RectF();
        new RectF();
        this.A0 = new RectF();
        this.B0 = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        char c10;
        z3 z3Var = this.D0;
        m4 m4Var = z3Var.G;
        if (this.f44694x0) {
            return;
        }
        float fMin = Math.min(z3Var.f45011w, 1.0f - z3Var.f45012x);
        Paint paint = this.f44689s0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - z3Var.E) * 96.0f * fMin));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int iL = z3Var.l() - AndroidUtilities.dp(20.0f);
        boolean z10 = iL < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight && fMin > 0.95f;
        if (z3Var.B != z10) {
            z3Var.B = z10;
            z3Var.i();
        }
        float fE = this.f44693w0.e(z10);
        if (z3Var.C != (fE >= 0.999f)) {
            z3Var.C = fE >= 0.999f;
            z3Var.h();
        }
        int iLerp = AndroidUtilities.lerp(iL, 0, Utilities.clamp01(fE));
        float fMax = Math.max(1.0f - z3Var.f45011w, z3Var.f45012x) * z3Var.k();
        canvas.save();
        canvas.translate(getWidth() * z3Var.E, fMax);
        float f11 = iLerp;
        float width = getWidth();
        float fDp = AndroidUtilities.dp(16.0f) + getHeight();
        RectF rectF = this.f44696z0;
        rectF.set(0.0f, f11, width, fDp);
        float f12 = 1.0f - fE;
        float fDp2 = AndroidUtilities.dp(24.0f) * f12;
        if (fE < 1.0f) {
            Paint paint2 = this.f44690t0;
            paint2.setColor(0);
            c10 = 0;
            f10 = 0.0f;
            paint2.setShadowLayer(AndroidUtilities.dp(18.0f), 0.0f, -AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.g6.l1(fMin * 0.26f, -16777216));
            canvas.drawRoundRect(rectF, fDp2, fDp2, paint2);
        } else {
            f10 = 0.0f;
            c10 = 0;
        }
        if (fDp2 <= f10) {
            canvas.clipRect(rectF);
        } else {
            Path path = this.f44695y0;
            path.rewind();
            path.addRoundRect(rectF, fDp2, fDp2, Path.Direction.CW);
            canvas.clipPath(path);
        }
        int backgroundColor = m4Var.f40347q0[1].getBackgroundColor();
        Paint paint3 = this.f44691u0;
        paint3.setColor(backgroundColor);
        canvas.drawRect(rectF, paint3);
        paint3.setColor(m4Var.f40347q0[c10].getBackgroundColor());
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        rectF2.left = m4Var.f40347q0[c10].getX();
        canvas.drawRect(rectF2, paint3);
        m4Var.f40335d0.f43976o0 = z10 && AndroidUtilities.dp(20.0f) + iL <= AndroidUtilities.statusBarHeight + m4Var.E0;
        if (fE > 0.0f) {
            canvas.save();
            float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(20.0f) + iL + 1, 0, fE);
            canvas.translate(0.0f, fLerp);
            m4Var.f40335d0.a(canvas, org.telegram.messenger.y1.C(20.0f, iL, 1) - fLerp, fE, true);
            canvas.restore();
        }
        canvas.translate(0.0f, -fMax);
        if (!AndroidUtilities.makingGlobalBlurBitmap && (!m4Var.f40347q0[0].f() || canvas.isHardwareAccelerated())) {
            super.dispatchDraw(canvas);
        }
        canvas.translate(0.0f, fMax);
        if (fE < 1.0f) {
            int iD = i0.b.d(fE, org.telegram.ui.ActionBar.g6.l1(0.15f, AndroidUtilities.computePerceivedBrightness(z3Var.j()) < 0.721f ? -1 : -16777216), -16777216);
            Paint paint4 = this.f44692v0;
            paint4.setColor(iD);
            paint4.setAlpha((int) (paint4.getAlpha() * f12));
            float width2 = getWidth() / 2.0f;
            float fDp3 = ((AndroidUtilities.dp(20.0f) / 2.0f) + f11) - (AndroidUtilities.dp(8.0f) * fE);
            float fLerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(48.0f), fE) / 2.0f;
            rectF.set(width2 - fLerp2, fDp3 - AndroidUtilities.dp(2.0f), width2 + fLerp2, fDp3 + AndroidUtilities.dp(2.0f));
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint4);
        }
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            z3 z3Var = this.D0;
            if (y10 < (z3Var.B ? 0 : z3Var.l())) {
                z3Var.dismiss(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public RectF getRect() {
        z3 z3Var = this.D0;
        float fMax = (Math.max(1.0f - z3Var.f45011w, z3Var.f45012x) * z3Var.k()) + (z3Var.B ? 0 : z3Var.l() - AndroidUtilities.dp(20.0f));
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.A0;
        rectF.set(0.0f, fMax, width, height);
        return rectF;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.D0.n();
    }

    @Override
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        boolean zOnNestedPreFling = super.onNestedPreFling(view, f10, f11);
        z3 z3Var = this.D0;
        m4 m4Var = z3Var.G;
        if (!m4Var.K0.y()) {
            q3 q3Var = m4Var.f40347q0[0];
            if (!(q3Var.c() ? !q3Var.f41496b.canScrollVertically(-1) : false) || f11 >= -1000.0f) {
                z3Var.e(false, null);
            } else {
                z3Var.dismiss(true);
            }
        }
        if (f10 != 0.0f || f11 != 0.0f) {
            org.telegram.ui.Cells.j9 j9Var = m4Var.K0;
            AndroidUtilities.cancelRunOnUIThread(j9Var.f25870g0);
            j9Var.f25899z = false;
        }
        this.C0 = true;
        return zOnNestedPreFling;
    }

    @Override
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        z3 z3Var = this.D0;
        m4 m4Var = z3Var.G;
        if (!z3Var.D) {
            z3Var.D = i11 != 0;
        }
        q3 q3Var = m4Var.f40347q0[0];
        if ((q3Var.c() ? !q3Var.f41496b.canScrollVertically(-1) : false) && !m4Var.K0.y()) {
            iArr[1] = Math.min((int) (z3Var.k() * z3Var.f45012x), i11);
            z3Var.f45012x = Utilities.clamp(z3Var.f45012x - (i11 / z3Var.k()), 1.0f, 0.0f);
            z3Var.n();
            z3Var.h();
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        org.telegram.ui.Cells.j9 j9Var = m4Var.K0;
        AndroidUtilities.cancelRunOnUIThread(j9Var.f25870g0);
        j9Var.f25899z = false;
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        this.C0 = false;
        this.D0.getClass();
        return i10 == 2;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        z3 z3Var = this.D0;
        z3Var.D = false;
        if (!this.C0 && !z3Var.G.K0.y()) {
            if (z3Var.f45012x > 0.25f) {
                z3Var.dismiss(true);
            } else {
                z3Var.e(false, null);
            }
        }
        super.onStopNestedScroll(view);
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        if (this.f44694x0 != z10) {
            this.f44694x0 = z10;
            invalidate();
        }
    }

    @Override
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        rectF2.set(getRect());
        AndroidUtilities.lerp(rectF2, rectF, f10, rectF2);
        z3 z3Var = this.D0;
        m4 m4Var = z3Var.G;
        float f12 = 1.0f - f10;
        float fMin = Math.min(z3Var.f45011w, 1.0f - z3Var.f45012x) * f12;
        Paint paint = this.f44689s0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - z3Var.E) * fMin * 96.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f), f10);
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false);
        Paint paint2 = this.f44691u0;
        paint2.setColor(iW0);
        Path path = this.B0;
        path.rewind();
        path.addRoundRect(rectF2, fLerp, fLerp, Path.Direction.CW);
        canvas.drawPath(path, paint2);
        if (getChildCount() == 1) {
            if (z3Var.B) {
                canvas.save();
                canvas.clipPath(path);
                canvas.translate(0.0f, rectF2.top);
                m4Var.f40335d0.draw(canvas);
                canvas.restore();
            }
            View childAt = getChildAt(0);
            canvas.save();
            float fLerp2 = AndroidUtilities.lerp(1.0f, 0.99f, f10);
            float f13 = fLerp2 - 1.0f;
            if (Math.abs(f13) > 0.01f) {
                canvas.scale(fLerp2, fLerp2, rectF2.centerX(), rectF2.centerY());
            }
            canvas.clipPath(path);
            if (Math.abs(f13) > 0.01f) {
                float f14 = 1.0f / fLerp2;
                canvas.scale(f14, f14, rectF2.centerX(), rectF2.centerY());
            }
            canvas.translate(0.0f, ((z3Var.B ? m4Var.f40335d0.getMeasuredHeight() : 0) * f12) + (-z3Var.l()) + rectF2.top);
            childAt.draw(canvas);
            canvas.restore();
        }
        return fLerp;
    }
}
