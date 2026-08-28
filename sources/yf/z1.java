package yf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class z1 extends i {
    public final int f50197n;
    public RectF f50198r;

    public z1(j jVar, Context context, int i9) {
        super(jVar, context);
        this.f50197n = i9;
    }

    @Override
    public final int a(float f10, float f11) {
        float measuredWidth;
        float measuredWidth2;
        float measuredWidth3;
        switch (this.f50197n) {
            case 0:
                float dp = AndroidUtilities.dp(19.5f);
                float dp2 = AndroidUtilities.dp(1.0f) + dp;
                float f12 = dp2 * 2.0f;
                float A = e2.c.A(getMeasuredHeight(), f12, 2.0f, dp2);
                if (f10 > dp2 - dp && f11 > A - dp && f10 < dp2 + dp && f11 < A + dp) {
                    return 1;
                }
                if (f10 > ((getMeasuredWidth() - f12) + dp2) - dp && f11 > A - dp && f10 < (getMeasuredWidth() - f12) + dp2 + dp && f11 < A + dp) {
                    return 2;
                }
                if (Math.pow(f11 - measuredWidth, 2.0d) + Math.pow(f10 - measuredWidth, 2.0d) < Math.pow(getMeasuredWidth() / 2.0f, 2.0d)) {
                    return 3;
                }
                return 0;
            case 1:
                float dp3 = AndroidUtilities.dp(19.5f);
                float dp4 = AndroidUtilities.dp(1.0f) + dp3;
                float f13 = dp4 * 2.0f;
                float A2 = e2.c.A(getMeasuredHeight(), f13, 2.0f, dp4);
                if (f10 > dp4 - dp3 && f11 > A2 - dp3 && f10 < dp4 + dp3 && f11 < A2 + dp3) {
                    return 1;
                }
                if (f10 > ((getMeasuredWidth() - f13) + dp4) - dp3 && f11 > A2 - dp3 && f10 < (getMeasuredWidth() - f13) + dp4 + dp3 && f11 < A2 + dp3) {
                    return 2;
                }
                if (Math.pow(f11 - measuredWidth2, 2.0d) + Math.pow(f10 - measuredWidth2, 2.0d) < Math.pow(getMeasuredWidth() / 2.0f, 2.0d)) {
                    return 3;
                }
                return 0;
            default:
                float dp5 = AndroidUtilities.dp(19.5f);
                float dp6 = AndroidUtilities.dp(1.0f) + dp5;
                float f14 = dp6 * 2.0f;
                float A3 = e2.c.A(getMeasuredHeight(), f14, 2.0f, dp6);
                if (f10 > dp6 - dp5 && f11 > A3 - dp5 && f10 < dp6 + dp5 && f11 < A3 + dp5) {
                    return 1;
                }
                if (f10 > ((getMeasuredWidth() - f14) + dp6) - dp5 && f11 > A3 - dp5 && f10 < (getMeasuredWidth() - f14) + dp6 + dp5 && f11 < A3 + dp5) {
                    return 2;
                }
                if (Math.pow(f11 - measuredWidth3, 2.0d) + Math.pow(f10 - measuredWidth3, 2.0d) < Math.pow(getMeasuredWidth() / 2.0f, 2.0d)) {
                    return 3;
                }
                return 0;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f50197n) {
            case 0:
                RectF rectF = this.f50198r;
                super.onDraw(canvas);
                int saveCount = canvas.getSaveCount();
                float showAlpha = getShowAlpha();
                if (showAlpha > 0.0f) {
                    if (showAlpha < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha * 255.0f), 31);
                    }
                    float dpf2 = AndroidUtilities.dpf2(5.66f);
                    float dp = AndroidUtilities.dp(1.0f) + dpf2 + AndroidUtilities.dp(15.0f);
                    float measuredWidth = (getMeasuredWidth() / 2) - dp;
                    float f10 = (2.0f * measuredWidth) + dp;
                    rectF.set(dp, dp, f10, f10);
                    Paint paint = this.f49841a;
                    canvas.drawArc(rectF, 0.0f, 180.0f, false, paint);
                    canvas.drawArc(rectF, 180.0f, 180.0f, false, paint);
                    float f11 = measuredWidth + dp;
                    Paint paint2 = this.f49843c;
                    canvas.drawCircle(dp, f11, dpf2, paint2);
                    Paint paint3 = this.f49842b;
                    canvas.drawCircle(dp, f11, dpf2 - AndroidUtilities.dp(1.0f), paint3);
                    canvas.drawCircle(f10, f11, dpf2, paint2);
                    canvas.drawCircle(f10, f11, dpf2 - AndroidUtilities.dp(1.0f), paint3);
                    canvas.restoreToCount(saveCount);
                    return;
                }
                return;
            case 1:
                RectF rectF2 = this.f50198r;
                super.onDraw(canvas);
                int saveCount2 = canvas.getSaveCount();
                float showAlpha2 = getShowAlpha();
                if (showAlpha2 > 0.0f) {
                    if (showAlpha2 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha2 * 255.0f), 31);
                    }
                    float dpf22 = AndroidUtilities.dpf2(5.66f);
                    float dp2 = AndroidUtilities.dp(1.0f) + dpf22 + AndroidUtilities.dp(15.0f);
                    float measuredWidth2 = (getMeasuredWidth() / 2.0f) - dp2;
                    float f12 = (2.0f * measuredWidth2) + dp2;
                    rectF2.set(dp2, dp2, f12, f12);
                    Paint paint4 = this.f49841a;
                    canvas.drawArc(rectF2, 0.0f, 180.0f, false, paint4);
                    canvas.drawArc(rectF2, 180.0f, 180.0f, false, paint4);
                    float f13 = measuredWidth2 + dp2;
                    Paint paint5 = this.f49843c;
                    canvas.drawCircle(dp2, f13, dpf22, paint5);
                    Paint paint6 = this.f49842b;
                    canvas.drawCircle(dp2, f13, dpf22 - AndroidUtilities.dp(1.0f), paint6);
                    canvas.drawCircle(f12, f13, dpf22, paint5);
                    canvas.drawCircle(f12, f13, dpf22 - AndroidUtilities.dp(1.0f), paint6);
                    canvas.restoreToCount(saveCount2);
                    return;
                }
                return;
            default:
                RectF rectF3 = this.f50198r;
                super.onDraw(canvas);
                int saveCount3 = canvas.getSaveCount();
                float showAlpha3 = getShowAlpha();
                if (showAlpha3 > 0.0f) {
                    if (showAlpha3 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha3 * 255.0f), 31);
                    }
                    float dpf23 = AndroidUtilities.dpf2(5.66f);
                    float dp3 = AndroidUtilities.dp(1.0f) + dpf23 + AndroidUtilities.dp(15.0f);
                    float measuredWidth3 = (getMeasuredWidth() / 2) - dp3;
                    float f14 = (2.0f * measuredWidth3) + dp3;
                    rectF3.set(dp3, dp3, f14, f14);
                    Paint paint7 = this.f49841a;
                    canvas.drawArc(rectF3, 0.0f, 180.0f, false, paint7);
                    canvas.drawArc(rectF3, 180.0f, 180.0f, false, paint7);
                    float f15 = measuredWidth3 + dp3;
                    Paint paint8 = this.f49843c;
                    canvas.drawCircle(dp3, f15, dpf23, paint8);
                    Paint paint9 = this.f49842b;
                    canvas.drawCircle(dp3, f15, dpf23 - AndroidUtilities.dp(1.0f), paint9);
                    canvas.drawCircle(f14, f15, dpf23, paint8);
                    canvas.drawCircle(f14, f15, dpf23 - AndroidUtilities.dp(1.0f), paint9);
                    canvas.restoreToCount(saveCount3);
                    return;
                }
                return;
        }
    }

    public z1(b2 b2Var, Context context) {
        super(b2Var, context);
        this.f50197n = 1;
        this.f50198r = new RectF();
    }
}
