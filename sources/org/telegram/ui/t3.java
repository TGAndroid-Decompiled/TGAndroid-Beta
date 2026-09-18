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
public final class t3 extends org.telegram.ui.Components.qv0 implements org.telegram.ui.ActionBar.l2, org.telegram.ui.ActionBar.w3 {
    public final org.telegram.ui.Components.c6 A0;
    public boolean B0;
    public final Path C0;
    public final RectF D0;
    public final RectF E0;
    public final Path F0;
    public boolean G0;
    public final u3 H0;
    public final Paint f37639w0;
    public final Paint f37640x0;
    public final Paint f37641y0;
    public final Paint f37642z0;

    public t3(u3 u3Var, Context context) {
        super(context, null);
        this.H0 = u3Var;
        this.f37639w0 = new Paint(1);
        this.f37640x0 = new Paint(1);
        this.f37641y0 = new Paint(1);
        this.f37642z0 = new Paint(1);
        new Paint(1);
        this.A0 = new org.telegram.ui.Components.c6(this, 0L, 420L, org.telegram.ui.Components.qr.h);
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
        u3 u3Var = this.H0;
        h4 h4Var = u3Var.K;
        if (this.B0) {
            return;
        }
        float min = Math.min(u3Var.f37931w, 1.0f - u3Var.f37932x);
        Paint paint = this.f37639w0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - u3Var.I) * 96.0f * min));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int l4 = u3Var.l() - AndroidUtilities.dp(20.0f);
        if (l4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight && min > 0.95f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (u3Var.F != z10) {
            u3Var.F = z10;
            u3Var.i();
        }
        float e = this.A0.e(z10);
        boolean z15 = u3Var.G;
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
            u3Var.G = z14;
            u3Var.h();
        }
        int lerp = AndroidUtilities.lerp(l4, 0, Utilities.clamp01(e));
        float max = Math.max(1.0f - u3Var.f37931w, u3Var.f37932x) * u3Var.k();
        canvas.save();
        canvas.translate(getWidth() * u3Var.I, max);
        float f10 = lerp;
        int height = getHeight();
        RectF rectF = this.D0;
        rectF.set(0.0f, f10, getWidth(), AndroidUtilities.dp(16.0f) + height);
        float f11 = 1.0f - e;
        float dp = AndroidUtilities.dp(24.0f) * f11;
        int i12 = (e > 1.0f ? 1 : (e == 1.0f ? 0 : -1));
        if (i12 < 0) {
            Paint paint2 = this.f37640x0;
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
        int backgroundColor = h4Var.f34173u0[1].getBackgroundColor();
        Paint paint3 = this.f37641y0;
        paint3.setColor(backgroundColor);
        canvas.drawRect(rectF, paint3);
        paint3.setColor(h4Var.f34173u0[c10].getBackgroundColor());
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        rectF2.left = h4Var.f34173u0[c10].getX();
        canvas.drawRect(rectF2, paint3);
        k0 k0Var = h4Var.f34161h0;
        if (z12 && AndroidUtilities.dp(20.0f) + l4 <= AndroidUtilities.statusBarHeight + h4Var.I0) {
            z13 = true;
        } else {
            z13 = false;
        }
        k0Var.f38978s0 = z13;
        if (e > 0.0f) {
            canvas.save();
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(20.0f) + l4 + 1, 0, e);
            canvas.translate(0.0f, lerp2);
            h4Var.f34161h0.a(canvas, org.telegram.messenger.w1.C(20.0f, l4, 1) - lerp2, e, true);
            canvas.restore();
        }
        canvas.translate(0.0f, -max);
        if (!AndroidUtilities.makingGlobalBlurBitmap && (!h4Var.f34173u0[0].f() || canvas.isHardwareAccelerated())) {
            super.dispatchDraw(canvas);
        }
        canvas.translate(0.0f, max);
        if (i12 < 0) {
            if (AndroidUtilities.computePerceivedBrightness(u3Var.j()) < 0.721f) {
                i10 = -1;
            } else {
                i10 = -16777216;
            }
            int d = i0.a.d(e, org.telegram.ui.ActionBar.j6.l1(0.15f, i10), -16777216);
            Paint paint4 = this.f37642z0;
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
            u3 u3Var = this.H0;
            if (u3Var.F) {
                l4 = 0;
            } else {
                l4 = u3Var.l();
            }
            if (y3 < l4) {
                u3Var.dismiss(true);
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
        u3 u3Var = this.H0;
        if (u3Var.F) {
            l4 = 0;
        } else {
            l4 = u3Var.l() - AndroidUtilities.dp(20.0f);
        }
        float max = Math.max(1.0f - u3Var.f37931w, u3Var.f37932x) * u3Var.k();
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
        u3 u3Var = this.H0;
        h4 h4Var = u3Var.K;
        if (!h4Var.O0.y()) {
            l3 l3Var = h4Var.f34173u0[0];
            if (l3Var.c()) {
                z10 = !l3Var.f35435b.canScrollVertically(-1);
            } else {
                z10 = false;
            }
            if (z10 && f10 < -1000.0f) {
                u3Var.dismiss(true);
            } else {
                u3Var.e(false, null);
            }
        }
        if (f7 != 0.0f || f10 != 0.0f) {
            org.telegram.ui.Cells.q9 q9Var = h4Var.O0;
            AndroidUtilities.cancelRunOnUIThread(q9Var.f19961g0);
            q9Var.f19990z = false;
        }
        this.G0 = true;
        return onNestedPreFling;
    }

    @Override
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        boolean z10;
        boolean z11;
        u3 u3Var = this.H0;
        h4 h4Var = u3Var.K;
        if (!u3Var.H) {
            if (i11 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            u3Var.H = z11;
        }
        l3 l3Var = h4Var.f34173u0[0];
        if (l3Var.c()) {
            z10 = !l3Var.f35435b.canScrollVertically(-1);
        } else {
            z10 = false;
        }
        if (z10 && !h4Var.O0.y()) {
            iArr[1] = Math.min((int) (u3Var.k() * u3Var.f37932x), i11);
            u3Var.f37932x = Utilities.clamp(u3Var.f37932x - (i11 / u3Var.k()), 1.0f, 0.0f);
            u3Var.n();
            u3Var.h();
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        org.telegram.ui.Cells.q9 q9Var = h4Var.O0;
        AndroidUtilities.cancelRunOnUIThread(q9Var.f19961g0);
        q9Var.f19990z = false;
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
        u3 u3Var = this.H0;
        u3Var.H = false;
        if (!this.G0 && !u3Var.K.O0.y()) {
            if (u3Var.f37932x > 0.25f) {
                u3Var.dismiss(true);
            } else {
                u3Var.e(false, null);
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
    public final float x(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        int i10;
        rectF2.set(getRect());
        AndroidUtilities.lerp(rectF2, rectF, f7, rectF2);
        u3 u3Var = this.H0;
        h4 h4Var = u3Var.K;
        float f11 = 1.0f - f7;
        Paint paint = this.f37639w0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - u3Var.I) * Math.min(u3Var.f37931w, 1.0f - u3Var.f37932x) * f11 * 96.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f), f7);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18863d6, false);
        Paint paint2 = this.f37641y0;
        paint2.setColor(w02);
        Path path = this.F0;
        path.rewind();
        path.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
        canvas.drawPath(path, paint2);
        if (getChildCount() == 1) {
            if (u3Var.F) {
                canvas.save();
                canvas.clipPath(path);
                canvas.translate(0.0f, rectF2.top);
                h4Var.f34161h0.draw(canvas);
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
            float f14 = (-u3Var.l()) + rectF2.top;
            if (u3Var.F) {
                i10 = h4Var.f34161h0.getMeasuredHeight();
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
