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

    public final RectF f44974a;

    public final TextPaint f44975b;

    public final Paint f44976c;
    public final ValueAnimator d;

    public final float[] f44977e;

    public final m2.a f44978f;
    public boolean h;

    public final ProfileActivity f44979n;

    public yz0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f44979n = profileActivity;
        this.f44974a = new RectF();
        this.f44977e = new float[]{0.0f, 1.0f};
        m2.a adapter = profileActivity.f35987j0.getAdapter();
        this.f44978f = adapter;
        setVisibility(8);
        TextPaint textPaint = new TextPaint(1);
        this.f44975b = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AndroidUtilities.dpf2(15.0f));
        Paint paint = new Paint(1);
        this.f44976c = paint;
        paint.setColor(637534208);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(org.telegram.ui.Components.er.f28125j);
        valueAnimatorOfFloat.addUpdateListener(new g3(this, 29));
        valueAnimatorOfFloat.addListener(new n40(6, this, profileActivity.f35988j1));
        profileActivity.f35987j0.b(new xz0(this));
        adapter.f17544a.registerObserver(new h1.a(this, 3));
    }

    public final void a(boolean z10) {
        ProfileActivity profileActivity = this.f44979n;
        if (z10) {
            wz0 wz0Var = profileActivity.J;
            wz0Var.F = wz0Var.H;
            wz0Var.G = wz0Var.I;
            wz0Var.J = 0.0f;
            wz0Var.K = 1;
        }
        profileActivity.J.invalidate();
        float fMeasureText = this.f44975b.measureText(((String) this.f44978f.d(profileActivity.f35987j0.getCurrentItem())).toString());
        float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(54.0f);
        RectF rectF = this.f44974a;
        rectF.right = measuredWidth;
        rectF.left = measuredWidth - (AndroidUtilities.dpf2(16.0f) + fMeasureText);
        float fDp = AndroidUtilities.dp(15.0f) + ((((org.telegram.ui.ActionBar.n2) profileActivity).actionBar == null || !((org.telegram.ui.ActionBar.n2) profileActivity).actionBar.getOccupyStatusBar()) ? 0 : AndroidUtilities.statusBarHeight);
        rectF.top = fDp;
        rectF.bottom = fDp + AndroidUtilities.dp(26.0f);
        setPivotX(rectF.centerX());
        setPivotY(rectF.centerY());
        invalidate();
    }

    public final void b(float f10) {
        ProfileActivity profileActivity = this.f44979n;
        boolean z10 = profileActivity.f36002l2 && profileActivity.f35987j0.getRealCount() > 20;
        if (z10 != this.h) {
            this.h = z10;
            ValueAnimator valueAnimator = this.d;
            valueAnimator.cancel();
            float animatedFraction = valueAnimator.getAnimatedFraction();
            float[] fArr = this.f44977e;
            float fLerp = AndroidUtilities.lerp(fArr, animatedFraction);
            if (f10 <= 0.0f) {
                valueAnimator.setDuration(0L);
            } else if (z10) {
                valueAnimator.setDuration((long) (((1.0f - fLerp) * 250.0f) / f10));
            } else {
                valueAnimator.setDuration((long) ((250.0f * fLerp) / f10));
            }
            fArr[0] = fLerp;
            fArr[1] = z10 ? 1.0f : 0.0f;
            valueAnimator.start();
        }
    }

    public final void c() {
        my0 my0Var;
        ProfileActivity profileActivity = this.f44979n;
        if (profileActivity.P0 == null || (my0Var = profileActivity.f35987j0) == null || !profileActivity.f36002l2) {
            return;
        }
        if (my0Var.getRealPosition() == 0) {
            profileActivity.P0.r(33);
            profileActivity.P0.K(36);
        } else {
            profileActivity.P0.K(33);
            profileActivity.P0.r(36);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float fDpf2 = AndroidUtilities.dpf2(12.0f);
        Paint paint = this.f44976c;
        RectF rectF = this.f44974a;
        canvas.drawRoundRect(rectF, fDpf2, fDpf2, paint);
        canvas.drawText(((String) this.f44978f.d(this.f44979n.f35987j0.getCurrentItem())).toString(), rectF.centerX(), AndroidUtilities.dpf2(18.5f) + rectF.top, this.f44975b);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        a(false);
    }
}
