package p4;

import a8.ma;
import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
public final class c {
    public int f55286a;
    public final int f55287b;
    public final boolean f55288c;
    public Object d;
    public final Cloneable f55289e;
    public Serializable f55290f;
    public Object f55291g;

    public c() {
        this.f55287b = 0;
        this.f55289e = Bundle.EMPTY;
        this.f55286a = -1;
        this.f55288c = true;
    }

    public static v4.m e(int i7, ArrayList arrayList, boolean z10) {
        int i10;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            v4.m mVar = (v4.m) arrayList.get(size);
            if (mVar.f59310a == i7 && mVar.f59312c == z10) {
                arrayList.remove(size);
                while (size < arrayList.size()) {
                    v4.m mVar2 = (v4.m) arrayList.get(size);
                    int i11 = mVar2.f59311b;
                    if (z10) {
                        i10 = 1;
                    } else {
                        i10 = -1;
                    }
                    mVar2.f59311b = i11 + i10;
                    size++;
                }
                return mVar;
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
        if (((j1) this.d) == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f55286a == -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            z12 = true;
        }
        ma.o("Exactly one of sessionCommand and playerCommand should be set", z12);
        if (((l9.a) this.f55290f) == null) {
            int i10 = this.f55286a;
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
            this.f55290f = new l9.a(new int[]{i7});
        }
        return new d((j1) this.d, this.f55286a, this.f55287b, (Bundle) this.f55289e, this.f55288c, (l9.a) this.f55290f, this.f55291g);
    }

    public void b(v4.e0 e0Var) {
        v4.c cVar;
        v4.p pVar;
        int i7;
        int[] iArr = (int[]) this.f55289e;
        ArrayList arrayList = (ArrayList) this.d;
        v4.p pVar2 = (v4.p) this.f55291g;
        if (e0Var instanceof v4.c) {
            cVar = (v4.c) e0Var;
        } else {
            cVar = new v4.c(e0Var);
        }
        ArrayList arrayList2 = new ArrayList();
        int i10 = this.f55286a;
        int size = arrayList.size() - 1;
        int i11 = this.f55287b;
        while (size >= 0) {
            v4.o oVar = (v4.o) arrayList.get(size);
            int i12 = oVar.f59328c;
            int i13 = oVar.f59326a + i12;
            int i14 = oVar.f59327b + i12;
            boolean z10 = this.f55288c;
            int[] iArr2 = iArr;
            if (i13 < i10) {
                int i15 = i10 - i13;
                if (!z10) {
                    cVar.y0(i13, i15);
                } else {
                    int i16 = i15 - 1;
                    while (i16 >= 0) {
                        int i17 = i13 + i16;
                        int i18 = iArr2[i17];
                        ArrayList arrayList3 = arrayList;
                        int i19 = i18 & 31;
                        if (i19 != 0) {
                            pVar = pVar2;
                            if (i19 != 4 && i19 != 8) {
                                if (i19 == 16) {
                                    arrayList2.add(new v4.m(i17, i17, true));
                                    i7 = i16;
                                } else {
                                    StringBuilder m10 = i5.c.m(i17, "unknown flag for pos ", " ");
                                    m10.append(Long.toBinaryString(i19));
                                    throw new IllegalStateException(m10.toString());
                                }
                            } else {
                                int i20 = i18 >> 5;
                                i7 = i16;
                                v4.m e10 = e(i20, arrayList2, false);
                                cVar.z(i17, e10.f59311b - 1);
                                if (i19 == 4) {
                                    pVar.getClass();
                                    cVar.V0(e10.f59311b - 1, 1);
                                }
                            }
                        } else {
                            pVar = pVar2;
                            i7 = i16;
                            boolean z11 = true;
                            cVar.y0(i17, 1);
                            int size2 = arrayList2.size();
                            int i21 = 0;
                            while (i21 < size2) {
                                Object obj = arrayList2.get(i21);
                                i21++;
                                v4.m mVar = (v4.m) obj;
                                mVar.f59311b--;
                                z11 = true;
                            }
                        }
                        i16 = i7 - 1;
                        arrayList = arrayList3;
                        pVar2 = pVar;
                    }
                }
            }
            ArrayList arrayList4 = arrayList;
            v4.p pVar3 = pVar2;
            if (i14 < i11) {
                int i22 = i11 - i14;
                if (!z10) {
                    cVar.V(i13, i22);
                } else {
                    for (int i23 = i22 - 1; i23 >= 0; i23--) {
                        int i24 = i14 + i23;
                        int i25 = ((int[]) this.f55290f)[i24];
                        int i26 = i25 & 31;
                        if (i26 != 0) {
                            if (i26 != 4 && i26 != 8) {
                                if (i26 == 16) {
                                    arrayList2.add(new v4.m(i24, i13, false));
                                } else {
                                    StringBuilder m11 = i5.c.m(i24, "unknown flag for pos ", " ");
                                    m11.append(Long.toBinaryString(i26));
                                    throw new IllegalStateException(m11.toString());
                                }
                            }
                            cVar.z(e(i25 >> 5, arrayList2, true).f59311b, i13);
                            if (i26 == 4) {
                                pVar3.getClass();
                                cVar.V0(i13, 1);
                            }
                        } else {
                            boolean z12 = true;
                            cVar.V(i13, 1);
                            int size3 = arrayList2.size();
                            int i27 = 0;
                            while (i27 < size3) {
                                Object obj2 = arrayList2.get(i27);
                                i27++;
                                ((v4.m) obj2).f59311b++;
                                z12 = true;
                            }
                        }
                    }
                }
            }
            for (int i28 = i12 - 1; i28 >= 0; i28--) {
                int i29 = oVar.f59326a + i28;
                if ((iArr2[i29] & 31) == 2) {
                    pVar3.getClass();
                    cVar.V0(i29, 1);
                }
            }
            i10 = oVar.f59326a;
            i11 = oVar.f59327b;
            size--;
            iArr = iArr2;
            arrayList = arrayList4;
            pVar2 = pVar3;
        }
        cVar.a();
    }

    public void c(v4.i0 i0Var) {
        b(new v4.b(i0Var, 0));
    }

    public void d(int i7, int i10, int i11, boolean z10) {
        int i12;
        int i13;
        int[] iArr = (int[]) this.f55289e;
        int[] iArr2 = (int[]) this.f55290f;
        v4.p pVar = (v4.p) this.f55291g;
        if (z10) {
            i10--;
            i13 = i7;
            i12 = i10;
        } else {
            i12 = i7 - 1;
            i13 = i12;
        }
        while (i11 >= 0) {
            v4.o oVar = (v4.o) ((ArrayList) this.d).get(i11);
            int i14 = oVar.f59326a;
            int i15 = oVar.f59328c;
            int i16 = i14 + i15;
            int i17 = oVar.f59327b + i15;
            int i18 = 4;
            if (z10) {
                for (int i19 = i13 - 1; i19 >= i16; i19--) {
                    if (pVar.b(i19, i12)) {
                        if (pVar.a(i19, i12)) {
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
                    if (pVar.b(i12, i20)) {
                        if (pVar.a(i12, i20)) {
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
            i13 = oVar.f59326a;
            i10 = oVar.f59327b;
            i11--;
        }
    }

    public c(v4.p pVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z10) {
        this.d = arrayList;
        this.f55289e = iArr;
        this.f55290f = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f55291g = pVar;
        int e10 = pVar.e();
        this.f55286a = e10;
        int d = pVar.d();
        this.f55287b = d;
        this.f55288c = z10;
        v4.o oVar = arrayList.isEmpty() ? null : (v4.o) arrayList.get(0);
        if (oVar == null || oVar.f59326a != 0 || oVar.f59327b != 0) {
            ?? obj = new Object();
            obj.f59326a = 0;
            obj.f59327b = 0;
            obj.d = false;
            obj.f59328c = 0;
            obj.f59329e = false;
            arrayList.add(0, obj);
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            v4.o oVar2 = (v4.o) arrayList.get(size);
            int i7 = oVar2.f59326a;
            int i10 = oVar2.f59328c;
            int i11 = i7 + i10;
            int i12 = oVar2.f59327b + i10;
            if (this.f55288c) {
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
            for (int i13 = 0; i13 < oVar2.f59328c; i13++) {
                int i14 = oVar2.f59326a + i13;
                int i15 = oVar2.f59327b + i13;
                int i16 = ((v4.p) this.f55291g).a(i14, i15) ? 1 : 2;
                iArr[i14] = (i15 << 5) | i16;
                iArr2[i15] = (i14 << 5) | i16;
            }
            e10 = oVar2.f59326a;
            d = oVar2.f59327b;
        }
    }
}
