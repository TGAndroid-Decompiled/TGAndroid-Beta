package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class wz0 extends View implements org.telegram.ui.Components.fh0 {
    public boolean A;
    public float B;
    public float C;
    public float[] D;
    public long E;
    public float F;
    public int G;
    public float H;
    public int I;
    public float J;
    public int K;
    public final ProfileActivity L;
    public final int f44407a;
    public final Rect f44408b;
    public final Rect f44409c;
    public final RectF d;
    public final GradientDrawable f44410e;
    public final GradientDrawable f44411f;
    public final ValueAnimator h;
    public final float[] f44412n;
    public final Paint f44413r;
    public final Paint f44414s;
    public final Paint v;
    public final GradientDrawable[] f44415w;
    public final boolean[] f44416x;
    public final float[] f44417y;

    public wz0(org.telegram.ui.ProfileActivity r7, android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wz0.<init>(org.telegram.ui.ProfileActivity, android.content.Context):void");
    }

    @Override
    public final void a() {
        Arrays.fill(this.f44416x, false);
        postInvalidateOnAnimation();
    }

    @Override
    public final void b(boolean z10) {
        this.f44416x[!z10 ? 1 : 0] = true;
        postInvalidateOnAnimation();
    }

    @Override
    public final void c() {
        this.L.i5(false);
    }

    @Override
    public final void d() {
        invalidate();
    }

    public final void e(float f9, boolean z10) {
        int i10 = (int) (255.0f * f9);
        this.f44410e.setAlpha(i10);
        this.f44411f.setAlpha(i10);
        this.f44413r.setAlpha((int) (66.0f * f9));
        this.f44414s.setAlpha((int) (85.0f * f9));
        this.v.setAlpha(i10);
        this.C = f9;
        if (!z10) {
            this.B = f9;
        }
        invalidate();
    }

    public final void f(float f9, boolean z10) {
        if (z10 != this.A) {
            this.A = z10;
            ValueAnimator valueAnimator = this.h;
            valueAnimator.cancel();
            float f10 = this.B;
            float[] fArr = this.f44412n;
            float lerp = AndroidUtilities.lerp(fArr, f10);
            float f11 = 1.0f;
            if (z10) {
                valueAnimator.setDuration(((1.0f - lerp) * 250.0f) / f9);
            } else {
                valueAnimator.setDuration((250.0f * lerp) / f9);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wz0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.f44407a;
        Rect rect = this.f44408b;
        rect.set(0, 0, i10, (int) (currentActionBarHeight * 0.5f));
        Rect rect2 = this.f44409c;
        rect2.set(0, (int) (i11 - (AndroidUtilities.dp(72.0f) * 0.5f)), i10, i11);
        this.f44410e.setBounds(0, rect.bottom, i10, AndroidUtilities.dp(16.0f) + currentActionBarHeight);
        this.f44411f.setBounds(0, ((i11 - this.L.O3()) - AndroidUtilities.dp(72.0f)) - AndroidUtilities.dp(24.0f), i10, rect2.top);
        GradientDrawable[] gradientDrawableArr = this.f44415w;
        int i14 = i10 / 5;
        gradientDrawableArr[0].setBounds(0, 0, i14, i11);
        gradientDrawableArr[1].setBounds(i10 - i14, 0, i10, i11);
    }
}
