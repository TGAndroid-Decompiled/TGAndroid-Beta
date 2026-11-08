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
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import org.json.JSONArray;
public final class z0 {
    public final Paint f53010a = new Paint(1);
    public final Paint f53011b;
    public final Paint f53012c;
    public final Paint d;
    public final Path f53013e;
    public final Path f53014f;
    public final Path f53015g;
    public final RectF h;
    public final RectF f53016i;
    public final float[] f53017j;
    public final float[] f53018k;
    public final Matrix f53019l;
    public final HashMap f53020m;
    public final IdentityHashMap f53021n;
    public final float[] f53022o;
    public final RectF f53023p;
    public final RectF f53024q;
    public final float[] f53025r;
    public boolean f53026s;
    public boolean f53027t;
    public float[] f53028u;

    public z0() {
        Paint paint = new Paint(1);
        this.f53011b = paint;
        this.f53012c = new Paint(2);
        this.d = new Paint(1);
        this.f53013e = new Path();
        this.f53014f = new Path();
        this.f53015g = new Path();
        this.h = new RectF();
        new RectF();
        this.f53016i = new RectF();
        this.f53017j = new float[8];
        this.f53018k = new float[8];
        this.f53019l = new Matrix();
        this.f53020m = new HashMap();
        this.f53021n = new IdentityHashMap();
        this.f53022o = new float[9];
        this.f53023p = new RectF();
        this.f53024q = new RectF();
        this.f53025r = new float[8];
        this.f53028u = new float[64];
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

    public static r7 h(f5.u uVar) {
        int e10 = uVar.e(64, 5);
        r7 r7Var = new r7(e10);
        for (int i7 = 0; i7 < e10; i7++) {
            ((int[]) r7Var.f614b)[i7] = uVar.p();
            ((float[]) r7Var.d)[i7] = uVar.j();
            ((float[]) r7Var.f616e)[i7] = uVar.j();
            ((float[]) r7Var.f617f)[i7] = uVar.j();
            ((int[]) r7Var.f615c)[i7] = uVar.p();
        }
        return r7Var;
    }

    public static void j(f5.u uVar, int i7, int[] iArr, float[] fArr) {
        for (int i10 = 0; i10 < i7; i10++) {
            float max = Math.max(0.0f, Math.min(1.0f, uVar.j()));
            iArr[i10] = uVar.p();
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
        if (!this.f53026s) {
            path.addRect(rectF, Path.Direction.CW);
            return;
        }
        int i7 = 0;
        while (true) {
            float[] fArr = this.f53017j;
            if (i7 < 8) {
                fArr[i7] = Math.max(this.f53025r[i7] + f10, 0.0f);
                i7++;
            } else {
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                return;
            }
        }
    }

    public final void b(Canvas canvas, Paint paint) {
        float f10;
        if (this.f53026s) {
            float[] fArr = this.f53025r;
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
        RectF rectF = this.f53023p;
        if (i10 == 0) {
            canvas.drawRect(rectF, paint);
        } else if (i10 > 0) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            Path path = this.f53013e;
            k(rectF, path);
            canvas.drawPath(path, paint);
        }
    }

    public final void d(android.graphics.Canvas r50, org.telegram.utils.twidget.i r51, int r52, org.telegram.utils.twidget.y0 r53, float r54, boolean r55) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.z0.d(android.graphics.Canvas, org.telegram.utils.twidget.i, int, org.telegram.utils.twidget.y0, float, boolean):void");
    }

    public final void e(Canvas canvas, i iVar, y0 y0Var, float f10) {
        boolean z9;
        int i7;
        if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && iVar.f52828c) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i7 = canvas.saveLayer(null, null);
        } else {
            i7 = -1;
        }
        d(canvas, iVar, iVar.f52827b, y0Var, f10, true);
        if (z9) {
            canvas.restoreToCount(i7);
        }
    }

    public final Shader f(f5.u uVar, int i7) {
        float[] fArr = this.f53018k;
        uVar.k(7, fArr);
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        int e10 = uVar.e(4096, 2);
        int[] iArr = new int[Math.max(2, e10)];
        float[] fArr2 = e10 == 1 ? new float[]{0.0f, 1.0f} : new float[Math.max(e10, 2)];
        j(uVar, e10, iArr, fArr2);
        if (e10 < 2) {
            return null;
        }
        if (i7 == 1) {
            return new LinearGradient(f10, f11, f12, f13, iArr, fArr2, Shader.TileMode.CLAMP);
        }
        return new RadialGradient(f10, f11, Math.max(f14, 0.01f), iArr, fArr2, Shader.TileMode.CLAMP);
    }

    public final void g(a4.k kVar, float f10) {
        Object obj;
        int i7;
        int i10;
        x0 x0Var = (x0) org.telegram.ui.Cells.f1.k(1, (ArrayList) kVar.f194f);
        while (true) {
            int i11 = kVar.f191b;
            obj = x0Var.f53002c;
            if (obj == null && x0Var.f53004f == null) {
                i10 = x0Var.f53001b;
            } else {
                i10 = 0;
            }
            if (i11 <= i10) {
                break;
            }
            kVar.q();
        }
        if (obj != null) {
            w0.d(x0Var, f10);
            kVar.f192c = x0Var.f53000a;
        } else {
            Bitmap bitmap = x0Var.f53004f;
            if (bitmap != null) {
                r7 r7Var = x0Var.f53006i;
                int[] iArr = (int[]) r7Var.f614b;
                StringBuilder sb2 = new StringBuilder("[");
                for (i7 = 0; i7 < iArr.length; i7++) {
                    if (i7 > 0) {
                        sb2.append(',');
                    }
                    sb2.append('[');
                    sb2.append(iArr[i7]);
                    sb2.append(',');
                    sb2.append(((float[]) r7Var.d)[i7]);
                    sb2.append(',');
                    sb2.append(((float[]) r7Var.f616e)[i7]);
                    sb2.append(',');
                    sb2.append(((float[]) r7Var.f617f)[i7]);
                    sb2.append(',');
                    sb2.append(((int[]) r7Var.f615c)[i7] & 4294967295L);
                    sb2.append(']');
                }
                sb2.append(']');
                WidgetSandboxNative.filterPixels(bitmap, sb2.toString().getBytes(StandardCharsets.UTF_8), x0Var.h);
                kVar.f192c = x0Var.f53000a;
                Matrix matrix = new Matrix();
                if (x0Var.f53005g.invert(matrix)) {
                    ((Canvas) kVar.f192c).save();
                    ((Canvas) kVar.f192c).concat(matrix);
                    ((Canvas) kVar.f192c).drawBitmap(x0Var.f53004f, x0Var.d, x0Var.f53003e, this.f53012c);
                    ((Canvas) kVar.f192c).restore();
                }
            }
        }
        kVar.f191b = x0Var.f53001b;
    }

    public final void i(f5.u uVar, Path path) {
        Path.FillType fillType;
        int i7;
        int i10;
        int i11;
        int i12;
        path.rewind();
        int e10 = uVar.e(1048576, 0);
        int e11 = uVar.e(6291456, 1);
        int i13 = uVar.f11190b;
        long j3 = (e10 + 3) / 4;
        i iVar = (i) uVar.f11191c;
        if (4 * j3 <= iVar.d - i13) {
            uVar.f11190b = (((int) j3) * 4) + i13;
            float[] fArr = this.f53028u;
            int i14 = 2;
            if (fArr.length < e11) {
                this.f53028u = new float[Math.max(e11, fArr.length * 2)];
            }
            uVar.k(e11, this.f53028u);
            int i15 = 0;
            int i16 = 0;
            while (i15 < e10) {
                int i17 = iVar.f52826a.get(i13 + i15) & 255;
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
                if (i18 > e11) {
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
                                float[] fArr2 = this.f53028u;
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
                            float[] fArr3 = this.f53028u;
                            path.quadTo(fArr3[i20], fArr3[i20 + 1], fArr3[i20 + 2], fArr3[i20 + 3]);
                        }
                    } else {
                        i10 = i15;
                        int i21 = i16;
                        i11 = i14;
                        i12 = i18;
                        float[] fArr4 = this.f53028u;
                        path.lineTo(fArr4[i21], fArr4[i21 + 1]);
                    }
                } else {
                    i10 = i15;
                    int i22 = i16;
                    i11 = i14;
                    i12 = i18;
                    float[] fArr5 = this.f53028u;
                    path.moveTo(fArr5[i22], fArr5[i22 + 1]);
                }
                i15 = i10 + 1;
                i16 = i12;
                i14 = i11;
            }
            if (uVar.p() != 0) {
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
        if (this.f53026s) {
            fArr = this.f53025r;
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
