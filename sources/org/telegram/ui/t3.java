package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class t3 extends org.telegram.ui.Components.qt0 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.h3 {
    public final Paint f49681g0;
    public final Paint f49682h0;
    public final Paint f49683i0;
    public final Paint f49684j0;
    public final org.telegram.ui.Components.u5 f49685k0;
    public boolean f49686l0;
    public final Path m0;
    public final RectF f49687n0;
    public final RectF f49688o0;
    public final Path f49689p0;
    public boolean f49690q0;
    public final u3 f49691r0;

    public t3(u3 u3Var, Context context) {
        super(context, null);
        this.f49691r0 = u3Var;
        this.f49681g0 = new Paint(1);
        this.f49682h0 = new Paint(1);
        this.f49683i0 = new Paint(1);
        this.f49684j0 = new Paint(1);
        new Paint(1);
        this.f49685k0 = new org.telegram.ui.Components.u5(this, 0L, 420L, org.telegram.ui.Components.xq.h);
        this.m0 = new Path();
        this.f49687n0 = new RectF();
        new RectF();
        this.f49688o0 = new RectF();
        this.f49689p0 = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i3;
        float f10;
        boolean z13;
        int i10;
        boolean z14;
        u3 u3Var = this.f49691r0;
        i4 i4Var = u3Var.L;
        if (this.f49686l0) {
            return;
        }
        float min = Math.min(u3Var.f49958x, 1.0f - u3Var.f49959y);
        Paint paint = this.f49681g0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - u3Var.J) * 96.0f * min));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int x10 = u3Var.x() - org.telegram.messenger.g0.L(20.0f);
        if (x10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22602m && min > 0.95f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (u3Var.G != z10) {
            u3Var.G = z10;
            u3Var.u();
        }
        float d = this.f49685k0.d(z10);
        boolean z15 = u3Var.H;
        int i11 = (d > 0.999f ? 1 : (d == 0.999f ? 0 : -1));
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
            u3Var.H = z14;
            u3Var.r();
        }
        int W1 = org.telegram.messenger.g0.W1(Utilities.l(d), x10, 0);
        float max = Math.max(1.0f - u3Var.f49958x, u3Var.f49959y) * u3Var.w();
        canvas.save();
        canvas.translate(getWidth() * u3Var.J, max);
        float f11 = W1;
        int height = getHeight();
        RectF rectF = this.f49687n0;
        rectF.set(0.0f, f11, getWidth(), org.telegram.messenger.g0.L(16.0f) + height);
        float f12 = 1.0f - d;
        float L = org.telegram.messenger.g0.L(24.0f) * f12;
        int i12 = (d > 1.0f ? 1 : (d == 1.0f ? 0 : -1));
        if (i12 < 0) {
            Paint paint2 = this.f49682h0;
            paint2.setColor(0);
            i3 = 0;
            z12 = z10;
            f10 = 0.0f;
            paint2.setShadowLayer(org.telegram.messenger.g0.L(18.0f), 0.0f, -org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.k6.r1(min * 0.26f, -16777216));
            canvas.drawRoundRect(rectF, L, L, paint2);
        } else {
            z12 = z10;
            i3 = 0;
            f10 = 0.0f;
        }
        if (L <= f10) {
            canvas.clipRect(rectF);
        } else {
            Path path = this.m0;
            path.rewind();
            path.addRoundRect(rectF, L, L, Path.Direction.CW);
            canvas.clipPath(path);
        }
        int backgroundColor = i4Var.f46100v0[1].getBackgroundColor();
        Paint paint3 = this.f49683i0;
        paint3.setColor(backgroundColor);
        canvas.drawRect(rectF, paint3);
        paint3.setColor(i4Var.f46100v0[i3].getBackgroundColor());
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(rectF);
        rectF2.left = i4Var.f46100v0[i3].getX();
        canvas.drawRect(rectF2, paint3);
        m0 m0Var = i4Var.f46088i0;
        if (z12 && org.telegram.messenger.g0.L(20.0f) + x10 <= org.telegram.messenger.g0.f22602m + i4Var.K0) {
            z13 = true;
        } else {
            z13 = i3;
        }
        m0Var.f50896t0 = z13;
        if (d > 0.0f) {
            canvas.save();
            float W12 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(20.0f) + x10 + 1, i3);
            canvas.translate(0.0f, W12);
            i4Var.f46088i0.a(canvas, org.telegram.messenger.k5.C(20.0f, x10, 1) - W12, d, true);
            canvas.restore();
        }
        canvas.translate(0.0f, -max);
        if (!org.telegram.messenger.g0.m0 && (!i4Var.f46100v0[0].f() || canvas.isHardwareAccelerated())) {
            super.dispatchDraw(canvas);
        }
        canvas.translate(0.0f, max);
        if (i12 < 0) {
            if (org.telegram.messenger.g0.B(u3Var.v()) < 0.721f) {
                i10 = -1;
            } else {
                i10 = -16777216;
            }
            int f13 = i0.a.f(d, org.telegram.ui.ActionBar.k6.r1(0.15f, i10), -16777216);
            Paint paint4 = this.f49684j0;
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
            float y9 = motionEvent.getY();
            u3 u3Var = this.f49691r0;
            if (u3Var.G) {
                x10 = 0;
            } else {
                x10 = u3Var.x();
            }
            if (y9 < x10) {
                u3Var.a(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public RectF getRect() {
        int x10;
        u3 u3Var = this.f49691r0;
        if (u3Var.G) {
            x10 = 0;
        } else {
            x10 = u3Var.x() - org.telegram.messenger.g0.L(20.0f);
        }
        float max = Math.max(1.0f - u3Var.f49958x, u3Var.f49959y) * u3Var.w();
        RectF rectF = this.f49688o0;
        rectF.set(0.0f, max + x10, getWidth(), getHeight());
        return rectF;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        this.f49691r0.A();
    }

    @Override
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        boolean z10;
        boolean onNestedPreFling = super.onNestedPreFling(view, f10, f11);
        u3 u3Var = this.f49691r0;
        i4 i4Var = u3Var.L;
        if (!i4Var.Q0.x()) {
            l3 l3Var = i4Var.f46100v0[0];
            if (l3Var.c()) {
                z10 = !l3Var.f47083b.canScrollVertically(-1);
            } else {
                z10 = false;
            }
            if (z10 && f11 < -1000.0f) {
                u3Var.a(true);
            } else {
                u3Var.m(false, null);
            }
        }
        if (f10 != 0.0f || f11 != 0.0f) {
            org.telegram.ui.Cells.h9 h9Var = i4Var.Q0;
            org.telegram.messenger.g0.r(h9Var.f30669f0);
            h9Var.f30695z = false;
        }
        this.f49690q0 = true;
        return onNestedPreFling;
    }

    @Override
    public final void onNestedPreScroll(View view, int i3, int i10, int[] iArr) {
        boolean z10;
        boolean z11;
        u3 u3Var = this.f49691r0;
        i4 i4Var = u3Var.L;
        if (!u3Var.I) {
            if (i10 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            u3Var.I = z11;
        }
        l3 l3Var = i4Var.f46100v0[0];
        if (l3Var.c()) {
            z10 = !l3Var.f47083b.canScrollVertically(-1);
        } else {
            z10 = false;
        }
        if (z10 && !i4Var.Q0.x()) {
            iArr[1] = Math.min((int) (u3Var.w() * u3Var.f49959y), i10);
            u3Var.f49959y = Utilities.i(u3Var.f49959y - (i10 / u3Var.w()), 1.0f, 0.0f);
            u3Var.A();
            u3Var.r();
        }
        if (i3 == 0 && i10 == 0) {
            return;
        }
        org.telegram.ui.Cells.h9 h9Var = i4Var.Q0;
        org.telegram.messenger.g0.r(h9Var.f30669f0);
        h9Var.f30695z = false;
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        this.f49690q0 = false;
        this.f49691r0.getClass();
        if (i3 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        u3 u3Var = this.f49691r0;
        u3Var.I = false;
        if (!this.f49690q0 && !u3Var.L.Q0.x()) {
            if (u3Var.f49959y > 0.25f) {
                u3Var.a(true);
            } else {
                u3Var.m(false, null);
            }
        }
        super.onStopNestedScroll(view);
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        if (this.f49686l0 != z10) {
            this.f49686l0 = z10;
            invalidate();
        }
    }

    @Override
    public final float y(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        int i3;
        rectF2.set(getRect());
        org.telegram.messenger.g0.Z1(rectF2, rectF, f10, rectF2);
        u3 u3Var = this.f49691r0;
        i4 i4Var = u3Var.L;
        float f12 = 1.0f - f10;
        Paint paint = this.f49681g0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - u3Var.J) * Math.min(u3Var.f49958x, 1.0f - u3Var.f49959y) * f12 * 96.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float W1 = org.telegram.messenger.g0.W1(f10, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(18.0f));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false);
        Paint paint2 = this.f49683i0;
        paint2.setColor(x02);
        Path path = this.f49689p0;
        path.rewind();
        path.addRoundRect(rectF2, W1, W1, Path.Direction.CW);
        canvas.drawPath(path, paint2);
        if (getChildCount() == 1) {
            if (u3Var.G) {
                canvas.save();
                canvas.clipPath(path);
                canvas.translate(0.0f, rectF2.top);
                i4Var.f46088i0.draw(canvas);
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
            float f15 = (-u3Var.x()) + rectF2.top;
            if (u3Var.G) {
                i3 = i4Var.f46088i0.getMeasuredHeight();
            } else {
                i3 = 0;
            }
            canvas.translate(0.0f, (i3 * f12) + f15);
            childAt.draw(canvas);
            canvas.restore();
        }
        return W1;
    }
}
