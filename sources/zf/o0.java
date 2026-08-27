package zf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

public final class o0 extends i {

    public final int f50633n = 2;

    public final Paint f50634r;

    public final Path f50635s;

    public o0(p0 p0Var, Context context) {
        super(p0Var, context);
        Paint paint = new Paint(1);
        this.f50634r = paint;
        this.f50635s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override
    public final int a(float f10, float f11) {
        switch (this.f50633n) {
            case 0:
                float fDp = AndroidUtilities.dp(1.0f);
                float fDp2 = AndroidUtilities.dp(19.5f);
                float f12 = fDp + fDp2;
                float f13 = f12 * 2.0f;
                float measuredWidth = getMeasuredWidth() - f13;
                float fA = com.google.android.recaptcha.internal.a.A(getMeasuredHeight(), f13, 2.0f, f12);
                if (f10 > f12 - fDp2 && f11 > fA - fDp2 && f10 < f12 + fDp2 && f11 < fA + fDp2) {
                    return 1;
                }
                float f14 = f12 + measuredWidth;
                return (f10 <= f14 - fDp2 || f11 <= fA - fDp2 || f10 >= f14 + fDp2 || f11 >= fA + fDp2) ? 0 : 2;
            case 1:
                float fDp3 = AndroidUtilities.dp(1.0f);
                float fDp4 = AndroidUtilities.dp(19.5f);
                float f15 = fDp3 + fDp4;
                float f16 = f15 * 2.0f;
                float measuredWidth2 = getMeasuredWidth() - f16;
                float fA2 = com.google.android.recaptcha.internal.a.A(getMeasuredHeight(), f16, 2.0f, f15);
                if (f10 > f15 - fDp4 && f11 > fA2 - fDp4 && f10 < f15 + fDp4 && f11 < fA2 + fDp4) {
                    return 1;
                }
                float f17 = f15 + measuredWidth2;
                return (f10 <= f17 - fDp4 || f11 <= fA2 - fDp4 || f10 >= f17 + fDp4 || f11 >= fA2 + fDp4) ? 0 : 2;
            case 2:
                float fDp5 = AndroidUtilities.dp(1.0f);
                float fDp6 = AndroidUtilities.dp(19.5f);
                float f18 = fDp5 + fDp6;
                float f19 = f18 * 2.0f;
                float measuredWidth3 = getMeasuredWidth() - f19;
                float measuredHeight = getMeasuredHeight() - f19;
                float f20 = (measuredHeight / 2.0f) + f18;
                if (f10 > f18 - fDp6 && f11 > f20 - fDp6 && f10 < f18 + fDp6 && f11 < f20 + fDp6) {
                    return 1;
                }
                float f21 = f18 + measuredWidth3;
                if (f10 <= f21 - fDp6 || f11 <= f20 - fDp6 || f10 >= f21 + fDp6 || f11 >= f20 + fDp6) {
                    return (f10 <= f18 || f10 >= measuredWidth3 || f11 <= f18 || f11 >= measuredHeight) ? 0 : 3;
                }
                return 2;
            case 3:
                float fDp7 = AndroidUtilities.dp(1.0f);
                float fDp8 = AndroidUtilities.dp(19.5f);
                float f22 = fDp7 + fDp8;
                float f23 = f22 * 2.0f;
                float measuredWidth4 = getMeasuredWidth() - f23;
                float measuredHeight2 = getMeasuredHeight() - f23;
                float f24 = (measuredHeight2 / 2.0f) + f22;
                if (f10 > f22 - fDp8 && f11 > f24 - fDp8 && f10 < f22 + fDp8 && f11 < f24 + fDp8) {
                    return 1;
                }
                float f25 = f22 + measuredWidth4;
                if (f10 <= f25 - fDp8 || f11 <= f24 - fDp8 || f10 >= f25 + fDp8 || f11 >= f24 + fDp8) {
                    return (f10 <= f22 || f10 >= measuredWidth4 || f11 <= f22 || f11 >= measuredHeight2) ? 0 : 3;
                }
                return 2;
            case 4:
                float fDp9 = AndroidUtilities.dp(1.0f);
                float fDp10 = AndroidUtilities.dp(19.5f);
                float f26 = fDp9 + fDp10;
                float f27 = f26 * 2.0f;
                float measuredWidth5 = getMeasuredWidth() - f27;
                float fA3 = com.google.android.recaptcha.internal.a.A(getMeasuredHeight(), f27, 2.0f, f26);
                if (f10 > f26 - fDp10 && f11 > fA3 - fDp10 && f10 < f26 + fDp10 && f11 < fA3 + fDp10) {
                    return 1;
                }
                float f28 = f26 + measuredWidth5;
                return (f10 <= f28 - fDp10 || f11 <= fA3 - fDp10 || f10 >= f28 + fDp10 || f11 >= fA3 + fDp10) ? 0 : 2;
            default:
                float fDp11 = AndroidUtilities.dp(1.0f);
                float fDp12 = AndroidUtilities.dp(19.5f);
                float f29 = fDp11 + fDp12;
                float f30 = f29 * 2.0f;
                float measuredWidth6 = getMeasuredWidth() - f30;
                float fA4 = com.google.android.recaptcha.internal.a.A(getMeasuredHeight(), f30, 2.0f, f29);
                if (f10 > f29 - fDp12 && f11 > fA4 - fDp12 && f10 < f29 + fDp12 && f11 < fA4 + fDp12) {
                    return 1;
                }
                float f31 = f29 + measuredWidth6;
                return (f10 <= f31 - fDp12 || f11 <= fA4 - fDp12 || f10 >= f31 + fDp12 || f11 >= fA4 + fDp12) ? 0 : 2;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f50633n) {
            case 0:
                super.onDraw(canvas);
                int saveCount = canvas.getSaveCount();
                float showAlpha = getShowAlpha();
                if (showAlpha > 0.0f) {
                    if (showAlpha < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha * 255.0f), 31);
                    }
                    float fDp = AndroidUtilities.dp(2.0f);
                    float fDpf2 = AndroidUtilities.dpf2(5.66f);
                    float fDp2 = fDp + fDpf2 + AndroidUtilities.dp(15.0f);
                    float f10 = fDp2 * 2.0f;
                    float measuredWidth = getMeasuredWidth() - f10;
                    float measuredHeight = getMeasuredHeight() - f10;
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f11 = fDp2 + measuredWidth;
                    float f12 = fDp2 + measuredHeight;
                    rectF.set(fDp2, fDp2, f11, f12);
                    float fDp3 = AndroidUtilities.dp(12.0f);
                    float fMin = Math.min(fDp3, measuredWidth / 2.0f);
                    float f13 = measuredHeight / 2.0f;
                    float fMin2 = Math.min(fDp3, f13);
                    Path path = this.f50635s;
                    path.rewind();
                    float f14 = fMin * 2.0f;
                    float f15 = fDp2 + f14;
                    float f16 = 2.0f * fMin2;
                    float f17 = fDp2 + f16;
                    rectF.set(fDp2, fDp2, f15, f17);
                    path.arcTo(rectF, 180.0f, 90.0f);
                    float f18 = f11 - f14;
                    rectF.set(f18, fDp2, f11, f17);
                    path.arcTo(rectF, 270.0f, 90.0f);
                    Paint paint = this.f50428a;
                    canvas.drawPath(path, paint);
                    path.rewind();
                    float f19 = f12 - f16;
                    rectF.set(fDp2, f19, f15, f12);
                    path.arcTo(rectF, 180.0f, -90.0f);
                    rectF.set(f18, f19, f11, f12);
                    path.arcTo(rectF, 90.0f, -90.0f);
                    canvas.drawPath(path, paint);
                    float f20 = fDp2 + f13;
                    Paint paint2 = this.f50430c;
                    canvas.drawCircle(fDp2, f20, fDpf2, paint2);
                    float fDp4 = (fDpf2 - AndroidUtilities.dp(1.0f)) + 1.0f;
                    Paint paint3 = this.f50429b;
                    canvas.drawCircle(fDp2, f20, fDp4, paint3);
                    canvas.drawCircle(f11, f20, fDpf2, paint2);
                    canvas.drawCircle(f11, f20, (fDpf2 - AndroidUtilities.dp(1.0f)) + 1.0f, paint3);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f21 = fDp2 + fMin2;
                    float f22 = f12 - fMin2;
                    canvas.drawLine(fDp2, f21, fDp2, f22, paint);
                    canvas.drawLine(f11, f21, f11, f22, paint);
                    float fDp5 = (AndroidUtilities.dp(1.0f) + fDpf2) - 1.0f;
                    Paint paint4 = this.f50634r;
                    canvas.drawCircle(f11, f20, fDp5, paint4);
                    canvas.drawCircle(fDp2, f20, (fDpf2 + AndroidUtilities.dp(1.0f)) - 1.0f, paint4);
                    canvas.restoreToCount(saveCount);
                    break;
                }
                break;
            case 1:
                super.onDraw(canvas);
                int saveCount2 = canvas.getSaveCount();
                float showAlpha2 = getShowAlpha();
                if (showAlpha2 > 0.0f) {
                    if (showAlpha2 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha2 * 255.0f), 31);
                    }
                    float fDp6 = AndroidUtilities.dp(2.0f);
                    float fDpf3 = AndroidUtilities.dpf2(5.66f);
                    float fDp7 = fDp6 + fDpf3 + AndroidUtilities.dp(15.0f);
                    float f23 = fDp7 * 2.0f;
                    float measuredWidth2 = getMeasuredWidth() - f23;
                    float measuredHeight2 = getMeasuredHeight() - f23;
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f24 = fDp7 + measuredWidth2;
                    float f25 = fDp7 + measuredHeight2;
                    rectF2.set(fDp7, fDp7, f24, f25);
                    float fDp8 = AndroidUtilities.dp(12.0f);
                    float fMin3 = Math.min(fDp8, measuredWidth2 / 2.0f);
                    float f26 = measuredHeight2 / 2.0f;
                    float fMin4 = Math.min(fDp8, f26);
                    Path path2 = this.f50635s;
                    path2.rewind();
                    float f27 = fMin3 * 2.0f;
                    float f28 = fDp7 + f27;
                    float f29 = 2.0f * fMin4;
                    float f30 = fDp7 + f29;
                    rectF2.set(fDp7, fDp7, f28, f30);
                    path2.arcTo(rectF2, 180.0f, 90.0f);
                    float f31 = f24 - f27;
                    rectF2.set(f31, fDp7, f24, f30);
                    path2.arcTo(rectF2, 270.0f, 90.0f);
                    Paint paint5 = this.f50428a;
                    canvas.drawPath(path2, paint5);
                    path2.rewind();
                    float f32 = f25 - f29;
                    rectF2.set(fDp7, f32, f28, f25);
                    path2.arcTo(rectF2, 180.0f, -90.0f);
                    rectF2.set(f31, f32, f24, f25);
                    path2.arcTo(rectF2, 90.0f, -90.0f);
                    canvas.drawPath(path2, paint5);
                    float f33 = fDp7 + f26;
                    Paint paint6 = this.f50430c;
                    canvas.drawCircle(fDp7, f33, fDpf3, paint6);
                    float fDp9 = (fDpf3 - AndroidUtilities.dp(1.0f)) + 1.0f;
                    Paint paint7 = this.f50429b;
                    canvas.drawCircle(fDp7, f33, fDp9, paint7);
                    canvas.drawCircle(f24, f33, fDpf3, paint6);
                    canvas.drawCircle(f24, f33, (fDpf3 - AndroidUtilities.dp(1.0f)) + 1.0f, paint7);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f34 = fDp7 + fMin4;
                    float f35 = f25 - fMin4;
                    canvas.drawLine(fDp7, f34, fDp7, f35, paint5);
                    canvas.drawLine(f24, f34, f24, f35, paint5);
                    float fDp10 = (AndroidUtilities.dp(1.0f) + fDpf3) - 1.0f;
                    Paint paint8 = this.f50634r;
                    canvas.drawCircle(f24, f33, fDp10, paint8);
                    canvas.drawCircle(fDp7, f33, (fDpf3 + AndroidUtilities.dp(1.0f)) - 1.0f, paint8);
                    canvas.restoreToCount(saveCount2);
                    break;
                }
                break;
            case 2:
                super.onDraw(canvas);
                int saveCount3 = canvas.getSaveCount();
                float showAlpha3 = getShowAlpha();
                if (showAlpha3 > 0.0f) {
                    if (showAlpha3 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha3 * 255.0f), 31);
                    }
                    float fDp11 = AndroidUtilities.dp(2.0f);
                    float fDpf4 = AndroidUtilities.dpf2(5.66f);
                    float fDp12 = fDp11 + fDpf4 + AndroidUtilities.dp(15.0f);
                    float f36 = fDp12 * 2.0f;
                    float measuredWidth3 = getMeasuredWidth() - f36;
                    float measuredHeight3 = getMeasuredHeight() - f36;
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f37 = fDp12 + measuredWidth3;
                    float f38 = fDp12 + measuredHeight3;
                    rectF3.set(fDp12, fDp12, f37, f38);
                    float fDp13 = AndroidUtilities.dp(12.0f);
                    float fMin5 = Math.min(fDp13, measuredWidth3 / 2.0f);
                    float f39 = measuredHeight3 / 2.0f;
                    float fMin6 = Math.min(fDp13, f39);
                    Path path3 = this.f50635s;
                    path3.rewind();
                    float f40 = fMin5 * 2.0f;
                    float f41 = fDp12 + f40;
                    float f42 = 2.0f * fMin6;
                    float f43 = fDp12 + f42;
                    rectF3.set(fDp12, fDp12, f41, f43);
                    path3.arcTo(rectF3, 180.0f, 90.0f);
                    float f44 = f37 - f40;
                    rectF3.set(f44, fDp12, f37, f43);
                    path3.arcTo(rectF3, 270.0f, 90.0f);
                    Paint paint9 = this.f50428a;
                    canvas.drawPath(path3, paint9);
                    path3.rewind();
                    float f45 = f38 - f42;
                    rectF3.set(fDp12, f45, f41, f38);
                    path3.arcTo(rectF3, 180.0f, -90.0f);
                    rectF3.set(f44, f45, f37, f38);
                    path3.arcTo(rectF3, 90.0f, -90.0f);
                    canvas.drawPath(path3, paint9);
                    float f46 = fDp12 + f39;
                    Paint paint10 = this.f50430c;
                    canvas.drawCircle(fDp12, f46, fDpf4, paint10);
                    float fDp14 = (fDpf4 - AndroidUtilities.dp(1.0f)) + 1.0f;
                    Paint paint11 = this.f50429b;
                    canvas.drawCircle(fDp12, f46, fDp14, paint11);
                    canvas.drawCircle(f37, f46, fDpf4, paint10);
                    canvas.drawCircle(f37, f46, (fDpf4 - AndroidUtilities.dp(1.0f)) + 1.0f, paint11);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f47 = fDp12 + fMin6;
                    float f48 = f38 - fMin6;
                    canvas.drawLine(fDp12, f47, fDp12, f48, paint9);
                    canvas.drawLine(f37, f47, f37, f48, paint9);
                    float fDp15 = (AndroidUtilities.dp(1.0f) + fDpf4) - 1.0f;
                    Paint paint12 = this.f50634r;
                    canvas.drawCircle(f37, f46, fDp15, paint12);
                    canvas.drawCircle(fDp12, f46, (fDpf4 + AndroidUtilities.dp(1.0f)) - 1.0f, paint12);
                    canvas.restoreToCount(saveCount3);
                    break;
                }
                break;
            case 3:
                super.onDraw(canvas);
                int saveCount4 = canvas.getSaveCount();
                float showAlpha4 = getShowAlpha();
                if (showAlpha4 > 0.0f) {
                    if (showAlpha4 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha4 * 255.0f), 31);
                    }
                    float fDp16 = AndroidUtilities.dp(2.0f);
                    float fDpf5 = AndroidUtilities.dpf2(5.66f);
                    float fDp17 = fDp16 + fDpf5 + AndroidUtilities.dp(15.0f);
                    float f49 = fDp17 * 2.0f;
                    float measuredWidth4 = getMeasuredWidth() - f49;
                    float measuredHeight4 = getMeasuredHeight() - f49;
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float f50 = fDp17 + measuredWidth4;
                    float f51 = fDp17 + measuredHeight4;
                    rectF4.set(fDp17, fDp17, f50, f51);
                    float fDp18 = AndroidUtilities.dp(12.0f);
                    float fMin7 = Math.min(fDp18, measuredWidth4 / 2.0f);
                    float f52 = measuredHeight4 / 2.0f;
                    float fMin8 = Math.min(fDp18, f52);
                    Path path4 = this.f50635s;
                    path4.rewind();
                    float f53 = fMin7 * 2.0f;
                    float f54 = fDp17 + f53;
                    float f55 = 2.0f * fMin8;
                    float f56 = fDp17 + f55;
                    rectF4.set(fDp17, fDp17, f54, f56);
                    path4.arcTo(rectF4, 180.0f, 90.0f);
                    float f57 = f50 - f53;
                    rectF4.set(f57, fDp17, f50, f56);
                    path4.arcTo(rectF4, 270.0f, 90.0f);
                    Paint paint13 = this.f50428a;
                    canvas.drawPath(path4, paint13);
                    path4.rewind();
                    float f58 = f51 - f55;
                    rectF4.set(fDp17, f58, f54, f51);
                    path4.arcTo(rectF4, 180.0f, -90.0f);
                    rectF4.set(f57, f58, f50, f51);
                    path4.arcTo(rectF4, 90.0f, -90.0f);
                    canvas.drawPath(path4, paint13);
                    float f59 = fDp17 + f52;
                    Paint paint14 = this.f50430c;
                    canvas.drawCircle(fDp17, f59, fDpf5, paint14);
                    float fDp19 = (fDpf5 - AndroidUtilities.dp(1.0f)) + 1.0f;
                    Paint paint15 = this.f50429b;
                    canvas.drawCircle(fDp17, f59, fDp19, paint15);
                    canvas.drawCircle(f50, f59, fDpf5, paint14);
                    canvas.drawCircle(f50, f59, (fDpf5 - AndroidUtilities.dp(1.0f)) + 1.0f, paint15);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f60 = fDp17 + fMin8;
                    float f61 = f51 - fMin8;
                    canvas.drawLine(fDp17, f60, fDp17, f61, paint13);
                    canvas.drawLine(f50, f60, f50, f61, paint13);
                    float fDp20 = (AndroidUtilities.dp(1.0f) + fDpf5) - 1.0f;
                    Paint paint16 = this.f50634r;
                    canvas.drawCircle(f50, f59, fDp20, paint16);
                    canvas.drawCircle(fDp17, f59, (fDpf5 + AndroidUtilities.dp(1.0f)) - 1.0f, paint16);
                    canvas.restoreToCount(saveCount4);
                    break;
                }
                break;
            case 4:
                super.onDraw(canvas);
                int saveCount5 = canvas.getSaveCount();
                float showAlpha5 = getShowAlpha();
                if (showAlpha5 > 0.0f) {
                    if (showAlpha5 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha5 * 255.0f), 31);
                    }
                    float fDp21 = AndroidUtilities.dp(2.0f);
                    float fDpf6 = AndroidUtilities.dpf2(5.66f);
                    float fDp22 = fDp21 + fDpf6 + AndroidUtilities.dp(15.0f);
                    float f62 = fDp22 * 2.0f;
                    float measuredWidth5 = getMeasuredWidth() - f62;
                    float measuredHeight5 = getMeasuredHeight() - f62;
                    RectF rectF5 = AndroidUtilities.rectTmp;
                    float f63 = fDp22 + measuredWidth5;
                    float f64 = fDp22 + measuredHeight5;
                    rectF5.set(fDp22, fDp22, f63, f64);
                    float fDp23 = AndroidUtilities.dp(12.0f);
                    float fMin9 = Math.min(fDp23, measuredWidth5 / 2.0f);
                    float f65 = measuredHeight5 / 2.0f;
                    float fMin10 = Math.min(fDp23, f65);
                    Path path5 = this.f50635s;
                    path5.rewind();
                    float f66 = fMin9 * 2.0f;
                    float f67 = fDp22 + f66;
                    float f68 = 2.0f * fMin10;
                    float f69 = fDp22 + f68;
                    rectF5.set(fDp22, fDp22, f67, f69);
                    path5.arcTo(rectF5, 180.0f, 90.0f);
                    float f70 = f63 - f66;
                    rectF5.set(f70, fDp22, f63, f69);
                    path5.arcTo(rectF5, 270.0f, 90.0f);
                    Paint paint17 = this.f50428a;
                    canvas.drawPath(path5, paint17);
                    path5.rewind();
                    float f71 = f64 - f68;
                    rectF5.set(fDp22, f71, f67, f64);
                    path5.arcTo(rectF5, 180.0f, -90.0f);
                    rectF5.set(f70, f71, f63, f64);
                    path5.arcTo(rectF5, 90.0f, -90.0f);
                    canvas.drawPath(path5, paint17);
                    float f72 = fDp22 + f65;
                    Paint paint18 = this.f50430c;
                    canvas.drawCircle(fDp22, f72, fDpf6, paint18);
                    float fDp24 = (fDpf6 - AndroidUtilities.dp(1.0f)) + 1.0f;
                    Paint paint19 = this.f50429b;
                    canvas.drawCircle(fDp22, f72, fDp24, paint19);
                    canvas.drawCircle(f63, f72, fDpf6, paint18);
                    canvas.drawCircle(f63, f72, (fDpf6 - AndroidUtilities.dp(1.0f)) + 1.0f, paint19);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f73 = fDp22 + fMin10;
                    float f74 = f64 - fMin10;
                    canvas.drawLine(fDp22, f73, fDp22, f74, paint17);
                    canvas.drawLine(f63, f73, f63, f74, paint17);
                    float fDp25 = (AndroidUtilities.dp(1.0f) + fDpf6) - 1.0f;
                    Paint paint20 = this.f50634r;
                    canvas.drawCircle(f63, f72, fDp25, paint20);
                    canvas.drawCircle(fDp22, f72, (fDpf6 + AndroidUtilities.dp(1.0f)) - 1.0f, paint20);
                    canvas.restoreToCount(saveCount5);
                    break;
                }
                break;
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
                    float fDp26 = AndroidUtilities.dp(2.0f);
                    float fDpf7 = AndroidUtilities.dpf2(5.66f);
                    float fDp27 = fDp26 + fDpf7 + AndroidUtilities.dp(15.0f);
                    float f75 = fDp27 * 2.0f;
                    float measuredWidth6 = getMeasuredWidth() - f75;
                    float measuredHeight6 = getMeasuredHeight() - f75;
                    RectF rectF6 = AndroidUtilities.rectTmp;
                    float f76 = fDp27 + measuredWidth6;
                    float f77 = fDp27 + measuredHeight6;
                    rectF6.set(fDp27, fDp27, f76, f77);
                    float fDp28 = AndroidUtilities.dp(12.0f);
                    float fMin11 = Math.min(fDp28, measuredWidth6 / 2.0f);
                    float f78 = measuredHeight6 / 2.0f;
                    float fMin12 = Math.min(fDp28, f78);
                    Path path6 = this.f50635s;
                    path6.rewind();
                    float f79 = fMin11 * 2.0f;
                    float f80 = fDp27 + f79;
                    float f81 = 2.0f * fMin12;
                    float f82 = fDp27 + f81;
                    rectF6.set(fDp27, fDp27, f80, f82);
                    path6.arcTo(rectF6, 180.0f, 90.0f);
                    float f83 = f76 - f79;
                    rectF6.set(f83, fDp27, f76, f82);
                    path6.arcTo(rectF6, 270.0f, 90.0f);
                    Paint paint21 = this.f50428a;
                    canvas2.drawPath(path6, paint21);
                    path6.rewind();
                    float f84 = f77 - f81;
                    rectF6.set(fDp27, f84, f80, f77);
                    path6.arcTo(rectF6, 180.0f, -90.0f);
                    rectF6.set(f83, f84, f76, f77);
                    path6.arcTo(rectF6, 90.0f, -90.0f);
                    canvas2.drawPath(path6, paint21);
                    float f85 = fDp27 + f78;
                    Paint paint22 = this.f50430c;
                    canvas2.drawCircle(fDp27, f85, fDpf7, paint22);
                    float fDp29 = (fDpf7 - AndroidUtilities.dp(1.0f)) + 1.0f;
                    Paint paint23 = this.f50429b;
                    canvas2.drawCircle(fDp27, f85, fDp29, paint23);
                    canvas2.drawCircle(f76, f85, fDpf7, paint22);
                    canvas2.drawCircle(f76, f85, (fDpf7 - AndroidUtilities.dp(1.0f)) + 1.0f, paint23);
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f86 = fDp27 + fMin12;
                    float f87 = f77 - fMin12;
                    canvas.drawLine(fDp27, f86, fDp27, f87, paint21);
                    canvas.drawLine(f76, f86, f76, f87, paint21);
                    float fDp30 = (AndroidUtilities.dp(1.0f) + fDpf7) - 1.0f;
                    Paint paint24 = this.f50634r;
                    canvas.drawCircle(f76, f85, fDp30, paint24);
                    canvas.drawCircle(fDp27, f85, (fDpf7 + AndroidUtilities.dp(1.0f)) - 1.0f, paint24);
                    canvas.restoreToCount(saveCount6);
                    break;
                }
                break;
        }
    }

    public o0(w2 w2Var, Context context) {
        super(w2Var, context);
        Paint paint = new Paint(1);
        this.f50634r = paint;
        this.f50635s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public o0(s0 s0Var, Context context) {
        super(s0Var, context);
        Paint paint = new Paint(1);
        this.f50634r = paint;
        this.f50635s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public o0(v2 v2Var, Context context) {
        super(v2Var, context);
        Paint paint = new Paint(1);
        this.f50634r = paint;
        this.f50635s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public o0(x1 x1Var, Context context) {
        super(x1Var, context);
        Paint paint = new Paint(1);
        this.f50634r = paint;
        this.f50635s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public o0(e1 e1Var, Context context) {
        super(e1Var, context);
        Paint paint = new Paint(1);
        this.f50634r = paint;
        this.f50635s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}
