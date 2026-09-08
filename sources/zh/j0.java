package zh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pr;
public abstract class j0 {
    public static final float[][] f52091a;
    public static final e0.i0 f52092b;

    static {
        float[][] fArr = {new float[]{83.33f, 24.0f, 27.33f, 0.22f, 68.66f, 75.33f, 25.33f, 0.21f, 0.0f, 86.0f, 25.33f, 0.12f, -68.66f, 75.33f, 25.33f, 0.21f, -82.66f, 13.66f, 27.33f, 0.22f, -80.0f, -33.33f, 20.0f, 0.24f, -46.5f, -63.16f, 27.0f, 0.21f, 1.0f, -82.66f, 20.0f, 0.15f, 46.5f, -63.16f, 27.0f, 0.21f, 80.0f, -33.33f, 19.33f, 0.24f, 115.66f, -63.0f, 20.0f, 0.15f, 134.0f, -10.66f, 20.0f, 0.18f, 118.66f, 55.66f, 20.0f, 0.15f, 124.33f, 98.33f, 20.0f, 0.11f, -128.0f, 98.33f, 20.0f, 0.11f, -108.0f, 55.66f, 20.0f, 0.15f, -123.33f, -10.66f, 20.0f, 0.18f, -116.0f, -63.33f, 20.0f, 0.15f}, new float[]{27.33f, -57.66f, 20.0f, 0.12f, 59.0f, -32.0f, 19.33f, 0.22f, 77.0f, 4.33f, 22.66f, 0.2f, 100.0f, 40.33f, 18.0f, 0.12f, 58.66f, 59.0f, 20.0f, 0.18f, 73.33f, 100.33f, 22.66f, 0.15f, 75.0f, 155.0f, 22.0f, 0.11f, -27.33f, -57.33f, 20.0f, 0.12f, -59.0f, -32.33f, 19.33f, 0.2f, -77.0f, 4.66f, 23.33f, 0.2f, -98.66f, 41.0f, 18.66f, 0.12f, -58.0f, 59.33f, 19.33f, 0.18f, -73.33f, 100.0f, 22.0f, 0.15f, -75.66f, 155.0f, 22.0f, 0.11f}, new float[]{-0.83f, -52.16f, 12.33f, 0.2f, 26.66f, -40.33f, 16.0f, 0.2f, 44.16f, -20.5f, 12.33f, 0.2f, 53.0f, 7.33f, 16.0f, 0.2f, 31.0f, 23.66f, 14.66f, 0.2f, 0.0f, 32.0f, 13.33f, 0.2f, -29.0f, 23.66f, 14.0f, 0.2f, -53.0f, 7.33f, 16.0f, 0.2f, -44.5f, -20.16f, 12.33f, 0.2f, -27.33f, -40.33f, 16.0f, 0.2f, 43.66f, 50.0f, 14.66f, 0.2f, -41.66f, 48.0f, 14.66f, 0.2f}, new float[]{-0.16f, -103.5f, 20.33f, 0.15f, 39.66f, -77.33f, 26.66f, 0.15f, 70.66f, -46.33f, 21.33f, 0.15f, 84.5f, -3.83f, 29.66f, 0.15f, 65.33f, 56.33f, 24.66f, 0.15f, 0.0f, 67.66f, 24.66f, 0.15f, -65.66f, 56.66f, 24.66f, 0.15f, -85.0f, -4.0f, 29.33f, 0.15f, -70.66f, -46.33f, 21.33f, 0.15f, -40.33f, -77.66f, 26.66f, 0.15f, 62.66f, -109.66f, 21.33f, 0.11f, 103.166f, -67.5f, 20.33f, 0.11f, 110.33f, 37.66f, 20.66f, 0.11f, 94.166f, 91.16f, 20.33f, 0.11f, 38.83f, 91.16f, 20.33f, 0.11f, 0.0f, 112.5f, 20.33f, 0.11f, -38.83f, 91.16f, 20.33f, 0.11f, -94.166f, 91.16f, 20.33f, 0.11f, -110.33f, 37.66f, 20.66f, 0.11f, -103.166f, -67.5f, 20.33f, 0.11f, -62.66f, -109.66f, 21.33f, 0.11f}};
        f52091a = fArr;
        short s10 = 0;
        for (float[] fArr2 : fArr) {
            s10 = (short) Math.max((int) s10, fArr2.length / 4);
        }
        f52092b = new e0.i0(s10);
    }

