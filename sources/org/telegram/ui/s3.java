package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class s3 extends org.telegram.ui.Components.tt0 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.ActionBar.i3 {
    public final Paint f49736f0;
    public final Paint f49737g0;
    public final Paint f49738h0;
    public final Paint f49739i0;
    public final org.telegram.ui.Components.w5 f49740j0;
    public boolean f49741k0;
    public final Path f49742l0;
    public final RectF m0;
    public final RectF f49743n0;
    public final Path f49744o0;
    public boolean f49745p0;
    public final t3 f49746q0;

    public s3(t3 t3Var, Context context) {
        super(context, null);
        this.f49746q0 = t3Var;
        this.f49736f0 = new Paint(1);
        this.f49737g0 = new Paint(1);
        this.f49738h0 = new Paint(1);
        this.f49739i0 = new Paint(1);
        new Paint(1);
        this.f49740j0 = new org.telegram.ui.Components.w5(this, 0L, 420L, org.telegram.ui.Components.xq.h);
        this.f49742l0 = new Path();
        this.m0 = new RectF();
        new RectF();
        this.f49743n0 = new RectF();
        this.f49744o0 = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z9;
        boolean z10;
        boolean z11;
        int i7;
        float f10;
        boolean z12;
        int i10;
        boolean z13;
        t3 t3Var = this.f49746q0;
        g4 g4Var = t3Var.K;
        if (this.f49741k0) {
            return;
        }
        float min = Math.min(t3Var.f50054x, 1.0f - t3Var.f50055y);
        Paint paint = this.f49736f0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - t3Var.I) * 96.0f * min));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int x10 = t3Var.x() - org.telegram.messenger.g0.L(20.0f);
        if (x10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22557m && min > 0.95f) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (t3Var.F != z9) {
            t3Var.F = z9;
            t3Var.u();
        }
        float d = this.f49740j0.d(z9);
        boolean z14 = t3Var.G;
        int i11 = (d > 0.999f ? 1 : (d == 0.999f ? 0 : -1));
        if (i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z14 != z10) {
            if (i11 >= 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            t3Var.G = z13;
            t3Var.r();
        }
        int W1 = org.telegram.messenger.g0.W1(Utilities.l(d), x10, 0);
        float max = Math.max(1.0f - t3Var.f50054x, t3Var.f50055y) * t3Var.w();
        canvas.save();
        canvas.translate(getWidth() * t3Var.I, max);
        float f11 = W1;
        int height = getHeight();
        RectF rectF = this.m0;
        rectF.set(0.0f, f11, getWidth(), org.telegram.messenger.g0.L(16.0f) + height);
        float f12 = 1.0f - d;
        float L = org.telegram.messenger.g0.L(24.0f) * f12;
        int i12 = (d > 1.0f ? 1 : (d == 1.0f ? 0 : -1));
        if (i12 < 0) {
            Paint paint2 = this.f49737g0;
            paint2.setColor(0);
            i7 = 0;
            z11 = z9;
            f10 = 0.0f;
            paint2.setShadowLayer(org.telegram.messenger.g0.L(18.0f), 0.0f, -org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.l6.r1(min * 0.26f, -16777216));
            canvas.drawRoundRect(rectF, L, L, paint2);
        } else {
            z11 = z9;
            i7 = 0;
            f10 = 0.0f;
        }
        if (L <= f10) {
            canvas.clipRect(rectF);
        } else {
            Path path = this.f49742l0;
            path.rewind();
            path.addRoundRect(rectF, L, L, Path.Direction.CW);
            canvas.clipPath(path);
        }
        int backgroundColor = g4Var.f45902u0[1].getBackgroundColor();
        Paint paint3 = this.f49738h0;
        paint3.setColor(backgroundColor);
        canvas.drawRect(rectF, paint3);
        paint3.setColor(g4Var.f45902u0[i7].getBackgroundColor());
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(rectF);
        rectF2.left = g4Var.f45902u0[i7].getX();
        canvas.drawRect(rectF2, paint3);
        l0 l0Var = g4Var.f45890h0;
        if (z11 && org.telegram.messenger.g0.L(20.0f) + x10 <= org.telegram.messenger.g0.f22557m + g4Var.J0) {
            z12 = true;
        } else {
            z12 = i7;
        }
        l0Var.f51192s0 = z12;
        if (d > 0.0f) {
            canvas.save();
            float W12 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(20.0f) + x10 + 1, i7);
            canvas.translate(0.0f, W12);
            g4Var.f45890h0.a(canvas, org.telegram.messenger.k5.C(20.0f, x10, 1) - W12, d, true);
            canvas.restore();
        }
        canvas.translate(0.0f, -max);
        if (!org.telegram.messenger.g0.m0 && (!g4Var.f45902u0[0].f() || canvas.isHardwareAccelerated())) {
            super.dispatchDraw(canvas);
        }
        canvas.translate(0.0f, max);
        if (i12 < 0) {
            if (org.telegram.messenger.g0.B(t3Var.v()) < 0.721f) {
                i10 = -1;
            } else {
                i10 = -16777216;
            }
            int f13 = i0.a.f(d, org.telegram.ui.ActionBar.l6.r1(0.15f, i10), -16777216);
            Paint paint4 = this.f49739i0;
            paint4.setColor(f13);
            paint4.setAlpha((int) (paint4.getAlpha() * f12));
            float width = getWidth() / 2.0f;
            float L2 = ((org.telegram.messenger.g0.L(20.0f) / 2.0f) + f11) - (org.telegram.messenger.g0.L(8.0f) * d);
            float W13 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(48.0f)) / 2.0f;
            rectF.set(width - W13, L2 - org.telegram.messenger.g0.L(2.0f), width + W13, L2 + org.telegram.messenger.g0.L(2.0f));
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint4);
        }
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int x10;
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            t3 t3Var = this.f49746q0;
            if (t3Var.F) {
                x10 = 0;
            } else {
                x10 = t3Var.x();
            }
            if (y10 < x10) {
                t3Var.a(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public RectF getRect() {
        int x10;
        t3 t3Var = this.f49746q0;
        if (t3Var.F) {
            x10 = 0;
        } else {
            x10 = t3Var.x() - org.telegram.messenger.g0.L(20.0f);
        }
        float max = Math.max(1.0f - t3Var.f50054x, t3Var.f50055y) * t3Var.w();
        RectF rectF = this.f49743n0;
        rectF.set(0.0f, max + x10, getWidth(), getHeight());
        return rectF;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f49746q0.A();
    }

    @Override
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        boolean z9;
        boolean onNestedPreFling = super.onNestedPreFling(view, f10, f11);
        t3 t3Var = this.f49746q0;
        g4 g4Var = t3Var.K;
        if (!g4Var.P0.x()) {
            k3 k3Var = g4Var.f45902u0[0];
            if (k3Var.c()) {
                z9 = !k3Var.f47167b.canScrollVertically(-1);
            } else {
                z9 = false;
            }
            if (z9 && f11 < -1000.0f) {
                t3Var.a(true);
            } else {
                t3Var.m(false, null);
            }
        }
        if (f10 != 0.0f || f11 != 0.0f) {
            org.telegram.ui.Cells.i9 i9Var = g4Var.P0;
            org.telegram.messenger.g0.r(i9Var.f30662f0);
            i9Var.f30688z = false;
        }
        this.f49745p0 = true;
        return onNestedPreFling;
    }

    @Override
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
        boolean z9;
        boolean z10;
        t3 t3Var = this.f49746q0;
        g4 g4Var = t3Var.K;
        if (!t3Var.H) {
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            t3Var.H = z10;
        }
        k3 k3Var = g4Var.f45902u0[0];
        if (k3Var.c()) {
            z9 = !k3Var.f47167b.canScrollVertically(-1);
        } else {
            z9 = false;
        }
        if (z9 && !g4Var.P0.x()) {
            iArr[1] = Math.min((int) (t3Var.w() * t3Var.f50055y), i10);
            t3Var.f50055y = Utilities.i(t3Var.f50055y - (i10 / t3Var.w()), 1.0f, 0.0f);
            t3Var.A();
            t3Var.r();
        }
        if (i7 == 0 && i10 == 0) {
            return;
        }
        org.telegram.ui.Cells.i9 i9Var = g4Var.P0;
        org.telegram.messenger.g0.r(i9Var.f30662f0);
        i9Var.f30688z = false;
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        this.f49745p0 = false;
        this.f49746q0.getClass();
        if (i7 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        t3 t3Var = this.f49746q0;
        t3Var.H = false;
        if (!this.f49745p0 && !t3Var.K.P0.x()) {
            if (t3Var.f50055y > 0.25f) {
                t3Var.a(true);
            } else {
                t3Var.m(false, null);
            }
        }
        super.onStopNestedScroll(view);
    }

    @Override
    public void setDrawingFromOverlay(boolean z9) {
        if (this.f49741k0 != z9) {
            this.f49741k0 = z9;
            invalidate();
        }
    }

    @Override
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        int i7;
        rectF2.set(getRect());
        org.telegram.messenger.g0.Z1(rectF2, rectF, f10, rectF2);
        t3 t3Var = this.f49746q0;
        g4 g4Var = t3Var.K;
        float f12 = 1.0f - f10;
        Paint paint = this.f49736f0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - t3Var.I) * Math.min(t3Var.f50054x, 1.0f - t3Var.f50055y) * f12 * 96.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float W1 = org.telegram.messenger.g0.W1(f10, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(18.0f));
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, false);
        Paint paint2 = this.f49738h0;
        paint2.setColor(x02);
        Path path = this.f49744o0;
        path.rewind();
        path.addRoundRect(rectF2, W1, W1, Path.Direction.CW);
        canvas.drawPath(path, paint2);
        if (getChildCount() == 1) {
            if (t3Var.F) {
                canvas.save();
                canvas.clipPath(path);
                canvas.translate(0.0f, rectF2.top);
                g4Var.f45890h0.draw(canvas);
                canvas.restore();
            }
            View childAt = getChildAt(0);
            canvas.save();
            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.99f, f10);
            float f13 = T1 - 1.0f;
            if (Math.abs(f13) > 0.01f) {
                canvas.scale(T1, T1, rectF2.centerX(), rectF2.centerY());
            }
            canvas.clipPath(path);
            if (Math.abs(f13) > 0.01f) {
                float f14 = 1.0f / T1;
                canvas.scale(f14, f14, rectF2.centerX(), rectF2.centerY());
            }
            float f15 = (-t3Var.x()) + rectF2.top;
            if (t3Var.F) {
                i7 = g4Var.f45890h0.getMeasuredHeight();
            } else {
                i7 = 0;
            }
            canvas.translate(0.0f, (i7 * f12) + f15);
            childAt.draw(canvas);
            canvas.restore();
        }
        return W1;
    }
}
