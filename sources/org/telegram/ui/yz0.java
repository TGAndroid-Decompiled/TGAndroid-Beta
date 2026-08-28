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
    public final RectF f44981a;
    public final TextPaint f44982b;
    public final Paint f44983c;
    public final ValueAnimator d;
    public final float[] f44984e;
    public final m2.a f44985f;
    public boolean h;
    public final ProfileActivity f44986n;

    public yz0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f44986n = profileActivity;
        this.f44981a = new RectF();
        this.f44984e = new float[]{0.0f, 1.0f};
        m2.a adapter = profileActivity.f35984j0.getAdapter();
        this.f44985f = adapter;
        setVisibility(8);
        TextPaint textPaint = new TextPaint(1);
        this.f44982b = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AndroidUtilities.dpf2(15.0f));
        Paint paint = new Paint(1);
        this.f44983c = paint;
        paint.setColor(637534208);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.setInterpolator(org.telegram.ui.Components.gr.f28847j);
        ofFloat.addUpdateListener(new f3(this, 29));
        ofFloat.addListener(new n60(5, this, profileActivity.f35985j1));
        profileActivity.f35984j0.b(new xz0(this));
        adapter.f17168a.registerObserver(new h1.a(this, 3));
    }

    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        int i9;
        org.telegram.ui.ActionBar.k kVar2;
        ProfileActivity profileActivity = this.f44986n;
        if (z10) {
            wz0 wz0Var = profileActivity.J;
            wz0Var.F = wz0Var.H;
            wz0Var.G = wz0Var.I;
            wz0Var.J = 0.0f;
            wz0Var.K = 1;
        }
        profileActivity.J.invalidate();
        float measureText = this.f44982b.measureText(((String) this.f44985f.d(profileActivity.f35984j0.getCurrentItem())).toString());
        float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(54.0f);
        RectF rectF = this.f44981a;
        rectF.right = measuredWidth;
        rectF.left = measuredWidth - (AndroidUtilities.dpf2(16.0f) + measureText);
        kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
            if (kVar2.getOccupyStatusBar()) {
                i9 = AndroidUtilities.statusBarHeight;
                float dp = AndroidUtilities.dp(15.0f) + i9;
                rectF.top = dp;
                rectF.bottom = dp + AndroidUtilities.dp(26.0f);
                setPivotX(rectF.centerX());
                setPivotY(rectF.centerY());
                invalidate();
            }
        }
        i9 = 0;
        float dp2 = AndroidUtilities.dp(15.0f) + i9;
        rectF.top = dp2;
        rectF.bottom = dp2 + AndroidUtilities.dp(26.0f);
        setPivotX(rectF.centerX());
        setPivotY(rectF.centerY());
        invalidate();
    }

    public final void b(float f10) {
        boolean z10;
        ProfileActivity profileActivity = this.f44986n;
        if (profileActivity.f35999l2 && profileActivity.f35984j0.getRealCount() > 20) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.h) {
            this.h = z10;
            ValueAnimator valueAnimator = this.d;
            valueAnimator.cancel();
            float animatedFraction = valueAnimator.getAnimatedFraction();
            float[] fArr = this.f44984e;
            float lerp = AndroidUtilities.lerp(fArr, animatedFraction);
            float f11 = 1.0f;
            if (f10 <= 0.0f) {
                valueAnimator.setDuration(0L);
            } else if (z10) {
                valueAnimator.setDuration(((1.0f - lerp) * 250.0f) / f10);
            } else {
                valueAnimator.setDuration((250.0f * lerp) / f10);
            }
            fArr[0] = lerp;
            if (!z10) {
                f11 = 0.0f;
            }
            fArr[1] = f11;
            valueAnimator.start();
        }
    }

    public final void c() {
        my0 my0Var;
        ProfileActivity profileActivity = this.f44986n;
        if (profileActivity.P0 != null && (my0Var = profileActivity.f35984j0) != null && profileActivity.f35999l2) {
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
        Paint paint = this.f44983c;
        RectF rectF = this.f44981a;
        canvas.drawRoundRect(rectF, dpf2, dpf2, paint);
        canvas.drawText(((String) this.f44985f.d(this.f44986n.f35984j0.getCurrentItem())).toString(), rectF.centerX(), AndroidUtilities.dpf2(18.5f) + rectF.top, this.f44982b);
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        a(false);
    }
}
