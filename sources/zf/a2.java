package zf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

public final class a2 extends i {

    public final int f50336n;

    public RectF f50337r;

    public a2(j jVar, Context context, int i10) {
        super(jVar, context);
        this.f50336n = i10;
    }

    @Override
    public final int a(float f10, float f11) {
        switch (this.f50336n) {
            case 0:
                float fDp = AndroidUtilities.dp(1.0f);
                float fDp2 = AndroidUtilities.dp(19.5f);
                float f12 = fDp + fDp2;
                float f13 = f12 * 2.0f;
                float fA = com.google.android.recaptcha.internal.a.A(getMeasuredHeight(), f13, 2.0f, f12);
                if (f10 > f12 - fDp2 && f11 > fA - fDp2 && f10 < f12 + fDp2 && f11 < fA + fDp2) {
                    return 1;
                }
                if (f10 > ((getMeasuredWidth() - f13) + f12) - fDp2 && f11 > fA - fDp2 && f10 < (getMeasuredWidth() - f13) + f12 + fDp2 && f11 < fA + fDp2) {
                    return 2;
                }
                float measuredWidth = getMeasuredWidth() / 2.0f;
                return Math.pow((double) (f11 - measuredWidth), 2.0d) + Math.pow((double) (f10 - measuredWidth), 2.0d) < Math.pow((double) measuredWidth, 2.0d) ? 3 : 0;
            case 1:
                float fDp3 = AndroidUtilities.dp(1.0f);
                float fDp4 = AndroidUtilities.dp(19.5f);
                float f14 = fDp3 + fDp4;
                float f15 = f14 * 2.0f;
                float fA2 = com.google.android.recaptcha.internal.a.A(getMeasuredHeight(), f15, 2.0f, f14);
                if (f10 > f14 - fDp4 && f11 > fA2 - fDp4 && f10 < f14 + fDp4 && f11 < fA2 + fDp4) {
                    return 1;
                }
                if (f10 > ((getMeasuredWidth() - f15) + f14) - fDp4 && f11 > fA2 - fDp4 && f10 < (getMeasuredWidth() - f15) + f14 + fDp4 && f11 < fA2 + fDp4) {
                    return 2;
                }
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                return Math.pow((double) (f11 - measuredWidth2), 2.0d) + Math.pow((double) (f10 - measuredWidth2), 2.0d) < Math.pow((double) measuredWidth2, 2.0d) ? 3 : 0;
            default:
                float fDp5 = AndroidUtilities.dp(1.0f);
                float fDp6 = AndroidUtilities.dp(19.5f);
                float f16 = fDp5 + fDp6;
                float f17 = f16 * 2.0f;
                float fA3 = com.google.android.recaptcha.internal.a.A(getMeasuredHeight(), f17, 2.0f, f16);
                if (f10 > f16 - fDp6 && f11 > fA3 - fDp6 && f10 < f16 + fDp6 && f11 < fA3 + fDp6) {
                    return 1;
                }
                if (f10 > ((getMeasuredWidth() - f17) + f16) - fDp6 && f11 > fA3 - fDp6 && f10 < (getMeasuredWidth() - f17) + f16 + fDp6 && f11 < fA3 + fDp6) {
                    return 2;
                }
                float measuredWidth3 = getMeasuredWidth() / 2.0f;
                return Math.pow((double) (f11 - measuredWidth3), 2.0d) + Math.pow((double) (f10 - measuredWidth3), 2.0d) < Math.pow((double) measuredWidth3, 2.0d) ? 3 : 0;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f50336n) {
            case 0:
                RectF rectF = this.f50337r;
                super.onDraw(canvas);
                int saveCount = canvas.getSaveCount();
                float showAlpha = getShowAlpha();
                if (showAlpha > 0.0f) {
                    if (showAlpha < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha * 255.0f), 31);
                    }
                    float fDp = AndroidUtilities.dp(1.0f);
                    float fDpf2 = AndroidUtilities.dpf2(5.66f);
                    float fDp2 = fDp + fDpf2 + AndroidUtilities.dp(15.0f);
                    float measuredWidth = (getMeasuredWidth() / 2) - fDp2;
                    float f10 = (2.0f * measuredWidth) + fDp2;
                    rectF.set(fDp2, fDp2, f10, f10);
                    Paint paint = this.f50428a;
                    canvas.drawArc(rectF, 0.0f, 180.0f, false, paint);
                    canvas.drawArc(rectF, 180.0f, 180.0f, false, paint);
                    float f11 = measuredWidth + fDp2;
                    Paint paint2 = this.f50430c;
                    canvas.drawCircle(fDp2, f11, fDpf2, paint2);
                    float fDp3 = fDpf2 - AndroidUtilities.dp(1.0f);
                    Paint paint3 = this.f50429b;
                    canvas.drawCircle(fDp2, f11, fDp3, paint3);
                    canvas.drawCircle(f10, f11, fDpf2, paint2);
                    canvas.drawCircle(f10, f11, fDpf2 - AndroidUtilities.dp(1.0f), paint3);
                    canvas.restoreToCount(saveCount);
                    break;
                }
                break;
            case 1:
                RectF rectF2 = this.f50337r;
                super.onDraw(canvas);
                int saveCount2 = canvas.getSaveCount();
                float showAlpha2 = getShowAlpha();
                if (showAlpha2 > 0.0f) {
                    if (showAlpha2 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha2 * 255.0f), 31);
                    }
                    float fDp4 = AndroidUtilities.dp(1.0f);
                    float fDpf3 = AndroidUtilities.dpf2(5.66f);
                    float fDp5 = fDp4 + fDpf3 + AndroidUtilities.dp(15.0f);
                    float measuredWidth2 = (getMeasuredWidth() / 2.0f) - fDp5;
                    float f12 = (2.0f * measuredWidth2) + fDp5;
                    rectF2.set(fDp5, fDp5, f12, f12);
                    Paint paint4 = this.f50428a;
                    canvas.drawArc(rectF2, 0.0f, 180.0f, false, paint4);
                    canvas.drawArc(rectF2, 180.0f, 180.0f, false, paint4);
                    float f13 = measuredWidth2 + fDp5;
                    Paint paint5 = this.f50430c;
                    canvas.drawCircle(fDp5, f13, fDpf3, paint5);
                    float fDp6 = fDpf3 - AndroidUtilities.dp(1.0f);
                    Paint paint6 = this.f50429b;
                    canvas.drawCircle(fDp5, f13, fDp6, paint6);
                    canvas.drawCircle(f12, f13, fDpf3, paint5);
                    canvas.drawCircle(f12, f13, fDpf3 - AndroidUtilities.dp(1.0f), paint6);
                    canvas.restoreToCount(saveCount2);
                    break;
                }
                break;
            default:
                RectF rectF3 = this.f50337r;
                super.onDraw(canvas);
                int saveCount3 = canvas.getSaveCount();
                float showAlpha3 = getShowAlpha();
                if (showAlpha3 > 0.0f) {
                    if (showAlpha3 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha3 * 255.0f), 31);
                    }
                    float fDp7 = AndroidUtilities.dp(1.0f);
                    float fDpf4 = AndroidUtilities.dpf2(5.66f);
                    float fDp8 = fDp7 + fDpf4 + AndroidUtilities.dp(15.0f);
                    float measuredWidth3 = (getMeasuredWidth() / 2) - fDp8;
                    float f14 = (2.0f * measuredWidth3) + fDp8;
                    rectF3.set(fDp8, fDp8, f14, f14);
                    Paint paint7 = this.f50428a;
                    canvas.drawArc(rectF3, 0.0f, 180.0f, false, paint7);
                    canvas.drawArc(rectF3, 180.0f, 180.0f, false, paint7);
                    float f15 = measuredWidth3 + fDp8;
                    Paint paint8 = this.f50430c;
                    canvas.drawCircle(fDp8, f15, fDpf4, paint8);
                    float fDp9 = fDpf4 - AndroidUtilities.dp(1.0f);
                    Paint paint9 = this.f50429b;
                    canvas.drawCircle(fDp8, f15, fDp9, paint9);
                    canvas.drawCircle(f14, f15, fDpf4, paint8);
                    canvas.drawCircle(f14, f15, fDpf4 - AndroidUtilities.dp(1.0f), paint9);
                    canvas.restoreToCount(saveCount3);
                    break;
                }
                break;
        }
    }

    public a2(c2 c2Var, Context context) {
        super(c2Var, context);
        this.f50336n = 1;
        this.f50337r = new RectF();
    }
}
