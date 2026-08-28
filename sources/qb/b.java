package qb;

import java.util.ArrayList;
public final class b {
    public final lb.b f46125a;
    public final int f46127c;
    public final int d;
    public final int f46128e;
    public final int f46129f;
    public final float f46130g;
    public final ArrayList f46126b = new ArrayList(5);
    public final int[] h = new int[3];

    public b(lb.b bVar, int i9, int i10, int i11, int i12, float f10) {
        this.f46125a = bVar;
        this.f46127c = i9;
        this.d = i10;
        this.f46128e = i11;
        this.f46129f = i12;
        this.f46130g = f10;
    }

    public final boolean a(int[] iArr) {
        float f10 = this.f46130g;
        float f11 = f10 / 2.0f;
        for (int i9 = 0; i9 < 3; i9++) {
            if (Math.abs(f10 - iArr[i9]) >= f11) {
                return false;
            }
        }
        return true;
    }

    public final a b(int i9, int i10, int[] iArr) {
        int i11;
        int i12 = 0;
        int i13 = iArr[0];
        int i14 = iArr[1];
        int i15 = i13 + i14 + iArr[2];
        float f10 = (i10 - i11) - (i14 / 2.0f);
        int i16 = (int) f10;
        int i17 = i14 * 2;
        lb.b bVar = this.f46125a;
        int i18 = bVar.f16736b;
        int[] iArr2 = this.h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        int i19 = i9;
        while (i19 >= 0 && bVar.b(i16, i19)) {
            int i20 = iArr2[1];
            if (i20 > i17) {
                break;
            }
            iArr2[1] = i20 + 1;
            i19--;
        }
        float f11 = Float.NaN;
        if (i19 >= 0 && iArr2[1] <= i17) {
            while (i19 >= 0 && !bVar.b(i16, i19)) {
                int i21 = iArr2[0];
                if (i21 > i17) {
                    break;
                }
                iArr2[0] = i21 + 1;
                i19--;
            }
            if (iArr2[0] <= i17) {
                int i22 = i9 + 1;
                while (i22 < i18 && bVar.b(i16, i22)) {
                    int i23 = iArr2[1];
                    if (i23 > i17) {
                        break;
                    }
                    iArr2[1] = i23 + 1;
                    i22++;
                }
                if (i22 != i18 && iArr2[1] <= i17) {
                    while (i22 < i18 && !bVar.b(i16, i22)) {
                        int i24 = iArr2[2];
                        if (i24 > i17) {
                            break;
                        }
                        iArr2[2] = i24 + 1;
                        i22++;
                    }
                    int i25 = iArr2[2];
                    if (i25 <= i17 && Math.abs(((iArr2[0] + iArr2[1]) + i25) - i15) * 5 < i15 * 2 && a(iArr2)) {
                        f11 = (i22 - iArr2[2]) - (iArr2[1] / 2.0f);
                    }
                }
            }
        }
        if (!Float.isNaN(f11)) {
            float f12 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
            ArrayList arrayList = this.f46126b;
            int size = arrayList.size();
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                a aVar = (a) obj;
                float f13 = aVar.f46124c;
                float f14 = aVar.f14748a;
                float f15 = aVar.f14749b;
                if (Math.abs(f11 - f15) <= f12 && Math.abs(f10 - f14) <= f12) {
                    float abs = Math.abs(f12 - f13);
                    if (abs <= 1.0f || abs <= f13) {
                        return new a((f14 + f10) / 2.0f, (f15 + f11) / 2.0f, (aVar.f46124c + f12) / 2.0f);
                    }
                }
            }
            arrayList.add(new a(f10, f11, f12));
            return null;
        }
        return null;
    }
}
