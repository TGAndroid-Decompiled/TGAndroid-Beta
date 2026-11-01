package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class t3 extends org.telegram.ui.Components.vu0 implements org.telegram.ui.ActionBar.h2, org.telegram.ui.ActionBar.o3 {
    public final Paint f41519f0;
    public final Paint f41520g0;
    public final Paint f41521h0;
    public final Paint f41522i0;
    public final org.telegram.ui.Components.t5 f41523j0;
    public boolean f41524k0;
    public final Path f41525l0;
    public final RectF m0;
    public final RectF f41526n0;
    public final Path f41527o0;
    public boolean f41528p0;
    public final u3 f41529q0;

    public t3(u3 u3Var, Context context) {
        super(context, null);
        this.f41529q0 = u3Var;
        this.f41519f0 = new Paint(1);
        this.f41520g0 = new Paint(1);
        this.f41521h0 = new Paint(1);
        this.f41522i0 = new Paint(1);
        new Paint(1);
        this.f41523j0 = new org.telegram.ui.Components.t5(this, 0L, 420L, org.telegram.ui.Components.gr.h);
        this.f41525l0 = new Path();
        this.m0 = new RectF();
        new RectF();
        this.f41526n0 = new RectF();
        this.f41527o0 = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        float f7;
        boolean z13;
        int i11;
        boolean z14;
        u3 u3Var = this.f41529q0;
        h4 h4Var = u3Var.K;
        if (this.f41524k0) {
            return;
        }
        float min = Math.min(u3Var.f41781x, 1.0f - u3Var.f41782y);
        Paint paint = this.f41519f0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - u3Var.I) * 96.0f * min));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int x10 = u3Var.x() - org.telegram.messenger.i0.L(20.0f);
        if (x10 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16166m && min > 0.95f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (u3Var.F != z10) {
            u3Var.F = z10;
            u3Var.u();
        }
        float d = this.f41523j0.d(z10);
        boolean z15 = u3Var.G;
        int i12 = (d > 0.999f ? 1 : (d == 0.999f ? 0 : -1));
        if (i12 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z15 != z11) {
            if (i12 >= 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            u3Var.G = z14;
            u3Var.r();
        }
        int W1 = org.telegram.messenger.i0.W1(Utilities.l(d), x10, 0);
        float max = Math.max(1.0f - u3Var.f41781x, u3Var.f41782y) * u3Var.w();
        canvas.save();
        canvas.translate(getWidth() * u3Var.I, max);
        float f10 = W1;
        int height = getHeight();
        RectF rectF = this.m0;
        rectF.set(0.0f, f10, getWidth(), org.telegram.messenger.i0.L(16.0f) + height);
        float f11 = 1.0f - d;
        float L = org.telegram.messenger.i0.L(24.0f) * f11;
        int i13 = (d > 1.0f ? 1 : (d == 1.0f ? 0 : -1));
        if (i13 < 0) {
            Paint paint2 = this.f41520g0;
            paint2.setColor(0);
            i10 = 0;
            z12 = z10;
            f7 = 0.0f;
            paint2.setShadowLayer(org.telegram.messenger.i0.L(18.0f), 0.0f, -org.telegram.messenger.i0.L(3.0f), org.telegram.ui.ActionBar.t6.r1(min * 0.26f, -16777216));
            canvas.drawRoundRect(rectF, L, L, paint2);
        } else {
            z12 = z10;
            i10 = 0;
            f7 = 0.0f;
        }
        if (L <= f7) {
            canvas.clipRect(rectF);
        } else {
            Path path = this.f41525l0;
            path.rewind();
            path.addRoundRect(rectF, L, L, Path.Direction.CW);
            canvas.clipPath(path);
        }
        int backgroundColor = h4Var.f37691u0[1].getBackgroundColor();
        Paint paint3 = this.f41521h0;
        paint3.setColor(backgroundColor);
        canvas.drawRect(rectF, paint3);
        paint3.setColor(h4Var.f37691u0[i10].getBackgroundColor());
        RectF rectF2 = org.telegram.messenger.i0.P;
        rectF2.set(rectF);
        rectF2.left = h4Var.f37691u0[i10].getX();
        canvas.drawRect(rectF2, paint3);
        m0 m0Var = h4Var.f37679h0;
        if (z12 && org.telegram.messenger.i0.L(20.0f) + x10 <= org.telegram.messenger.i0.f16166m + h4Var.J0) {
            z13 = true;
        } else {
            z13 = i10;
        }
        m0Var.f42918s0 = z13;
        if (d > 0.0f) {
            canvas.save();
            float W12 = org.telegram.messenger.i0.W1(d, org.telegram.messenger.i0.L(20.0f) + x10 + 1, i10);
            canvas.translate(0.0f, W12);
            h4Var.f37679h0.a(canvas, org.telegram.messenger.m5.C(20.0f, x10, 1) - W12, d, true);
            canvas.restore();
        }
        canvas.translate(0.0f, -max);
        if (!org.telegram.messenger.i0.m0 && (!h4Var.f37691u0[0].f() || canvas.isHardwareAccelerated())) {
            super.dispatchDraw(canvas);
        }
        canvas.translate(0.0f, max);
        if (i13 < 0) {
            if (org.telegram.messenger.i0.B(u3Var.v()) < 0.721f) {
                i11 = -1;
            } else {
                i11 = -16777216;
            }
            int f12 = i0.b.f(d, org.telegram.ui.ActionBar.t6.r1(0.15f, i11), -16777216);
            Paint paint4 = this.f41522i0;
            paint4.setColor(f12);
            paint4.setAlpha((int) (paint4.getAlpha() * f11));
            float width = getWidth() / 2.0f;
            float L2 = ((org.telegram.messenger.i0.L(20.0f) / 2.0f) + f10) - (org.telegram.messenger.i0.L(8.0f) * d);
            float W13 = org.telegram.messenger.i0.W1(d, org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(48.0f)) / 2.0f;
            rectF.set(width - W13, L2 - org.telegram.messenger.i0.L(2.0f), width + W13, L2 + org.telegram.messenger.i0.L(2.0f));
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint4);
        }
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int x10;
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            u3 u3Var = this.f41529q0;
            if (u3Var.F) {
                x10 = 0;
            } else {
                x10 = u3Var.x();
            }
            if (y3 < x10) {
                u3Var.a(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public RectF getRect() {
        int x10;
        u3 u3Var = this.f41529q0;
        if (u3Var.F) {
            x10 = 0;
        } else {
            x10 = u3Var.x() - org.telegram.messenger.i0.L(20.0f);
        }
        float max = Math.max(1.0f - u3Var.f41781x, u3Var.f41782y) * u3Var.w();
        RectF rectF = this.f41526n0;
        rectF.set(0.0f, max + x10, getWidth(), getHeight());
        return rectF;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f41529q0.A();
    }

    @Override
    public final boolean onNestedPreFling(View view, float f7, float f10) {
        boolean z10;
        boolean onNestedPreFling = super.onNestedPreFling(view, f7, f10);
        u3 u3Var = this.f41529q0;
        h4 h4Var = u3Var.K;
        if (!h4Var.P0.x()) {
            l3 l3Var = h4Var.f37691u0[0];
            if (l3Var.c()) {
                z10 = !l3Var.f39061b.canScrollVertically(-1);
            } else {
                z10 = false;
            }
            if (z10 && f10 < -1000.0f) {
                u3Var.a(true);
            } else {
                u3Var.m(false, null);
            }
        }
        if (f7 != 0.0f || f10 != 0.0f) {
            org.telegram.ui.Cells.k9 k9Var = h4Var.P0;
            org.telegram.messenger.i0.r(k9Var.f23422f0);
            k9Var.f23448z = false;
        }
        this.f41528p0 = true;
        return onNestedPreFling;
    }

    @Override
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        boolean z10;
        boolean z11;
        u3 u3Var = this.f41529q0;
        h4 h4Var = u3Var.K;
        if (!u3Var.H) {
            if (i11 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            u3Var.H = z11;
        }
        l3 l3Var = h4Var.f37691u0[0];
        if (l3Var.c()) {
            z10 = !l3Var.f39061b.canScrollVertically(-1);
        } else {
            z10 = false;
        }
        if (z10 && !h4Var.P0.x()) {
            iArr[1] = Math.min((int) (u3Var.w() * u3Var.f41782y), i11);
            u3Var.f41782y = Utilities.i(u3Var.f41782y - (i11 / u3Var.w()), 1.0f, 0.0f);
            u3Var.A();
            u3Var.r();
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        org.telegram.ui.Cells.k9 k9Var = h4Var.P0;
        org.telegram.messenger.i0.r(k9Var.f23422f0);
        k9Var.f23448z = false;
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        this.f41528p0 = false;
        this.f41529q0.getClass();
        if (i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        u3 u3Var = this.f41529q0;
        u3Var.H = false;
        if (!this.f41528p0 && !u3Var.K.P0.x()) {
            if (u3Var.f41782y > 0.25f) {
                u3Var.a(true);
            } else {
                u3Var.m(false, null);
            }
        }
        super.onStopNestedScroll(view);
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        if (this.f41524k0 != z10) {
            this.f41524k0 = z10;
            invalidate();
        }
    }

    @Override
    public final float x(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        int i10;
        rectF2.set(getRect());
        org.telegram.messenger.i0.Z1(rectF2, rectF, f7, rectF2);
        u3 u3Var = this.f41529q0;
        h4 h4Var = u3Var.K;
        float f11 = 1.0f - f7;
        Paint paint = this.f41519f0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - u3Var.I) * Math.min(u3Var.f41781x, 1.0f - u3Var.f41782y) * f11 * 96.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float W1 = org.telegram.messenger.i0.W1(f7, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(18.0f));
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false);
        Paint paint2 = this.f41521h0;
        paint2.setColor(x02);
        Path path = this.f41527o0;
        path.rewind();
        path.addRoundRect(rectF2, W1, W1, Path.Direction.CW);
        canvas.drawPath(path, paint2);
        if (getChildCount() == 1) {
            if (u3Var.F) {
                canvas.save();
                canvas.clipPath(path);
                canvas.translate(0.0f, rectF2.top);
                h4Var.f37679h0.draw(canvas);
                canvas.restore();
            }
            View childAt = getChildAt(0);
            canvas.save();
            float T1 = org.telegram.messenger.i0.T1(1.0f, 0.99f, f7);
            float f12 = T1 - 1.0f;
            if (Math.abs(f12) > 0.01f) {
                canvas.scale(T1, T1, rectF2.centerX(), rectF2.centerY());
            }
            canvas.clipPath(path);
            if (Math.abs(f12) > 0.01f) {
                float f13 = 1.0f / T1;
                canvas.scale(f13, f13, rectF2.centerX(), rectF2.centerY());
            }
            float f14 = (-u3Var.x()) + rectF2.top;
            if (u3Var.F) {
                i10 = h4Var.f37679h0.getMeasuredHeight();
            } else {
                i10 = 0;
            }
            canvas.translate(0.0f, (i10 * f11) + f14);
            childAt.draw(canvas);
            canvas.restore();
        }
        return W1;
    }
}
