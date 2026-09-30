package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class t01 extends View {
    public final RectF f38012a;
    public final TextPaint f38013b;
    public final Paint f38014c;
    public final ValueAnimator d;
    public final float[] e;
    public final z4.a f38015f;
    public boolean h;
    public final ProfileActivity f38016n;

    public t01(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f38016n = profileActivity;
        this.f38012a = new RectF();
        this.e = new float[]{0.0f, 1.0f};
        z4.a adapter = profileActivity.f31689n0.getAdapter();
        this.f38015f = adapter;
        setVisibility(8);
        TextPaint textPaint = new TextPaint(1);
        this.f38013b = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AndroidUtilities.dpf2(15.0f));
        Paint paint = new Paint(1);
        this.f38014c = paint;
        paint.setColor(637534208);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.setInterpolator(org.telegram.ui.Components.tr.f28639j);
        ofFloat.addUpdateListener(new c3(this, 29));
        ofFloat.addListener(new c70(5, this, profileActivity.f31690n1));
        profileActivity.f31689n0.b(new s01(this));
        adapter.f48490a.registerObserver(new h1.a(this, 2));
    }

    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        org.telegram.ui.ActionBar.k kVar2;
        ProfileActivity profileActivity = this.f38016n;
        if (z10) {
            r01 r01Var = profileActivity.N;
            r01Var.J = r01Var.L;
            r01Var.K = r01Var.M;
            r01Var.N = 0.0f;
            r01Var.O = 1;
        }
        profileActivity.N.invalidate();
        float measureText = this.f38013b.measureText(((String) this.f38015f.d(profileActivity.f31689n0.getCurrentItem())).toString());
        float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(54.0f);
        RectF rectF = this.f38012a;
        rectF.right = measuredWidth;
        rectF.left = measuredWidth - (AndroidUtilities.dpf2(16.0f) + measureText);
        kVar = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
            if (kVar2.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
                float dp = AndroidUtilities.dp(15.0f) + i10;
                rectF.top = dp;
                rectF.bottom = dp + AndroidUtilities.dp(26.0f);
                setPivotX(rectF.centerX());
                setPivotY(rectF.centerY());
                invalidate();
            }
        }
        i10 = 0;
        float dp2 = AndroidUtilities.dp(15.0f) + i10;
        rectF.top = dp2;
        rectF.bottom = dp2 + AndroidUtilities.dp(26.0f);
        setPivotX(rectF.centerX());
        setPivotY(rectF.centerY());
        invalidate();
    }

    public final void b(float f7) {
        boolean z10;
        ProfileActivity profileActivity = this.f38016n;
        if (profileActivity.f31705p2 && profileActivity.f31689n0.getRealCount() > 20) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.h) {
            this.h = z10;
            ValueAnimator valueAnimator = this.d;
            valueAnimator.cancel();
            float animatedFraction = valueAnimator.getAnimatedFraction();
            float[] fArr = this.e;
            float lerp = AndroidUtilities.lerp(fArr, animatedFraction);
            float f10 = 1.0f;
            if (f7 <= 0.0f) {
                valueAnimator.setDuration(0L);
            } else if (z10) {
                valueAnimator.setDuration(((1.0f - lerp) * 250.0f) / f7);
            } else {
                valueAnimator.setDuration((250.0f * lerp) / f7);
            }
            fArr[0] = lerp;
            if (!z10) {
                f10 = 0.0f;
            }
            fArr[1] = f10;
            valueAnimator.start();
        }
    }

    public final void c() {
        gz0 gz0Var;
        ProfileActivity profileActivity = this.f38016n;
        if (profileActivity.T0 != null && (gz0Var = profileActivity.f31689n0) != null && profileActivity.f31705p2) {
            if (gz0Var.getRealPosition() == 0) {
                profileActivity.T0.r(33);
                profileActivity.T0.K(36);
                return;
            }
            profileActivity.T0.K(33);
            profileActivity.T0.r(36);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dpf2 = AndroidUtilities.dpf2(12.0f);
        Paint paint = this.f38014c;
        RectF rectF = this.f38012a;
        canvas.drawRoundRect(rectF, dpf2, dpf2, paint);
        canvas.drawText(((String) this.f38015f.d(this.f38016n.f31689n0.getCurrentItem())).toString(), rectF.centerX(), AndroidUtilities.dpf2(18.5f) + rectF.top, this.f38013b);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        a(false);
    }
}