    public static void a(Canvas canvas, int i10, Drawable drawable, float f7, float f10, float f11, float f12) {
        if (f11 > 0.0f) {
            int i11 = 0;
            while (true) {
                float[] fArr = f52091a[i10];
                if (i11 < fArr.length) {
                    float f13 = fArr[i11];
                    float f14 = fArr[i11 + 1];
                    float f15 = fArr[i11 + 2];
                    float f16 = fArr[i11 + 3];
                    if (f7 < f10 && i10 == 0) {
                        f14 = f13;
                        f13 = f14;
                    }
                    float f17 = f13 * f12;
                    float f18 = f14 * f12;
                    float f19 = f15 * f12;
                    drawable.setBounds((int) (AndroidUtilities.dp(f17) - (AndroidUtilities.dp(f19) / 2.0f)), (int) (AndroidUtilities.dp(f18) - (AndroidUtilities.dp(f19) / 2.0f)), (int) ((AndroidUtilities.dp(f19) / 2.0f) + AndroidUtilities.dp(f17)), (int) ((AndroidUtilities.dp(f19) / 2.0f) + AndroidUtilities.dp(f18)));
                    drawable.setAlpha((int) Utilities.clamp(f11 * 255.0f * f16, 255.0f, 0.0f));
                    drawable.draw(canvas);
                    i11 += 4;
                } else {
                    return;
                }
            }
        }
    }

    public static void b(Canvas canvas, int i10, Paint paint, Bitmap bitmap, float f7, float f10, float f11) {
        e0.i0 i0Var;
        if (f11 <= 0.0f) {
            return;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i0Var = f52092b;
            if (i12 >= i0Var.f8653a) {
                break;
            }
            e0.i0.a((float[]) i0Var.f8655c, i12, 0.0f, 0.0f, width, height);
            i12++;
        }
        while (true) {
            float[] fArr = f52091a[i10];
            if (i11 < fArr.length) {
                float f12 = fArr[i11];
                float f13 = fArr[i11 + 1];
                float f14 = fArr[i11 + 2];
                float f15 = fArr[i11 + 3];
                if (f7 < f10 && i10 == 0) {
                    f13 = f12;
                    f12 = f13;
                }
                float f16 = f12 * 1.0f;
                float f17 = f13 * 1.0f;
                float f18 = f14 * 1.0f;
                int i13 = i11 / 4;
                e0.i0.a((float[]) i0Var.f8654b, i13, AndroidUtilities.dp(f16) - (AndroidUtilities.dp(f18) / 2.0f), AndroidUtilities.dp(f17) - (AndroidUtilities.dp(f18) / 2.0f), (AndroidUtilities.dp(f18) / 2.0f) + AndroidUtilities.dp(f16), (AndroidUtilities.dp(f18) / 2.0f) + AndroidUtilities.dp(f17));
                i0Var.e(i13, i0.a.k(-1, (int) (255.0f * f11 * f15)));
                i11 += 4;
            } else {
                g0.a.b(canvas, i0Var, fArr.length / 4, paint);
                return;
            }
        }
    }

