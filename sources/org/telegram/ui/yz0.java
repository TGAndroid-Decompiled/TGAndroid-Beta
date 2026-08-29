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
public final class yz0 extends View {
    public final RectF f44992a;
    public final TextPaint f44993b;
    public final Paint f44994c;
    public final ValueAnimator d;
    public final float[] f44995e;
    public final m2.a f44996f;
    public boolean h;
    public final ProfileActivity f44997n;

    public yz0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f44997n = profileActivity;
        this.f44992a = new RectF();
        this.f44995e = new float[]{0.0f, 1.0f};
        m2.a adapter = profileActivity.f36049j0.getAdapter();
        this.f44996f = adapter;
        setVisibility(8);
        TextPaint textPaint = new TextPaint(1);
        this.f44993b = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AndroidUtilities.dpf2(15.0f));
        Paint paint = new Paint(1);
        this.f44994c = paint;
        paint.setColor(637534208);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.setInterpolator(org.telegram.ui.Components.jr.f29803j);
        ofFloat.addUpdateListener(new g3(this, 29));
        ofFloat.addListener(new p60(5, this, profileActivity.f36050j1));
        profileActivity.f36049j0.b(new xz0(this));
        adapter.f16766a.registerObserver(new h1.a(this, 3));
    }

    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        int i10;
        org.telegram.ui.ActionBar.l lVar2;
        ProfileActivity profileActivity = this.f44997n;
        if (z10) {
            wz0 wz0Var = profileActivity.J;
            wz0Var.F = wz0Var.H;
            wz0Var.G = wz0Var.I;
            wz0Var.J = 0.0f;
            wz0Var.K = 1;
        }
        profileActivity.J.invalidate();
        float measureText = this.f44993b.measureText(((String) this.f44996f.d(profileActivity.f36049j0.getCurrentItem())).toString());
        float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(54.0f);
        RectF rectF = this.f44992a;
        rectF.right = measuredWidth;
        rectF.left = measuredWidth - (AndroidUtilities.dpf2(16.0f) + measureText);
        lVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
        if (lVar != null) {
            lVar2 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
            if (lVar2.getOccupyStatusBar()) {
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

    public final void b(float f9) {
        boolean z10;
        ProfileActivity profileActivity = this.f44997n;
        if (profileActivity.f36064l2 && profileActivity.f36049j0.getRealCount() > 20) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.h) {
            this.h = z10;
            ValueAnimator valueAnimator = this.d;
            valueAnimator.cancel();
            float animatedFraction = valueAnimator.getAnimatedFraction();
            float[] fArr = this.f44995e;
            float lerp = AndroidUtilities.lerp(fArr, animatedFraction);
            float f10 = 1.0f;
            if (f9 <= 0.0f) {
                valueAnimator.setDuration(0L);
            } else if (z10) {
                valueAnimator.setDuration(((1.0f - lerp) * 250.0f) / f9);
            } else {
                valueAnimator.setDuration((250.0f * lerp) / f9);
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
        my0 my0Var;
        ProfileActivity profileActivity = this.f44997n;
        if (profileActivity.P0 != null && (my0Var = profileActivity.f36049j0) != null && profileActivity.f36064l2) {
            if (my0Var.getRealPosition() == 0) {
                profileActivity.P0.r(33);
                profileActivity.P0.K(36);
                return;
            }
            profileActivity.P0.K(33);
            profileActivity.P0.r(36);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dpf2 = AndroidUtilities.dpf2(12.0f);
        Paint paint = this.f44994c;
        RectF rectF = this.f44992a;
        canvas.drawRoundRect(rectF, dpf2, dpf2, paint);
        canvas.drawText(((String) this.f44996f.d(this.f44997n.f36049j0.getCurrentItem())).toString(), rectF.centerX(), AndroidUtilities.dpf2(18.5f) + rectF.top, this.f44993b);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        a(false);
    }
}
