package rb;

import java.util.ArrayList;

public final class b {

    public final mb.b f46884a;

    public final int f46886c;
    public final int d;

    public final int f46887e;

    public final int f46888f;

    public final float f46889g;

    public final ArrayList f46885b = new ArrayList(5);
    public final int[] h = new int[3];

    public b(mb.b bVar, int i10, int i11, int i12, int i13, float f10) {
        this.f46884a = bVar;
        this.f46886c = i10;
        this.d = i11;
        this.f46887e = i12;
        this.f46888f = i13;
        this.f46889g = f10;
    }

    public final boolean a(int[] iArr) {
        float f10 = this.f46889g;
        float f11 = f10 / 2.0f;
        for (int i10 = 0; i10 < 3; i10++) {
            if (Math.abs(f10 - iArr[i10]) >= f11) {
                return false;
            }
        }
        return true;
    }

    public final a b(int i10, int i11, int[] iArr) {
        int i12 = 0;
        int i13 = iArr[0];
        int i14 = iArr[1];
        int i15 = iArr[2];
        int i16 = i13 + i14 + i15;
        float f10 = (i11 - i15) - (i14 / 2.0f);
        int i17 = (int) f10;
        int i18 = i14 * 2;
        mb.b bVar = this.f46884a;
        int i19 = bVar.f17920b;
        int[] iArr2 = this.h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        int i20 = i10;
        while (i20 >= 0 && bVar.b(i17, i20)) {
            int i21 = iArr2[1];
            if (i21 > i18) {
                break;
            }
            iArr2[1] = i21 + 1;
            i20--;
        }
        float f11 = Float.NaN;
        if (i20 >= 0 && iArr2[1] <= i18) {
            while (i20 >= 0 && !bVar.b(i17, i20)) {
                int i22 = iArr2[0];
                if (i22 > i18) {
                    break;
                }
                iArr2[0] = i22 + 1;
                i20--;
            }
            if (iArr2[0] <= i18) {
                int i23 = i10 + 1;
                while (i23 < i19 && bVar.b(i17, i23)) {
                    int i24 = iArr2[1];
                    if (i24 > i18) {
                        break;
                    }
                    iArr2[1] = i24 + 1;
                    i23++;
                }
                if (i23 != i19 && iArr2[1] <= i18) {
                    while (i23 < i19 && !bVar.b(i17, i23)) {
                        int i25 = iArr2[2];
                        if (i25 > i18) {
                            break;
                        }
                        iArr2[2] = i25 + 1;
                        i23++;
                    }
                    int i26 = iArr2[2];
                    if (i26 <= i18 && Math.abs(((iArr2[0] + iArr2[1]) + i26) - i16) * 5 < i16 * 2 && a(iArr2)) {
                        f11 = (i23 - iArr2[2]) - (iArr2[1] / 2.0f);
                    }
                }
            }
        }
        if (Float.isNaN(f11)) {
            return null;
        }
        float f12 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        ArrayList arrayList = this.f46885b;
        int size = arrayList.size();
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            a aVar = (a) obj;
            float f13 = aVar.f46883c;
            float f14 = aVar.f15529a;
            float f15 = aVar.f15530b;
            if (Math.abs(f11 - f15) <= f12 && Math.abs(f10 - f14) <= f12) {
                float fAbs = Math.abs(f12 - f13);
                if (fAbs <= 1.0f || fAbs <= f13) {
                    return new a((f14 + f10) / 2.0f, (f15 + f11) / 2.0f, (aVar.f46883c + f12) / 2.0f);
                }
            }
        }
        arrayList.add(new a(f10, f11, f12));
        return null;
    }
}
