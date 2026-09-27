package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class t01 extends View implements org.telegram.ui.Components.wh0 {
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
    public final int f37612a;
    public final Rect f37613b;
    public final Rect f37614c;
    public final RectF d;
    public final GradientDrawable e;
    public final GradientDrawable f37615f;
    public final ValueAnimator h;
    public final float[] f37616n;
    public final Paint f37617r;
    public final Paint f37618s;
    public final Paint v;
    public final GradientDrawable[] f37619w;
    public final boolean[] f37620x;
    public final float[] f37621y;

    public t01(org.telegram.ui.ProfileActivity r7, android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t01.<init>(org.telegram.ui.ProfileActivity, android.content.Context):void");
    }

    @Override
    public final void a() {
        Arrays.fill(this.f37620x, false);
        postInvalidateOnAnimation();
    }

    @Override
    public final void b(boolean z10) {
        this.f37620x[!z10 ? 1 : 0] = true;
        postInvalidateOnAnimation();
    }

    @Override
    public final void c() {
        this.P.i5(false);
    }

    @Override
    public final void d() {
        invalidate();
    }

    public final void e(float f7, boolean z10) {
        int i10 = (int) (255.0f * f7);
        this.e.setAlpha(i10);
        this.f37615f.setAlpha(i10);
        this.f37617r.setAlpha((int) (66.0f * f7));
        this.f37618s.setAlpha((int) (85.0f * f7));
        this.v.setAlpha(i10);
        this.G = f7;
        if (!z10) {
            this.F = f7;
        }
        invalidate();
    }

    public final void f(float f7, boolean z10) {
        if (z10 != this.E) {
            this.E = z10;
            ValueAnimator valueAnimator = this.h;
            valueAnimator.cancel();
            float f10 = this.F;
            float[] fArr = this.f37616n;
            float lerp = AndroidUtilities.lerp(fArr, f10);
            float f11 = 1.0f;
            if (z10) {
                valueAnimator.setDuration(((1.0f - lerp) * 250.0f) / f7);
            } else {
                valueAnimator.setDuration((250.0f * lerp) / f7);
            }
            fArr[0] = lerp;
            if (!z10) {
                f11 = 0.0f;
            }
            fArr[1] = f11;
            valueAnimator.start();
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t01.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.f37612a;
        Rect rect = this.f37613b;
        rect.set(0, 0, i10, (int) (currentActionBarHeight * 0.5f));
        Rect rect2 = this.f37614c;
        rect2.set(0, (int) (i11 - (AndroidUtilities.dp(72.0f) * 0.5f)), i10, i11);
        this.e.setBounds(0, rect.bottom, i10, AndroidUtilities.dp(16.0f) + currentActionBarHeight);
        this.f37615f.setBounds(0, ((i11 - this.P.O3()) - AndroidUtilities.dp(72.0f)) - AndroidUtilities.dp(24.0f), i10, rect2.top);
        GradientDrawable[] gradientDrawableArr = this.f37619w;
        int i14 = i10 / 5;
        gradientDrawableArr[0].setBounds(0, 0, i14, i11);
        gradientDrawableArr[1].setBounds(i10 - i14, 0, i10, i11);
    }
}
