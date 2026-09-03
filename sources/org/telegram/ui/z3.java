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
public final class z3 extends org.telegram.ui.Components.qv0 implements org.telegram.ui.ActionBar.m2, org.telegram.ui.ActionBar.u3 {
    public final RectF A0;
    public final RectF B0;
    public final Path C0;
    public boolean D0;
    public final a4 E0;
    public final Paint f40384t0;
    public final Paint f40385u0;
    public final Paint f40386v0;
    public final Paint f40387w0;
    public final org.telegram.ui.Components.z5 f40388x0;
    public boolean f40389y0;
    public final Path f40390z0;

    public z3(a4 a4Var, Context context) {
        super(context, null);
        this.E0 = a4Var;
        this.f40384t0 = new Paint(1);
        this.f40385u0 = new Paint(1);
        this.f40386v0 = new Paint(1);
        this.f40387w0 = new Paint(1);
        new Paint(1);
        this.f40388x0 = new org.telegram.ui.Components.z5(this, 0L, 420L, org.telegram.ui.Components.mr.h);
        this.f40390z0 = new Path();
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
        a4 a4Var = this.E0;
        n4 n4Var = a4Var.H;
        if (this.f40389y0) {
            return;
        }
        float min = Math.min(a4Var.f32447w, 1.0f - a4Var.f32448x);
        Paint paint = this.f40384t0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - a4Var.F) * 96.0f * min));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int l10 = a4Var.l() - AndroidUtilities.dp(20.0f);
        if (l10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight && min > 0.95f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (a4Var.C != z4) {
            a4Var.C = z4;
            a4Var.i();
        }
        float e = this.f40388x0.e(z4);
        boolean z14 = a4Var.D;
        int i11 = (e > 0.999f ? 1 : (e == 0.999f ? 0 : -1));
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
            a4Var.D = z13;
            a4Var.h();
        }
        int lerp = AndroidUtilities.lerp(l10, 0, Utilities.clamp01(e));
        float max = Math.max(1.0f - a4Var.f32447w, a4Var.f32448x) * a4Var.k();
        canvas.save();
        canvas.translate(getWidth() * a4Var.F, max);
        float f11 = lerp;
        int height = getHeight();
        RectF rectF = this.A0;
        rectF.set(0.0f, f11, getWidth(), AndroidUtilities.dp(16.0f) + height);
        float f12 = 1.0f - e;
        float dp = AndroidUtilities.dp(24.0f) * f12;
        int i12 = (e > 1.0f ? 1 : (e == 1.0f ? 0 : -1));
        if (i12 < 0) {
            Paint paint2 = this.f40385u0;
            paint2.setColor(0);
            c3 = 0;
            z11 = z4;
            f10 = 0.0f;
            paint2.setShadowLayer(AndroidUtilities.dp(18.0f), 0.0f, -AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.j6.l1(min * 0.26f, -16777216));
            canvas.drawRoundRect(rectF, dp, dp, paint2);
        } else {
            z11 = z4;
            f10 = 0.0f;
            c3 = 0;
        }
        if (dp <= f10) {
            canvas.clipRect(rectF);
        } else {
            Path path = this.f40390z0;
            path.rewind();
            path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
            canvas.clipPath(path);
        }
        int backgroundColor = n4Var.f36375r0[1].getBackgroundColor();
        Paint paint3 = this.f40386v0;
        paint3.setColor(backgroundColor);
        canvas.drawRect(rectF, paint3);
        paint3.setColor(n4Var.f36375r0[c3].getBackgroundColor());
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        rectF2.left = n4Var.f36375r0[c3].getX();
        canvas.drawRect(rectF2, paint3);
        o0 o0Var = n4Var.f36363e0;
        if (z11 && AndroidUtilities.dp(20.0f) + l10 <= AndroidUtilities.statusBarHeight + n4Var.F0) {
            z12 = true;
        } else {
            z12 = false;
        }
        o0Var.f39612p0 = z12;
        if (e > 0.0f) {
            canvas.save();
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(20.0f) + l10 + 1, 0, e);
            canvas.translate(0.0f, lerp2);
            n4Var.f36363e0.a(canvas, org.telegram.messenger.y3.C(20.0f, l10, 1) - lerp2, e, true);
            canvas.restore();
        }
        canvas.translate(0.0f, -max);
        if (!AndroidUtilities.makingGlobalBlurBitmap && (!n4Var.f36375r0[0].f() || canvas.isHardwareAccelerated())) {
            super.dispatchDraw(canvas);
        }
        canvas.translate(0.0f, max);
        if (i12 < 0) {
            if (AndroidUtilities.computePerceivedBrightness(a4Var.j()) < 0.721f) {
                i10 = -1;
            } else {
                i10 = -16777216;
            }
            int d = i0.a.d(e, org.telegram.ui.ActionBar.j6.l1(0.15f, i10), -16777216);
            Paint paint4 = this.f40387w0;
            paint4.setColor(d);
            paint4.setAlpha((int) (paint4.getAlpha() * f12));
            float width = getWidth() / 2.0f;
            float dp2 = ((AndroidUtilities.dp(20.0f) / 2.0f) + f11) - (AndroidUtilities.dp(8.0f) * e);
            float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(48.0f), e) / 2.0f;
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
            a4 a4Var = this.E0;
            if (a4Var.C) {
                l10 = 0;
            } else {
                l10 = a4Var.l();
            }
            if (y10 < l10) {
                a4Var.dismiss(true);
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
        a4 a4Var = this.E0;
        if (a4Var.C) {
            l10 = 0;
        } else {
            l10 = a4Var.l() - AndroidUtilities.dp(20.0f);
        }
        float max = Math.max(1.0f - a4Var.f32447w, a4Var.f32448x) * a4Var.k();
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
        a4 a4Var = this.E0;
        n4 n4Var = a4Var.H;
        if (!n4Var.L0.y()) {
            r3 r3Var = n4Var.f36375r0[0];
            if (r3Var.c()) {
                z4 = !r3Var.f37684b.canScrollVertically(-1);
            } else {
                z4 = false;
            }
            if (z4 && f11 < -1000.0f) {
                a4Var.dismiss(true);
            } else {
                a4Var.e(false, null);
            }
        }
        if (f10 != 0.0f || f11 != 0.0f) {
            org.telegram.ui.Cells.l9 l9Var = n4Var.L0;
            AndroidUtilities.cancelRunOnUIThread(l9Var.f22612g0);
            l9Var.f22641z = false;
        }
        this.D0 = true;
        return onNestedPreFling;
    }

    @Override
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        boolean z4;
        boolean z10;
        a4 a4Var = this.E0;
        n4 n4Var = a4Var.H;
        if (!a4Var.E) {
            if (i11 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            a4Var.E = z10;
        }
        r3 r3Var = n4Var.f36375r0[0];
        if (r3Var.c()) {
            z4 = !r3Var.f37684b.canScrollVertically(-1);
        } else {
            z4 = false;
        }
        if (z4 && !n4Var.L0.y()) {
            iArr[1] = Math.min((int) (a4Var.k() * a4Var.f32448x), i11);
            a4Var.f32448x = Utilities.clamp(a4Var.f32448x - (i11 / a4Var.k()), 1.0f, 0.0f);
            a4Var.n();
            a4Var.h();
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        org.telegram.ui.Cells.l9 l9Var = n4Var.L0;
        AndroidUtilities.cancelRunOnUIThread(l9Var.f22612g0);
        l9Var.f22641z = false;
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
        a4 a4Var = this.E0;
        a4Var.E = false;
        if (!this.D0 && !a4Var.H.L0.y()) {
            if (a4Var.f32448x > 0.25f) {
                a4Var.dismiss(true);
            } else {
                a4Var.e(false, null);
            }
        }
        super.onStopNestedScroll(view);
    }

    @Override
    public void setDrawingFromOverlay(boolean z4) {
        if (this.f40389y0 != z4) {
            this.f40389y0 = z4;
            invalidate();
        }
    }

    @Override
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        int i10;
        rectF2.set(getRect());
        AndroidUtilities.lerp(rectF2, rectF, f10, rectF2);
        a4 a4Var = this.E0;
        n4 n4Var = a4Var.H;
        float f12 = 1.0f - f10;
        Paint paint = this.f40384t0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - a4Var.F) * Math.min(a4Var.f32447w, 1.0f - a4Var.f32448x) * f12 * 96.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f), f10);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false);
        Paint paint2 = this.f40386v0;
        paint2.setColor(w02);
        Path path = this.C0;
        path.rewind();
        path.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
        canvas.drawPath(path, paint2);
        if (getChildCount() == 1) {
            if (a4Var.C) {
                canvas.save();
                canvas.clipPath(path);
                canvas.translate(0.0f, rectF2.top);
                n4Var.f36363e0.draw(canvas);
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
            float f15 = (-a4Var.l()) + rectF2.top;
            if (a4Var.C) {
                i10 = n4Var.f36363e0.getMeasuredHeight();
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
