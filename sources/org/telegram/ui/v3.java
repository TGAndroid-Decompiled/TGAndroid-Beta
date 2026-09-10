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
public final class v3 extends org.telegram.ui.Components.aw0 implements org.telegram.ui.ActionBar.m2, org.telegram.ui.ActionBar.x3 {
    public final org.telegram.ui.Components.d6 A0;
    public boolean B0;
    public final Path C0;
    public final RectF D0;
    public final RectF E0;
    public final Path F0;
    public boolean G0;
    public final w3 H0;
    public final Paint f37400w0;
    public final Paint f37401x0;
    public final Paint f37402y0;
    public final Paint f37403z0;

    public v3(w3 w3Var, Context context) {
        super(context, null);
        this.H0 = w3Var;
        this.f37400w0 = new Paint(1);
        this.f37401x0 = new Paint(1);
        this.f37402y0 = new Paint(1);
        this.f37403z0 = new Paint(1);
        new Paint(1);
        this.A0 = new org.telegram.ui.Components.d6(this, 0L, 420L, org.telegram.ui.Components.wr.h);
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
        float f7;
        char c10;
        boolean z13;
        int i10;
        boolean z14;
        w3 w3Var = this.H0;
        j4 j4Var = w3Var.K;
        if (this.B0) {
            return;
        }
        float min = Math.min(w3Var.f37692w, 1.0f - w3Var.f37693x);
        Paint paint = this.f37400w0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - w3Var.I) * 96.0f * min));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int l4 = w3Var.l() - AndroidUtilities.dp(20.0f);
        if (l4 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight && min > 0.95f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (w3Var.F != z10) {
            w3Var.F = z10;
            w3Var.i();
        }
        float e = this.A0.e(z10);
        boolean z15 = w3Var.G;
        int i11 = (e > 0.999f ? 1 : (e == 0.999f ? 0 : -1));
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
            w3Var.G = z14;
            w3Var.h();
        }
        int lerp = AndroidUtilities.lerp(l4, 0, Utilities.clamp01(e));
        float max = Math.max(1.0f - w3Var.f37692w, w3Var.f37693x) * w3Var.k();
        canvas.save();
        canvas.translate(getWidth() * w3Var.I, max);
        float f10 = lerp;
        int height = getHeight();
        RectF rectF = this.D0;
        rectF.set(0.0f, f10, getWidth(), AndroidUtilities.dp(16.0f) + height);
        float f11 = 1.0f - e;
        float dp = AndroidUtilities.dp(24.0f) * f11;
        int i12 = (e > 1.0f ? 1 : (e == 1.0f ? 0 : -1));
        if (i12 < 0) {
            Paint paint2 = this.f37401x0;
            paint2.setColor(0);
            c10 = 0;
            z12 = z10;
            f7 = 0.0f;
            paint2.setShadowLayer(AndroidUtilities.dp(18.0f), 0.0f, -AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.j6.l1(min * 0.26f, -16777216));
            canvas.drawRoundRect(rectF, dp, dp, paint2);
        } else {
            z12 = z10;
            f7 = 0.0f;
            c10 = 0;
        }
        if (dp <= f7) {
            canvas.clipRect(rectF);
        } else {
            Path path = this.C0;
            path.rewind();
            path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
            canvas.clipPath(path);
        }
        int backgroundColor = j4Var.f33920u0[1].getBackgroundColor();
        Paint paint3 = this.f37402y0;
        paint3.setColor(backgroundColor);
        canvas.drawRect(rectF, paint3);
        paint3.setColor(j4Var.f33920u0[c10].getBackgroundColor());
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        rectF2.left = j4Var.f33920u0[c10].getX();
        canvas.drawRect(rectF2, paint3);
        l0 l0Var = j4Var.f33908h0;
        if (z12 && AndroidUtilities.dp(20.0f) + l4 <= AndroidUtilities.statusBarHeight + j4Var.I0) {
            z13 = true;
        } else {
            z13 = false;
        }
        l0Var.f38124s0 = z13;
        if (e > 0.0f) {
            canvas.save();
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(20.0f) + l4 + 1, 0, e);
            canvas.translate(0.0f, lerp2);
            j4Var.f33908h0.a(canvas, org.telegram.messenger.a2.C(20.0f, l4, 1) - lerp2, e, true);
            canvas.restore();
        }
        canvas.translate(0.0f, -max);
        if (!AndroidUtilities.makingGlobalBlurBitmap && (!j4Var.f33920u0[0].f() || canvas.isHardwareAccelerated())) {
            super.dispatchDraw(canvas);
        }
        canvas.translate(0.0f, max);
        if (i12 < 0) {
            if (AndroidUtilities.computePerceivedBrightness(w3Var.j()) < 0.721f) {
                i10 = -1;
            } else {
                i10 = -16777216;
            }
            int d = i0.a.d(e, org.telegram.ui.ActionBar.j6.l1(0.15f, i10), -16777216);
            Paint paint4 = this.f37403z0;
            paint4.setColor(d);
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
            w3 w3Var = this.H0;
            if (w3Var.F) {
                l4 = 0;
            } else {
                l4 = w3Var.l();
            }
            if (y3 < l4) {
                w3Var.dismiss(true);
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
        w3 w3Var = this.H0;
        if (w3Var.F) {
            l4 = 0;
        } else {
            l4 = w3Var.l() - AndroidUtilities.dp(20.0f);
        }
        float max = Math.max(1.0f - w3Var.f37692w, w3Var.f37693x) * w3Var.k();
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
        w3 w3Var = this.H0;
        j4 j4Var = w3Var.K;
        if (!j4Var.O0.y()) {
            n3 n3Var = j4Var.f33920u0[0];
            if (n3Var.c()) {
                z10 = !n3Var.f35102b.canScrollVertically(-1);
            } else {
                z10 = false;
            }
            if (z10 && f10 < -1000.0f) {
                w3Var.dismiss(true);
            } else {
                w3Var.e(false, null);
            }
        }
        if (f7 != 0.0f || f10 != 0.0f) {
            org.telegram.ui.Cells.s9 s9Var = j4Var.O0;
            AndroidUtilities.cancelRunOnUIThread(s9Var.f19139g0);
            s9Var.f19168z = false;
        }
        this.G0 = true;
        return onNestedPreFling;
    }

    @Override
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        boolean z10;
        boolean z11;
        w3 w3Var = this.H0;
        j4 j4Var = w3Var.K;
        if (!w3Var.H) {
            if (i11 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            w3Var.H = z11;
        }
        n3 n3Var = j4Var.f33920u0[0];
        if (n3Var.c()) {
            z10 = !n3Var.f35102b.canScrollVertically(-1);
        } else {
            z10 = false;
        }
        if (z10 && !j4Var.O0.y()) {
            iArr[1] = Math.min((int) (w3Var.k() * w3Var.f37693x), i11);
            w3Var.f37693x = Utilities.clamp(w3Var.f37693x - (i11 / w3Var.k()), 1.0f, 0.0f);
            w3Var.n();
            w3Var.h();
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        org.telegram.ui.Cells.s9 s9Var = j4Var.O0;
        AndroidUtilities.cancelRunOnUIThread(s9Var.f19139g0);
        s9Var.f19168z = false;
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
        w3 w3Var = this.H0;
        w3Var.H = false;
        if (!this.G0 && !w3Var.K.O0.y()) {
            if (w3Var.f37693x > 0.25f) {
                w3Var.dismiss(true);
            } else {
                w3Var.e(false, null);
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
    public final float w(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        int i10;
        rectF2.set(getRect());
        AndroidUtilities.lerp(rectF2, rectF, f7, rectF2);
        w3 w3Var = this.H0;
        j4 j4Var = w3Var.K;
        float f11 = 1.0f - f7;
        Paint paint = this.f37400w0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - w3Var.I) * Math.min(w3Var.f37692w, 1.0f - w3Var.f37693x) * f11 * 96.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f), f7);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false);
        Paint paint2 = this.f37402y0;
        paint2.setColor(w02);
        Path path = this.F0;
        path.rewind();
        path.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
        canvas.drawPath(path, paint2);
        if (getChildCount() == 1) {
            if (w3Var.F) {
                canvas.save();
                canvas.clipPath(path);
                canvas.translate(0.0f, rectF2.top);
                j4Var.f33908h0.draw(canvas);
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
            float f14 = (-w3Var.l()) + rectF2.top;
            if (w3Var.F) {
                i10 = j4Var.f33908h0.getMeasuredHeight();
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
