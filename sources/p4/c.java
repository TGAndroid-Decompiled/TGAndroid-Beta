package p4;

import a8.la;
import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.Components.of;
public final class c {
    public int f55160a;
    public final int f55161b;
    public final boolean f55162c;
    public Object d;
    public final Cloneable f55163e;
    public Serializable f55164f;
    public Object f55165g;

    public c() {
        this.f55161b = 0;
        this.f55163e = Bundle.EMPTY;
        this.f55160a = -1;
        this.f55162c = true;
    }

    public static v4.l e(int i7, ArrayList arrayList, boolean z10) {
        int i10;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            v4.l lVar = (v4.l) arrayList.get(size);
            if (lVar.f59181a == i7 && lVar.f59183c == z10) {
                arrayList.remove(size);
                while (size < arrayList.size()) {
                    v4.l lVar2 = (v4.l) arrayList.get(size);
                    int i11 = lVar2.f59182b;
                    if (z10) {
                        i10 = 1;
                    } else {
                        i10 = -1;
                    }
                    lVar2.f59182b = i11 + i10;
                    size++;
                }
                return lVar;
            }
            size--;
        }
        return null;
    }

    public d a() {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        int i7 = 1;
        if (((k1) this.d) == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f55160a == -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            z12 = true;
        }
        la.o("Exactly one of sessionCommand and playerCommand should be set", z12);
        if (((l9.a) this.f55164f) == null) {
            int i10 = this.f55160a;
            if (i10 != 1) {
                if (i10 != 11 && i10 != 7) {
                    i7 = 6;
                    if (i10 != 6) {
                        if (i10 == 12 || i10 == 9 || i10 == 8) {
                            i7 = 3;
                        }
                    }
                }
                i7 = 2;
            }
            this.f55164f = new l9.a(new int[]{i7});
        }
        return new d((k1) this.d, this.f55160a, this.f55161b, (Bundle) this.f55163e, this.f55162c, (l9.a) this.f55164f, this.f55165g);
    }

    public void b(v4.e0 e0Var) {
        v4.b bVar;
        v4.o oVar;
        int i7;
        int[] iArr = (int[]) this.f55163e;
        ArrayList arrayList = (ArrayList) this.d;
        v4.o oVar2 = (v4.o) this.f55165g;
        if (e0Var instanceof v4.b) {
            bVar = (v4.b) e0Var;
        } else {
            bVar = new v4.b(e0Var);
        }
        ArrayList arrayList2 = new ArrayList();
        int i10 = this.f55160a;
        int size = arrayList.size() - 1;
        int i11 = this.f55161b;
        while (size >= 0) {
            v4.n nVar = (v4.n) arrayList.get(size);
            int i12 = nVar.f59192c;
            int i13 = nVar.f59190a + i12;
            int i14 = nVar.f59191b + i12;
            boolean z10 = this.f55162c;
            int[] iArr2 = iArr;
            if (i13 < i10) {
                int i15 = i10 - i13;
                if (!z10) {
                    bVar.M0(i13, i15);
                } else {
                    int i16 = i15 - 1;
                    while (i16 >= 0) {
                        int i17 = i13 + i16;
                        int i18 = iArr2[i17];
                        ArrayList arrayList3 = arrayList;
                        int i19 = i18 & 31;
                        if (i19 != 0) {
                            oVar = oVar2;
                            if (i19 != 4 && i19 != 8) {
                                if (i19 == 16) {
                                    arrayList2.add(new v4.l(i17, i17, true));
                                    i7 = i16;
                                } else {
                                    StringBuilder m10 = i5.c.m(i17, "unknown flag for pos ", " ");
                                    m10.append(Long.toBinaryString(i19));
                                    throw new IllegalStateException(m10.toString());
                                }
                            } else {
                                int i20 = i18 >> 5;
                                i7 = i16;
                                v4.l e10 = e(i20, arrayList2, false);
                                bVar.F(i17, e10.f59182b - 1);
                                if (i19 == 4) {
                                    oVar.getClass();
                                    bVar.g1(e10.f59182b - 1, 1);
                                }
                            }
                        } else {
                            oVar = oVar2;
                            i7 = i16;
                            boolean z11 = true;
                            bVar.M0(i17, 1);
                            int size2 = arrayList2.size();
                            int i21 = 0;
                            while (i21 < size2) {
                                Object obj = arrayList2.get(i21);
                                i21++;
                                v4.l lVar = (v4.l) obj;
                                lVar.f59182b--;
                                z11 = true;
                            }
                        }
                        i16 = i7 - 1;
                        arrayList = arrayList3;
                        oVar2 = oVar;
                    }
                }
            }
            ArrayList arrayList4 = arrayList;
            v4.o oVar3 = oVar2;
            if (i14 < i11) {
                int i22 = i11 - i14;
                if (!z10) {
                    bVar.g0(i13, i22);
                } else {
                    for (int i23 = i22 - 1; i23 >= 0; i23--) {
                        int i24 = i14 + i23;
                        int i25 = ((int[]) this.f55164f)[i24];
                        int i26 = i25 & 31;
                        if (i26 != 0) {
                            if (i26 != 4 && i26 != 8) {
                                if (i26 == 16) {
                                    arrayList2.add(new v4.l(i24, i13, false));
                                } else {
                                    StringBuilder m11 = i5.c.m(i24, "unknown flag for pos ", " ");
                                    m11.append(Long.toBinaryString(i26));
                                    throw new IllegalStateException(m11.toString());
                                }
                            }
                            bVar.F(e(i25 >> 5, arrayList2, true).f59182b, i13);
                            if (i26 == 4) {
                                oVar3.getClass();
                                bVar.g1(i13, 1);
                            }
                        } else {
                            boolean z12 = true;
                            bVar.g0(i13, 1);
                            int size3 = arrayList2.size();
                            int i27 = 0;
                            while (i27 < size3) {
                                Object obj2 = arrayList2.get(i27);
                                i27++;
                                ((v4.l) obj2).f59182b++;
                                z12 = true;
                            }
                        }
                    }
                }
            }
            for (int i28 = i12 - 1; i28 >= 0; i28--) {
                int i29 = nVar.f59190a + i28;
                if ((iArr2[i29] & 31) == 2) {
                    oVar3.getClass();
                    bVar.g1(i29, 1);
                }
            }
            i10 = nVar.f59190a;
            i11 = nVar.f59191b;
            size--;
            iArr = iArr2;
            arrayList = arrayList4;
            oVar2 = oVar3;
        }
        bVar.a();
    }

    public void c(v4.i0 i0Var) {
        b(new of(i0Var, 23));
    }

    public void d(int i7, int i10, int i11, boolean z10) {
        int i12;
        int i13;
        int[] iArr = (int[]) this.f55163e;
        int[] iArr2 = (int[]) this.f55164f;
        v4.o oVar = (v4.o) this.f55165g;
        if (z10) {
            i10--;
            i13 = i7;
            i12 = i10;
        } else {
            i12 = i7 - 1;
            i13 = i12;
        }
        while (i11 >= 0) {
            v4.n nVar = (v4.n) ((ArrayList) this.d).get(i11);
            int i14 = nVar.f59190a;
            int i15 = nVar.f59192c;
            int i16 = i14 + i15;
            int i17 = nVar.f59191b + i15;
            int i18 = 4;
            if (z10) {
                for (int i19 = i13 - 1; i19 >= i16; i19--) {
                    if (oVar.b(i19, i12)) {
                        if (oVar.a(i19, i12)) {
                            i18 = 8;
                        }
                        iArr2[i12] = (i19 << 5) | 16;
                        iArr[i19] = (i12 << 5) | i18;
                        return;
                    }
                }
                continue;
            } else {
                for (int i20 = i10 - 1; i20 >= i17; i20--) {
                    if (oVar.b(i12, i20)) {
                        if (oVar.a(i12, i20)) {
                            i18 = 8;
                        }
                        int i21 = i7 - 1;
                        iArr[i21] = (i20 << 5) | 16;
                        iArr2[i20] = (i21 << 5) | i18;
                        return;
                    }
                }
                continue;
            }
            i13 = nVar.f59190a;
            i10 = nVar.f59191b;
            i11--;
        }
    }

    public c(v4.o oVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z10) {
        this.d = arrayList;
        this.f55163e = iArr;
        this.f55164f = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f55165g = oVar;
        int e10 = oVar.e();
        this.f55160a = e10;
        int d = oVar.d();
        this.f55161b = d;
        this.f55162c = z10;
        v4.n nVar = arrayList.isEmpty() ? null : (v4.n) arrayList.get(0);
        if (nVar == null || nVar.f59190a != 0 || nVar.f59191b != 0) {
            ?? obj = new Object();
            obj.f59190a = 0;
            obj.f59191b = 0;
            obj.d = false;
            obj.f59192c = 0;
            obj.f59193e = false;
            arrayList.add(0, obj);
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            v4.n nVar2 = (v4.n) arrayList.get(size);
            int i7 = nVar2.f59190a;
            int i10 = nVar2.f59192c;
            int i11 = i7 + i10;
            int i12 = nVar2.f59191b + i10;
            if (this.f55162c) {
                while (e10 > i11) {
                    if (iArr[e10 - 1] == 0) {
                        d(e10, d, size, false);
                    }
                    e10--;
                }
                while (d > i12) {
                    if (iArr2[d - 1] == 0) {
                        d(e10, d, size, true);
                    }
                    d--;
                }
            }
            for (int i13 = 0; i13 < nVar2.f59192c; i13++) {
                int i14 = nVar2.f59190a + i13;
                int i15 = nVar2.f59191b + i13;
                int i16 = ((v4.o) this.f55165g).a(i14, i15) ? 1 : 2;
                iArr[i14] = (i15 << 5) | i16;
                iArr2[i15] = (i14 << 5) | i16;
            }
            e10 = nVar2.f59190a;
            d = nVar2.f59191b;
        }
    }
}
