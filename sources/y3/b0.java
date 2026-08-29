package y3;

import ag.j2;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import i7.s8;
import j3.t1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class b0 implements o3.k {
    public final int f50227a;
    public final List f50228b;
    public final f5.w f50229c;
    public final SparseIntArray d;
    public final o0.i f50230e;
    public final SparseArray f50231f;
    public final SparseBooleanArray f50232g;
    public final SparseBooleanArray h;
    public final v f50233i;
    public r3.a f50234j;
    public o3.m f50235k;
    public int f50236l;
    public boolean f50237m;
    public boolean f50238n;
    public boolean f50239o;
    public e0 f50240p;
    public int f50241q;
    public int f50242r;

    public b0(int i10, f5.c0 c0Var, o0.i iVar) {
        this.f50230e = iVar;
        this.f50227a = i10;
        if (i10 != 1 && i10 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f50228b = arrayList;
            arrayList.add(c0Var);
        } else {
            this.f50228b = Collections.singletonList(c0Var);
        }
        this.f50229c = new f5.w(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f50232g = sparseBooleanArray;
        this.h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f50231f = sparseArray;
        this.d = new SparseIntArray();
        this.f50233i = new v(1);
        this.f50235k = o3.m.f19102u;
        this.f50242r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i11 = 0; i11 < size; i11++) {
            sparseArray.put(sparseArray2.keyAt(i11), (e0) sparseArray2.valueAt(i11));
        }
        sparseArray.put(0, new z(new v5.n(this)));
        this.f50240p = null;
    }

    @Override
    public final int d(o3.l lVar, o3.n nVar) {
        o3.l lVar2;
        int i10;
        ?? r32;
        int i11;
        int i12;
        boolean z10;
        int i13;
        long j10;
        boolean z11;
        int i14;
        long j11 = ((o3.h) lVar).f19095c;
        boolean z12 = this.f50237m;
        int i15 = this.f50227a;
        if (z12) {
            long j12 = -9223372036854775807L;
            v vVar = this.f50233i;
            if (j11 != -1 && i15 != 2 && !vVar.d) {
                int i16 = this.f50242r;
                f5.c0 c0Var = vVar.f50442b;
                f5.w wVar = vVar.f50443c;
                if (i16 <= 0) {
                    vVar.a(lVar);
                    return 0;
                } else if (!vVar.f50445f) {
                    o3.h hVar = (o3.h) lVar;
                    long j13 = hVar.f19095c;
                    int min = (int) Math.min(112800, j13);
                    long j14 = j13 - min;
                    if (hVar.d != j14) {
                        nVar.f19103a = j14;
                        return 1;
                    }
                    wVar.z(min);
                    hVar.f19097f = 0;
                    hVar.f(wVar.f6640a, 0, min, false);
                    int i17 = wVar.f6641b;
                    int i18 = wVar.f6642c;
                    int i19 = i18 - 188;
                    while (true) {
                        if (i19 < i17) {
                            break;
                        }
                        byte[] bArr = wVar.f6640a;
                        int i20 = -4;
                        int i21 = 0;
                        while (true) {
                            if (i20 > 4) {
                                break;
                            }
                            int i22 = (i20 * 188) + i19;
                            if (i22 >= i17 && i22 < i18 && bArr[i22] == 71) {
                                i21++;
                                if (i21 == 5) {
                                    long a2 = s8.a(wVar, i19, i16);
                                    if (a2 != -9223372036854775807L) {
                                        j12 = a2;
                                        break;
                                    }
                                }
                            } else {
                                i21 = 0;
                            }
                            i20++;
                        }
                        i19--;
                    }
                    vVar.h = j12;
                    vVar.f50445f = true;
                    return 0;
                } else if (vVar.h == -9223372036854775807L) {
                    vVar.a(lVar);
                    return 0;
                } else if (!vVar.f50444e) {
                    o3.h hVar2 = (o3.h) lVar;
                    int min2 = (int) Math.min(112800, hVar2.f19095c);
                    long j15 = 0;
                    if (hVar2.d != j15) {
                        nVar.f19103a = j15;
                        return 1;
                    }
                    wVar.z(min2);
                    hVar2.f19097f = 0;
                    hVar2.f(wVar.f6640a, 0, min2, false);
                    int i23 = wVar.f6641b;
                    int i24 = wVar.f6642c;
                    while (true) {
                        if (i23 >= i24) {
                            break;
                        }
                        if (wVar.f6640a[i23] == 71) {
                            long a10 = s8.a(wVar, i23, i16);
                            if (a10 != -9223372036854775807L) {
                                j12 = a10;
                                break;
                            }
                        }
                        i23++;
                    }
                    vVar.f50446g = j12;
                    vVar.f50444e = true;
                    return 0;
                } else {
                    long j16 = vVar.f50446g;
                    if (j16 == -9223372036854775807L) {
                        vVar.a(lVar);
                        return 0;
                    }
                    long b10 = c0Var.b(vVar.h) - c0Var.b(j16);
                    vVar.f50447i = b10;
                    if (b10 < 0) {
                        f5.a.K("TsDurationReader", "Invalid duration: " + vVar.f50447i + ". Using TIME_UNSET instead.");
                        vVar.f50447i = -9223372036854775807L;
                    }
                    vVar.a(lVar);
                    return 0;
                }
            }
            if (!this.f50238n) {
                this.f50238n = true;
                long j17 = vVar.f50447i;
                if (j17 != -9223372036854775807L) {
                    f5.c0 c0Var2 = vVar.f50442b;
                    i10 = i15;
                    j10 = 0;
                    z11 = false;
                    i14 = 1;
                    r3.a aVar = new r3.a(new x9.d(15), new j2(this.f50242r, c0Var2), j17, j17 + 1, 0L, j11, 188L, 940);
                    this.f50234j = aVar;
                    this.f50235k.D1(aVar.f46920a);
                } else {
                    i10 = i15;
                    j10 = 0;
                    z11 = false;
                    i14 = 1;
                    this.f50235k.D1(new o3.o(j17));
                }
            } else {
                i10 = i15;
                j10 = 0;
                z11 = false;
                i14 = 1;
            }
            if (this.f50239o) {
                this.f50239o = z11;
                f(j10, j10);
                if (((o3.h) lVar).d != j10) {
                    nVar.f19103a = j10;
                    return i14;
                }
            }
            r3.a aVar2 = this.f50234j;
            if (aVar2 != null && aVar2.f46922c != null) {
                return aVar2.b(lVar, nVar);
            }
            lVar2 = lVar;
            r32 = z11;
        } else {
            lVar2 = lVar;
            i10 = i15;
            r32 = 0;
        }
        f5.w wVar2 = this.f50229c;
        byte[] bArr2 = wVar2.f6640a;
        if (9400 - wVar2.f6641b < 188) {
            int a11 = wVar2.a();
            if (a11 > 0) {
                System.arraycopy(bArr2, wVar2.f6641b, bArr2, r32, a11);
            }
            wVar2.A(a11, bArr2);
        }
        while (wVar2.a() < 188) {
            int i25 = wVar2.f6642c;
            int read = ((o3.h) lVar2).read(bArr2, i25, 9400 - i25);
            if (read == -1) {
                return -1;
            }
            wVar2.B(i25 + read);
        }
        int i26 = wVar2.f6641b;
        int i27 = wVar2.f6642c;
        byte[] bArr3 = wVar2.f6640a;
        int i28 = i26;
        while (i28 < i27 && bArr3[i28] != 71) {
            i28++;
        }
        wVar2.C(i28);
        int i29 = i28 + 188;
        e0 e0Var = null;
        if (i29 > i27) {
            int i30 = (i28 - i26) + this.f50241q;
            this.f50241q = i30;
            i11 = i10;
            if (i11 == 2 && i30 > 376) {
                throw t1.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            i11 = i10;
            this.f50241q = r32;
        }
        int i31 = wVar2.f6642c;
        if (i29 > i31) {
            return r32;
        }
        int e10 = wVar2.e();
        if ((8388608 & e10) != 0) {
            wVar2.C(i29);
            return r32;
        }
        if ((4194304 & e10) != 0) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        int i32 = (2096896 & e10) >> 8;
        if ((e10 & 32) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((e10 & 16) != 0) {
            e0Var = (e0) this.f50231f.get(i32);
        }
        if (e0Var == null) {
            wVar2.C(i29);
            return r32;
        }
        if (i11 != 2) {
            int i33 = e10 & 15;
            SparseIntArray sparseIntArray = this.d;
            int i34 = sparseIntArray.get(i32, i33 - 1);
            sparseIntArray.put(i32, i33);
            if (i34 == i33) {
                wVar2.C(i29);
                return r32;
            } else if (i33 != ((i34 + 1) & 15)) {
                e0Var.a();
            }
        }
        if (z10) {
            int r6 = wVar2.r();
            if ((wVar2.r() & 64) != 0) {
                i13 = 2;
            } else {
                i13 = 0;
            }
            i12 |= i13;
            wVar2.D(r6 - 1);
        }
        boolean z13 = this.f50237m;
        if (i11 == 2 || z13 || !this.h.get(i32, r32)) {
            wVar2.B(i29);
            e0Var.c(i12, wVar2);
            wVar2.B(i31);
        }
        if (i11 != 2 && !z13 && this.f50237m && j11 != -1) {
            this.f50239o = true;
        }
        wVar2.C(i29);
        return r32;
    }

    @Override
    public final boolean e(o3.l r7) {
        throw new UnsupportedOperationException("Method not decompiled: y3.b0.e(o3.l):boolean");
    }

    @Override
    public final void f(long j10, long j11) {
        boolean z10;
        r3.a aVar;
        boolean z11;
        if (this.f50227a != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.i(z10);
        List list = this.f50228b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            f5.c0 c0Var = (f5.c0) list.get(i10);
            if (c0Var.d() == -9223372036854775807L) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                long c3 = c0Var.c();
                if (c3 != -9223372036854775807L && c3 != 0 && c3 != j11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            if (z11) {
                c0Var.e(j11);
            }
        }
        if (j11 != 0 && (aVar = this.f50234j) != null) {
            aVar.d(j11);
        }
        this.f50229c.z(0);
        this.d.clear();
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.f50231f;
            if (i11 < sparseArray.size()) {
                ((e0) sparseArray.valueAt(i11)).a();
                i11++;
            } else {
                this.f50241q = 0;
                return;
            }
        }
    }

    @Override
    public final void i(o3.m mVar) {
        this.f50235k = mVar;
    }

    @Override
    public final void release() {
    }
}
