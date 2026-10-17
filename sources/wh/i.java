package wh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import c5.b0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import mi.q;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.t0;
public final class i {
    public static i f49093q;
    public Bitmap e;
    public Canvas f49097f;
    public Paint f49098g;
    public long h;
    public ArrayList f49099i;
    public boolean f49100j;
    public final int f49101k;
    public boolean f49102l;
    public boolean f49106p;
    public final DispatchQueue f49094a = new DispatchQueue("SpoilerEffectBitmapFactory", true, 3);
    public final b0[] f49095b = new b0[g.C.length];
    public final q[] f49096c = new q[2];
    public int d = 0;
    public final Rect f49103m = new Rect();
    public final r4.e f49104n = new r4.e(this, 2);
    public final Rect f49105o = new Rect();

    public i() {
        float f7;
        if (SharedConfig.getDevicePerformanceClass() == 2) {
            f7 = 150.0f;
        } else {
            f7 = 100.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        Point point = AndroidUtilities.displaySize;
        int min = (int) Math.min(Math.min(point.x, point.y) * 0.5f, dp);
        this.f49101k = min < AndroidUtilities.dp(80.0f) ? AndroidUtilities.dp(80.0f) : min;
        int i10 = 0;
        while (true) {
            b0[] b0VarArr = this.f49095b;
            if (i10 < b0VarArr.length) {
                b0 b0Var = new b0(15, false, false);
                b0Var.f4703c = new float[Math.max(64, 2)];
                b0Var.f4702b = 0;
                b0VarArr[i10] = b0Var;
                i10++;
            } else {
                return;
            }
        }
    }

    public final void a(Canvas canvas, Rect rect) {
        int i10;
        int i11;
        float f7;
        int i12;
        int i13;
        c cVar;
        float f10;
        boolean z10;
        Rect rect2 = rect;
        b0[] b0VarArr = this.f49095b;
        for (b0 b0Var : b0VarArr) {
            b0Var.f4702b = 0;
        }
        int i14 = 0;
        while (i14 < 100) {
            g gVar = (g) this.f49099i.get(i14);
            if (Rect.intersects(gVar.getBounds(), rect2)) {
                float[][] fArr = g.D;
                int[] iArr = gVar.f49071f;
                float[] fArr2 = gVar.e;
                if (b0VarArr != null) {
                    int length = b0VarArr.length;
                    float[] fArr3 = g.C;
                    if (length == fArr3.length) {
                        long currentTimeMillis = System.currentTimeMillis();
                        gVar.f49074j = currentTimeMillis;
                        ArrayList arrayList = gVar.h;
                        Stack stack = gVar.f49070c;
                        int i15 = gVar.d;
                        int length2 = fArr3.length;
                        Rect bounds = gVar.getBounds();
                        float f11 = bounds.left;
                        float f12 = bounds.top;
                        i10 = i14;
                        float width = bounds.width();
                        float height = bounds.height();
                        RectF rectF = gVar.f49089z;
                        float f13 = rectF.left;
                        float f14 = rectF.top;
                        float f15 = rectF.right;
                        float f16 = rectF.bottom;
                        float dpf2 = AndroidUtilities.dpf2(1.0f);
                        float f17 = rect2.left - dpf2;
                        float f18 = rect2.top - dpf2;
                        float f19 = rect2.right + dpf2;
                        float f20 = rect2.bottom + dpf2;
                        float min = (int) Math.min(currentTimeMillis - gVar.f49074j, 34L);
                        float f21 = min / 500.0f;
                        int size = arrayList.size();
                        int i16 = 0;
                        while (i16 < size) {
                            int i17 = size;
                            c cVar2 = (c) arrayList.get(i16);
                            float f22 = f20;
                            float f23 = f15;
                            float min2 = Math.min(cVar2.f49044g + min, cVar2.f49043f);
                            cVar2.f49044g = min2;
                            float f24 = cVar2.f49040a;
                            float f25 = cVar2.f49041b;
                            if (f24 >= f13 && f24 <= f23 && f25 >= f14 && f25 <= f16) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (min2 < cVar2.f49043f && !z10) {
                                float f26 = cVar2.e * f21;
                                cVar2.f49040a = (cVar2.f49042c * f26) + f24;
                                cVar2.f49041b = (cVar2.d * f26) + f25;
                                size = i17;
                            } else {
                                if (stack.size() < i15) {
                                    stack.push(cVar2);
                                }
                                int i18 = i17 - 1;
                                if (i16 != i18) {
                                    arrayList.set(i16, (c) arrayList.get(i18));
                                }
                                arrayList.remove(i18);
                                size = i17 - 1;
                                i16--;
                            }
                            i16++;
                            f20 = f22;
                            f15 = f23;
                        }
                        float f27 = f20;
                        float f28 = f15;
                        int size2 = arrayList.size();
                        if (size2 < i15) {
                            int i19 = i15 - size2;
                            int i20 = 14;
                            float f29 = -1.0f;
                            Arrays.fill(fArr2, 0, Math.min(i19, 14), -1.0f);
                            float f30 = f12;
                            int i21 = 0;
                            int i22 = 0;
                            while (i21 < i19) {
                                float f31 = fArr2[i22];
                                if (f31 == f29) {
                                    f31 = Utilities.fastRandom.nextFloat();
                                    fArr2[i22] = f31;
                                }
                                float f32 = f31;
                                int i23 = i22 + 1;
                                if (i23 == i20) {
                                    i22 = 0;
                                } else {
                                    i22 = i23;
                                }
                                if (!stack.isEmpty()) {
                                    cVar = (c) stack.pop();
                                } else {
                                    cVar = new Object();
                                }
                                int i24 = 0;
                                while (true) {
                                    cVar.f49040a = t0.d(Utilities.fastRandom, width, f11);
                                    float d = t0.d(Utilities.fastRandom, height, f30);
                                    cVar.f49041b = d;
                                    int i25 = i24 + 1;
                                    f10 = width;
                                    float f33 = cVar.f49040a;
                                    if ((f33 < f13 || f33 > f28 || d < f14 || d > f16) && i25 < 4) {
                                        width = f10;
                                        i24 = i25;
                                    }
                                }
                                float f34 = f30;
                                double d10 = ((f32 * 3.141592653589793d) * 2.0d) - 3.141592653589793d;
                                cVar.f49042c = (float) Math.cos(d10);
                                cVar.d = (float) Math.sin(d10);
                                cVar.f49044g = 0.0f;
                                cVar.f49043f = Utilities.fastRandom.nextInt(2000) + 1000;
                                cVar.e = (f32 * 6.0f) + 4.0f;
                                cVar.h = Utilities.fastRandom.nextInt(length2);
                                arrayList.add(cVar);
                                i21++;
                                width = f10;
                                f30 = f34;
                                i20 = 14;
                                f29 = -1.0f;
                            }
                            size2 = arrayList.size();
                        }
                        for (int i26 = 0; i26 < length2; i26++) {
                            iArr[i26] = 0;
                        }
                        int i27 = gVar.f49087x;
                        int i28 = 0;
                        while (i28 < size2) {
                            c cVar3 = (c) arrayList.get(i28);
                            float f35 = cVar3.f49040a;
                            float f36 = cVar3.f49041b;
                            if (f35 >= f17 && f35 <= f19 && f36 >= f18 && f36 <= f27) {
                                int i29 = cVar3.h;
                                float[] fArr4 = fArr[i29];
                                int i30 = iArr[i29];
                                int i31 = i30 + 1;
                                if (i31 < fArr4.length) {
                                    fArr4[i30] = f35;
                                    fArr4[i31] = f36;
                                    int i32 = i30 + 2;
                                    float f37 = gVar.f49069b[i29];
                                    if (f35 < f37) {
                                        int i33 = i30 + 3;
                                        i11 = size2;
                                        if (i33 < fArr4.length) {
                                            fArr4[i32] = i27 + f35;
                                            fArr4[i33] = f36;
                                            i32 = i30 + 4;
                                        }
                                    } else {
                                        i11 = size2;
                                    }
                                    float f38 = i27;
                                    float f39 = f38 - f37;
                                    if (f35 > f39) {
                                        int i34 = i32 + 1;
                                        f7 = f38;
                                        if (i34 < fArr4.length) {
                                            fArr4[i32] = f35 - f7;
                                            fArr4[i34] = f36;
                                            i32 += 2;
                                        }
                                    } else {
                                        f7 = f38;
                                    }
                                    if (f36 < f37 && (i13 = i32 + 1) < fArr4.length) {
                                        fArr4[i32] = f35;
                                        fArr4[i13] = f36 + f7;
                                        i32 += 2;
                                    }
                                    if (f36 > f39 && (i12 = i32 + 1) < fArr4.length) {
                                        fArr4[i32] = f35;
                                        fArr4[i12] = f36 - f7;
                                        i32 += 2;
                                    }
                                    iArr[i29] = i32;
                                    i28++;
                                    size2 = i11;
                                }
                            }
                            i11 = size2;
                            i28++;
                            size2 = i11;
                        }
                        for (int i35 = 0; i35 < length2; i35++) {
                            b0 b0Var2 = b0VarArr[i35];
                            float[] fArr5 = fArr[i35];
                            int i36 = iArr[i35];
                            int i37 = b0Var2.f4702b + i36;
                            float[] fArr6 = (float[]) b0Var2.f4703c;
                            if (i37 > fArr6.length) {
                                b0Var2.f4703c = Arrays.copyOf((float[]) b0Var2.f4703c, Math.max(i37, fArr6.length * 2));
                            }
                            System.arraycopy(fArr5, 0, (float[]) b0Var2.f4703c, b0Var2.f4702b, i36);
                            b0Var2.f4702b += i36;
                        }
                        i14 = i10 + 1;
                        rect2 = rect;
                    }
                }
            }
            i10 = i14;
            i14 = i10 + 1;
            rect2 = rect;
        }
        g gVar2 = (g) this.f49099i.get(0);
        gVar2.getClass();
        float[] fArr7 = g.C;
        if (b0VarArr != null && b0VarArr.length == fArr7.length) {
            for (int i38 = 0; i38 < fArr7.length; i38++) {
                b0 b0Var3 = b0VarArr[i38];
                Paint paint = gVar2.f49068a[i38];
                int i39 = b0Var3.f4702b;
                if (i39 > 0) {
                    canvas.drawPoints((float[]) b0Var3.f4703c, 0, i39, paint);
                }
            }
        }
    }
}
