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
public final class u3 extends org.telegram.ui.Components.ov0 implements org.telegram.ui.ActionBar.k2, org.telegram.ui.ActionBar.v3 {
    public final org.telegram.ui.Components.e6 A0;
    public boolean B0;
    public final Path C0;
    public final RectF D0;
    public final RectF E0;
    public final Path F0;
    public boolean G0;
    public final v3 H0;
    public final Paint f40907w0;
    public final Paint f40908x0;
    public final Paint f40909y0;
    public final Paint f40910z0;

    public u3(v3 v3Var, Context context) {
        super(context, null);
        this.H0 = v3Var;
        this.f40907w0 = new Paint(1);
        this.f40908x0 = new Paint(1);
        this.f40909y0 = new Paint(1);
        this.f40910z0 = new Paint(1);
        new Paint(1);
        this.A0 = new org.telegram.ui.Components.e6(this, 0L, 420L, org.telegram.ui.Components.pr.h);
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
        v3 v3Var = this.H0;
        i4 i4Var = v3Var.K;
        if (this.B0) {
            return;
        }
        float min = Math.min(v3Var.f41401w, 1.0f - v3Var.f41402x);
        Paint paint = this.f40907w0;
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
        float e7 = this.A0.e(z10);
        boolean z15 = v3Var.G;
        int i11 = (e7 > 0.999f ? 1 : (e7 == 0.999f ? 0 : -1));
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
            v3Var.G = z14;
            v3Var.h();
        }
        int lerp = AndroidUtilities.lerp(l4, 0, Utilities.clamp01(e7));
        float max = Math.max(1.0f - v3Var.f41401w, v3Var.f41402x) * v3Var.k();
        canvas.save();
        canvas.translate(getWidth() * v3Var.I, max);
        float f10 = lerp;
        int height = getHeight();
        RectF rectF = this.D0;
        rectF.set(0.0f, f10, getWidth(), AndroidUtilities.dp(16.0f) + height);
        float f11 = 1.0f - e7;
        float dp = AndroidUtilities.dp(24.0f) * f11;
        int i12 = (e7 > 1.0f ? 1 : (e7 == 1.0f ? 0 : -1));
        if (i12 < 0) {
            Paint paint2 = this.f40908x0;
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
        int backgroundColor = i4Var.f37232u0[1].getBackgroundColor();
        Paint paint3 = this.f40909y0;
        paint3.setColor(backgroundColor);
        canvas.drawRect(rectF, paint3);
        paint3.setColor(i4Var.f37232u0[c10].getBackgroundColor());
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        rectF2.left = i4Var.f37232u0[c10].getX();
        canvas.drawRect(rectF2, paint3);
        k0 k0Var = i4Var.f37220h0;
        if (z12 && AndroidUtilities.dp(20.0f) + l4 <= AndroidUtilities.statusBarHeight + i4Var.I0) {
            z13 = true;
        } else {
            z13 = false;
        }
        k0Var.f42299s0 = z13;
        if (e7 > 0.0f) {
            canvas.save();
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(20.0f) + l4 + 1, 0, e7);
            canvas.translate(0.0f, lerp2);
            i4Var.f37220h0.a(canvas, org.telegram.messenger.w1.C(20.0f, l4, 1) - lerp2, e7, true);
            canvas.restore();
        }
        canvas.translate(0.0f, -max);
        if (!AndroidUtilities.makingGlobalBlurBitmap && (!i4Var.f37232u0[0].f() || canvas.isHardwareAccelerated())) {
            super.dispatchDraw(canvas);
        }
        canvas.translate(0.0f, max);
        if (i12 < 0) {
            if (AndroidUtilities.computePerceivedBrightness(v3Var.j()) < 0.721f) {
                i10 = -1;
            } else {
                i10 = -16777216;
            }
            int d = i0.a.d(e7, org.telegram.ui.ActionBar.j6.l1(0.15f, i10), -16777216);
            Paint paint4 = this.f40910z0;
            paint4.setColor(d);
            paint4.setAlpha((int) (paint4.getAlpha() * f11));
            float width = getWidth() / 2.0f;
            float dp2 = ((AndroidUtilities.dp(20.0f) / 2.0f) + f10) - (AndroidUtilities.dp(8.0f) * e7);
            float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(48.0f), e7) / 2.0f;
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
            v3 v3Var = this.H0;
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
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public RectF getRect() {
        int l4;
        v3 v3Var = this.H0;
        if (v3Var.F) {
            l4 = 0;
        } else {
            l4 = v3Var.l() - AndroidUtilities.dp(20.0f);
        }
        float max = Math.max(1.0f - v3Var.f41401w, v3Var.f41402x) * v3Var.k();
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
        v3 v3Var = this.H0;
        i4 i4Var = v3Var.K;
        if (!i4Var.O0.y()) {
            m3 m3Var = i4Var.f37232u0[0];
            if (m3Var.c()) {
                z10 = !m3Var.f38551b.canScrollVertically(-1);
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
            org.telegram.ui.Cells.q9 q9Var = i4Var.O0;
            AndroidUtilities.cancelRunOnUIThread(q9Var.f21774g0);
            q9Var.f21803z = false;
        }
        this.G0 = true;
        return onNestedPreFling;
    }

    @Override
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        boolean z10;
        boolean z11;
        v3 v3Var = this.H0;
        i4 i4Var = v3Var.K;
        if (!v3Var.H) {
            if (i11 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            v3Var.H = z11;
        }
        m3 m3Var = i4Var.f37232u0[0];
        if (m3Var.c()) {
            z10 = !m3Var.f38551b.canScrollVertically(-1);
        } else {
            z10 = false;
        }
        if (z10 && !i4Var.O0.y()) {
            iArr[1] = Math.min((int) (v3Var.k() * v3Var.f41402x), i11);
            v3Var.f41402x = Utilities.clamp(v3Var.f41402x - (i11 / v3Var.k()), 1.0f, 0.0f);
            v3Var.n();
            v3Var.h();
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        org.telegram.ui.Cells.q9 q9Var = i4Var.O0;
        AndroidUtilities.cancelRunOnUIThread(q9Var.f21774g0);
        q9Var.f21803z = false;
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
        v3 v3Var = this.H0;
        v3Var.H = false;
        if (!this.G0 && !v3Var.K.O0.y()) {
            if (v3Var.f41402x > 0.25f) {
                v3Var.dismiss(true);
            } else {
                v3Var.e(false, null);
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
        v3 v3Var = this.H0;
        i4 i4Var = v3Var.K;
        float f11 = 1.0f - f7;
        Paint paint = this.f40907w0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - v3Var.I) * Math.min(v3Var.f41401w, 1.0f - v3Var.f41402x) * f11 * 96.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f), f7);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20663d6, false);
        Paint paint2 = this.f40909y0;
        paint2.setColor(w02);
        Path path = this.F0;
        path.rewind();
        path.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
        canvas.drawPath(path, paint2);
        if (getChildCount() == 1) {
            if (v3Var.F) {
                canvas.save();
                canvas.clipPath(path);
                canvas.translate(0.0f, rectF2.top);
                i4Var.f37220h0.draw(canvas);
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
                i10 = i4Var.f37220h0.getMeasuredHeight();
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
