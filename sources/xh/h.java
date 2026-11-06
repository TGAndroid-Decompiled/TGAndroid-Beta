package xh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import bg.y;
import f5.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.iz;
import org.telegram.messenger.q5;
public final class h {
    public static h f58696q;
    public Bitmap f58700e;
    public Canvas f58701f;
    public Paint f58702g;
    public long h;
    public ArrayList f58703i;
    public boolean f58704j;
    public final int f58705k;
    public boolean f58706l;
    public boolean f58710p;
    public final q5 f58697a = new q5("SpoilerEffectBitmapFactory", 3);
    public final u[] f58698b = new u[f.C.length];
    public final v6.e[] f58699c = new v6.e[2];
    public int d = 0;
    public final Rect f58707m = new Rect();
    public final y f58708n = new y(this, 2);
    public final Rect f58709o = new Rect();

    public h() {
        float f10;
        if (iz.o() == 2) {
            f10 = 150.0f;
        } else {
            f10 = 100.0f;
        }
        int L = g0.L(f10);
        Point point = g0.f22537q;
        int min = (int) Math.min(Math.min(point.x, point.y) * 0.5f, L);
        this.f58705k = min < g0.L(80.0f) ? g0.L(80.0f) : min;
        int i7 = 0;
        while (true) {
            u[] uVarArr = this.f58698b;
            if (i7 < uVarArr.length) {
                u uVar = new u(18, false, false);
                uVar.f11191c = new float[Math.max(64, 2)];
                uVar.f11190b = 0;
                uVarArr[i7] = uVar;
                i7++;
            } else {
                return;
            }
        }
    }

