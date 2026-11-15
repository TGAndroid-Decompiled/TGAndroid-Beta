package org.telegram.utils.twidget;

import a8.r7;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import org.json.JSONArray;
public final class c1 {
    public final Paint f54172a = new Paint(1);
    public final Paint f54173b;
    public final Paint f54174c;
    public final Paint d;
    public final Path f54175e;
    public final Path f54176f;
    public final Path f54177g;
    public final RectF h;
    public final RectF f54178i;
    public final float[] f54179j;
    public final float[] f54180k;
    public final Matrix f54181l;
    public final HashMap f54182m;
    public final IdentityHashMap f54183n;
    public final float[] f54184o;
    public final RectF f54185p;
    public final RectF f54186q;
    public final float[] f54187r;
    public boolean f54188s;
    public boolean f54189t;
    public float[] f54190u;
    public int v;
    public int f54191w;
    public long f54192x;

    public c1() {
        Paint paint = new Paint(1);
        this.f54173b = paint;
        this.f54174c = new Paint(2);
        this.d = new Paint(1);
        this.f54175e = new Path();
        this.f54176f = new Path();
        this.f54177g = new Path();
        this.h = new RectF();
        new RectF();
        this.f54178i = new RectF();
        this.f54179j = new float[8];
        this.f54180k = new float[8];
        this.f54181l = new Matrix();
        this.f54182m = new HashMap();
        this.f54183n = new IdentityHashMap();
        this.f54184o = new float[9];
        this.f54185p = new RectF();
        this.f54186q = new RectF();
        this.f54187r = new float[8];
        this.f54190u = new float[64];
        paint.setStyle(Paint.Style.STROKE);
    }

    public static void c(JSONArray jSONArray, float[] fArr, int i7, float... fArr2) {
        float f10;
        for (int i10 = 0; i10 < i7; i10++) {
            if (i10 < fArr2.length) {
                f10 = fArr2[i10];
            } else {
                f10 = 0.0f;
            }
            if (jSONArray != null && i10 < jSONArray.length()) {
                f10 = (float) jSONArray.optDouble(i10, f10);
            }
            fArr[i10] = f10;
        }
    }

    public static r7 h(f5.v vVar) {
        int f10 = vVar.f(64, 5);
        r7 r7Var = new r7(f10);
        for (int i7 = 0; i7 < f10; i7++) {
            ((int[]) r7Var.f617b)[i7] = vVar.p();
            ((float[]) r7Var.d)[i7] = vVar.j();
            ((float[]) r7Var.f619e)[i7] = vVar.j();
            ((float[]) r7Var.f620f)[i7] = vVar.j();
            ((int[]) r7Var.f618c)[i7] = vVar.p();
        }
        return r7Var;
    }

    public static void j(f5.v vVar, int i7, int[] iArr, float[] fArr) {
        for (int i10 = 0; i10 < i7; i10++) {
            float max = Math.max(0.0f, Math.min(1.0f, vVar.j()));
            iArr[i10] = vVar.p();
            if (i7 > 1) {
                fArr[i10] = max;
            }
        }
        if (i7 == 1) {
            iArr[1] = iArr[0];
        }
    }

    public static void l(int i7, Paint paint) {
        paint.setShader(null);
        paint.setColor(i7);
    }

    public final void a(Path path, RectF rectF, float f10) {
        if (!this.f54188s) {
            path.addRect(rectF, Path.Direction.CW);
            return;
        }
        int i7 = 0;
        while (true) {
            float[] fArr = this.f54179j;
            if (i7 < 8) {
                fArr[i7] = Math.max(this.f54187r[i7] + f10, 0.0f);
                i7++;
            } else {
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                return;
            }
        }
    }

