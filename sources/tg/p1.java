package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
public final class p1 extends i {
    public final int f55913n;
    public RectF f55914r;

    public p1(j jVar, Context context, int i7) {
        super(jVar, context);
        this.f55913n = i7;
    }

    @Override
    public final int a(float f10, float f11) {
        float measuredWidth;
        float measuredWidth2;
        float measuredWidth3;
        switch (this.f55913n) {
            case 0:
                float L = org.telegram.messenger.g0.L(19.5f);
                float L2 = org.telegram.messenger.g0.L(1.0f) + L;
                float f12 = L2 * 2.0f;
                float A = com.google.android.recaptcha.internal.a.A(getMeasuredHeight(), f12, 2.0f, L2);
                if (f10 > L2 - L && f11 > A - L && f10 < L2 + L && f11 < A + L) {
                    return 1;
                }
                if (f10 > ((getMeasuredWidth() - f12) + L2) - L && f11 > A - L && f10 < (getMeasuredWidth() - f12) + L2 + L && f11 < A + L) {
                    return 2;
                }
                if (Math.pow(f11 - measuredWidth, 2.0d) + Math.pow(f10 - measuredWidth, 2.0d) < Math.pow(getMeasuredWidth() / 2.0f, 2.0d)) {
                    return 3;
                }
                return 0;
            case 1:
                float L3 = org.telegram.messenger.g0.L(19.5f);
                float L4 = org.telegram.messenger.g0.L(1.0f) + L3;
                float f13 = L4 * 2.0f;
                float A2 = com.google.android.recaptcha.internal.a.A(getMeasuredHeight(), f13, 2.0f, L4);
                if (f10 > L4 - L3 && f11 > A2 - L3 && f10 < L4 + L3 && f11 < A2 + L3) {
                    return 1;
                }
                if (f10 > ((getMeasuredWidth() - f13) + L4) - L3 && f11 > A2 - L3 && f10 < (getMeasuredWidth() - f13) + L4 + L3 && f11 < A2 + L3) {
                    return 2;
                }
                if (Math.pow(f11 - measuredWidth2, 2.0d) + Math.pow(f10 - measuredWidth2, 2.0d) < Math.pow(getMeasuredWidth() / 2.0f, 2.0d)) {
                    return 3;
                }
                return 0;
            default:
                float L5 = org.telegram.messenger.g0.L(19.5f);
                float L6 = org.telegram.messenger.g0.L(1.0f) + L5;
                float f14 = L6 * 2.0f;
                float A3 = com.google.android.recaptcha.internal.a.A(getMeasuredHeight(), f14, 2.0f, L6);
                if (f10 > L6 - L5 && f11 > A3 - L5 && f10 < L6 + L5 && f11 < A3 + L5) {
                    return 1;
                }
                if (f10 > ((getMeasuredWidth() - f14) + L6) - L5 && f11 > A3 - L5 && f10 < (getMeasuredWidth() - f14) + L6 + L5 && f11 < A3 + L5) {
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
        switch (this.f55913n) {
            case 0:
                RectF rectF = this.f55914r;
                super.onDraw(canvas);
                int saveCount = canvas.getSaveCount();
                float showAlpha = getShowAlpha();
                if (showAlpha > 0.0f) {
                    if (showAlpha < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha * 255.0f), 31);
                    }
                    float N = org.telegram.messenger.g0.N(5.66f);
                    float L = org.telegram.messenger.g0.L(1.0f) + N + org.telegram.messenger.g0.L(15.0f);
                    float measuredWidth = (getMeasuredWidth() / 2) - L;
                    float f10 = (2.0f * measuredWidth) + L;
                    rectF.set(L, L, f10, f10);
                    Paint paint = this.f55733a;
                    canvas.drawArc(rectF, 0.0f, 180.0f, false, paint);
                    canvas.drawArc(rectF, 180.0f, 180.0f, false, paint);
                    float f11 = measuredWidth + L;
                    Paint paint2 = this.f55735c;
                    canvas.drawCircle(L, f11, N, paint2);
                    Paint paint3 = this.f55734b;
                    canvas.drawCircle(L, f11, N - org.telegram.messenger.g0.L(1.0f), paint3);
                    canvas.drawCircle(f10, f11, N, paint2);
                    canvas.drawCircle(f10, f11, N - org.telegram.messenger.g0.L(1.0f), paint3);
                    canvas.restoreToCount(saveCount);
                    return;
                }
                return;
            case 1:
                RectF rectF2 = this.f55914r;
                super.onDraw(canvas);
                int saveCount2 = canvas.getSaveCount();
                float showAlpha2 = getShowAlpha();
                if (showAlpha2 > 0.0f) {
                    if (showAlpha2 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha2 * 255.0f), 31);
                    }
                    float N2 = org.telegram.messenger.g0.N(5.66f);
                    float L2 = org.telegram.messenger.g0.L(1.0f) + N2 + org.telegram.messenger.g0.L(15.0f);
                    float measuredWidth2 = (getMeasuredWidth() / 2.0f) - L2;
                    float f12 = (2.0f * measuredWidth2) + L2;
                    rectF2.set(L2, L2, f12, f12);
                    Paint paint4 = this.f55733a;
                    canvas.drawArc(rectF2, 0.0f, 180.0f, false, paint4);
                    canvas.drawArc(rectF2, 180.0f, 180.0f, false, paint4);
                    float f13 = measuredWidth2 + L2;
                    Paint paint5 = this.f55735c;
                    canvas.drawCircle(L2, f13, N2, paint5);
                    Paint paint6 = this.f55734b;
                    canvas.drawCircle(L2, f13, N2 - org.telegram.messenger.g0.L(1.0f), paint6);
                    canvas.drawCircle(f12, f13, N2, paint5);
                    canvas.drawCircle(f12, f13, N2 - org.telegram.messenger.g0.L(1.0f), paint6);
                    canvas.restoreToCount(saveCount2);
                    return;
                }
                return;
            default:
                RectF rectF3 = this.f55914r;
                super.onDraw(canvas);
                int saveCount3 = canvas.getSaveCount();
                float showAlpha3 = getShowAlpha();
                if (showAlpha3 > 0.0f) {
                    if (showAlpha3 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha3 * 255.0f), 31);
                    }
                    float N3 = org.telegram.messenger.g0.N(5.66f);
                    float L3 = org.telegram.messenger.g0.L(1.0f) + N3 + org.telegram.messenger.g0.L(15.0f);
                    float measuredWidth3 = (getMeasuredWidth() / 2) - L3;
                    float f14 = (2.0f * measuredWidth3) + L3;
                    rectF3.set(L3, L3, f14, f14);
                    Paint paint7 = this.f55733a;
                    canvas.drawArc(rectF3, 0.0f, 180.0f, false, paint7);
                    canvas.drawArc(rectF3, 180.0f, 180.0f, false, paint7);
                    float f15 = measuredWidth3 + L3;
                    Paint paint8 = this.f55735c;
                    canvas.drawCircle(L3, f15, N3, paint8);
                    Paint paint9 = this.f55734b;
                    canvas.drawCircle(L3, f15, N3 - org.telegram.messenger.g0.L(1.0f), paint9);
                    canvas.drawCircle(f14, f15, N3, paint8);
                    canvas.drawCircle(f14, f15, N3 - org.telegram.messenger.g0.L(1.0f), paint9);
                    canvas.restoreToCount(saveCount3);
                    return;
                }
                return;
        }
    }

    public p1(r1 r1Var, Context context) {
        super(r1Var, context);
        this.f55913n = 1;
        this.f55914r = new RectF();
    }
}
