package s4;

import java.util.ArrayList;
import java.util.Arrays;
public final class k {
    public final ArrayList f41678a;
    public final int[] f41679b;
    public final int[] f41680c;
    public final o d;
    public final int e;
    public final int f41681f;
    public final boolean f41682g;

    public k(o oVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z10) {
        n nVar;
        int i10;
        this.f41678a = arrayList;
        this.f41679b = iArr;
        this.f41680c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = oVar;
        int e = oVar.e();
        this.e = e;
        int d = oVar.d();
        this.f41681f = d;
        this.f41682g = z10;
        if (arrayList.isEmpty()) {
            nVar = null;
        } else {
            nVar = (n) arrayList.get(0);
        }
        if (nVar == null || nVar.f41698a != 0 || nVar.f41699b != 0) {
            ?? obj = new Object();
            obj.f41698a = 0;
            obj.f41699b = 0;
            obj.d = false;
            obj.f41700c = 0;
            obj.e = false;
            arrayList.add(0, obj);
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            n nVar2 = (n) arrayList.get(size);
            int i11 = nVar2.f41698a;
            int i12 = nVar2.f41700c;
            int i13 = i11 + i12;
            int i14 = nVar2.f41699b + i12;
            if (this.f41682g) {
                while (e > i13) {
                    if (iArr[e - 1] == 0) {
                        c(e, d, size, false);
                    }
                    e--;
                }
                while (d > i14) {
                    if (iArr2[d - 1] == 0) {
                        c(e, d, size, true);
                    }
                    d--;
                }
            }
            for (int i15 = 0; i15 < nVar2.f41700c; i15++) {
                int i16 = nVar2.f41698a + i15;
                int i17 = nVar2.f41699b + i15;
                if (this.d.a(i16, i17)) {
                    i10 = 1;
                } else {
                    i10 = 2;
                }
                iArr[i16] = (i17 << 5) | i10;
                iArr2[i17] = (i16 << 5) | i10;
            }
            e = nVar2.f41698a;
            d = nVar2.f41699b;
        }
    }

