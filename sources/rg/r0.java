package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class r0 extends j {
    public final int f45495n = 2;
    public final Paint f45496r;
    public final Path f45497s;

    public r0(s0 s0Var, Context context) {
        super(s0Var, context);
        Paint paint = new Paint(1);
        this.f45496r = paint;
        this.f45497s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override
    public final int a(float f7, float f10) {
        switch (this.f45495n) {
            case 0:
                float dp = AndroidUtilities.dp(19.5f);
                float dp2 = AndroidUtilities.dp(1.0f) + dp;
                float f11 = dp2 * 2.0f;
                float measuredWidth = getMeasuredWidth() - f11;
                float A = com.google.android.gms.internal.vision.e2.A(getMeasuredHeight(), f11, 2.0f, dp2);
                if (f7 > dp2 - dp && f10 > A - dp && f7 < dp2 + dp && f10 < A + dp) {
                    return 1;
                }
                float f12 = dp2 + measuredWidth;
                if (f7 > f12 - dp && f10 > A - dp && f7 < f12 + dp && f10 < A + dp) {
                    return 2;
                }
                return 0;
            case 1:
                float dp3 = AndroidUtilities.dp(19.5f);
                float dp4 = AndroidUtilities.dp(1.0f) + dp3;
                float f13 = dp4 * 2.0f;
                float measuredWidth2 = getMeasuredWidth() - f13;
                float A2 = com.google.android.gms.internal.vision.e2.A(getMeasuredHeight(), f13, 2.0f, dp4);
                if (f7 > dp4 - dp3 && f10 > A2 - dp3 && f7 < dp4 + dp3 && f10 < A2 + dp3) {
                    return 1;
                }
                float f14 = dp4 + measuredWidth2;
                if (f7 > f14 - dp3 && f10 > A2 - dp3 && f7 < f14 + dp3 && f10 < A2 + dp3) {
                    return 2;
                }
                return 0;
            case 2:
                float dp5 = AndroidUtilities.dp(19.5f);
                float dp6 = AndroidUtilities.dp(1.0f) + dp5;
                float f15 = dp6 * 2.0f;
                float measuredWidth3 = getMeasuredWidth() - f15;
                float measuredHeight = getMeasuredHeight() - f15;
                float f16 = (measuredHeight / 2.0f) + dp6;
                if (f7 > dp6 - dp5 && f10 > f16 - dp5 && f7 < dp6 + dp5 && f10 < f16 + dp5) {
                    return 1;
                }
                float f17 = dp6 + measuredWidth3;
                if (f7 > f17 - dp5 && f10 > f16 - dp5 && f7 < f17 + dp5 && f10 < f16 + dp5) {
                    return 2;
                }
                if (f7 > dp6 && f7 < measuredWidth3 && f10 > dp6 && f10 < measuredHeight) {
                    return 3;
                }
                return 0;
            case 3:
                float dp7 = AndroidUtilities.dp(19.5f);
                float dp8 = AndroidUtilities.dp(1.0f) + dp7;
                float f18 = dp8 * 2.0f;
                float measuredWidth4 = getMeasuredWidth() - f18;
                float measuredHeight2 = getMeasuredHeight() - f18;
                float f19 = (measuredHeight2 / 2.0f) + dp8;
                if (f7 > dp8 - dp7 && f10 > f19 - dp7 && f7 < dp8 + dp7 && f10 < f19 + dp7) {
                    return 1;
                }
                float f20 = dp8 + measuredWidth4;
                if (f7 > f20 - dp7 && f10 > f19 - dp7 && f7 < f20 + dp7 && f10 < f19 + dp7) {
                    return 2;
                }
                if (f7 > dp8 && f7 < measuredWidth4 && f10 > dp8 && f10 < measuredHeight2) {
                    return 3;
                }
                return 0;
            case 4:
                float dp9 = AndroidUtilities.dp(19.5f);
                float dp10 = AndroidUtilities.dp(1.0f) + dp9;
                float f21 = dp10 * 2.0f;
                float measuredWidth5 = getMeasuredWidth() - f21;
                float A3 = com.google.android.gms.internal.vision.e2.A(getMeasuredHeight(), f21, 2.0f, dp10);
                if (f7 > dp10 - dp9 && f10 > A3 - dp9 && f7 < dp10 + dp9 && f10 < A3 + dp9) {
                    return 1;
                }
                float f22 = dp10 + measuredWidth5;
                if (f7 > f22 - dp9 && f10 > A3 - dp9 && f7 < f22 + dp9 && f10 < A3 + dp9) {
                    return 2;
                }
                return 0;
            default:
                float dp11 = AndroidUtilities.dp(19.5f);
                float dp12 = AndroidUtilities.dp(1.0f) + dp11;
                float f23 = dp12 * 2.0f;
                float measuredWidth6 = getMeasuredWidth() - f23;
                float A4 = com.google.android.gms.internal.vision.e2.A(getMeasuredHeight(), f23, 2.0f, dp12);
                if (f7 > dp12 - dp11 && f10 > A4 - dp11 && f7 < dp12 + dp11 && f10 < A4 + dp11) {
                    return 1;
                }
                float f24 = dp12 + measuredWidth6;
                if (f7 > f24 - dp11 && f10 > A4 - dp11 && f7 < f24 + dp11 && f10 < A4 + dp11) {
                    return 2;
                }
                return 0;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f45495n) {
            case 0:
                super.onDraw(canvas);
                int saveCount = canvas.getSaveCount();
                float showAlpha = getShowAlpha();
                if (showAlpha > 0.0f) {
                    if (showAlpha < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha * 255.0f), 31);
                    }
                    float dpf2 = AndroidUtilities.dpf2(5.66f);
                    float dp = AndroidUtilities.dp(2.0f) + dpf2 + AndroidUtilities.dp(15.0f);
                    float f7 = dp * 2.0f;
                    float measuredWidth = getMeasuredWidth() - f7;
                    float measuredHeight = getMeasuredHeight() - f7;
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f10 = dp + measuredWidth;
                    float f11 = dp + measuredHeight;
                    rectF.set(dp, dp, f10, f11);
                    float dp2 = AndroidUtilities.dp(12.0f);
                    float min = Math.min(dp2, measuredWidth / 2.0f);
                    float f12 = measuredHeight / 2.0f;
                    float min2 = Math.min(dp2, f12);
                    Path path = this.f45497s;
                    path.rewind();
                    float f13 = min * 2.0f;
                    float f14 = dp + f13;
                    float f15 = 2.0f * min2;
                    float f16 = dp + f15;
                    rectF.set(dp, dp, f14, f16);
                    path.arcTo(rectF, 180.0f, 90.0f);
                    float f17 = f10 - f13;
                    rectF.set(f17, dp, f10, f16);
                    path.arcTo(rectF, 270.0f, 90.0f);
                    Paint paint = this.f45247a;
                    canvas.drawPath(path, paint);
                    path.rewind();
                    float f18 = f11 - f15;
                    rectF.set(dp, f18, f14, f11);
                    path.arcTo(rectF, 180.0f, -90.0f);
                    rectF.set(f17, f18, f10, f11);
                    path.arcTo(rectF, 90.0f, -90.0f);
                    canvas.drawPath(path, paint);
                    float f19 = dp + f12;
                    Paint paint2 = this.f45249c;
                    canvas.drawCircle(dp, f19, dpf2, paint2);
                    Paint paint3 = this.f45248b;
                    canvas.drawCircle(dp, f19, (dpf2 - AndroidUtilities.dp(1.0f)) + 1.0f, paint3);
                    canvas.drawCircle(f10, f19, dpf2, paint2);
                    canvas.drawCircle(f10, f19, (dpf2 - AndroidUtilities.dp(1.0f)) + 1.0f, paint3);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f20 = dp + min2;
                    float f21 = f11 - min2;
                    canvas.drawLine(dp, f20, dp, f21, paint);
                    canvas.drawLine(f10, f20, f10, f21, paint);
                    Paint paint4 = this.f45496r;
                    canvas.drawCircle(f10, f19, (AndroidUtilities.dp(1.0f) + dpf2) - 1.0f, paint4);
                    canvas.drawCircle(dp, f19, (dpf2 + AndroidUtilities.dp(1.0f)) - 1.0f, paint4);
                    canvas.restoreToCount(saveCount);
                    return;
                }
                return;
            case 1:
                super.onDraw(canvas);
                int saveCount2 = canvas.getSaveCount();
                float showAlpha2 = getShowAlpha();
                if (showAlpha2 > 0.0f) {
                    if (showAlpha2 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha2 * 255.0f), 31);
                    }
                    float dpf22 = AndroidUtilities.dpf2(5.66f);
                    float dp3 = AndroidUtilities.dp(2.0f) + dpf22 + AndroidUtilities.dp(15.0f);
                    float f22 = dp3 * 2.0f;
                    float measuredWidth2 = getMeasuredWidth() - f22;
                    float measuredHeight2 = getMeasuredHeight() - f22;
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f23 = dp3 + measuredWidth2;
                    float f24 = dp3 + measuredHeight2;
                    rectF2.set(dp3, dp3, f23, f24);
                    float dp4 = AndroidUtilities.dp(12.0f);
                    float min3 = Math.min(dp4, measuredWidth2 / 2.0f);
                    float f25 = measuredHeight2 / 2.0f;
                    float min4 = Math.min(dp4, f25);
                    Path path2 = this.f45497s;
                    path2.rewind();
                    float f26 = min3 * 2.0f;
                    float f27 = dp3 + f26;
                    float f28 = 2.0f * min4;
                    float f29 = dp3 + f28;
                    rectF2.set(dp3, dp3, f27, f29);
                    path2.arcTo(rectF2, 180.0f, 90.0f);
                    float f30 = f23 - f26;
                    rectF2.set(f30, dp3, f23, f29);
                    path2.arcTo(rectF2, 270.0f, 90.0f);
                    Paint paint5 = this.f45247a;
                    canvas.drawPath(path2, paint5);
                    path2.rewind();
                    float f31 = f24 - f28;
                    rectF2.set(dp3, f31, f27, f24);
                    path2.arcTo(rectF2, 180.0f, -90.0f);
                    rectF2.set(f30, f31, f23, f24);
                    path2.arcTo(rectF2, 90.0f, -90.0f);
                    canvas.drawPath(path2, paint5);
                    float f32 = dp3 + f25;
                    Paint paint6 = this.f45249c;
                    canvas.drawCircle(dp3, f32, dpf22, paint6);
                    Paint paint7 = this.f45248b;
                    canvas.drawCircle(dp3, f32, (dpf22 - AndroidUtilities.dp(1.0f)) + 1.0f, paint7);
                    canvas.drawCircle(f23, f32, dpf22, paint6);
                    canvas.drawCircle(f23, f32, (dpf22 - AndroidUtilities.dp(1.0f)) + 1.0f, paint7);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f33 = dp3 + min4;
                    float f34 = f24 - min4;
                    canvas.drawLine(dp3, f33, dp3, f34, paint5);
                    canvas.drawLine(f23, f33, f23, f34, paint5);
                    Paint paint8 = this.f45496r;
                    canvas.drawCircle(f23, f32, (AndroidUtilities.dp(1.0f) + dpf22) - 1.0f, paint8);
                    canvas.drawCircle(dp3, f32, (dpf22 + AndroidUtilities.dp(1.0f)) - 1.0f, paint8);
                    canvas.restoreToCount(saveCount2);
                    return;
                }
                return;
            case 2:
                super.onDraw(canvas);
                int saveCount3 = canvas.getSaveCount();
                float showAlpha3 = getShowAlpha();
                if (showAlpha3 > 0.0f) {
                    if (showAlpha3 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha3 * 255.0f), 31);
                    }
                    float dpf23 = AndroidUtilities.dpf2(5.66f);
                    float dp5 = AndroidUtilities.dp(2.0f) + dpf23 + AndroidUtilities.dp(15.0f);
                    float f35 = dp5 * 2.0f;
                    float measuredWidth3 = getMeasuredWidth() - f35;
                    float measuredHeight3 = getMeasuredHeight() - f35;
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f36 = dp5 + measuredWidth3;
                    float f37 = dp5 + measuredHeight3;
                    rectF3.set(dp5, dp5, f36, f37);
                    float dp6 = AndroidUtilities.dp(12.0f);
                    float min5 = Math.min(dp6, measuredWidth3 / 2.0f);
                    float f38 = measuredHeight3 / 2.0f;
                    float min6 = Math.min(dp6, f38);
                    Path path3 = this.f45497s;
                    path3.rewind();
                    float f39 = min5 * 2.0f;
                    float f40 = dp5 + f39;
                    float f41 = 2.0f * min6;
                    float f42 = dp5 + f41;
                    rectF3.set(dp5, dp5, f40, f42);
                    path3.arcTo(rectF3, 180.0f, 90.0f);
                    float f43 = f36 - f39;
                    rectF3.set(f43, dp5, f36, f42);
                    path3.arcTo(rectF3, 270.0f, 90.0f);
                    Paint paint9 = this.f45247a;
                    canvas.drawPath(path3, paint9);
                    path3.rewind();
                    float f44 = f37 - f41;
                    rectF3.set(dp5, f44, f40, f37);
                    path3.arcTo(rectF3, 180.0f, -90.0f);
                    rectF3.set(f43, f44, f36, f37);
                    path3.arcTo(rectF3, 90.0f, -90.0f);
                    canvas.drawPath(path3, paint9);
                    float f45 = dp5 + f38;
                    Paint paint10 = this.f45249c;
                    canvas.drawCircle(dp5, f45, dpf23, paint10);
                    Paint paint11 = this.f45248b;
                    canvas.drawCircle(dp5, f45, (dpf23 - AndroidUtilities.dp(1.0f)) + 1.0f, paint11);
                    canvas.drawCircle(f36, f45, dpf23, paint10);
                    canvas.drawCircle(f36, f45, (dpf23 - AndroidUtilities.dp(1.0f)) + 1.0f, paint11);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f46 = dp5 + min6;
                    float f47 = f37 - min6;
                    canvas.drawLine(dp5, f46, dp5, f47, paint9);
                    canvas.drawLine(f36, f46, f36, f47, paint9);
                    Paint paint12 = this.f45496r;
                    canvas.drawCircle(f36, f45, (AndroidUtilities.dp(1.0f) + dpf23) - 1.0f, paint12);
                    canvas.drawCircle(dp5, f45, (dpf23 + AndroidUtilities.dp(1.0f)) - 1.0f, paint12);
                    canvas.restoreToCount(saveCount3);
                    return;
                }
                return;
            case 3:
                super.onDraw(canvas);
                int saveCount4 = canvas.getSaveCount();
                float showAlpha4 = getShowAlpha();
                if (showAlpha4 > 0.0f) {
                    if (showAlpha4 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha4 * 255.0f), 31);
                    }
                    float dpf24 = AndroidUtilities.dpf2(5.66f);
                    float dp7 = AndroidUtilities.dp(2.0f) + dpf24 + AndroidUtilities.dp(15.0f);
                    float f48 = dp7 * 2.0f;
                    float measuredWidth4 = getMeasuredWidth() - f48;
                    float measuredHeight4 = getMeasuredHeight() - f48;
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float f49 = dp7 + measuredWidth4;
                    float f50 = dp7 + measuredHeight4;
                    rectF4.set(dp7, dp7, f49, f50);
                    float dp8 = AndroidUtilities.dp(12.0f);
                    float min7 = Math.min(dp8, measuredWidth4 / 2.0f);
                    float f51 = measuredHeight4 / 2.0f;
                    float min8 = Math.min(dp8, f51);
                    Path path4 = this.f45497s;
                    path4.rewind();
                    float f52 = min7 * 2.0f;
                    float f53 = dp7 + f52;
                    float f54 = 2.0f * min8;
                    float f55 = dp7 + f54;
                    rectF4.set(dp7, dp7, f53, f55);
                    path4.arcTo(rectF4, 180.0f, 90.0f);
                    float f56 = f49 - f52;
                    rectF4.set(f56, dp7, f49, f55);
                    path4.arcTo(rectF4, 270.0f, 90.0f);
                    Paint paint13 = this.f45247a;
                    canvas.drawPath(path4, paint13);
                    path4.rewind();
                    float f57 = f50 - f54;
                    rectF4.set(dp7, f57, f53, f50);
                    path4.arcTo(rectF4, 180.0f, -90.0f);
                    rectF4.set(f56, f57, f49, f50);
                    path4.arcTo(rectF4, 90.0f, -90.0f);
                    canvas.drawPath(path4, paint13);
                    float f58 = dp7 + f51;
                    Paint paint14 = this.f45249c;
                    canvas.drawCircle(dp7, f58, dpf24, paint14);
                    Paint paint15 = this.f45248b;
                    canvas.drawCircle(dp7, f58, (dpf24 - AndroidUtilities.dp(1.0f)) + 1.0f, paint15);
                    canvas.drawCircle(f49, f58, dpf24, paint14);
                    canvas.drawCircle(f49, f58, (dpf24 - AndroidUtilities.dp(1.0f)) + 1.0f, paint15);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f59 = dp7 + min8;
                    float f60 = f50 - min8;
                    canvas.drawLine(dp7, f59, dp7, f60, paint13);
                    canvas.drawLine(f49, f59, f49, f60, paint13);
                    Paint paint16 = this.f45496r;
                    canvas.drawCircle(f49, f58, (AndroidUtilities.dp(1.0f) + dpf24) - 1.0f, paint16);
                    canvas.drawCircle(dp7, f58, (dpf24 + AndroidUtilities.dp(1.0f)) - 1.0f, paint16);
                    canvas.restoreToCount(saveCount4);
                    return;
                }
                return;
            case 4:
                super.onDraw(canvas);
                int saveCount5 = canvas.getSaveCount();
                float showAlpha5 = getShowAlpha();
                if (showAlpha5 > 0.0f) {
                    if (showAlpha5 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha5 * 255.0f), 31);
                    }
                    float dpf25 = AndroidUtilities.dpf2(5.66f);
                    float dp9 = AndroidUtilities.dp(2.0f) + dpf25 + AndroidUtilities.dp(15.0f);
                    float f61 = dp9 * 2.0f;
                    float measuredWidth5 = getMeasuredWidth() - f61;
                    float measuredHeight5 = getMeasuredHeight() - f61;
                    RectF rectF5 = AndroidUtilities.rectTmp;
                    float f62 = dp9 + measuredWidth5;
                    float f63 = dp9 + measuredHeight5;
                    rectF5.set(dp9, dp9, f62, f63);
                    float dp10 = AndroidUtilities.dp(12.0f);
                    float min9 = Math.min(dp10, measuredWidth5 / 2.0f);
                    float f64 = measuredHeight5 / 2.0f;
                    float min10 = Math.min(dp10, f64);
                    Path path5 = this.f45497s;
                    path5.rewind();
                    float f65 = min9 * 2.0f;
                    float f66 = dp9 + f65;
                    float f67 = 2.0f * min10;
                    float f68 = dp9 + f67;
                    rectF5.set(dp9, dp9, f66, f68);
                    path5.arcTo(rectF5, 180.0f, 90.0f);
                    float f69 = f62 - f65;
                    rectF5.set(f69, dp9, f62, f68);
                    path5.arcTo(rectF5, 270.0f, 90.0f);
                    Paint paint17 = this.f45247a;
                    canvas.drawPath(path5, paint17);
                    path5.rewind();
                    float f70 = f63 - f67;
                    rectF5.set(dp9, f70, f66, f63);
                    path5.arcTo(rectF5, 180.0f, -90.0f);
                    rectF5.set(f69, f70, f62, f63);
                    path5.arcTo(rectF5, 90.0f, -90.0f);
                    canvas.drawPath(path5, paint17);
                    float f71 = dp9 + f64;
                    Paint paint18 = this.f45249c;
                    canvas.drawCircle(dp9, f71, dpf25, paint18);
                    Paint paint19 = this.f45248b;
                    canvas.drawCircle(dp9, f71, (dpf25 - AndroidUtilities.dp(1.0f)) + 1.0f, paint19);
                    canvas.drawCircle(f62, f71, dpf25, paint18);
                    canvas.drawCircle(f62, f71, (dpf25 - AndroidUtilities.dp(1.0f)) + 1.0f, paint19);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f72 = dp9 + min10;
                    float f73 = f63 - min10;
                    canvas.drawLine(dp9, f72, dp9, f73, paint17);
                    canvas.drawLine(f62, f72, f62, f73, paint17);
                    Paint paint20 = this.f45496r;
                    canvas.drawCircle(f62, f71, (AndroidUtilities.dp(1.0f) + dpf25) - 1.0f, paint20);
                    canvas.drawCircle(dp9, f71, (dpf25 + AndroidUtilities.dp(1.0f)) - 1.0f, paint20);
                    canvas.restoreToCount(saveCount5);
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                int saveCount6 = canvas.getSaveCount();
                float showAlpha6 = getShowAlpha();
                if (showAlpha6 > 0.0f) {
                    if (showAlpha6 < 1.0f) {
                        int i10 = (int) (showAlpha6 * 255.0f);
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), i10, 31);
                    } else {
                        canvas2 = canvas;
                    }
                    float dpf26 = AndroidUtilities.dpf2(5.66f);
                    float dp11 = AndroidUtilities.dp(2.0f) + dpf26 + AndroidUtilities.dp(15.0f);
                    float f74 = dp11 * 2.0f;
                    float measuredWidth6 = getMeasuredWidth() - f74;
                    float measuredHeight6 = getMeasuredHeight() - f74;
                    RectF rectF6 = AndroidUtilities.rectTmp;
                    float f75 = dp11 + measuredWidth6;
                    float f76 = dp11 + measuredHeight6;
                    rectF6.set(dp11, dp11, f75, f76);
                    float dp12 = AndroidUtilities.dp(12.0f);
                    float min11 = Math.min(dp12, measuredWidth6 / 2.0f);
                    float f77 = measuredHeight6 / 2.0f;
                    float min12 = Math.min(dp12, f77);
                    Path path6 = this.f45497s;
                    path6.rewind();
                    float f78 = min11 * 2.0f;
                    float f79 = dp11 + f78;
                    float f80 = 2.0f * min12;
                    float f81 = dp11 + f80;
                    rectF6.set(dp11, dp11, f79, f81);
                    path6.arcTo(rectF6, 180.0f, 90.0f);
                    float f82 = f75 - f78;
                    rectF6.set(f82, dp11, f75, f81);
                    path6.arcTo(rectF6, 270.0f, 90.0f);
                    Paint paint21 = this.f45247a;
                    canvas2.drawPath(path6, paint21);
                    path6.rewind();
                    float f83 = f76 - f80;
                    rectF6.set(dp11, f83, f79, f76);
                    path6.arcTo(rectF6, 180.0f, -90.0f);
                    rectF6.set(f82, f83, f75, f76);
                    path6.arcTo(rectF6, 90.0f, -90.0f);
                    canvas2.drawPath(path6, paint21);
                    float f84 = dp11 + f77;
                    Paint paint22 = this.f45249c;
                    canvas2.drawCircle(dp11, f84, dpf26, paint22);
                    Paint paint23 = this.f45248b;
                    canvas2.drawCircle(dp11, f84, (dpf26 - AndroidUtilities.dp(1.0f)) + 1.0f, paint23);
                    canvas2.drawCircle(f75, f84, dpf26, paint22);
                    canvas2.drawCircle(f75, f84, (dpf26 - AndroidUtilities.dp(1.0f)) + 1.0f, paint23);
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f85 = dp11 + min12;
                    float f86 = f76 - min12;
                    canvas.drawLine(dp11, f85, dp11, f86, paint21);
                    canvas.drawLine(f75, f85, f75, f86, paint21);
                    Paint paint24 = this.f45496r;
                    canvas.drawCircle(f75, f84, (AndroidUtilities.dp(1.0f) + dpf26) - 1.0f, paint24);
                    canvas.drawCircle(dp11, f84, (dpf26 + AndroidUtilities.dp(1.0f)) - 1.0f, paint24);
                    canvas.restoreToCount(saveCount6);
                    return;
                }
                return;
        }
    }

    public r0(y2 y2Var, Context context) {
        super(y2Var, context);
        Paint paint = new Paint(1);
        this.f45496r = paint;
        this.f45497s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public r0(v0 v0Var, Context context) {
        super(v0Var, context);
        Paint paint = new Paint(1);
        this.f45496r = paint;
        this.f45497s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public r0(x2 x2Var, Context context) {
        super(x2Var, context);
        Paint paint = new Paint(1);
        this.f45496r = paint;
        this.f45497s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public r0(z1 z1Var, Context context) {
        super(z1Var, context);
        Paint paint = new Paint(1);
        this.f45496r = paint;
        this.f45497s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public r0(g1 g1Var, Context context) {
        super(g1Var, context);
        Paint paint = new Paint(1);
        this.f45496r = paint;
        this.f45497s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}
