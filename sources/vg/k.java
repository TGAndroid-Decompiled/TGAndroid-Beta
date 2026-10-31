package vg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import w7.k9;
public final class k {
    public static final h h = new h(4194304, 0);
    public static final j f50872i = new j();
    public final long[] f50873a = new long[3];
    public final i[] f50874b = new i[3];
    public final int[] f50875c = new int[3];
    public final PorterDuffColorFilter[] d = new PorterDuffColorFilter[3];
    public final Paint e = new Paint(2);
    public final float[] f50876f = new float[8];
    public final Rect f50877g = new Rect();

    public static float c(float f7, float f10, float f11) {
        if (f11 > f10 && f11 > 0.0f) {
            return Math.min(f7, f10 / f11);
        }
        return f7;
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, float[] fArr, g gVar, float f13) {
        float f14 = f11 - f7;
        float f15 = f12 - f10;
        if (f14 >= 1.0f && f15 >= 1.0f && f13 > 0.0f) {
            float c10 = c(c(c(c(1.0f, f14, fArr[0] + fArr[2]), f14, fArr[6] + fArr[4]), f15, fArr[1] + fArr[7]), f15, fArr[3] + fArr[5]);
            for (int i10 = 0; i10 < 8; i10++) {
                this.f50876f[i10] = Math.max(0.0f, fArr[i10]) * c10;
            }
            if (gVar.e > 0.05f) {
                int i11 = gVar.f50853f;
                if ((i11 >>> 24) != 0) {
                    b(canvas, 2, f7, f10, f11, f12, gVar, i11, f13);
                }
            }
            if (gVar.f50850a > 0.05f) {
                int i12 = gVar.f50851b;
                if ((i12 >>> 24) != 0) {
                    b(canvas, 0, f7, f10, f11, f12, gVar, i12, f13);
                }
            }
            if (gVar.f50852c > 0.05f) {
                int i13 = gVar.d;
                if ((i13 >>> 24) != 0) {
                    b(canvas, 1, f7, f10, f11, f12, gVar, i13, f13);
                }
            }
        }
    }

