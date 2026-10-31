package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import java.util.Arrays;
public final class yx0 extends View implements org.telegram.ui.Components.qg0 {
    public final float[] D;
    public boolean E;
    public float F;
    public float G;
    public float[] H;
    public long I;
    public float J;
    public int K;
    public float L;
    public int M;
    public float N;
    public int O;
    public final ProfileActivity P;
    public final int f43904a;
    public final Rect f43905b;
    public final Rect f43906c;
    public final RectF d;
    public final GradientDrawable e;
    public final GradientDrawable f43907f;
    public final ValueAnimator h;
    public final float[] f43908n;
    public final Paint f43909r;
    public final Paint f43910s;
    public final Paint f43911w;
    public final GradientDrawable[] f43912x;
    public final boolean[] f43913y;

    public yx0(org.telegram.ui.ProfileActivity r7, android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yx0.<init>(org.telegram.ui.ProfileActivity, android.content.Context):void");
    }

    @Override
    public final void a() {
        Arrays.fill(this.f43913y, false);
        postInvalidateOnAnimation();
    }

    @Override
    public final void b(boolean z10) {
        this.f43913y[!z10 ? 1 : 0] = true;
        postInvalidateOnAnimation();
    }

    @Override
    public final void c() {
        RectF rectF = ProfileActivity.R6;
        this.P.H5(false);
    }

    @Override
    public final void d() {
        invalidate();
    }

    public final void e(boolean z10, float f7) {
        int i10 = (int) (255.0f * f7);
        this.e.setAlpha(i10);
        this.f43907f.setAlpha(i10);
        this.f43909r.setAlpha((int) (66.0f * f7));
        this.f43910s.setAlpha((int) (85.0f * f7));
        this.f43911w.setAlpha(i10);
        this.G = f7;
        if (!z10) {
            this.F = f7;
        }
        invalidate();
    }

    public final void f(boolean z10, float f7) {
        if (z10 != this.E) {
            this.E = z10;
            ValueAnimator valueAnimator = this.h;
            valueAnimator.cancel();
            float f10 = this.F;
            float[] fArr = this.f43908n;
            float U1 = org.telegram.messenger.i0.U1(f10, fArr);
            float f11 = 1.0f;
            if (z10) {
                valueAnimator.setDuration(((1.0f - U1) * 250.0f) / f7);
            } else {
                valueAnimator.setDuration((250.0f * U1) / f7);
            }
            fArr[0] = U1;
            if (!z10) {
                f11 = 0.0f;
            }
            fArr[1] = f11;
            valueAnimator.start();
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yx0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.f43904a;
        Rect rect = this.f43905b;
        rect.set(0, 0, i10, (int) (currentActionBarHeight * 0.5f));
        Rect rect2 = this.f43906c;
        rect2.set(0, (int) (i11 - (org.telegram.messenger.i0.L(72.0f) * 0.5f)), i10, i11);
        this.e.setBounds(0, rect.bottom, i10, org.telegram.messenger.i0.L(16.0f) + currentActionBarHeight);
        RectF rectF = ProfileActivity.R6;
        this.f43907f.setBounds(0, ((i11 - this.P.d4()) - org.telegram.messenger.i0.L(72.0f)) - org.telegram.messenger.i0.L(24.0f), i10, rect2.top);
        GradientDrawable[] gradientDrawableArr = this.f43912x;
        int i14 = i10 / 5;
        gradientDrawableArr[0].setBounds(0, 0, i14, i11);
        gradientDrawableArr[1].setBounds(i10 - i14, 0, i10, i11);
    }
}
