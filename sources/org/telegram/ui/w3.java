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
public final class w3 extends org.telegram.ui.Components.kw0 implements org.telegram.ui.ActionBar.k2, org.telegram.ui.ActionBar.u3 {
    public final org.telegram.ui.Components.f6 A0;
    public boolean B0;
    public final Path C0;
    public final RectF D0;
    public final RectF E0;
    public final Path F0;
    public boolean G0;
    public final x3 H0;
    public final Paint f42446w0;
    public final Paint f42447x0;
    public final Paint f42448y0;
    public final Paint f42449z0;

    public w3(x3 x3Var, Context context) {
        super(context, null);
        this.H0 = x3Var;
        this.f42446w0 = new Paint(1);
        this.f42447x0 = new Paint(1);
        this.f42448y0 = new Paint(1);
        this.f42449z0 = new Paint(1);
        new Paint(1);
        this.A0 = new org.telegram.ui.Components.f6(this, 0L, 420L, org.telegram.ui.Components.bs.h);
        this.C0 = new Path();
        this.D0 = new RectF();
        new RectF();
        this.E0 = new RectF();
        this.F0 = new Path();
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
        x3 x3Var = this.H0;
        l4 l4Var = x3Var.K;
        if (this.B0) {
            return;
        }
        float min = Math.min(x3Var.f43011w, 1.0f - x3Var.f43012x);
        Paint paint = this.f42446w0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - x3Var.I) * 96.0f * min));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int l4 = x3Var.l() - AndroidUtilities.dp(20.0f);
        if (l4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight && min > 0.95f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (x3Var.F != z10) {
            x3Var.F = z10;
            x3Var.i();
        }
        float e = this.A0.e(z10);
        boolean z15 = x3Var.G;
        int i12 = (e > 0.999f ? 1 : (e == 0.999f ? 0 : -1));
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
            x3Var.G = z14;
            x3Var.h();
        }
        int lerp = AndroidUtilities.lerp(l4, 0, Utilities.clamp01(e));
        float max = Math.max(1.0f - x3Var.f43011w, x3Var.f43012x) * x3Var.k();
        canvas.save();
        canvas.translate(getWidth() * x3Var.I, max);
        float f10 = lerp;
        int height = getHeight();
        RectF rectF = this.D0;
        rectF.set(0.0f, f10, getWidth(), AndroidUtilities.dp(16.0f) + height);
        float f11 = 1.0f - e;
        float dp = AndroidUtilities.dp(24.0f) * f11;
        int i13 = (e > 1.0f ? 1 : (e == 1.0f ? 0 : -1));
        if (i13 < 0) {
            Paint paint2 = this.f42447x0;
            paint2.setColor(0);
            i10 = 0;
            z12 = z10;
            f7 = 0.0f;
            paint2.setShadowLayer(AndroidUtilities.dp(18.0f), 0.0f, -AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.h6.m1(min * 0.26f, -16777216));
            canvas.drawRoundRect(rectF, dp, dp, paint2);
        } else {
            z12 = z10;
            i10 = 0;
            f7 = 0.0f;
        }
        if (dp <= f7) {
            canvas.clipRect(rectF);
        } else {
            Path path = this.C0;
            path.rewind();
            path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
            canvas.clipPath(path);
        }
        int backgroundColor = l4Var.f38774u0[1].getBackgroundColor();
        Paint paint3 = this.f42448y0;
        paint3.setColor(backgroundColor);
        canvas.drawRect(rectF, paint3);
        paint3.setColor(l4Var.f38774u0[i10].getBackgroundColor());
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        rectF2.left = l4Var.f38774u0[i10].getX();
        canvas.drawRect(rectF2, paint3);
        n0 n0Var = l4Var.f38762h0;
        if (z12 && AndroidUtilities.dp(20.0f) + l4 <= AndroidUtilities.statusBarHeight + l4Var.I0) {
            z13 = true;
        } else {
            z13 = i10;
        }
        n0Var.f42802s0 = z13;
        if (e > 0.0f) {
            canvas.save();
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(20.0f) + l4 + 1, i10, e);
            canvas.translate(0.0f, lerp2);
            l4Var.f38762h0.a(canvas, org.telegram.messenger.g0.C(20.0f, l4, 1) - lerp2, e, true);
            canvas.restore();
        }
        canvas.translate(0.0f, -max);
        if (!AndroidUtilities.makingGlobalBlurBitmap && (!l4Var.f38774u0[0].f() || canvas.isHardwareAccelerated())) {
            super.dispatchDraw(canvas);
        }
        canvas.translate(0.0f, max);
        if (i13 < 0) {
            if (AndroidUtilities.computePerceivedBrightness(x3Var.j()) < 0.721f) {
                i11 = -1;
            } else {
                i11 = -16777216;
            }
            int f12 = i0.a.f(e, org.telegram.ui.ActionBar.h6.m1(0.15f, i11), -16777216);
            Paint paint4 = this.f42449z0;
            paint4.setColor(f12);
            paint4.setAlpha((int) (paint4.getAlpha() * f11));
            float width = getWidth() / 2.0f;
            float dp2 = ((AndroidUtilities.dp(20.0f) / 2.0f) + f10) - (AndroidUtilities.dp(8.0f) * e);
            float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(48.0f), e) / 2.0f;
            rectF.set(width - lerp3, dp2 - AndroidUtilities.dp(2.0f), width + lerp3, dp2 + AndroidUtilities.dp(2.0f));
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint4);
        }
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int l4;
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            x3 x3Var = this.H0;
            if (x3Var.F) {
                l4 = 0;
            } else {
                l4 = x3Var.l();
            }
            if (y3 < l4) {
                x3Var.dismiss(true);
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
        int l4;
        x3 x3Var = this.H0;
        if (x3Var.F) {
            l4 = 0;
        } else {
            l4 = x3Var.l() - AndroidUtilities.dp(20.0f);
        }
        float max = Math.max(1.0f - x3Var.f43011w, x3Var.f43012x) * x3Var.k();
        RectF rectF = this.E0;
        rectF.set(0.0f, max + l4, getWidth(), getHeight());
        return rectF;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.H0.n();
    }

    @Override
    public final boolean onNestedPreFling(View view, float f7, float f10) {
        boolean z10;
        boolean onNestedPreFling = super.onNestedPreFling(view, f7, f10);
        x3 x3Var = this.H0;
        l4 l4Var = x3Var.K;
        if (!l4Var.O0.x()) {
            o3 o3Var = l4Var.f38774u0[0];
            if (o3Var.c()) {
                z10 = !o3Var.f39748b.canScrollVertically(-1);
            } else {
                z10 = false;
            }
            if (z10 && f10 < -1000.0f) {
                x3Var.dismiss(true);
            } else {
                x3Var.e(false, null);
            }
        }
        if (f7 != 0.0f || f10 != 0.0f) {
            org.telegram.ui.Cells.n9 n9Var = l4Var.O0;
            AndroidUtilities.cancelRunOnUIThread(n9Var.f21990f0);
            n9Var.f22016z = false;
        }
        this.G0 = true;
        return onNestedPreFling;
    }

    @Override
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        boolean z10;
        boolean z11;
        x3 x3Var = this.H0;
        l4 l4Var = x3Var.K;
        if (!x3Var.H) {
            if (i11 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            x3Var.H = z11;
        }
        o3 o3Var = l4Var.f38774u0[0];
        if (o3Var.c()) {
            z10 = !o3Var.f39748b.canScrollVertically(-1);
        } else {
            z10 = false;
        }
        if (z10 && !l4Var.O0.x()) {
            iArr[1] = Math.min((int) (x3Var.k() * x3Var.f43012x), i11);
            x3Var.f43012x = Utilities.clamp(x3Var.f43012x - (i11 / x3Var.k()), 1.0f, 0.0f);
            x3Var.n();
            x3Var.h();
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        org.telegram.ui.Cells.n9 n9Var = l4Var.O0;
        AndroidUtilities.cancelRunOnUIThread(n9Var.f21990f0);
        n9Var.f22016z = false;
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        this.G0 = false;
        this.H0.getClass();
        if (i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        x3 x3Var = this.H0;
        x3Var.H = false;
        if (!this.G0 && !x3Var.K.O0.x()) {
            if (x3Var.f43012x > 0.25f) {
                x3Var.dismiss(true);
            } else {
                x3Var.e(false, null);
            }
        }
        super.onStopNestedScroll(view);
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        if (this.B0 != z10) {
            this.B0 = z10;
            invalidate();
        }
    }

    @Override
    public final float z(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        int i10;
        rectF2.set(getRect());
        AndroidUtilities.lerp(rectF2, rectF, f7, rectF2);
        x3 x3Var = this.H0;
        l4 l4Var = x3Var.K;
        float f11 = 1.0f - f7;
        Paint paint = this.f42446w0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - x3Var.I) * Math.min(x3Var.f43011w, 1.0f - x3Var.f43012x) * f11 * 96.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f), f7);
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20989d6, false);
        Paint paint2 = this.f42448y0;
        paint2.setColor(x02);
        Path path = this.F0;
        path.rewind();
        path.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
        canvas.drawPath(path, paint2);
        if (getChildCount() == 1) {
            if (x3Var.F) {
                canvas.save();
                canvas.clipPath(path);
                canvas.translate(0.0f, rectF2.top);
                l4Var.f38762h0.draw(canvas);
                canvas.restore();
            }
            View childAt = getChildAt(0);
            canvas.save();
            float lerp2 = AndroidUtilities.lerp(1.0f, 0.99f, f7);
            float f12 = lerp2 - 1.0f;
            if (Math.abs(f12) > 0.01f) {
                canvas.scale(lerp2, lerp2, rectF2.centerX(), rectF2.centerY());
            }
            canvas.clipPath(path);
            if (Math.abs(f12) > 0.01f) {
                float f13 = 1.0f / lerp2;
                canvas.scale(f13, f13, rectF2.centerX(), rectF2.centerY());
            }
            float f14 = (-x3Var.l()) + rectF2.top;
            if (x3Var.F) {
                i10 = l4Var.f38762h0.getMeasuredHeight();
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
