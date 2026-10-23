package zh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
public abstract class t {
    public static Bitmap f52114a;
    public static BitmapShader f52115b;
    public static final Paint f52116c = new Paint(2);
    public static final Paint d = new Paint(3);
    public static final RectF e = new RectF();
    public static final Matrix f52117f = new Matrix();
    public static final HashMap f52118g = new HashMap();
    public static final SweepGradient[] h = new SweepGradient[4];
    public static int f52119i = -1;
    public static final Paint f52120j = new Paint(2);
    public static final Rect f52121k = new Rect();
    public static final RectF f52122l = new RectF();
    public static final int[] f52123m = new int[4];
    public static final int[] f52124n = new int[4];
    public static final float[] f52125o = new float[4];
    public static final float[] f52126p = new float[4];

    public static boolean a(Canvas canvas, RectF rectF, float f7, int i10, float f10) {
        float f11;
        boolean z10;
        boolean z11;
        float f12;
        float f13;
        float f14;
        boolean z12;
        int i11;
        int i12;
        float f15;
        float f16;
        RectF rectF2;
        boolean z13;
        if (Build.VERSION.SDK_INT >= 29) {
            float f17 = 0.004f;
            boolean z14 = true;
            if (f10 <= 0.004f) {
                return true;
            }
            int i13 = f52119i;
            SweepGradient[] sweepGradientArr = h;
            float[][] fArr = d1.f51974a;
            int i14 = 4;
            HashMap hashMap = f52118g;
            if (i13 != 1) {
                f52119i = 1;
                hashMap.clear();
                int i15 = 0;
                while (i15 < i14) {
                    float[] fArr2 = fArr[i15];
                    float f18 = f17;
                    int[] iArr = new int[73];
                    float[] fArr3 = new float[73];
                    int i16 = 0;
                    for (int i17 = 73; i16 < i17; i17 = 73) {
                        boolean z15 = z14;
                        SweepGradient[] sweepGradientArr2 = sweepGradientArr;
                        double radians = Math.toRadians(i16 * 5);
                        int i18 = i14;
                        HashMap hashMap2 = hashMap;
                        float pow = (float) Math.pow(Math.abs(Math.cos(radians)), fArr2[6]);
                        if (((float) Math.sin(radians)) < 0.0f) {
                            f11 = fArr2[11];
                        } else {
                            f11 = fArr2[12];
                        }
                        float f19 = f11 / 100.0f;
                        iArr[i16] = ((int) ((Math.max(0.0f, Math.min(1.0f, (((fArr2[5] / 100.0f) - f19) * pow) + f19)) * 255.0f) + 0.5f)) << 24;
                        fArr3[i16] = i16 / 72.0f;
                        i16++;
                        z14 = z15;
                        sweepGradientArr = sweepGradientArr2;
                        i14 = i18;
                        hashMap = hashMap2;
                    }
                    sweepGradientArr[i15] = new SweepGradient(0.0f, 0.0f, iArr, fArr3);
                    i15++;
                    f17 = f18;
                    z14 = z14;
                }
            }
            float f20 = f17;
            boolean z16 = z14;
            SweepGradient[] sweepGradientArr3 = sweepGradientArr;
            int i19 = i14;
            HashMap hashMap3 = hashMap;
            float[] fArr4 = fArr[i10];
            float dpf2 = AndroidUtilities.dpf2(fArr4[8]);
            float f21 = rectF.left + dpf2;
            float f22 = rectF.top + dpf2;
            float f23 = rectF.right - dpf2;
            float f24 = rectF.bottom - dpf2;
            float f25 = f23 - f21;
            float f26 = f24 - f22;
            if (f25 >= 1.0f) {
                if (f26 >= 1.0f) {
                    float min = Math.min(Math.max(0.0f, f7 - dpf2), Math.min(f25, f26) / 2.0f);
                    float dpf22 = AndroidUtilities.dpf2(fArr4[i19]);
                    float max = Math.max(AndroidUtilities.dpf2(fArr4[0]), AndroidUtilities.dpf2(fArr4[2]));
                    int ceil = ((int) Math.ceil(dpf22)) + 2;
                    int ceil2 = ((int) Math.ceil(max + min)) + 1;
                    int round = Math.round(f25);
                    int round2 = Math.round(f26);
                    int i20 = (ceil2 * 2) + 2;
                    if (round >= i20) {
                        z10 = z16 ? 1 : 0;
                    } else {
                        z10 = false;
                    }
                    if (round2 >= i20) {
                        z11 = z16 ? 1 : 0;
                    } else {
                        z11 = false;
                    }
                    if (z10) {
                        round = i20;
                    }
                    if (z11) {
                        round2 = i20;
                    }
                    boolean z17 = z11;
                    long round3 = (((Math.round(4.0f * min) << 32) ^ (i10 << 56)) ^ (round << 16)) ^ round2;
                    Bitmap bitmap = (Bitmap) hashMap3.get(Long.valueOf(round3));
                    if (bitmap == null) {
                        float[] fArr5 = fArr[i10];
                        int i21 = ceil * 2;
                        bitmap = Bitmap.createBitmap(round + i21, i21 + round2, Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(bitmap);
                        f12 = f21;
                        float f27 = ceil;
                        RectF rectF3 = new RectF(f27, f27, round + ceil, round2 + ceil);
                        float dpf23 = AndroidUtilities.dpf2(fArr5[i19]);
                        if (dpf23 > 0.05f) {
                            Matrix matrix = new Matrix();
                            f13 = f22;
                            f14 = f23;
                            matrix.setScale(rectF3.width() / Math.max(1.0f, rectF3.height()), 1.0f);
                            matrix.postTranslate(rectF3.centerX(), rectF3.centerY());
                            SweepGradient sweepGradient = sweepGradientArr3[i10];
                            sweepGradient.setLocalMatrix(matrix);
                            Paint paint = new Paint(z16 ? 1 : 0);
                            paint.setStyle(Paint.Style.STROKE);
                            paint.setStrokeWidth(dpf23);
                            paint.setShader(sweepGradient);
                            RectF rectF4 = new RectF(rectF3);
                            float f28 = (-dpf23) / 2.0f;
                            rectF4.inset(f28, f28);
                            float f29 = (dpf23 / 2.0f) + min;
                            canvas2.drawRoundRect(rectF4, f29, f29, paint);
                        } else {
                            f13 = f22;
                            f14 = f23;
                        }
                        Paint paint2 = new Paint(1);
                        paint2.setColor(-1);
                        Path path = new Path();
                        Path path2 = new Path();
                        RectF rectF5 = new RectF();
                        int i22 = 0;
                        boolean z18 = z17;
                        while (i22 < 2) {
                            if (i22 == 0) {
                                f15 = AndroidUtilities.dpf2(fArr5[0]);
                            } else {
                                f15 = -AndroidUtilities.dpf2(fArr5[2]);
                            }
                            if (i22 == 0) {
                                f16 = fArr5[1];
                            } else {
                                f16 = fArr5[3];
                            }
                            int i23 = i22;
                            float f30 = f16 / 100.0f;
                            if (f30 <= f20 || Math.abs(f15) < 0.1f) {
                                rectF2 = rectF3;
                                z13 = z18;
                            } else {
                                path.rewind();
                                z13 = z18;
                                Path.Direction direction = Path.Direction.CW;
                                path.addRoundRect(rectF3, min, min, direction);
                                rectF5.set(rectF3);
                                rectF2 = rectF3;
                                rectF5.offset(0.0f, f15);
                                path2.rewind();
                                path2.addRoundRect(rectF5, min, min, direction);
                                canvas2.save();
                                u.b(canvas2, path2);
                                paint2.setAlpha(Math.round(Math.min(1.0f, f30) * 255.0f));
                                canvas2.drawPath(path, paint2);
                                canvas2.restore();
                            }
                            i22 = i23 + 1;
                            z18 = z13;
                            rectF3 = rectF2;
                        }
                        z12 = z18;
                        bitmap.prepareToDraw();
                        hashMap3.put(Long.valueOf(round3), bitmap);
                    } else {
                        f12 = f21;
                        f13 = f22;
                        f14 = f23;
                        z12 = z17;
                    }
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    if (z10) {
                        i11 = 3;
                    } else {
                        i11 = 1;
                    }
                    if (z12) {
                        i12 = 3;
                    } else {
                        i12 = 1;
                    }
                    int[] iArr2 = f52123m;
                    iArr2[0] = 0;
                    float f31 = ceil;
                    float[] fArr6 = f52125o;
                    fArr6[0] = f12 - f31;
                    if (z10) {
                        iArr2[1] = ceil + ceil2;
                        iArr2[2] = (width - ceil) - ceil2;
                        float f32 = ceil2;
                        fArr6[1] = f12 + f32;
                        fArr6[2] = f14 - f32;
                    }
                    iArr2[i11] = width;
                    fArr6[i11] = f14 + f31;
                    int[] iArr3 = f52124n;
                    iArr3[0] = 0;
                    float[] fArr7 = f52126p;
                    fArr7[0] = f13 - f31;
                    if (z12) {
                        iArr3[1] = ceil + ceil2;
                        iArr3[2] = (height - ceil) - ceil2;
                        float f33 = ceil2;
                        fArr7[1] = f13 + f33;
                        fArr7[2] = f24 - f33;
                    }
                    iArr3[i12] = height;
                    fArr7[i12] = f24 + f31;
                    Paint paint3 = f52120j;
                    paint3.setAlpha((int) (Math.min(1.0f, f10) * 255.0f));
                    for (int i24 = 0; i24 < i12; i24++) {
                        int i25 = 0;
                        while (i25 < i11) {
                            int i26 = iArr2[i25];
                            int i27 = iArr3[i24];
                            int i28 = i25 + 1;
                            int i29 = iArr2[i28];
                            int i30 = i24 + 1;
                            int i31 = iArr3[i30];
                            int[] iArr4 = iArr3;
                            Rect rect = f52121k;
                            rect.set(i26, i27, i29, i31);
                            float f34 = fArr6[i25];
                            float f35 = fArr7[i24];
                            float f36 = fArr6[i28];
                            float f37 = fArr7[i30];
                            RectF rectF6 = f52122l;
                            rectF6.set(f34, f35, f36, f37);
                            canvas.drawBitmap(bitmap, rect, rectF6, paint3);
                            iArr3 = iArr4;
                            i25 = i28;
                        }
                    }
                } else {
                    return z16;
                }
            }
            return true;
        }
        return false;
    }

    public static void b(Canvas canvas, RectF rectF, float f7) {
        float f10 = rectF.left;
        float f11 = rectF.top;
        RectF rectF2 = e;
        rectF2.set(f10, f11, rectF.right, Math.min(rectF.height(), AndroidUtilities.dp(40.0f)) + f11);
        Paint paint = f52116c;
        paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, f7)) * 255.0f * 0.3125f));
        canvas.drawBitmap(d(), (Rect) null, rectF2, paint);
    }

    public static void c(Canvas canvas, RectF rectF, float f7, float f10) {
        Bitmap d10 = d();
        BitmapShader bitmapShader = f52115b;
        Paint paint = d;
        if (bitmapShader == null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader2 = new BitmapShader(d10, tileMode, tileMode);
            f52115b = bitmapShader2;
            paint.setShader(bitmapShader2);
        }
        float width = rectF.width() / d10.getWidth();
        float min = Math.min(rectF.height(), AndroidUtilities.dp(40.0f)) / d10.getHeight();
        Matrix matrix = f52117f;
        matrix.setScale(width, min);
        matrix.postTranslate(rectF.left, rectF.top);
        f52115b.setLocalMatrix(matrix);
        paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, f10)) * 255.0f * 0.3125f));
        canvas.drawRoundRect(rectF, f7, f7, paint);
    }

    public static Bitmap d() {
        if (f52114a == null) {
            int[] iArr = new int[64];
            for (int i10 = 0; i10 < 64; i10++) {
                iArr[i10] = (((int) (((1.0f - ((i10 + 0.5f) / 64.0f)) * 64.0f) + 0.5f)) << 24) | 16777215;
            }
            f52114a = Bitmap.createBitmap(iArr, 1, 64, Bitmap.Config.ARGB_8888);
        }
        return f52114a;
    }
}
