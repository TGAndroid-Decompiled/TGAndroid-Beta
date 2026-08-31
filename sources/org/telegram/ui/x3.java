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
public final class x3 extends org.telegram.ui.Components.qv0 implements org.telegram.ui.ActionBar.m2, org.telegram.ui.ActionBar.v3 {
    public final RectF A0;
    public final RectF B0;
    public final Path C0;
    public boolean D0;
    public final y3 E0;
    public final Paint f42948t0;
    public final Paint f42949u0;
    public final Paint f42950v0;
    public final Paint f42951w0;
    public final org.telegram.ui.Components.z5 f42952x0;
    public boolean f42953y0;
    public final Path f42954z0;

    public x3(y3 y3Var, Context context) {
        super(context, null);
        this.E0 = y3Var;
        this.f42948t0 = new Paint(1);
        this.f42949u0 = new Paint(1);
        this.f42950v0 = new Paint(1);
        this.f42951w0 = new Paint(1);
        new Paint(1);
        this.f42952x0 = new org.telegram.ui.Components.z5(this, 0L, 420L, org.telegram.ui.Components.pr.h);
        this.f42954z0 = new Path();
        this.A0 = new RectF();
        new RectF();
        this.B0 = new RectF();
        this.C0 = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z4;
        boolean z10;
        boolean z11;
        float f10;
        char c3;
        boolean z12;
        int i10;
        boolean z13;
        y3 y3Var = this.E0;
        l4 l4Var = y3Var.H;
        if (this.f42953y0) {
            return;
        }
        float min = Math.min(y3Var.f43538w, 1.0f - y3Var.f43539x);
        Paint paint = this.f42948t0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - y3Var.F) * 96.0f * min));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int l10 = y3Var.l() - AndroidUtilities.dp(20.0f);
        if (l10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight && min > 0.95f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (y3Var.C != z4) {
            y3Var.C = z4;
            y3Var.i();
        }
        float e6 = this.f42952x0.e(z4);
        boolean z14 = y3Var.D;
        int i11 = (e6 > 0.999f ? 1 : (e6 == 0.999f ? 0 : -1));
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
            y3Var.D = z13;
            y3Var.h();
        }
        int lerp = AndroidUtilities.lerp(l10, 0, Utilities.clamp01(e6));
        float max = Math.max(1.0f - y3Var.f43538w, y3Var.f43539x) * y3Var.k();
        canvas.save();
        canvas.translate(getWidth() * y3Var.F, max);
        float f11 = lerp;
        int height = getHeight();
        RectF rectF = this.A0;
        rectF.set(0.0f, f11, getWidth(), AndroidUtilities.dp(16.0f) + height);
        float f12 = 1.0f - e6;
        float dp = AndroidUtilities.dp(24.0f) * f12;
        int i12 = (e6 > 1.0f ? 1 : (e6 == 1.0f ? 0 : -1));
        if (i12 < 0) {
            Paint paint2 = this.f42949u0;
            paint2.setColor(0);
            c3 = 0;
            z11 = z4;
            f10 = 0.0f;
            paint2.setShadowLayer(AndroidUtilities.dp(18.0f), 0.0f, -AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.k6.l1(min * 0.26f, -16777216));
            canvas.drawRoundRect(rectF, dp, dp, paint2);
        } else {
            z11 = z4;
            f10 = 0.0f;
            c3 = 0;
        }
        if (dp <= f10) {
            canvas.clipRect(rectF);
        } else {
            Path path = this.f42954z0;
            path.rewind();
            path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
            canvas.clipPath(path);
        }
        int backgroundColor = l4Var.f38619r0[1].getBackgroundColor();
        Paint paint3 = this.f42950v0;
        paint3.setColor(backgroundColor);
        canvas.drawRect(rectF, paint3);
        paint3.setColor(l4Var.f38619r0[c3].getBackgroundColor());
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        rectF2.left = l4Var.f38619r0[c3].getX();
        canvas.drawRect(rectF2, paint3);
        m0 m0Var = l4Var.f38607e0;
        if (z11 && AndroidUtilities.dp(20.0f) + l10 <= AndroidUtilities.statusBarHeight + l4Var.F0) {
            z12 = true;
        } else {
            z12 = false;
        }
        m0Var.f42719p0 = z12;
        if (e6 > 0.0f) {
            canvas.save();
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(20.0f) + l10 + 1, 0, e6);
            canvas.translate(0.0f, lerp2);
            l4Var.f38607e0.a(canvas, org.telegram.messenger.y3.C(20.0f, l10, 1) - lerp2, e6, true);
            canvas.restore();
        }
        canvas.translate(0.0f, -max);
        if (!AndroidUtilities.makingGlobalBlurBitmap && (!l4Var.f38619r0[0].f() || canvas.isHardwareAccelerated())) {
            super.dispatchDraw(canvas);
        }
        canvas.translate(0.0f, max);
        if (i12 < 0) {
            if (AndroidUtilities.computePerceivedBrightness(y3Var.j()) < 0.721f) {
                i10 = -1;
            } else {
                i10 = -16777216;
            }
            int d = i0.a.d(e6, org.telegram.ui.ActionBar.k6.l1(0.15f, i10), -16777216);
            Paint paint4 = this.f42951w0;
            paint4.setColor(d);
            paint4.setAlpha((int) (paint4.getAlpha() * f12));
            float width = getWidth() / 2.0f;
            float dp2 = ((AndroidUtilities.dp(20.0f) / 2.0f) + f11) - (AndroidUtilities.dp(8.0f) * e6);
            float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(48.0f), e6) / 2.0f;
            rectF.set(width - lerp3, dp2 - AndroidUtilities.dp(2.0f), width + lerp3, dp2 + AndroidUtilities.dp(2.0f));
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint4);
        }
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int l10;
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            y3 y3Var = this.E0;
            if (y3Var.C) {
                l10 = 0;
            } else {
                l10 = y3Var.l();
            }
            if (y10 < l10) {
                y3Var.dismiss(true);
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
        y3 y3Var = this.E0;
        if (y3Var.C) {
            l10 = 0;
        } else {
            l10 = y3Var.l() - AndroidUtilities.dp(20.0f);
        }
        float max = Math.max(1.0f - y3Var.f43538w, y3Var.f43539x) * y3Var.k();
        RectF rectF = this.B0;
        rectF.set(0.0f, max + l10, getWidth(), getHeight());
        return rectF;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.E0.n();
    }

    @Override
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        boolean z4;
        boolean onNestedPreFling = super.onNestedPreFling(view, f10, f11);
        y3 y3Var = this.E0;
        l4 l4Var = y3Var.H;
        if (!l4Var.L0.y()) {
            p3 p3Var = l4Var.f38619r0[0];
            if (p3Var.c()) {
                z4 = !p3Var.f39904b.canScrollVertically(-1);
            } else {
                z4 = false;
            }
            if (z4 && f11 < -1000.0f) {
                y3Var.dismiss(true);
            } else {
                y3Var.e(false, null);
            }
        }
        if (f10 != 0.0f || f11 != 0.0f) {
            org.telegram.ui.Cells.m9 m9Var = l4Var.L0;
            AndroidUtilities.cancelRunOnUIThread(m9Var.f24512g0);
            m9Var.f24541z = false;
        }
        this.D0 = true;
        return onNestedPreFling;
    }

    @Override
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        boolean z4;
        boolean z10;
        y3 y3Var = this.E0;
        l4 l4Var = y3Var.H;
        if (!y3Var.E) {
            if (i11 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            y3Var.E = z10;
        }
        p3 p3Var = l4Var.f38619r0[0];
        if (p3Var.c()) {
            z4 = !p3Var.f39904b.canScrollVertically(-1);
        } else {
            z4 = false;
        }
        if (z4 && !l4Var.L0.y()) {
            iArr[1] = Math.min((int) (y3Var.k() * y3Var.f43539x), i11);
            y3Var.f43539x = Utilities.clamp(y3Var.f43539x - (i11 / y3Var.k()), 1.0f, 0.0f);
            y3Var.n();
            y3Var.h();
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        org.telegram.ui.Cells.m9 m9Var = l4Var.L0;
        AndroidUtilities.cancelRunOnUIThread(m9Var.f24512g0);
        m9Var.f24541z = false;
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        this.D0 = false;
        this.E0.getClass();
        if (i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        y3 y3Var = this.E0;
        y3Var.E = false;
        if (!this.D0 && !y3Var.H.L0.y()) {
            if (y3Var.f43539x > 0.25f) {
                y3Var.dismiss(true);
            } else {
                y3Var.e(false, null);
            }
        }
        super.onStopNestedScroll(view);
    }

    @Override
    public void setDrawingFromOverlay(boolean z4) {
        if (this.f42953y0 != z4) {
            this.f42953y0 = z4;
            invalidate();
        }
    }

    @Override
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        int i10;
        rectF2.set(getRect());
        AndroidUtilities.lerp(rectF2, rectF, f10, rectF2);
        y3 y3Var = this.E0;
        l4 l4Var = y3Var.H;
        float f12 = 1.0f - f10;
        Paint paint = this.f42948t0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - y3Var.F) * Math.min(y3Var.f43538w, 1.0f - y3Var.f43539x) * f12 * 96.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f), f10);
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false);
        Paint paint2 = this.f42950v0;
        paint2.setColor(w02);
        Path path = this.C0;
        path.rewind();
        path.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
        canvas.drawPath(path, paint2);
        if (getChildCount() == 1) {
            if (y3Var.C) {
                canvas.save();
                canvas.clipPath(path);
                canvas.translate(0.0f, rectF2.top);
                l4Var.f38607e0.draw(canvas);
                canvas.restore();
            }
            View childAt = getChildAt(0);
            canvas.save();
            float lerp2 = AndroidUtilities.lerp(1.0f, 0.99f, f10);
            float f13 = lerp2 - 1.0f;
            if (Math.abs(f13) > 0.01f) {
                canvas.scale(lerp2, lerp2, rectF2.centerX(), rectF2.centerY());
            }
            canvas.clipPath(path);
            if (Math.abs(f13) > 0.01f) {
                float f14 = 1.0f / lerp2;
                canvas.scale(f14, f14, rectF2.centerX(), rectF2.centerY());
            }
            float f15 = (-y3Var.l()) + rectF2.top;
            if (y3Var.C) {
                i10 = l4Var.f38607e0.getMeasuredHeight();
            } else {
                i10 = 0;
            }
            canvas.translate(0.0f, (i10 * f12) + f15);
            childAt.draw(canvas);
            canvas.restore();
        }
        return lerp;
    }
}