    public final void b(Canvas canvas, Paint paint) {
        float f10;
        if (this.f54188s) {
            float[] fArr = this.f54187r;
            f10 = fArr[0];
            int i7 = 1;
            while (true) {
                if (i7 >= 8) {
                    break;
                } else if (fArr[i7] != f10) {
                    f10 = -1.0f;
                    break;
                } else {
                    i7++;
                }
            }
        } else {
            f10 = 0.0f;
        }
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        RectF rectF = this.f54185p;
        if (i10 == 0) {
            canvas.drawRect(rectF, paint);
        } else if (i10 > 0) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            Path path = this.f54175e;
            k(rectF, path);
            canvas.drawPath(path, paint);
        }
    }

    public final void d(android.graphics.Canvas r50, org.telegram.utils.twidget.i r51, int r52, org.telegram.utils.twidget.b1 r53, float r54, boolean r55) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.c1.d(android.graphics.Canvas, org.telegram.utils.twidget.i, int, org.telegram.utils.twidget.b1, float, boolean):void");
    }

    public final void e(Canvas canvas, i iVar, b1 b1Var, float f10) {
        boolean z10;
        int i7;
        if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && iVar.f54249c) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i7 = canvas.saveLayer(null, null);
        } else {
            i7 = -1;
        }
        d(canvas, iVar, iVar.f54248b, b1Var, f10, true);
        if (z10) {
            canvas.restoreToCount(i7);
        }
    }

    public final Shader f(f5.v vVar, int i7) {
        float[] fArr = this.f54180k;
        vVar.k(7, fArr);
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        int f15 = vVar.f(4096, 2);
        int[] iArr = new int[Math.max(2, f15)];
        float[] fArr2 = f15 == 1 ? new float[]{0.0f, 1.0f} : new float[Math.max(f15, 2)];
        j(vVar, f15, iArr, fArr2);
        if (f15 < 2) {
            return null;
        }
        if (i7 == 1) {
            return new LinearGradient(f10, f11, f12, f13, iArr, fArr2, Shader.TileMode.CLAMP);
        }
        return new RadialGradient(f10, f11, Math.max(f14, 0.01f), iArr, fArr2, Shader.TileMode.CLAMP);
    }

    public final void g(n2.o0 o0Var, float f10) {
        Object obj;
        int i7;
        a1 a1Var = (a1) r.b.g(1, (ArrayList) o0Var.f20833f);
        if (a1Var.f54161c != null || a1Var.f54163f != null) {
            o0Var.f20830b--;
        }
        while (true) {
            int i10 = o0Var.f20829a;
            obj = a1Var.f54161c;
            if (obj == null && a1Var.f54163f == null) {
                i7 = a1Var.f54160b;
            } else {
                i7 = 0;
            }
            if (i10 <= i7) {
                break;
            }
            o0Var.l();
        }
        if (obj != null) {
            z0.d(a1Var, f10);
            o0Var.f20831c = a1Var.f54159a;
        } else {
            Bitmap bitmap = a1Var.f54163f;
            if (bitmap != null) {
                r7 r7Var = a1Var.f54165i;
                WidgetClientNative.filterPixels(bitmap, (int[]) r7Var.f617b, (float[]) r7Var.d, (float[]) r7Var.f619e, (float[]) r7Var.f620f, (int[]) r7Var.f618c, a1Var.h);
                o0Var.f20831c = a1Var.f54159a;
                Matrix matrix = new Matrix();
                if (a1Var.f54164g.invert(matrix)) {
                    ((Canvas) o0Var.f20831c).save();
                    ((Canvas) o0Var.f20831c).concat(matrix);
                    ((Canvas) o0Var.f20831c).drawBitmap(a1Var.f54163f, a1Var.d, a1Var.f54162e, this.f54174c);
                    ((Canvas) o0Var.f20831c).restore();
                }
            }
        }
        o0Var.f20829a = a1Var.f54160b;
    }

    public final void i(f5.v vVar, Path path) {
        Path.FillType fillType;
        int i7;
        int i10;
        int i11;
        int i12;
        path.rewind();
        int f10 = vVar.f(1048576, 0);
        int f11 = vVar.f(6291456, 1);
        int i13 = vVar.f11018b;
        long j3 = (f10 + 3) / 4;
        i iVar = (i) vVar.f11019c;
        if (4 * j3 <= iVar.d - i13) {
            vVar.f11018b = (((int) j3) * 4) + i13;
            float[] fArr = this.f54190u;
            int i14 = 2;
            if (fArr.length < f11) {
                this.f54190u = new float[Math.max(f11, fArr.length * 2)];
            }
            vVar.k(f11, this.f54190u);
            int i15 = 0;
            int i16 = 0;
            while (i15 < f10) {
                int i17 = iVar.f54247a.get(i13 + i15) & 255;
                if (i17 == 3) {
                    i7 = 6;
                } else if (i17 == i14) {
                    i7 = 4;
                } else if (i17 == 4) {
                    i7 = 0;
                } else {
                    i7 = i14;
                }
                int i18 = i7 + i16;
                if (i18 > f11) {
                    break;
                }
                if (i17 != 0) {
                    if (i17 != 1) {
                        if (i17 != i14) {
                            if (i17 != 3) {
                                if (i17 == 4) {
                                    path.close();
                                }
                                i10 = i15;
                                i11 = i14;
                                i12 = i18;
                            } else {
                                float[] fArr2 = this.f54190u;
                                int i19 = i16;
                                i11 = i14;
                                i12 = i18;
                                i10 = i15;
                                path.cubicTo(fArr2[i19], fArr2[i19 + 1], fArr2[i19 + 2], fArr2[i19 + 3], fArr2[i19 + 4], fArr2[i19 + 5]);
                            }
                        } else {
                            i10 = i15;
                            int i20 = i16;
                            i11 = i14;
                            i12 = i18;
                            float[] fArr3 = this.f54190u;
                            path.quadTo(fArr3[i20], fArr3[i20 + 1], fArr3[i20 + 2], fArr3[i20 + 3]);
                        }
                    } else {
                        i10 = i15;
                        int i21 = i16;
                        i11 = i14;
                        i12 = i18;
                        float[] fArr4 = this.f54190u;
                        path.lineTo(fArr4[i21], fArr4[i21 + 1]);
                    }
                } else {
                    i10 = i15;
                    int i22 = i16;
                    i11 = i14;
                    i12 = i18;
                    float[] fArr5 = this.f54190u;
                    path.moveTo(fArr5[i22], fArr5[i22 + 1]);
                }
                i15 = i10 + 1;
                i16 = i12;
                i14 = i11;
            }
            if (vVar.p() != 0) {
                fillType = Path.FillType.EVEN_ODD;
            } else {
                fillType = Path.FillType.WINDING;
            }
            path.setFillType(fillType);
            return;
        }
        throw i.a();
    }

    public final void k(RectF rectF, Path path) {
        float[] fArr;
        if (this.f54188s) {
            fArr = this.f54187r;
        } else {
            fArr = null;
        }
        path.rewind();
        if (fArr == null) {
            path.addRect(rectF, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
    }
}