    public final void b(Canvas canvas, int i10, float f7, float f10, float f11, float f12, g gVar, int i11, float f13) {
        float[] fArr;
        float f14;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        float f15;
        int round = Math.round(f11 - f7);
        int round2 = Math.round(f12 - f10);
        j jVar = f50872i;
        jVar.f50858a = i10;
        int[] iArr = jVar.f50859b;
        int i20 = 0;
        while (true) {
            fArr = this.f50876f;
            if (i20 >= 8) {
                break;
            }
            iArr[i20] = Math.round(fArr[i20] * 4.0f);
            i20++;
        }
        gVar.getClass();
        float f16 = gVar.e;
        double radians = Math.toRadians(0.0f);
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        if (i10 == 2) {
            jVar.d = 0.0f;
            jVar.f50860c = 0.0f;
            jVar.f50866l = Math.round(16.0f * f16);
            jVar.f50867m = 0;
            jVar.f50868n = Math.round(1000.0f);
            jVar.f50869o = Math.round(1000.0f);
            jVar.f50870p = Math.round(1000.0f);
            jVar.f50871q = 0;
        } else {
            if (i10 == 0) {
                f14 = gVar.f50850a;
            } else {
                f14 = -gVar.f50852c;
            }
            jVar.f50860c = Math.round((sin * f14) * 8.0f) / 8.0f;
            jVar.d = Math.round((cos * f14) * 8.0f) / 8.0f;
            jVar.f50871q = 0;
            jVar.f50870p = 0;
            jVar.f50869o = 0;
            jVar.f50868n = 0;
            jVar.f50867m = 0;
            jVar.f50866l = 0;
        }
        float abs = Math.abs(jVar.f50860c);
        float abs2 = Math.abs(jVar.d);
        jVar.e = ((int) Math.ceil(Math.max(fArr[0], fArr[6]) + abs)) + 1;
        jVar.f50862g = ((int) Math.ceil(Math.max(fArr[2], fArr[4]) + abs)) + 1;
        jVar.f50861f = ((int) Math.ceil(Math.max(fArr[1], fArr[3]) + abs2)) + 1;
        int ceil = ((int) Math.ceil(Math.max(fArr[5], fArr[7]) + abs2)) + 1;
        int i21 = jVar.e + jVar.f50862g + 2;
        if (round >= i21) {
            z10 = true;
        } else {
            z10 = false;
        }
        jVar.f50864j = z10;
        int i22 = jVar.f50861f + ceil + 2;
        if (round2 >= i22) {
            z11 = true;
        } else {
            z11 = false;
        }
        jVar.f50865k = z11;
        if (z10) {
            round = i21;
        }
        jVar.h = round;
        if (z11) {
            round2 = i22;
        }
        jVar.f50863i = round2;
        long a2 = j.a(jVar.f50858a, -3750763034362895579L);
        for (int i23 : iArr) {
            a2 = j.a(i23, a2);
        }
        long a10 = j.a(Float.floatToIntBits(jVar.d), j.a(Float.floatToIntBits(jVar.f50860c), a2));
        if (jVar.f50864j) {
            i12 = -1;
        } else {
            i12 = jVar.h;
        }
        long a11 = j.a(i12, a10);
        if (jVar.f50865k) {
            i13 = -1;
        } else {
            i13 = jVar.f50863i;
        }
        long a12 = j.a(jVar.f50871q, j.a(jVar.f50870p, j.a(jVar.f50869o, j.a(jVar.f50868n, j.a(jVar.f50867m, j.a(jVar.f50866l, j.a(i13, a11)))))));
        i[] iVarArr = this.f50874b;
        i iVar = iVarArr[i10];
        long[] jArr = this.f50873a;
        if (iVar == null || jArr[i10] != a12) {
            Long valueOf = Long.valueOf(a12);
            h hVar = h;
            iVar = (i) hVar.get(valueOf);
            if (iVar == null) {
                if (i10 == 2) {
                    i14 = ((int) Math.ceil(f16)) + 2;
                } else {
                    i14 = 1;
                }
                int i24 = i14 * 2;
                Bitmap createBitmap = Bitmap.createBitmap(jVar.h + i24, jVar.f50863i + i24, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f17 = i14;
                RectF rectF = new RectF(f17, f17, jVar.h + i14, jVar.f50863i + i14);
                float[] fArr2 = new float[8];
                int i25 = 0;
                for (int i26 = 8; i25 < i26; i26 = 8) {
                    fArr2[i25] = iArr[i25] / 4.0f;
                    i25++;
                    hVar = hVar;
                }
                h hVar2 = hVar;
                Paint paint = new Paint(1);
                paint.setColor(-1);
                if (i10 == 2) {
                    RectF rectF2 = new RectF(rectF);
                    float f18 = (-f16) / 2.0f;
                    rectF2.inset(f18, f18);
                    float[] fArr3 = new float[8];
                    for (int i27 = 0; i27 < 8; i27++) {
                        float f19 = fArr2[i27];
                        if (f19 > 0.0f) {
                            f15 = (f16 / 2.0f) + f19;
                        } else {
                            f15 = 0.0f;
                        }
                        fArr3[i27] = f15;
                    }
                    Path path = new Path();
                    path.addRoundRect(rectF2, fArr3, Path.Direction.CW);
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(f16);
                    paint.setAlpha(Math.round(Math.min(1.0f, 1.0f) * 255.0f));
                    canvas2.drawPath(path, paint);
                } else {
                    Path path2 = new Path();
                    Path.Direction direction = Path.Direction.CW;
                    path2.addRoundRect(rectF, fArr2, direction);
                    Path path3 = new Path();
                    float f20 = rectF.left;
                    float f21 = jVar.f50860c;
                    float f22 = f20 + f21;
                    float f23 = rectF.top;
                    float f24 = jVar.d;
                    path3.addRoundRect(f22, f23 + f24, rectF.right + f21, rectF.bottom + f24, fArr2, direction);
                    canvas2.save();
                    if (Build.VERSION.SDK_INT >= 26) {
                        canvas2.clipOutPath(path3);
                    } else {
                        canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                    }
                    canvas2.drawPath(path2, paint);
                    canvas2.restore();
                }
                createBitmap.prepareToDraw();
                boolean z12 = jVar.f50864j;
                if (z12) {
                    i16 = jVar.e + i14;
                    i15 = 2;
                } else {
                    i15 = 2;
                    i16 = (jVar.h / 2) + i14;
                }
                int i28 = i16;
                boolean z13 = jVar.f50865k;
                if (z13) {
                    i17 = jVar.f50861f + i14;
                } else {
                    i17 = (jVar.f50863i / 2) + i14;
                }
                int i29 = i17;
                if (z12) {
                    i18 = i15;
                } else {
                    i18 = 1;
                }
                int i30 = i28 + i18;
                if (z13) {
                    i19 = i15;
                } else {
                    i19 = 1;
                }
                i iVar2 = new i(new NinePatch(createBitmap, k9.c(i28, i30, i29, i29 + i19, 0, 0, 0, 0, 1).array(), null), i14, createBitmap.getByteCount());
                hVar2.put(Long.valueOf(a12), iVar2);
                iVar = iVar2;
            }
            jArr[i10] = a12;
            iVarArr[i10] = iVar;
        }
        int i31 = iVar.f50856b;
        int i32 = i11 | (-16777216);
        PorterDuffColorFilter[] porterDuffColorFilterArr = this.d;
        PorterDuffColorFilter porterDuffColorFilter = porterDuffColorFilterArr[i10];
        int[] iArr2 = this.f50875c;
        if (porterDuffColorFilter == null || iArr2[i10] != i32) {
            iArr2[i10] = i32;
            porterDuffColorFilterArr[i10] = new PorterDuffColorFilter(i32, PorterDuff.Mode.SRC_IN);
        }
        PorterDuffColorFilter porterDuffColorFilter2 = porterDuffColorFilterArr[i10];
        Paint paint2 = this.e;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setAlpha(Math.round(Math.min(1.0f, f13) * Color.alpha(i11)));
        int round3 = Math.round(f7) - i31;
        int round4 = Math.round(f10) - i31;
        int round5 = Math.round(f11) + i31;
        int round6 = Math.round(f12) + i31;
        Rect rect = this.f50877g;
        rect.set(round3, round4, round5, round6);
        iVar.f50855a.draw(canvas, rect, paint2);
    }
}
