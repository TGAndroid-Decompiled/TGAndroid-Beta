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
public final class u3 extends org.telegram.ui.Components.vw0 implements org.telegram.ui.ActionBar.o2, org.telegram.ui.ActionBar.z3 {
    public final Paint f43991l0;
    public final Paint m0;
    public final Paint f43992n0;
    public final Paint f43993o0;
    public final org.telegram.ui.Components.h6 f43994p0;
    public boolean f43995q0;
    public final Path f43996r0;
    public final RectF f43997s0;
    public final RectF f43998t0;
    public final Path f43999u0;
    public boolean f44000v0;
    public final v3 f44001w0;

    public u3(v3 v3Var, Context context) {
        super(context, null);
        this.f44001w0 = v3Var;
        this.f43991l0 = new Paint(1);
        this.m0 = new Paint(1);
        this.f43992n0 = new Paint(1);
        this.f43993o0 = new Paint(1);
        new Paint(1);
        this.f43994p0 = new org.telegram.ui.Components.h6(this, 0L, 420L, org.telegram.ui.Components.ds.h);
        this.f43996r0 = new Path();
        this.f43997s0 = new RectF();
        new RectF();
        this.f43998t0 = new RectF();
        this.f43999u0 = new Path();
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
        v3 v3Var = this.f44001w0;
        j4 j4Var = v3Var.K;
        if (this.f43995q0) {
            return;
        }
        float min = Math.min(v3Var.f44591w, 1.0f - v3Var.f44592x);
        Paint paint = this.f43991l0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - v3Var.I) * 96.0f * min));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int l4 = v3Var.l() - AndroidUtilities.dp(20.0f);
        if (l4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight && min > 0.95f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (v3Var.F != z10) {
            v3Var.F = z10;
            v3Var.i();
        }
        float e = this.f43994p0.e(z10);
        boolean z15 = v3Var.G;
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
            v3Var.G = z14;
            v3Var.h();
        }
        int lerp = AndroidUtilities.lerp(l4, 0, Utilities.clamp01(e));
        float max = Math.max(1.0f - v3Var.f44591w, v3Var.f44592x) * v3Var.k();
        canvas.save();
        canvas.translate(getWidth() * v3Var.I, max);
        float f10 = lerp;
        int height = getHeight();
        RectF rectF = this.f43997s0;
        rectF.set(0.0f, f10, getWidth(), AndroidUtilities.dp(16.0f) + height);
        float f11 = 1.0f - e;
        float dp = AndroidUtilities.dp(24.0f) * f11;
        int i13 = (e > 1.0f ? 1 : (e == 1.0f ? 0 : -1));
        if (i13 < 0) {
            Paint paint2 = this.m0;
            paint2.setColor(0);
            i10 = 0;
            z12 = z10;
            f7 = 0.0f;
            paint2.setShadowLayer(AndroidUtilities.dp(18.0f), 0.0f, -AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.y6.o1(min * 0.26f, -16777216));
            canvas.drawRoundRect(rectF, dp, dp, paint2);
        } else {
            z12 = z10;
            i10 = 0;
            f7 = 0.0f;
        }
        if (dp <= f7) {
            canvas.clipRect(rectF);
        } else {
            Path path = this.f43996r0;
            path.rewind();
            path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
            canvas.clipPath(path);
        }
        int backgroundColor = j4Var.f40449u0[1].getBackgroundColor();
        Paint paint3 = this.f43992n0;
        paint3.setColor(backgroundColor);
        canvas.drawRect(rectF, paint3);
        paint3.setColor(j4Var.f40449u0[i10].getBackgroundColor());
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        rectF2.left = j4Var.f40449u0[i10].getX();
        canvas.drawRect(rectF2, paint3);
        l0 l0Var = j4Var.f40437h0;
        if (z12 && AndroidUtilities.dp(20.0f) + l4 <= AndroidUtilities.statusBarHeight + j4Var.J0) {
            z13 = true;
        } else {
            z13 = i10;
        }
        l0Var.f45416s0 = z13;
        if (e > 0.0f) {
            canvas.save();
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(20.0f) + l4 + 1, i10, e);
            canvas.translate(0.0f, lerp2);
            j4Var.f40437h0.a(canvas, org.telegram.messenger.t.D(20.0f, l4, 1) - lerp2, e, true);
            canvas.restore();
        }
        canvas.translate(0.0f, -max);
        if (!AndroidUtilities.makingGlobalBlurBitmap && (!j4Var.f40449u0[0].f() || canvas.isHardwareAccelerated())) {
            super.dispatchDraw(canvas);
        }
        canvas.translate(0.0f, max);
        if (i13 < 0) {
            if (AndroidUtilities.computePerceivedBrightness(v3Var.j()) < 0.721f) {
                i11 = -1;
            } else {
                i11 = -16777216;
            }
            int f12 = i0.a.f(e, org.telegram.ui.ActionBar.y6.o1(0.15f, i11), -16777216);
            Paint paint4 = this.f43993o0;
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
            v3 v3Var = this.f44001w0;
            if (v3Var.F) {
                l4 = 0;
            } else {
                l4 = v3Var.l();
            }
            if (y3 < l4) {
                v3Var.dismiss(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public RectF getRect() {
        int l4;
        v3 v3Var = this.f44001w0;
        if (v3Var.F) {
            l4 = 0;
        } else {
            l4 = v3Var.l() - AndroidUtilities.dp(20.0f);
        }
        float max = Math.max(1.0f - v3Var.f44591w, v3Var.f44592x) * v3Var.k();
        RectF rectF = this.f43998t0;
        rectF.set(0.0f, max + l4, getWidth(), getHeight());
        return rectF;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f44001w0.n();
    }

    @Override
    public final boolean onNestedPreFling(View view, float f7, float f10) {
        boolean z10;
        boolean onNestedPreFling = super.onNestedPreFling(view, f7, f10);
        v3 v3Var = this.f44001w0;
        j4 j4Var = v3Var.K;
        if (!j4Var.P0.x()) {
            m3 m3Var = j4Var.f40449u0[0];
            if (m3Var.c()) {
                z10 = !m3Var.f41443b.canScrollVertically(-1);
            } else {
                z10 = false;
            }
            if (z10 && f10 < -1000.0f) {
                v3Var.dismiss(true);
            } else {
                v3Var.e(false, null);
            }
        }
        if (f7 != 0.0f || f10 != 0.0f) {
            org.telegram.ui.Cells.s9 s9Var = j4Var.P0;
            AndroidUtilities.cancelRunOnUIThread(s9Var.f24096f0);
            s9Var.f24122z = false;
        }
        this.f44000v0 = true;
        return onNestedPreFling;
    }

    @Override
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        boolean z10;
        boolean z11;
        v3 v3Var = this.f44001w0;
        j4 j4Var = v3Var.K;
        if (!v3Var.H) {
            if (i11 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            v3Var.H = z11;
        }
        m3 m3Var = j4Var.f40449u0[0];
        if (m3Var.c()) {
            z10 = !m3Var.f41443b.canScrollVertically(-1);
        } else {
            z10 = false;
        }
        if (z10 && !j4Var.P0.x()) {
            iArr[1] = Math.min((int) (v3Var.k() * v3Var.f44592x), i11);
            v3Var.f44592x = Utilities.clamp(v3Var.f44592x - (i11 / v3Var.k()), 1.0f, 0.0f);
            v3Var.n();
            v3Var.h();
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        org.telegram.ui.Cells.s9 s9Var = j4Var.P0;
        AndroidUtilities.cancelRunOnUIThread(s9Var.f24096f0);
        s9Var.f24122z = false;
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        this.f44000v0 = false;
        this.f44001w0.getClass();
        if (i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        v3 v3Var = this.f44001w0;
        v3Var.H = false;
        if (!this.f44000v0 && !v3Var.K.P0.x()) {
            if (v3Var.f44592x > 0.25f) {
                v3Var.dismiss(true);
            } else {
                v3Var.e(false, null);
            }
        }
        super.onStopNestedScroll(view);
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        if (this.f43995q0 != z10) {
            this.f43995q0 = z10;
            invalidate();
        }
    }

    @Override
    public final float y(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        int i10;
        rectF2.set(getRect());
        AndroidUtilities.lerp(rectF2, rectF, f7, rectF2);
        v3 v3Var = this.f44001w0;
        j4 j4Var = v3Var.K;
        float f11 = 1.0f - f7;
        Paint paint = this.f43991l0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - v3Var.I) * Math.min(v3Var.f44591w, 1.0f - v3Var.f44592x) * f11 * 96.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f), f7);
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23356d6, false);
        Paint paint2 = this.f43992n0;
        paint2.setColor(x02);
        Path path = this.f43999u0;
        path.rewind();
        path.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
        canvas.drawPath(path, paint2);
        if (getChildCount() == 1) {
            if (v3Var.F) {
                canvas.save();
                canvas.clipPath(path);
                canvas.translate(0.0f, rectF2.top);
                j4Var.f40437h0.draw(canvas);
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
            float f14 = (-v3Var.l()) + rectF2.top;
            if (v3Var.F) {
                i10 = j4Var.f40437h0.getMeasuredHeight();
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
