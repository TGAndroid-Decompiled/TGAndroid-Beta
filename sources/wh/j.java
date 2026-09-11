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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
public final class j {
    public static j f48639q;
    public Bitmap f48643e;
    public Canvas f48644f;
    public Paint f48645g;
    public long h;
    public ArrayList f48646i;
    public boolean f48647j;
    public final int f48648k;
    public boolean f48649l;
    public boolean f48653p;
    public final DispatchQueue f48640a = new DispatchQueue("SpoilerEffectBitmapFactory", true, 3);
    public final b0[] f48641b = new b0[h.C.length];
    public final o0.a[] f48642c = new o0.a[2];
    public int d = 0;
    public final Rect f48650m = new Rect();
    public final qf.b f48651n = new qf.b(this, 2);
    public final Rect f48652o = new Rect();

    public j() {
        float f7;
        if (SharedConfig.getDevicePerformanceClass() == 2) {
            f7 = 150.0f;
        } else {
            f7 = 100.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        Point point = AndroidUtilities.displaySize;
        int min = (int) Math.min(Math.min(point.x, point.y) * 0.5f, dp);
        this.f48648k = min < AndroidUtilities.dp(80.0f) ? AndroidUtilities.dp(80.0f) : min;
        int i10 = 0;
        while (true) {
            b0[] b0VarArr = this.f48641b;
            if (i10 < b0VarArr.length) {
                b0 b0Var = new b0((char) 0, 9);
                b0Var.f4347c = new float[Math.max(64, 2)];
                b0Var.f4346b = 0;
                b0VarArr[i10] = b0Var;
                i10++;
            } else {
                return;
            }
        }
    }

    public final void a(Canvas canvas, Rect rect) {
        int i10;
        int[] iArr;
        int i11;
        int[] iArr2;
        float f7;
        int i12;
        int i13;
        c cVar;
        float f10;
        boolean z10;
        Rect rect2 = rect;
        b0[] b0VarArr = this.f48641b;
        for (b0 b0Var : b0VarArr) {
            b0Var.f4346b = 0;
        }
        int i14 = 0;
        while (i14 < 100) {
            h hVar = (h) this.f48646i.get(i14);
            if (Rect.intersects(hVar.getBounds(), rect2)) {
                float[][] fArr = h.D;
                int[] iArr3 = hVar.f48617f;
                float[] fArr2 = hVar.f48616e;
                if (b0VarArr != null) {
                    int length = b0VarArr.length;
                    float[] fArr3 = h.C;
                    if (length == fArr3.length) {
                        long currentTimeMillis = System.currentTimeMillis();
                        int min = (int) Math.min(currentTimeMillis - hVar.f48620j, 34L);
                        hVar.f48620j = currentTimeMillis;
                        ArrayList arrayList = hVar.h;
                        Stack stack = hVar.f48615c;
                        int i15 = hVar.d;
                        int length2 = fArr3.length;
                        Rect bounds = hVar.getBounds();
                        float f11 = bounds.left;
                        float f12 = bounds.top;
                        i10 = i14;
                        float width = bounds.width();
                        float height = bounds.height();
                        RectF rectF = hVar.f48635z;
                        float f13 = rectF.left;
                        float f14 = rectF.top;
                        float f15 = rectF.right;
                        float f16 = rectF.bottom;
                        float dpf2 = AndroidUtilities.dpf2(1.0f);
                        float f17 = rect2.left - dpf2;
                        float f18 = rect2.top - dpf2;
                        float f19 = rect2.right + dpf2;
                        float f20 = rect2.bottom + dpf2;
                        float f21 = min;
                        float f22 = f21 / 500.0f;
                        int size = arrayList.size();
                        int i16 = 0;
                        while (i16 < size) {
                            int i17 = size;
                            c cVar2 = (c) arrayList.get(i16);
                            float f23 = f21;
                            float f24 = f15;
                            float min2 = Math.min(cVar2.f48586g + f23, cVar2.f48585f);
                            cVar2.f48586g = min2;
                            float f25 = cVar2.f48581a;
                            float f26 = cVar2.f48582b;
                            if (f25 >= f13 && f25 <= f24 && f26 >= f14 && f26 <= f16) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (min2 < cVar2.f48585f && !z10) {
                                float f27 = cVar2.f48584e * f22;
                                cVar2.f48581a = (cVar2.f48583c * f27) + f25;
                                cVar2.f48582b = (cVar2.d * f27) + f26;
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
                            f21 = f23;
                            f15 = f24;
                        }
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
                                    cVar.f48581a = (Utilities.fastRandom.nextFloat() * width) + f11;
                                    float nextFloat = (Utilities.fastRandom.nextFloat() * height) + f30;
                                    cVar.f48582b = nextFloat;
                                    int i25 = i24 + 1;
                                    f10 = f30;
                                    float f33 = cVar.f48581a;
                                    if ((f33 < f13 || f33 > f28 || nextFloat < f14 || nextFloat > f16) && i25 < 4) {
                                        f30 = f10;
                                        i24 = i25;
                                    }
                                }
                                int i26 = i21;
                                int[] iArr4 = iArr3;
                                double d = ((f32 * 3.141592653589793d) * 2.0d) - 3.141592653589793d;
                                cVar.f48583c = (float) Math.cos(d);
                                cVar.d = (float) Math.sin(d);
                                cVar.f48586g = 0.0f;
                                cVar.f48585f = Utilities.fastRandom.nextInt(2000) + 1000;
                                cVar.f48584e = (f32 * 6.0f) + 4.0f;
                                cVar.h = Utilities.fastRandom.nextInt(length2);
                                arrayList.add(cVar);
                                i21 = i26 + 1;
                                iArr3 = iArr4;
                                f30 = f10;
                                i20 = 14;
                                f29 = -1.0f;
                            }
                            iArr = iArr3;
                            size2 = arrayList.size();
                        } else {
                            iArr = iArr3;
                        }
                        for (int i27 = 0; i27 < length2; i27++) {
                            iArr[i27] = 0;
                        }
                        int i28 = hVar.f48633x;
                        int i29 = 0;
                        while (i29 < size2) {
                            c cVar3 = (c) arrayList.get(i29);
                            float f34 = cVar3.f48581a;
                            float f35 = cVar3.f48582b;
                            if (f34 >= f17 && f34 <= f19 && f35 >= f18 && f35 <= f20) {
                                int i30 = cVar3.h;
                                float[] fArr4 = fArr[i30];
                                int i31 = iArr[i30];
                                int i32 = i31 + 1;
                                if (i32 < fArr4.length) {
                                    fArr4[i31] = f34;
                                    fArr4[i32] = f35;
                                    int i33 = i31 + 2;
                                    float f36 = hVar.f48614b[i30];
                                    if (f34 < f36) {
                                        i11 = size2;
                                        int i34 = i31 + 3;
                                        iArr2 = iArr;
                                        if (i34 < fArr4.length) {
                                            fArr4[i33] = i28 + f34;
                                            fArr4[i34] = f35;
                                            i33 = i31 + 4;
                                        }
                                    } else {
                                        i11 = size2;
                                        iArr2 = iArr;
                                    }
                                    float f37 = i28;
                                    float f38 = f37 - f36;
                                    if (f34 > f38) {
                                        int i35 = i33 + 1;
                                        f7 = f37;
                                        if (i35 < fArr4.length) {
                                            fArr4[i33] = f34 - f7;
                                            fArr4[i35] = f35;
                                            i33 += 2;
                                        }
                                    } else {
                                        f7 = f37;
                                    }
                                    if (f35 < f36 && (i13 = i33 + 1) < fArr4.length) {
                                        fArr4[i33] = f34;
                                        fArr4[i13] = f35 + f7;
                                        i33 += 2;
                                    }
                                    if (f35 > f38 && (i12 = i33 + 1) < fArr4.length) {
                                        fArr4[i33] = f34;
                                        fArr4[i12] = f35 - f7;
                                        i33 += 2;
                                    }
                                    iArr2[i30] = i33;
                                    i29++;
                                    size2 = i11;
                                    iArr = iArr2;
                                }
                            }
                            i11 = size2;
                            iArr2 = iArr;
                            i29++;
                            size2 = i11;
                            iArr = iArr2;
                        }
                        int[] iArr5 = iArr;
                        for (int i36 = 0; i36 < length2; i36++) {
                            b0 b0Var2 = b0VarArr[i36];
                            float[] fArr5 = fArr[i36];
                            int i37 = iArr5[i36];
                            int i38 = b0Var2.f4346b + i37;
                            float[] fArr6 = (float[]) b0Var2.f4347c;
                            if (i38 > fArr6.length) {
                                b0Var2.f4347c = Arrays.copyOf((float[]) b0Var2.f4347c, Math.max(i38, fArr6.length * 2));
                            }
                            System.arraycopy(fArr5, 0, (float[]) b0Var2.f4347c, b0Var2.f4346b, i37);
                            b0Var2.f4346b += i37;
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
        h hVar2 = (h) this.f48646i.get(0);
        hVar2.getClass();
        float[] fArr7 = h.C;
        if (b0VarArr != null && b0VarArr.length == fArr7.length) {
            for (int i39 = 0; i39 < fArr7.length; i39++) {
                b0 b0Var3 = b0VarArr[i39];
                Paint paint = hVar2.f48613a[i39];
                int i40 = b0Var3.f4346b;
                if (i40 > 0) {
                    canvas.drawPoints((float[]) b0Var3.f4347c, 0, i40, paint);
                }
            }
        }
    }
}
