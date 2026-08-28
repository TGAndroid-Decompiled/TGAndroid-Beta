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
public final class x3 extends org.telegram.ui.Components.xu0 implements org.telegram.ui.ActionBar.l2, org.telegram.ui.ActionBar.t3 {
    public final RectF A0;
    public final Path B0;
    public boolean C0;
    public final y3 D0;
    public final Paint f44344s0;
    public final Paint f44345t0;
    public final Paint f44346u0;
    public final Paint f44347v0;
    public final org.telegram.ui.Components.y5 f44348w0;
    public boolean f44349x0;
    public final Path f44350y0;
    public final RectF f44351z0;

    public x3(y3 y3Var, Context context) {
        super(context, null);
        this.D0 = y3Var;
        this.f44344s0 = new Paint(1);
        this.f44345t0 = new Paint(1);
        this.f44346u0 = new Paint(1);
        this.f44347v0 = new Paint(1);
        new Paint(1);
        this.f44348w0 = new org.telegram.ui.Components.y5(this, 0L, 420L, org.telegram.ui.Components.gr.h);
        this.f44350y0 = new Path();
        this.f44351z0 = new RectF();
        new RectF();
        this.A0 = new RectF();
        this.B0 = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f10;
        char c10;
        boolean z13;
        int i9;
        boolean z14;
        y3 y3Var = this.D0;
        l4 l4Var = y3Var.G;
        if (this.f44349x0) {
            return;
        }
        float min = Math.min(y3Var.f44706w, 1.0f - y3Var.f44707x);
        Paint paint = this.f44344s0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - y3Var.E) * 96.0f * min));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int l10 = y3Var.l() - AndroidUtilities.dp(20.0f);
        if (l10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight && min > 0.95f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (y3Var.B != z10) {
            y3Var.B = z10;
            y3Var.i();
        }
        float e10 = this.f44348w0.e(z10);
        boolean z15 = y3Var.C;
        int i10 = (e10 > 0.999f ? 1 : (e10 == 0.999f ? 0 : -1));
        if (i10 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z15 != z11) {
            if (i10 >= 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            y3Var.C = z14;
            y3Var.h();
        }
        int lerp = AndroidUtilities.lerp(l10, 0, Utilities.clamp01(e10));
        float max = Math.max(1.0f - y3Var.f44706w, y3Var.f44707x) * y3Var.k();
        canvas.save();
        canvas.translate(getWidth() * y3Var.E, max);
        float f11 = lerp;
        int height = getHeight();
        RectF rectF = this.f44351z0;
        rectF.set(0.0f, f11, getWidth(), AndroidUtilities.dp(16.0f) + height);
        float f12 = 1.0f - e10;
        float dp = AndroidUtilities.dp(24.0f) * f12;
        int i11 = (e10 > 1.0f ? 1 : (e10 == 1.0f ? 0 : -1));
        if (i11 < 0) {
            Paint paint2 = this.f44345t0;
            paint2.setColor(0);
            c10 = 0;
            z12 = z10;
            f10 = 0.0f;
            paint2.setShadowLayer(AndroidUtilities.dp(18.0f), 0.0f, -AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.f6.l1(min * 0.26f, -16777216));
            canvas.drawRoundRect(rectF, dp, dp, paint2);
        } else {
            z12 = z10;
            f10 = 0.0f;
            c10 = 0;
        }
        if (dp <= f10) {
            canvas.clipRect(rectF);
        } else {
            Path path = this.f44350y0;
            path.rewind();
            path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
            canvas.clipPath(path);
        }
        int backgroundColor = l4Var.f40026q0[1].getBackgroundColor();
        Paint paint3 = this.f44346u0;
        paint3.setColor(backgroundColor);
        canvas.drawRect(rectF, paint3);
        paint3.setColor(l4Var.f40026q0[c10].getBackgroundColor());
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        rectF2.left = l4Var.f40026q0[c10].getX();
        canvas.drawRect(rectF2, paint3);
        n0 n0Var = l4Var.f40014d0;
        if (z12 && AndroidUtilities.dp(20.0f) + l10 <= AndroidUtilities.statusBarHeight + l4Var.E0) {
            z13 = true;
        } else {
            z13 = false;
        }
        n0Var.f43989o0 = z13;
        if (e10 > 0.0f) {
            canvas.save();
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(20.0f) + l10 + 1, 0, e10);
            canvas.translate(0.0f, lerp2);
            l4Var.f40014d0.a(canvas, org.telegram.messenger.l0.C(20.0f, l10, 1) - lerp2, e10, true);
            canvas.restore();
        }
        canvas.translate(0.0f, -max);
        if (!AndroidUtilities.makingGlobalBlurBitmap && (!l4Var.f40026q0[0].f() || canvas.isHardwareAccelerated())) {
            super.dispatchDraw(canvas);
        }
        canvas.translate(0.0f, max);
        if (i11 < 0) {
            if (AndroidUtilities.computePerceivedBrightness(y3Var.j()) < 0.721f) {
                i9 = -1;
            } else {
                i9 = -16777216;
            }
            int d = i0.a.d(e10, org.telegram.ui.ActionBar.f6.l1(0.15f, i9), -16777216);
            Paint paint4 = this.f44347v0;
            paint4.setColor(d);
            paint4.setAlpha((int) (paint4.getAlpha() * f12));
            float width = getWidth() / 2.0f;
            float dp2 = ((AndroidUtilities.dp(20.0f) / 2.0f) + f11) - (AndroidUtilities.dp(8.0f) * e10);
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
            float y10 = motionEvent.getY();
            y3 y3Var = this.D0;
            if (y3Var.B) {
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
        y3 y3Var = this.D0;
        if (y3Var.B) {
            l10 = 0;
        } else {
            l10 = y3Var.l() - AndroidUtilities.dp(20.0f);
        }
        float max = Math.max(1.0f - y3Var.f44706w, y3Var.f44707x) * y3Var.k();
        RectF rectF = this.A0;
        rectF.set(0.0f, max + l10, getWidth(), getHeight());
        return rectF;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        this.D0.n();
    }

    @Override
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        boolean z10;
        boolean onNestedPreFling = super.onNestedPreFling(view, f10, f11);
        y3 y3Var = this.D0;
        l4 l4Var = y3Var.G;
        if (!l4Var.K0.y()) {
            p3 p3Var = l4Var.f40026q0[0];
            if (p3Var.c()) {
                z10 = !p3Var.f41320b.canScrollVertically(-1);
            } else {
                z10 = false;
            }
            if (z10 && f11 < -1000.0f) {
                y3Var.dismiss(true);
            } else {
                y3Var.e(false, null);
            }
        }
        if (f10 != 0.0f || f11 != 0.0f) {
            org.telegram.ui.Cells.n9 n9Var = l4Var.K0;
            AndroidUtilities.cancelRunOnUIThread(n9Var.f24083g0);
            n9Var.f24112z = false;
        }
        this.C0 = true;
        return onNestedPreFling;
    }

    @Override
    public final void onNestedPreScroll(View view, int i9, int i10, int[] iArr) {
        boolean z10;
        boolean z11;
        y3 y3Var = this.D0;
        l4 l4Var = y3Var.G;
        if (!y3Var.D) {
            if (i10 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            y3Var.D = z11;
        }
        p3 p3Var = l4Var.f40026q0[0];
        if (p3Var.c()) {
            z10 = !p3Var.f41320b.canScrollVertically(-1);
        } else {
            z10 = false;
        }
        if (z10 && !l4Var.K0.y()) {
            iArr[1] = Math.min((int) (y3Var.k() * y3Var.f44707x), i10);
            y3Var.f44707x = Utilities.clamp(y3Var.f44707x - (i10 / y3Var.k()), 1.0f, 0.0f);
            y3Var.n();
            y3Var.h();
        }
        if (i9 == 0 && i10 == 0) {
            return;
        }
        org.telegram.ui.Cells.n9 n9Var = l4Var.K0;
        AndroidUtilities.cancelRunOnUIThread(n9Var.f24083g0);
        n9Var.f24112z = false;
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i9) {
        this.C0 = false;
        this.D0.getClass();
        if (i9 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        y3 y3Var = this.D0;
        y3Var.D = false;
        if (!this.C0 && !y3Var.G.K0.y()) {
            if (y3Var.f44707x > 0.25f) {
                y3Var.dismiss(true);
            } else {
                y3Var.e(false, null);
            }
        }
        super.onStopNestedScroll(view);
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        if (this.f44349x0 != z10) {
            this.f44349x0 = z10;
            invalidate();
        }
    }

    @Override
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        int i9;
        rectF2.set(getRect());
        AndroidUtilities.lerp(rectF2, rectF, f10, rectF2);
        y3 y3Var = this.D0;
        l4 l4Var = y3Var.G;
        float f12 = 1.0f - f10;
        Paint paint = this.f44344s0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - y3Var.E) * Math.min(y3Var.f44706w, 1.0f - y3Var.f44707x) * f12 * 96.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f), f10);
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false);
        Paint paint2 = this.f44346u0;
        paint2.setColor(w02);
        Path path = this.B0;
        path.rewind();
        path.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
        canvas.drawPath(path, paint2);
        if (getChildCount() == 1) {
            if (y3Var.B) {
                canvas.save();
                canvas.clipPath(path);
                canvas.translate(0.0f, rectF2.top);
                l4Var.f40014d0.draw(canvas);
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
            if (y3Var.B) {
                i9 = l4Var.f40014d0.getMeasuredHeight();
            } else {
                i9 = 0;
            }
            canvas.translate(0.0f, (i9 * f12) + f15);
            childAt.draw(canvas);
            canvas.restore();
        }
        return lerp;
    }
}
