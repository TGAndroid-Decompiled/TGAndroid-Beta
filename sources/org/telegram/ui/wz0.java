package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class wz0 extends View implements org.telegram.ui.Components.vg0 {
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
    public final int f44284a;
    public final Rect f44285b;
    public final Rect f44286c;
    public final RectF d;
    public final GradientDrawable f44287e;
    public final GradientDrawable f44288f;
    public final ValueAnimator h;
    public final float[] f44289n;
    public final Paint f44290r;
    public final Paint f44291s;
    public final Paint v;
    public final GradientDrawable[] f44292w;
    public final boolean[] f44293x;
    public final float[] f44294y;

    public wz0(org.telegram.ui.ProfileActivity r7, android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wz0.<init>(org.telegram.ui.ProfileActivity, android.content.Context):void");
    }

    @Override
    public final void a() {
        Arrays.fill(this.f44293x, false);
        postInvalidateOnAnimation();
    }

    @Override
    public final void b(boolean z10) {
        this.f44293x[!z10 ? 1 : 0] = true;
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

    public final void e(float f10, boolean z10) {
        int i9 = (int) (255.0f * f10);
        this.f44287e.setAlpha(i9);
        this.f44288f.setAlpha(i9);
        this.f44290r.setAlpha((int) (66.0f * f10));
        this.f44291s.setAlpha((int) (85.0f * f10));
        this.v.setAlpha(i9);
        this.C = f10;
        if (!z10) {
            this.B = f10;
        }
        invalidate();
    }

    public final void f(float f10, boolean z10) {
        if (z10 != this.A) {
            this.A = z10;
            ValueAnimator valueAnimator = this.h;
            valueAnimator.cancel();
            float f11 = this.B;
            float[] fArr = this.f44289n;
            float lerp = AndroidUtilities.lerp(fArr, f11);
            float f12 = 1.0f;
            if (z10) {
                valueAnimator.setDuration(((1.0f - lerp) * 250.0f) / f10);
            } else {
                valueAnimator.setDuration((250.0f * lerp) / f10);
            }
            fArr[0] = lerp;
            if (!z10) {
                f12 = 0.0f;
            }
            fArr[1] = f12;
            valueAnimator.start();
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wz0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.f44284a;
        Rect rect = this.f44285b;
        rect.set(0, 0, i9, (int) (currentActionBarHeight * 0.5f));
        Rect rect2 = this.f44286c;
        rect2.set(0, (int) (i10 - (AndroidUtilities.dp(72.0f) * 0.5f)), i9, i10);
        this.f44287e.setBounds(0, rect.bottom, i9, AndroidUtilities.dp(16.0f) + currentActionBarHeight);
        this.f44288f.setBounds(0, ((i10 - this.L.O3()) - AndroidUtilities.dp(72.0f)) - AndroidUtilities.dp(24.0f), i9, rect2.top);
        GradientDrawable[] gradientDrawableArr = this.f44292w;
        int i13 = i9 / 5;
        gradientDrawableArr[0].setBounds(0, 0, i13, i10);
        gradientDrawableArr[1].setBounds(i9 - i13, 0, i9, i10);
    }
}