    public static l d(int i10, ArrayList arrayList, boolean z10) {
        int i11;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            l lVar = (l) arrayList.get(size);
            if (lVar.f41683a == i10 && lVar.f41685c == z10) {
                arrayList.remove(size);
                while (size < arrayList.size()) {
                    l lVar2 = (l) arrayList.get(size);
                    int i12 = lVar2.f41684b;
                    if (z10) {
                        i11 = 1;
                    } else {
                        i11 = -1;
                    }
                    lVar2.f41684b = i12 + i11;
                    size++;
                }
                return lVar;
            }
            size--;
        }
        return null;
    }

    public final void a(e0 e0Var) {
        b bVar;
        int[] iArr;
        int i10;
        if (e0Var instanceof b) {
            bVar = (b) e0Var;
        } else {
            bVar = new b(e0Var);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f41678a;
        int size = arrayList2.size() - 1;
        int i11 = this.e;
        int i12 = this.f41681f;
        while (size >= 0) {
            n nVar = (n) arrayList2.get(size);
            int i13 = nVar.f41700c;
            int i14 = nVar.f41698a + i13;
            int i15 = nVar.f41699b + i13;
            int[] iArr2 = this.f41679b;
            boolean z10 = this.f41682g;
            o oVar = this.d;
            ArrayList arrayList3 = arrayList2;
            if (i14 < i11) {
                int i16 = i11 - i14;
                if (!z10) {
                    bVar.O0(i14, i16);
                } else {
                    int i17 = i16 - 1;
                    while (i17 >= 0) {
                        int i18 = i14 + i17;
                        int i19 = iArr2[i18];
                        int i20 = size;
                        int i21 = i19 & 31;
                        if (i21 != 0) {
                            iArr = iArr2;
                            if (i21 != 4 && i21 != 8) {
                                if (i21 == 16) {
                                    arrayList.add(new l(i18, i18, true));
                                    i10 = i17;
                                } else {
                                    StringBuilder m10 = hc.b.m(i18, "unknown flag for pos ", " ");
                                    m10.append(Long.toBinaryString(i21));
                                    throw new IllegalStateException(m10.toString());
                                }
                            } else {
                                int i22 = i19 >> 5;
                                i10 = i17;
                                l d = d(i22, arrayList, false);
                                bVar.C(i18, d.f41684b - 1);
                                if (i21 == 4) {
                                    oVar.getClass();
                                    bVar.k1(d.f41684b - 1, 1);
                                }
                            }
                        } else {
                            iArr = iArr2;
                            i10 = i17;
                            bVar.O0(i18, 1);
                            int size2 = arrayList.size();
                            int i23 = 0;
                            while (i23 < size2) {
                                Object obj = arrayList.get(i23);
                                i23++;
                                l lVar = (l) obj;
                                lVar.f41684b--;
                            }
                        }
                        i17 = i10 - 1;
                        size = i20;
                        iArr2 = iArr;
                    }
                }
            }
            int i24 = size;
            int[] iArr3 = iArr2;
            if (i15 < i12) {
                int i25 = i12 - i15;
                if (!z10) {
                    bVar.j0(i14, i25);
                } else {
                    for (int i26 = i25 - 1; i26 >= 0; i26--) {
                        int i27 = i15 + i26;
                        int i28 = this.f41680c[i27];
                        int i29 = i28 & 31;
                        if (i29 != 0) {
                            if (i29 != 4 && i29 != 8) {
                                if (i29 == 16) {
                                    arrayList.add(new l(i27, i14, false));
                                } else {
                                    StringBuilder m11 = hc.b.m(i27, "unknown flag for pos ", " ");
                                    m11.append(Long.toBinaryString(i29));
                                    throw new IllegalStateException(m11.toString());
                                }
                            }
                            bVar.C(d(i28 >> 5, arrayList, true).f41684b, i14);
                            if (i29 == 4) {
                                oVar.getClass();
                                bVar.k1(i14, 1);
                            }
                        } else {
                            bVar.j0(i14, 1);
                            int size3 = arrayList.size();
                            int i30 = 0;
                            while (i30 < size3) {
                                Object obj2 = arrayList.get(i30);
                                i30++;
                                ((l) obj2).f41684b++;
                            }
                        }
                    }
                }
            }
            for (int i31 = i13 - 1; i31 >= 0; i31--) {
                int i32 = nVar.f41698a + i31;
                if ((iArr3[i32] & 31) == 2) {
                    oVar.getClass();
                    bVar.k1(i32, 1);
                }
            }
            i11 = nVar.f41698a;
            i12 = nVar.f41699b;
            size = i24 - 1;
            arrayList2 = arrayList3;
        }
        bVar.a();
    }

    public final void b(h0 h0Var) {
        a(new o0.b(h0Var));
    }

    public final void c(int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        if (z10) {
            i11--;
            i14 = i10;
            i13 = i11;
        } else {
            i13 = i10 - 1;
            i14 = i13;
        }
        while (i12 >= 0) {
            n nVar = (n) this.f41678a.get(i12);
            int i15 = nVar.f41698a;
            int i16 = nVar.f41700c;
            int i17 = i15 + i16;
            int i18 = nVar.f41699b + i16;
            int[] iArr = this.f41679b;
            int[] iArr2 = this.f41680c;
            int i19 = 4;
            o oVar = this.d;
            if (z10) {
                for (int i20 = i14 - 1; i20 >= i17; i20--) {
                    if (oVar.b(i20, i13)) {
                        if (oVar.a(i20, i13)) {
                            i19 = 8;
                        }
                        iArr2[i13] = (i20 << 5) | 16;
                        iArr[i20] = (i13 << 5) | i19;
                        return;
                    }
                }
                continue;
            } else {
                for (int i21 = i11 - 1; i21 >= i18; i21--) {
                    if (oVar.b(i13, i21)) {
                        if (oVar.a(i13, i21)) {
                            i19 = 8;
                        }
                        int i22 = i10 - 1;
                        iArr[i22] = (i21 << 5) | 16;
                        iArr2[i21] = (i22 << 5) | i19;
                        return;
                    }
                }
                continue;
            }
            i14 = nVar.f41698a;
            i11 = nVar.f41699b;
            i12--;
        }
    }
}