    public static void c(Canvas canvas, org.telegram.ui.Components.o5 o5Var, int i10, float f7, float f10, RectF rectF, float f11) {
        float f12;
        float f13;
        float clamp01;
        float f14;
        float f15 = f10;
        if (f15 > 0.0f) {
            if (f15 >= 0.85f) {
                f12 = 1.0f;
            } else {
                f12 = f15 / 0.85f;
            }
            float clamp012 = Utilities.clamp01((f12 - 0.2f) / 0.8f);
            float f16 = rectF.left;
            float f17 = rectF.top;
            float width = rectF.width();
            float height = rectF.height();
            float f18 = (width / 2.0f) + f16;
            float f19 = (height / 2.0f) + f17;
            float dpf2 = AndroidUtilities.dpf2(96.0f);
            float min = Math.min(f16, (i10 - dpf2) / 2.0f);
            float max = Math.max(f17, (f7 - dpf2) / 2.0f);
            float max2 = Math.max(width, dpf2);
            float max3 = Math.max(height, dpf2);
            float f20 = max2 / 2.0f;
            float f21 = min + f20;
            float f22 = max3 / 2.0f;
            float f23 = max + f22;
            float dpf22 = AndroidUtilities.dpf2(24.0f);
            float dpf23 = AndroidUtilities.dpf2(16.0f);
            float dpf24 = AndroidUtilities.dpf2(12.0f);
            float dpf25 = AndroidUtilities.dpf2(8.0f);
            float dpf26 = AndroidUtilities.dpf2(4.0f);
            float f24 = dpf22 * 2.0f;
            float f25 = f24 * 2.0f;
            float cos = (f24 + f20) * ((float) Math.cos(Math.toRadians(120.0d)));
            float cos2 = (dpf23 + f22) * ((float) Math.cos(Math.toRadians(160.0d)));
            float f26 = max + max3;
            float f27 = min - dpf23;
            float f28 = max3 / 4.0f;
            float f29 = (f23 - f28) - dpf25;
            float f30 = min + max2;
            float f31 = f30 + dpf23;
            float f32 = f23 + f28 + dpf25;
            float f33 = min - f24;
            float f34 = f30 + f24;
            float f35 = f21 + cos;
            float f36 = (max - f24) + dpf24;
            float f37 = f21 - cos;
            float f38 = (f26 + f24) - dpf24;
            float f39 = f33 - dpf25;
            float f40 = f23 + cos2;
            float f41 = f34 + dpf25;
            float f42 = f23 - cos2;
            float f43 = min - f25;
            float f44 = f30 + f25;
            float f45 = 1.0f;
            int i11 = 0;
            float[] fArr = {f21, max - dpf22, 20.0f, f21, f26 + dpf22, 20.0f, f27, f29, 23.0f, f31, f29, 18.0f, f27, f32, 24.0f, f31 - dpf26, f32, 24.0f, f33, f23, 19.0f, f34, f23, 19.0f, f35, f36, 17.0f, f37, f36, 17.0f, f35, f38, 20.0f, f37, f38, 20.0f, f39, f40, 20.0f, f41, f40, 19.0f, f39, f42, 21.0f, f41, f42, 18.0f, f43, f23, 19.0f, f44, f23, 19.0f};
            float[] fArr2 = {0.02f, 0.42f, 0.0f, 0.32f, 0.0f, 0.4f, 0.0f, 0.4f, 0.0f, 0.4f, 0.0f, 0.4f, 0.14f, 0.6f, 0.16f, 0.64f, 0.14f, 0.7f, 0.14f, 0.9f, 0.2f, 0.75f, 0.2f, 0.85f, 0.09f, 0.45f, 0.09f, 0.45f, 0.09f, 0.45f, 0.11f, 0.45f, 0.14f, 0.75f, 0.2f, 0.8f};
            int i12 = 0;
            for (int i13 = 54; i12 < i13; i13 = 54) {
                float f46 = fArr[i12];
                float f47 = fArr[i12 + 1];
                float dpf27 = AndroidUtilities.dpf2(fArr[i12 + 2]) * 0.5f;
                float f48 = fArr2[i11];
                float f49 = fArr2[i11 + 1];
                float f50 = f45 - clamp012;
                if (f50 < f48) {
                    f13 = max3;
                    clamp01 = 1.0f;
                } else {
                    f13 = max3;
                    clamp01 = f45 - Utilities.clamp01((f50 - f48) / (f49 - f48));
                }
                float f51 = f26;
                if (i12 == 18 || i12 == 19 || i12 == 6 || i12 == 7) {
                    clamp01 = pr.f29495i.getInterpolation(clamp01);
                }
                float[] fArr3 = fArr;
                float b10 = com.google.android.gms.internal.vision.e2.b(1.0f, f15, AndroidUtilities.dp(12.0f), f47);
                int i14 = (clamp01 > 1.0f ? 1 : (clamp01 == 1.0f ? 0 : -1));
                if (i14 < 0) {
                    f46 = AndroidUtilities.lerp(f18, f46, pr.f29495i.getInterpolation(clamp01));
                    b10 = AndroidUtilities.lerp(f19, b10, clamp01);
                    dpf27 = AndroidUtilities.lerp(AndroidUtilities.dpf2(8.0f), dpf27, clamp01);
                }
                if (b10 > f51 + AndroidUtilities.dp(8.0f)) {
                    f45 = 1.0f;
                    f14 = 1.0f - Utilities.clamp01((((b10 - max) - f13) - AndroidUtilities.dp(8.0f)) / AndroidUtilities.dp(56.0f));
                } else {
                    f45 = 1.0f;
                    f14 = 1.0f;
                }
                float clamp013 = (f45 - Utilities.clamp01(v7.z6.a(f21, f23, f46, b10) / (max2 * 2.0f))) * f11 * 0.5f * f14;
                if (i14 < 0) {
                    clamp013 = AndroidUtilities.lerp(0.0f, clamp013, clamp01);
                }
                o5Var.setBounds((int) (f46 - dpf27), (int) (b10 - dpf27), (int) (f46 + dpf27), (int) (b10 + dpf27));
                o5Var.v = (int) (clamp013 * 255.0f);
                o5Var.draw(canvas);
                i12 += 3;
                i11 += 2;
                f15 = f10;
                f26 = f51;
                max3 = f13;
                fArr = fArr3;
            }
        }
    }
}
