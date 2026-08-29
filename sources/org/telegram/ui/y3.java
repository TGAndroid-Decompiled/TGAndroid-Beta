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
public final class y3 extends org.telegram.ui.Components.hv0 implements org.telegram.ui.ActionBar.l2, org.telegram.ui.ActionBar.t3 {
    public final RectF A0;
    public final Path B0;
    public boolean C0;
    public final z3 D0;
    public final Paint f44717s0;
    public final Paint f44718t0;
    public final Paint f44719u0;
    public final Paint f44720v0;
    public final org.telegram.ui.Components.d6 f44721w0;
    public boolean f44722x0;
    public final Path f44723y0;
    public final RectF f44724z0;

    public y3(z3 z3Var, Context context) {
        super(context, null);
        this.D0 = z3Var;
        this.f44717s0 = new Paint(1);
        this.f44718t0 = new Paint(1);
        this.f44719u0 = new Paint(1);
        this.f44720v0 = new Paint(1);
        new Paint(1);
        this.f44721w0 = new org.telegram.ui.Components.d6(this, 0L, 420L, org.telegram.ui.Components.jr.h);
        this.f44723y0 = new Path();
        this.f44724z0 = new RectF();
        new RectF();
        this.A0 = new RectF();
        this.B0 = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f9;
        char c3;
        boolean z13;
        int i10;
        boolean z14;
        z3 z3Var = this.D0;
        m4 m4Var = z3Var.G;
        if (this.f44722x0) {
            return;
        }
        float min = Math.min(z3Var.f45052w, 1.0f - z3Var.f45053x);
        Paint paint = this.f44717s0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - z3Var.E) * 96.0f * min));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int l10 = z3Var.l() - AndroidUtilities.dp(20.0f);
        if (l10 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight && min > 0.95f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z3Var.B != z10) {
            z3Var.B = z10;
            z3Var.i();
        }
        float e10 = this.f44721w0.e(z10);
        boolean z15 = z3Var.C;
        int i11 = (e10 > 0.999f ? 1 : (e10 == 0.999f ? 0 : -1));
        if (i11 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z15 != z11) {
            if (i11 >= 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            z3Var.C = z14;
            z3Var.h();
        }
        int lerp = AndroidUtilities.lerp(l10, 0, Utilities.clamp01(e10));
        float max = Math.max(1.0f - z3Var.f45052w, z3Var.f45053x) * z3Var.k();
        canvas.save();
        canvas.translate(getWidth() * z3Var.E, max);
        float f10 = lerp;
        int height = getHeight();
        RectF rectF = this.f44724z0;
        rectF.set(0.0f, f10, getWidth(), AndroidUtilities.dp(16.0f) + height);
        float f11 = 1.0f - e10;
        float dp = AndroidUtilities.dp(24.0f) * f11;
        int i12 = (e10 > 1.0f ? 1 : (e10 == 1.0f ? 0 : -1));
        if (i12 < 0) {
            Paint paint2 = this.f44718t0;
            paint2.setColor(0);
            c3 = 0;
            z12 = z10;
            f9 = 0.0f;
            paint2.setShadowLayer(AndroidUtilities.dp(18.0f), 0.0f, -AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.g6.l1(min * 0.26f, -16777216));
            canvas.drawRoundRect(rectF, dp, dp, paint2);
        } else {
            z12 = z10;
            f9 = 0.0f;
            c3 = 0;
        }
        if (dp <= f9) {
            canvas.clipRect(rectF);
        } else {
            Path path = this.f44723y0;
            path.rewind();
            path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
            canvas.clipPath(path);
        }
        int backgroundColor = m4Var.f40404q0[1].getBackgroundColor();
        Paint paint3 = this.f44719u0;
        paint3.setColor(backgroundColor);
        canvas.drawRect(rectF, paint3);
        paint3.setColor(m4Var.f40404q0[c3].getBackgroundColor());
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        rectF2.left = m4Var.f40404q0[c3].getX();
        canvas.drawRect(rectF2, paint3);
        o0 o0Var = m4Var.f40392d0;
        if (z12 && AndroidUtilities.dp(20.0f) + l10 <= AndroidUtilities.statusBarHeight + m4Var.E0) {
            z13 = true;
        } else {
            z13 = false;
        }
        o0Var.f44179o0 = z13;
        if (e10 > 0.0f) {
            canvas.save();
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(20.0f) + l10 + 1, 0, e10);
            canvas.translate(0.0f, lerp2);
            m4Var.f40392d0.a(canvas, org.telegram.messenger.x3.C(20.0f, l10, 1) - lerp2, e10, true);
            canvas.restore();
        }
        canvas.translate(0.0f, -max);
        if (!AndroidUtilities.makingGlobalBlurBitmap && (!m4Var.f40404q0[0].f() || canvas.isHardwareAccelerated())) {
            super.dispatchDraw(canvas);
        }
        canvas.translate(0.0f, max);
        if (i12 < 0) {
            if (AndroidUtilities.computePerceivedBrightness(z3Var.j()) < 0.721f) {
                i10 = -1;
            } else {
                i10 = -16777216;
            }
            int d = i0.a.d(e10, org.telegram.ui.ActionBar.g6.l1(0.15f, i10), -16777216);
            Paint paint4 = this.f44720v0;
            paint4.setColor(d);
            paint4.setAlpha((int) (paint4.getAlpha() * f11));
            float width = getWidth() / 2.0f;
            float dp2 = ((AndroidUtilities.dp(20.0f) / 2.0f) + f10) - (AndroidUtilities.dp(8.0f) * e10);
            float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(48.0f), e10) / 2.0f;
            rectF.set(width - lerp3, dp2 - AndroidUtilities.dp(2.0f), width + lerp3, dp2 + AndroidUtilities.dp(2.0f));
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint4);
        }
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int l10;
        if (motionEvent.getAction() == 0) {
            float y8 = motionEvent.getY();
            z3 z3Var = this.D0;
            if (z3Var.B) {
                l10 = 0;
            } else {
                l10 = z3Var.l();
            }
            if (y8 < l10) {
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
        int l10;
        z3 z3Var = this.D0;
        if (z3Var.B) {
            l10 = 0;
        } else {
            l10 = z3Var.l() - AndroidUtilities.dp(20.0f);
        }
        float max = Math.max(1.0f - z3Var.f45052w, z3Var.f45053x) * z3Var.k();
        RectF rectF = this.A0;
        rectF.set(0.0f, max + l10, getWidth(), getHeight());
        return rectF;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.D0.n();
    }

    @Override
    public final boolean onNestedPreFling(View view, float f9, float f10) {
        boolean z10;
        boolean onNestedPreFling = super.onNestedPreFling(view, f9, f10);
        z3 z3Var = this.D0;
        m4 m4Var = z3Var.G;
        if (!m4Var.K0.y()) {
            q3 q3Var = m4Var.f40404q0[0];
            if (q3Var.c()) {
                z10 = !q3Var.f41513b.canScrollVertically(-1);
            } else {
                z10 = false;
            }
            if (z10 && f10 < -1000.0f) {
                z3Var.dismiss(true);
            } else {
                z3Var.e(false, null);
            }
        }
        if (f9 != 0.0f || f10 != 0.0f) {
            org.telegram.ui.Cells.k9 k9Var = m4Var.K0;
            AndroidUtilities.cancelRunOnUIThread(k9Var.f25944g0);
            k9Var.f25973z = false;
        }
        this.C0 = true;
        return onNestedPreFling;
    }

    @Override
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        boolean z10;
        boolean z11;
        z3 z3Var = this.D0;
        m4 m4Var = z3Var.G;
        if (!z3Var.D) {
            if (i11 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            z3Var.D = z11;
        }
        q3 q3Var = m4Var.f40404q0[0];
        if (q3Var.c()) {
            z10 = !q3Var.f41513b.canScrollVertically(-1);
        } else {
            z10 = false;
        }
        if (z10 && !m4Var.K0.y()) {
            iArr[1] = Math.min((int) (z3Var.k() * z3Var.f45053x), i11);
            z3Var.f45053x = Utilities.clamp(z3Var.f45053x - (i11 / z3Var.k()), 1.0f, 0.0f);
            z3Var.n();
            z3Var.h();
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        org.telegram.ui.Cells.k9 k9Var = m4Var.K0;
        AndroidUtilities.cancelRunOnUIThread(k9Var.f25944g0);
        k9Var.f25973z = false;
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        this.C0 = false;
        this.D0.getClass();
        if (i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        z3 z3Var = this.D0;
        z3Var.D = false;
        if (!this.C0 && !z3Var.G.K0.y()) {
            if (z3Var.f45053x > 0.25f) {
                z3Var.dismiss(true);
            } else {
                z3Var.e(false, null);
            }
        }
        super.onStopNestedScroll(view);
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        if (this.f44722x0 != z10) {
            this.f44722x0 = z10;
            invalidate();
        }
    }

    @Override
    public final float z(Canvas canvas, RectF rectF, float f9, RectF rectF2, float f10) {
        int i10;
        rectF2.set(getRect());
        AndroidUtilities.lerp(rectF2, rectF, f9, rectF2);
        z3 z3Var = this.D0;
        m4 m4Var = z3Var.G;
        float f11 = 1.0f - f9;
        Paint paint = this.f44717s0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - z3Var.E) * Math.min(z3Var.f45052w, 1.0f - z3Var.f45053x) * f11 * 96.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f), f9);
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false);
        Paint paint2 = this.f44719u0;
        paint2.setColor(w02);
        Path path = this.B0;
        path.rewind();
        path.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
        canvas.drawPath(path, paint2);
        if (getChildCount() == 1) {
            if (z3Var.B) {
                canvas.save();
                canvas.clipPath(path);
                canvas.translate(0.0f, rectF2.top);
                m4Var.f40392d0.draw(canvas);
                canvas.restore();
            }
            View childAt = getChildAt(0);
            canvas.save();
            float lerp2 = AndroidUtilities.lerp(1.0f, 0.99f, f9);
            float f12 = lerp2 - 1.0f;
            if (Math.abs(f12) > 0.01f) {
                canvas.scale(lerp2, lerp2, rectF2.centerX(), rectF2.centerY());
            }
            canvas.clipPath(path);
            if (Math.abs(f12) > 0.01f) {
                float f13 = 1.0f / lerp2;
                canvas.scale(f13, f13, rectF2.centerX(), rectF2.centerY());
            }
            float f14 = (-z3Var.l()) + rectF2.top;
            if (z3Var.B) {
                i10 = m4Var.f40392d0.getMeasuredHeight();
            } else {
                i10 = 0;
            }
            canvas.translate(0.0f, (i10 * f11) + f14);
            childAt.draw(canvas);
            canvas.restore();
        }
        return lerp;
    }
}
