package xh;

import ag.d0;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import d5.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import m4.w1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.d3;
public final class i {
    public static i f51943q;
    public Bitmap e;
    public Canvas f51947f;
    public Paint f51948g;
    public long h;
    public ArrayList f51949i;
    public boolean f51950j;
    public final int f51951k;
    public boolean f51952l;
    public boolean f51956p;
    public final DispatchQueue f51944a = new DispatchQueue("SpoilerEffectBitmapFactory", true, 3);
    public final z[] f51945b = new z[g.C.length];
    public final w1[] f51946c = new w1[2];
    public int d = 0;
    public final Rect f51953m = new Rect();
    public final d0 f51954n = new d0(this, 3);
    public final Rect f51955o = new Rect();

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
        this.f51951k = min < AndroidUtilities.dp(80.0f) ? AndroidUtilities.dp(80.0f) : min;
        int i10 = 0;
        while (true) {
            z[] zVarArr = this.f51945b;
            if (i10 < zVarArr.length) {
                z zVar = new z(16, false, false);
                zVar.f8027c = new float[Math.max(64, 2)];
                zVar.f8026b = 0;
                zVarArr[i10] = zVar;
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
        z[] zVarArr = this.f51945b;
        for (z zVar : zVarArr) {
            zVar.f8026b = 0;
        }
        int i14 = 0;
        while (i14 < 100) {
            g gVar = (g) this.f51949i.get(i14);
            if (Rect.intersects(gVar.getBounds(), rect2)) {
                float[][] fArr = g.D;
                int[] iArr = gVar.f51921f;
                float[] fArr2 = gVar.e;
                if (zVarArr != null) {
                    int length = zVarArr.length;
                    float[] fArr3 = g.C;
                    if (length == fArr3.length) {
                        long currentTimeMillis = System.currentTimeMillis();
                        gVar.f51924j = currentTimeMillis;
                        ArrayList arrayList = gVar.h;
                        Stack stack = gVar.f51920c;
                        int i15 = gVar.d;
                        int length2 = fArr3.length;
                        Rect bounds = gVar.getBounds();
                        float f11 = bounds.left;
                        float f12 = bounds.top;
                        i10 = i14;
                        float width = bounds.width();
                        float height = bounds.height();
                        RectF rectF = gVar.f51939z;
                        float f13 = rectF.left;
                        float f14 = rectF.top;
                        float f15 = rectF.right;
                        float f16 = rectF.bottom;
                        float dpf2 = AndroidUtilities.dpf2(1.0f);
                        float f17 = rect2.left - dpf2;
                        float f18 = rect2.top - dpf2;
                        float f19 = rect2.right + dpf2;
                        float f20 = rect2.bottom + dpf2;
                        float min = (int) Math.min(currentTimeMillis - gVar.f51924j, 34L);
                        float f21 = min / 500.0f;
                        int size = arrayList.size();
                        int i16 = 0;
                        while (i16 < size) {
                            int i17 = size;
                            c cVar2 = (c) arrayList.get(i16);
                            float f22 = f20;
                            float f23 = f15;
                            float min2 = Math.min(cVar2.f51894g + min, cVar2.f51893f);
                            cVar2.f51894g = min2;
                            float f24 = cVar2.f51890a;
                            float f25 = cVar2.f51891b;
                            if (f24 >= f13 && f24 <= f23 && f25 >= f14 && f25 <= f16) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (min2 < cVar2.f51893f && !z10) {
                                float f26 = cVar2.e * f21;
                                cVar2.f51890a = (cVar2.f51892c * f26) + f24;
                                cVar2.f51891b = (cVar2.d * f26) + f25;
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
                                    cVar.f51890a = d3.f(Utilities.fastRandom, width, f11);
                                    float f33 = d3.f(Utilities.fastRandom, height, f30);
                                    cVar.f51891b = f33;
                                    int i25 = i24 + 1;
                                    f10 = width;
                                    float f34 = cVar.f51890a;
                                    if ((f34 < f13 || f34 > f28 || f33 < f14 || f33 > f16) && i25 < 4) {
                                        width = f10;
                                        i24 = i25;
                                    }
                                }
                                float f35 = f30;
                                double d = ((f32 * 3.141592653589793d) * 2.0d) - 3.141592653589793d;
                                cVar.f51892c = (float) Math.cos(d);
                                cVar.d = (float) Math.sin(d);
                                cVar.f51894g = 0.0f;
                                cVar.f51893f = Utilities.fastRandom.nextInt(2000) + 1000;
                                cVar.e = (f32 * 6.0f) + 4.0f;
                                cVar.h = Utilities.fastRandom.nextInt(length2);
                                arrayList.add(cVar);
                                i21++;
                                width = f10;
                                f30 = f35;
                                i20 = 14;
                                f29 = -1.0f;
                            }
                            size2 = arrayList.size();
                        }
                        for (int i26 = 0; i26 < length2; i26++) {
                            iArr[i26] = 0;
                        }
                        int i27 = gVar.f51937x;
                        int i28 = 0;
                        while (i28 < size2) {
                            c cVar3 = (c) arrayList.get(i28);
                            float f36 = cVar3.f51890a;
                            float f37 = cVar3.f51891b;
                            if (f36 >= f17 && f36 <= f19 && f37 >= f18 && f37 <= f27) {
                                int i29 = cVar3.h;
                                float[] fArr4 = fArr[i29];
                                int i30 = iArr[i29];
                                int i31 = i30 + 1;
                                if (i31 < fArr4.length) {
                                    fArr4[i30] = f36;
                                    fArr4[i31] = f37;
                                    int i32 = i30 + 2;
                                    float f38 = gVar.f51919b[i29];
                                    if (f36 < f38) {
                                        int i33 = i30 + 3;
                                        i11 = size2;
                                        if (i33 < fArr4.length) {
                                            fArr4[i32] = i27 + f36;
                                            fArr4[i33] = f37;
                                            i32 = i30 + 4;
                                        }
                                    } else {
                                        i11 = size2;
                                    }
                                    float f39 = i27;
                                    float f40 = f39 - f38;
                                    if (f36 > f40) {
                                        int i34 = i32 + 1;
                                        f7 = f39;
                                        if (i34 < fArr4.length) {
                                            fArr4[i32] = f36 - f7;
                                            fArr4[i34] = f37;
                                            i32 += 2;
                                        }
                                    } else {
                                        f7 = f39;
                                    }
                                    if (f37 < f38 && (i13 = i32 + 1) < fArr4.length) {
                                        fArr4[i32] = f36;
                                        fArr4[i13] = f37 + f7;
                                        i32 += 2;
                                    }
                                    if (f37 > f40 && (i12 = i32 + 1) < fArr4.length) {
                                        fArr4[i32] = f36;
                                        fArr4[i12] = f37 - f7;
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
                            z zVar2 = zVarArr[i35];
                            float[] fArr5 = fArr[i35];
                            int i36 = iArr[i35];
                            int i37 = zVar2.f8026b + i36;
                            float[] fArr6 = (float[]) zVar2.f8027c;
                            if (i37 > fArr6.length) {
                                zVar2.f8027c = Arrays.copyOf((float[]) zVar2.f8027c, Math.max(i37, fArr6.length * 2));
                            }
                            System.arraycopy(fArr5, 0, (float[]) zVar2.f8027c, zVar2.f8026b, i36);
                            zVar2.f8026b += i36;
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
        g gVar2 = (g) this.f51949i.get(0);
        gVar2.getClass();
        float[] fArr7 = g.C;
        if (zVarArr != null && zVarArr.length == fArr7.length) {
            for (int i38 = 0; i38 < fArr7.length; i38++) {
                z zVar3 = zVarArr[i38];
                Paint paint = gVar2.f51918a[i38];
                int i39 = zVar3.f8026b;
                if (i39 > 0) {
                    canvas.drawPoints((float[]) zVar3.f8027c, 0, i39, paint);
                }
            }
        }
    }
}
