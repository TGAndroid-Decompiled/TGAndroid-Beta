package vh;

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
import n7.z0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
public final class i {
    public static i f49793q;
    public Bitmap f49797e;
    public Canvas f49798f;
    public Paint f49799g;
    public long h;
    public ArrayList f49800i;
    public boolean f49801j;
    public final int f49802k;
    public boolean f49803l;
    public boolean f49807p;
    public final DispatchQueue f49794a = new DispatchQueue("SpoilerEffectBitmapFactory", true, 3);
    public final b0[] f49795b = new b0[g.C.length];
    public final z0[] f49796c = new z0[2];
    public int d = 0;
    public final Rect f49804m = new Rect();
    public final qf.b f49805n = new qf.b(this, 2);
    public final Rect f49806o = new Rect();

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
        this.f49802k = min < AndroidUtilities.dp(80.0f) ? AndroidUtilities.dp(80.0f) : min;
        int i10 = 0;
        while (true) {
            b0[] b0VarArr = this.f49795b;
            if (i10 < b0VarArr.length) {
                b0 b0Var = new b0(12, false, false);
                b0Var.f4203c = new float[Math.max(64, 2)];
                b0Var.f4202b = 0;
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
        float f7;
        int i12;
        int i13;
        c cVar;
        float f10;
        boolean z10;
        Rect rect2 = rect;
        b0[] b0VarArr = this.f49795b;
        for (b0 b0Var : b0VarArr) {
            b0Var.f4202b = 0;
        }
        int i14 = 0;
        while (i14 < 100) {
            g gVar = (g) this.f49800i.get(i14);
            if (Rect.intersects(gVar.getBounds(), rect2)) {
                float[][] fArr = g.D;
                int[] iArr2 = gVar.f49771f;
                float[] fArr2 = gVar.f49770e;
                if (b0VarArr != null) {
                    int length = b0VarArr.length;
                    float[] fArr3 = g.C;
                    if (length == fArr3.length) {
                        long currentTimeMillis = System.currentTimeMillis();
                        gVar.f49774j = currentTimeMillis;
                        ArrayList arrayList = gVar.h;
                        Stack stack = gVar.f49769c;
                        int i15 = gVar.d;
                        int length2 = fArr3.length;
                        Rect bounds = gVar.getBounds();
                        float f11 = bounds.left;
                        float f12 = bounds.top;
                        i10 = i14;
                        float width = bounds.width();
                        float height = bounds.height();
                        RectF rectF = gVar.f49789z;
                        float f13 = rectF.left;
                        float f14 = rectF.top;
                        float f15 = rectF.right;
                        float f16 = rectF.bottom;
                        float dpf2 = AndroidUtilities.dpf2(1.0f);
                        float f17 = rect2.left - dpf2;
                        float f18 = rect2.top - dpf2;
                        float f19 = rect2.right + dpf2;
                        float f20 = rect2.bottom + dpf2;
                        float min = (int) Math.min(currentTimeMillis - gVar.f49774j, 34L);
                        float f21 = min / 500.0f;
                        int size = arrayList.size();
                        int i16 = 0;
                        while (i16 < size) {
                            int i17 = size;
                            c cVar2 = (c) arrayList.get(i16);
                            float f22 = min;
                            float f23 = f15;
                            float min2 = Math.min(cVar2.f49741g + f22, cVar2.f49740f);
                            cVar2.f49741g = min2;
                            float f24 = cVar2.f49736a;
                            float f25 = cVar2.f49737b;
                            if (f24 >= f13 && f24 <= f23 && f25 >= f14 && f25 <= f16) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (min2 < cVar2.f49740f && !z10) {
                                float f26 = cVar2.f49739e * f21;
                                cVar2.f49736a = (cVar2.f49738c * f26) + f24;
                                cVar2.f49737b = (cVar2.d * f26) + f25;
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
                            min = f22;
                            f15 = f23;
                        }
                        float f27 = f15;
                        int size2 = arrayList.size();
                        if (size2 < i15) {
                            int i19 = i15 - size2;
                            int i20 = 14;
                            float f28 = -1.0f;
                            Arrays.fill(fArr2, 0, Math.min(i19, 14), -1.0f);
                            float f29 = f12;
                            int i21 = 0;
                            int i22 = 0;
                            while (i21 < i19) {
                                float f30 = fArr2[i22];
                                if (f30 == f28) {
                                    f30 = Utilities.fastRandom.nextFloat();
                                    fArr2[i22] = f30;
                                }
                                float f31 = f30;
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
                                    cVar.f49736a = (Utilities.fastRandom.nextFloat() * width) + f11;
                                    float nextFloat = (Utilities.fastRandom.nextFloat() * height) + f29;
                                    cVar.f49737b = nextFloat;
                                    int i25 = i24 + 1;
                                    f10 = f29;
                                    float f32 = cVar.f49736a;
                                    if ((f32 < f13 || f32 > f27 || nextFloat < f14 || nextFloat > f16) && i25 < 4) {
                                        f29 = f10;
                                        i24 = i25;
                                    }
                                }
                                int i26 = i21;
                                int[] iArr3 = iArr2;
                                double d = ((f31 * 3.141592653589793d) * 2.0d) - 3.141592653589793d;
                                cVar.f49738c = (float) Math.cos(d);
                                cVar.d = (float) Math.sin(d);
                                cVar.f49741g = 0.0f;
                                cVar.f49740f = Utilities.fastRandom.nextInt(2000) + 1000;
                                cVar.f49739e = (f31 * 6.0f) + 4.0f;
                                cVar.h = Utilities.fastRandom.nextInt(length2);
                                arrayList.add(cVar);
                                i21 = i26 + 1;
                                f29 = f10;
                                iArr2 = iArr3;
                                i20 = 14;
                                f28 = -1.0f;
                            }
                            iArr = iArr2;
                            size2 = arrayList.size();
                        } else {
                            iArr = iArr2;
                        }
                        for (int i27 = 0; i27 < length2; i27++) {
                            iArr[i27] = 0;
                        }
                        int i28 = gVar.f49787x;
                        int i29 = 0;
                        while (i29 < size2) {
                            c cVar3 = (c) arrayList.get(i29);
                            float f33 = cVar3.f49736a;
                            float f34 = cVar3.f49737b;
                            if (f33 >= f17 && f33 <= f19 && f34 >= f18 && f34 <= f20) {
                                int i30 = cVar3.h;
                                float[] fArr4 = fArr[i30];
                                int i31 = iArr[i30];
                                int i32 = i31 + 1;
                                if (i32 < fArr4.length) {
                                    fArr4[i31] = f33;
                                    fArr4[i32] = f34;
                                    int i33 = i31 + 2;
                                    float f35 = gVar.f49768b[i30];
                                    if (f33 < f35) {
                                        int i34 = i31 + 3;
                                        i11 = size2;
                                        if (i34 < fArr4.length) {
                                            fArr4[i33] = i28 + f33;
                                            fArr4[i34] = f34;
                                            i33 = i31 + 4;
                                        }
                                    } else {
                                        i11 = size2;
                                    }
                                    float f36 = i28;
                                    float f37 = f36 - f35;
                                    if (f33 > f37) {
                                        int i35 = i33 + 1;
                                        f7 = f36;
                                        if (i35 < fArr4.length) {
                                            fArr4[i33] = f33 - f7;
                                            fArr4[i35] = f34;
                                            i33 += 2;
                                        }
                                    } else {
                                        f7 = f36;
                                    }
                                    if (f34 < f35 && (i13 = i33 + 1) < fArr4.length) {
                                        fArr4[i33] = f33;
                                        fArr4[i13] = f34 + f7;
                                        i33 += 2;
                                    }
                                    if (f34 > f37 && (i12 = i33 + 1) < fArr4.length) {
                                        fArr4[i33] = f33;
                                        fArr4[i12] = f34 - f7;
                                        i33 += 2;
                                    }
                                    iArr[i30] = i33;
                                    i29++;
                                    size2 = i11;
                                }
                            }
                            i11 = size2;
                            i29++;
                            size2 = i11;
                        }
                        for (int i36 = 0; i36 < length2; i36++) {
                            b0 b0Var2 = b0VarArr[i36];
                            float[] fArr5 = fArr[i36];
                            int i37 = iArr[i36];
                            int i38 = b0Var2.f4202b + i37;
                            float[] fArr6 = (float[]) b0Var2.f4203c;
                            if (i38 > fArr6.length) {
                                b0Var2.f4203c = Arrays.copyOf((float[]) b0Var2.f4203c, Math.max(i38, fArr6.length * 2));
                            }
                            System.arraycopy(fArr5, 0, (float[]) b0Var2.f4203c, b0Var2.f4202b, i37);
                            b0Var2.f4202b += i37;
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
        g gVar2 = (g) this.f49800i.get(0);
        gVar2.getClass();
        float[] fArr7 = g.C;
        if (b0VarArr != null && b0VarArr.length == fArr7.length) {
            for (int i39 = 0; i39 < fArr7.length; i39++) {
                b0 b0Var3 = b0VarArr[i39];
                Paint paint = gVar2.f49767a[i39];
                int i40 = b0Var3.f4202b;
                if (i40 > 0) {
                    canvas.drawPoints((float[]) b0Var3.f4203c, 0, i40, paint);
                }
            }
        }
    }
}