    public final void a(Canvas canvas, Rect rect) {
        int i7;
        int[] iArr;
        int i10;
        float f10;
        int i11;
        int i12;
        b bVar;
        g5.a aVar;
        float f11;
        int i13;
        boolean z9;
        Rect rect2 = rect;
        u[] uVarArr = this.f58698b;
        for (u uVar : uVarArr) {
            uVar.f11190b = 0;
        }
        int i14 = 0;
        while (i14 < 100) {
            f fVar = (f) this.f58703i.get(i14);
            if (Rect.intersects(fVar.getBounds(), rect2)) {
                float[][] fArr = f.D;
                int[] iArr2 = fVar.f58674f;
                float[] fArr2 = fVar.f58673e;
                int length = uVarArr.length;
                float[] fArr3 = f.C;
                if (length == fArr3.length) {
                    long currentTimeMillis = System.currentTimeMillis();
                    fVar.f58677j = currentTimeMillis;
                    ArrayList arrayList = fVar.h;
                    Stack stack = fVar.f58672c;
                    int i15 = fVar.d;
                    int length2 = fArr3.length;
                    Rect bounds = fVar.getBounds();
                    float f12 = bounds.left;
                    float f13 = bounds.top;
                    i7 = i14;
                    float width = bounds.width();
                    float height = bounds.height();
                    RectF rectF = fVar.f58692z;
                    float f14 = rectF.left;
                    float f15 = rectF.top;
                    float f16 = rectF.right;
                    float f17 = rectF.bottom;
                    float N = g0.N(1.0f);
                    float f18 = rect2.left - N;
                    float f19 = rect2.top - N;
                    float f20 = rect2.right + N;
                    float f21 = rect2.bottom + N;
                    float min = (int) Math.min(currentTimeMillis - fVar.f58677j, 34L);
                    float f22 = min / 500.0f;
                    int size = arrayList.size();
                    int i16 = 0;
                    while (i16 < size) {
                        int i17 = size;
                        b bVar2 = (b) arrayList.get(i16);
                        float f23 = min;
                        float f24 = f16;
                        float min2 = Math.min(bVar2.f58644g + f23, bVar2.f58643f);
                        bVar2.f58644g = min2;
                        float f25 = bVar2.f58639a;
                        float f26 = bVar2.f58640b;
                        if (f25 >= f14 && f25 <= f24 && f26 >= f15 && f26 <= f17) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (min2 < bVar2.f58643f && !z9) {
                            float f27 = bVar2.f58642e * f22;
                            bVar2.f58639a = (bVar2.f58641c * f27) + f25;
                            bVar2.f58640b = (bVar2.d * f27) + f26;
                            size = i17;
                        } else {
                            if (stack.size() < i15) {
                                stack.push(bVar2);
                            }
                            int i18 = i17 - 1;
                            if (i16 != i18) {
                                arrayList.set(i16, (b) arrayList.get(i18));
                            }
                            arrayList.remove(i18);
                            size = i17 - 1;
                            i16--;
                        }
                        i16++;
                        min = f23;
                        f16 = f24;
                    }
                    float f28 = f16;
                    int size2 = arrayList.size();
                    if (size2 < i15) {
                        int i19 = i15 - size2;
                        int i20 = 14;
                        float f29 = -1.0f;
                        Arrays.fill(fArr2, 0, Math.min(i19, 14), -1.0f);
                        float f30 = f13;
                        int i21 = 0;
                        int i22 = 0;
                        while (i21 < i19) {
                            float f31 = fArr2[i22];
                            if (f31 == f29) {
                                f31 = Utilities.f21332c.nextFloat();
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
                                bVar = (b) stack.pop();
                            } else {
                                bVar = new Object();
                            }
                            int i24 = 0;
                            while (true) {
                                aVar = Utilities.f21332c;
                                f11 = f30;
                                bVar.f58639a = (aVar.nextFloat() * width) + f12;
                                float nextFloat = (aVar.nextFloat() * height) + f11;
                                bVar.f58640b = nextFloat;
                                int i25 = i24 + 1;
                                i13 = i21;
                                float f33 = bVar.f58639a;
                                if ((f33 < f14 || f33 > f28 || nextFloat < f15 || nextFloat > f17) && i25 < 4) {
                                    i21 = i13;
                                    i24 = i25;
                                    f30 = f11;
                                }
                            }
                            int[] iArr3 = iArr2;
                            double d = ((f32 * 3.141592653589793d) * 2.0d) - 3.141592653589793d;
                            bVar.f58641c = (float) Math.cos(d);
                            bVar.d = (float) Math.sin(d);
                            bVar.f58644g = 0.0f;
                            bVar.f58643f = aVar.nextInt(2000) + 1000;
                            bVar.f58642e = (f32 * 6.0f) + 4.0f;
                            bVar.h = aVar.nextInt(length2);
                            arrayList.add(bVar);
                            i21 = i13 + 1;
                            iArr2 = iArr3;
                            f30 = f11;
                            i20 = 14;
                            f29 = -1.0f;
                        }
                        iArr = iArr2;
                        size2 = arrayList.size();
                    } else {
                        iArr = iArr2;
                    }
                    for (int i26 = 0; i26 < length2; i26++) {
                        iArr[i26] = 0;
                    }
                    int i27 = fVar.f58690x;
                    int i28 = 0;
                    while (i28 < size2) {
                        b bVar3 = (b) arrayList.get(i28);
                        float f34 = bVar3.f58639a;
                        float f35 = bVar3.f58640b;
                        if (f34 >= f18 && f34 <= f20 && f35 >= f19 && f35 <= f21) {
                            int i29 = bVar3.h;
                            float[] fArr4 = fArr[i29];
                            int i30 = iArr[i29];
                            int i31 = i30 + 1;
                            if (i31 < fArr4.length) {
                                fArr4[i30] = f34;
                                fArr4[i31] = f35;
                                int i32 = i30 + 2;
                                float f36 = fVar.f58671b[i29];
                                if (f34 < f36) {
                                    int i33 = i30 + 3;
                                    i10 = size2;
                                    if (i33 < fArr4.length) {
                                        fArr4[i32] = i27 + f34;
                                        fArr4[i33] = f35;
                                        i32 = i30 + 4;
                                    }
                                } else {
                                    i10 = size2;
                                }
                                float f37 = i27;
                                float f38 = f37 - f36;
                                if (f34 > f38) {
                                    int i34 = i32 + 1;
                                    f10 = f37;
                                    if (i34 < fArr4.length) {
                                        fArr4[i32] = f34 - f10;
                                        fArr4[i34] = f35;
                                        i32 += 2;
                                    }
                                } else {
                                    f10 = f37;
                                }
                                if (f35 < f36 && (i12 = i32 + 1) < fArr4.length) {
                                    fArr4[i32] = f34;
                                    fArr4[i12] = f35 + f10;
                                    i32 += 2;
                                }
                                if (f35 > f38 && (i11 = i32 + 1) < fArr4.length) {
                                    fArr4[i32] = f34;
                                    fArr4[i11] = f35 - f10;
                                    i32 += 2;
                                }
                                iArr[i29] = i32;
                                i28++;
                                size2 = i10;
                            }
                        }
                        i10 = size2;
                        i28++;
                        size2 = i10;
                    }
                    for (int i35 = 0; i35 < length2; i35++) {
                        u uVar2 = uVarArr[i35];
                        float[] fArr5 = fArr[i35];
                        int i36 = iArr[i35];
                        int i37 = uVar2.f11190b + i36;
                        float[] fArr6 = (float[]) uVar2.f11191c;
                        if (i37 > fArr6.length) {
                            uVar2.f11191c = Arrays.copyOf((float[]) uVar2.f11191c, Math.max(i37, fArr6.length * 2));
                        }
                        System.arraycopy(fArr5, 0, (float[]) uVar2.f11191c, uVar2.f11190b, i36);
                        uVar2.f11190b += i36;
                    }
                    i14 = i7 + 1;
                    rect2 = rect;
                }
            }
            i7 = i14;
            i14 = i7 + 1;
            rect2 = rect;
        }
        f fVar2 = (f) this.f58703i.get(0);
        fVar2.getClass();
        float[] fArr7 = f.C;
        if (uVarArr.length == fArr7.length) {
            for (int i38 = 0; i38 < fArr7.length; i38++) {
                u uVar3 = uVarArr[i38];
                Paint paint = fVar2.f58670a[i38];
                int i39 = uVar3.f11190b;
                if (i39 > 0) {
                    canvas.drawPoints((float[]) uVar3.f11191c, 0, i39, paint);
                }
            }
        }
    }
}
