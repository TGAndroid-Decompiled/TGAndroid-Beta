package w3;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import g7.a8;
import h3.t1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.ui.Cells.e3;
public final class b0 implements m3.k {
    public final int f48494a;
    public final List f48495b;
    public final d5.y f48496c;
    public final SparseIntArray d;
    public final o0.h f48497e;
    public final SparseArray f48498f;
    public final SparseBooleanArray f48499g;
    public final SparseBooleanArray h;
    public final v f48500i;
    public p3.a f48501j;
    public m3.m f48502k;
    public int f48503l;
    public boolean f48504m;
    public boolean f48505n;
    public boolean f48506o;
    public e0 f48507p;
    public int f48508q;
    public int f48509r;

    public b0(int i9, d5.e0 e0Var, o0.h hVar) {
        this.f48497e = hVar;
        this.f48494a = i9;
        if (i9 != 1 && i9 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f48495b = arrayList;
            arrayList.add(e0Var);
        } else {
            this.f48495b = Collections.singletonList(e0Var);
        }
        this.f48496c = new d5.y(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f48499g = sparseBooleanArray;
        this.h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f48498f = sparseArray;
        this.d = new SparseIntArray();
        this.f48500i = new v(1);
        this.f48502k = m3.m.f17243t;
        this.f48509r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArray.put(sparseArray2.keyAt(i10), (e0) sparseArray2.valueAt(i10));
        }
        sparseArray.put(0, new z(new e3(this)));
        this.f48507p = null;
    }

    @Override
    public final int b(m3.l lVar, m3.n nVar) {
        m3.l lVar2;
        int i9;
        ?? r32;
        int i10;
        int i11;
        boolean z10;
        int i12;
        long j10;
        boolean z11;
        int i13;
        long j11 = ((m3.h) lVar).f17236c;
        boolean z12 = this.f48504m;
        int i14 = this.f48494a;
        if (z12) {
            long j12 = -9223372036854775807L;
            v vVar = this.f48500i;
            if (j11 != -1 && i14 != 2 && !vVar.d) {
                int i15 = this.f48509r;
                d5.e0 e0Var = vVar.f48709b;
                d5.y yVar = vVar.f48710c;
                if (i15 <= 0) {
                    vVar.a(lVar);
                    return 0;
                } else if (!vVar.f48712f) {
                    m3.h hVar = (m3.h) lVar;
                    long j13 = hVar.f17236c;
                    int min = (int) Math.min(112800, j13);
                    long j14 = j13 - min;
                    if (hVar.d != j14) {
                        nVar.f17244a = j14;
                        return 1;
                    }
                    yVar.z(min);
                    hVar.f17238f = 0;
                    hVar.g(yVar.f4410a, 0, min, false);
                    int i16 = yVar.f4411b;
                    int i17 = yVar.f4412c;
                    int i18 = i17 - 188;
                    while (true) {
                        if (i18 < i16) {
                            break;
                        }
                        byte[] bArr = yVar.f4410a;
                        int i19 = -4;
                        int i20 = 0;
                        while (true) {
                            if (i19 > 4) {
                                break;
                            }
                            int i21 = (i19 * 188) + i18;
                            if (i21 >= i16 && i21 < i17 && bArr[i21] == 71) {
                                i20++;
                                if (i20 == 5) {
                                    long a2 = a8.a(yVar, i18, i15);
                                    if (a2 != -9223372036854775807L) {
                                        j12 = a2;
                                        break;
                                    }
                                }
                            } else {
                                i20 = 0;
                            }
                            i19++;
                        }
                        i18--;
                    }
                    vVar.h = j12;
                    vVar.f48712f = true;
                    return 0;
                } else if (vVar.h == -9223372036854775807L) {
                    vVar.a(lVar);
                    return 0;
                } else if (!vVar.f48711e) {
                    m3.h hVar2 = (m3.h) lVar;
                    int min2 = (int) Math.min(112800, hVar2.f17236c);
                    long j15 = 0;
                    if (hVar2.d != j15) {
                        nVar.f17244a = j15;
                        return 1;
                    }
                    yVar.z(min2);
                    hVar2.f17238f = 0;
                    hVar2.g(yVar.f4410a, 0, min2, false);
                    int i22 = yVar.f4411b;
                    int i23 = yVar.f4412c;
                    while (true) {
                        if (i22 >= i23) {
                            break;
                        }
                        if (yVar.f4410a[i22] == 71) {
                            long a3 = a8.a(yVar, i22, i15);
                            if (a3 != -9223372036854775807L) {
                                j12 = a3;
                                break;
                            }
                        }
                        i22++;
                    }
                    vVar.f48713g = j12;
                    vVar.f48711e = true;
                    return 0;
                } else {
                    long j16 = vVar.f48713g;
                    if (j16 == -9223372036854775807L) {
                        vVar.a(lVar);
                        return 0;
                    }
                    long b10 = e0Var.b(vVar.h) - e0Var.b(j16);
                    vVar.f48714i = b10;
                    if (b10 < 0) {
                        d5.a.K("TsDurationReader", "Invalid duration: " + vVar.f48714i + ". Using TIME_UNSET instead.");
                        vVar.f48714i = -9223372036854775807L;
                    }
                    vVar.a(lVar);
                    return 0;
                }
            }
            if (!this.f48505n) {
                this.f48505n = true;
                long j17 = vVar.f48714i;
                if (j17 != -9223372036854775807L) {
                    d5.e0 e0Var2 = vVar.f48709b;
                    i9 = i14;
                    j10 = 0;
                    z11 = false;
                    i13 = 1;
                    p3.a aVar = new p3.a(new wa.a(14), new a6.a(this.f48509r, e0Var2), j17, j17 + 1, 0L, j11, 188L, 940);
                    this.f48501j = aVar;
                    this.f48502k.y(aVar.f45339a);
                } else {
                    i9 = i14;
                    j10 = 0;
                    z11 = false;
                    i13 = 1;
                    this.f48502k.y(new m3.o(j17));
                }
            } else {
                i9 = i14;
                j10 = 0;
                z11 = false;
                i13 = 1;
            }
            if (this.f48506o) {
                this.f48506o = z11;
                g(j10, j10);
                if (((m3.h) lVar).d != j10) {
                    nVar.f17244a = j10;
                    return i13;
                }
            }
            p3.a aVar2 = this.f48501j;
            if (aVar2 != null && aVar2.f45341c != null) {
                return aVar2.b(lVar, nVar);
            }
            lVar2 = lVar;
            r32 = z11;
        } else {
            lVar2 = lVar;
            i9 = i14;
            r32 = 0;
        }
        d5.y yVar2 = this.f48496c;
        byte[] bArr2 = yVar2.f4410a;
        if (9400 - yVar2.f4411b < 188) {
            int a10 = yVar2.a();
            if (a10 > 0) {
                System.arraycopy(bArr2, yVar2.f4411b, bArr2, r32, a10);
            }
            yVar2.A(a10, bArr2);
        }
        while (yVar2.a() < 188) {
            int i24 = yVar2.f4412c;
            int read = ((m3.h) lVar2).read(bArr2, i24, 9400 - i24);
            if (read == -1) {
                return -1;
            }
            yVar2.B(i24 + read);
        }
        int i25 = yVar2.f4411b;
        int i26 = yVar2.f4412c;
        byte[] bArr3 = yVar2.f4410a;
        int i27 = i25;
        while (i27 < i26 && bArr3[i27] != 71) {
            i27++;
        }
        yVar2.C(i27);
        int i28 = i27 + 188;
        e0 e0Var3 = null;
        if (i28 > i26) {
            int i29 = (i27 - i25) + this.f48508q;
            this.f48508q = i29;
            i10 = i9;
            if (i10 == 2 && i29 > 376) {
                throw t1.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            i10 = i9;
            this.f48508q = r32;
        }
        int i30 = yVar2.f4412c;
        if (i28 > i30) {
            return r32;
        }
        int e10 = yVar2.e();
        if ((8388608 & e10) != 0) {
            yVar2.C(i28);
            return r32;
        }
        if ((4194304 & e10) != 0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i31 = (2096896 & e10) >> 8;
        if ((e10 & 32) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((e10 & 16) != 0) {
            e0Var3 = (e0) this.f48498f.get(i31);
        }
        if (e0Var3 == null) {
            yVar2.C(i28);
            return r32;
        }
        if (i10 != 2) {
            int i32 = e10 & 15;
            SparseIntArray sparseIntArray = this.d;
            int i33 = sparseIntArray.get(i31, i32 - 1);
            sparseIntArray.put(i31, i32);
            if (i33 == i32) {
                yVar2.C(i28);
                return r32;
            } else if (i32 != ((i33 + 1) & 15)) {
                e0Var3.h();
            }
        }
        if (z10) {
            int r10 = yVar2.r();
            if ((yVar2.r() & 64) != 0) {
                i12 = 2;
            } else {
                i12 = 0;
            }
            i11 |= i12;
            yVar2.D(r10 - 1);
        }
        boolean z13 = this.f48504m;
        if (i10 == 2 || z13 || !this.h.get(i31, r32)) {
            yVar2.B(i28);
            e0Var3.a(i11, yVar2);
            yVar2.B(i30);
        }
        if (i10 != 2 && !z13 && this.f48504m && j11 != -1) {
            this.f48506o = true;
        }
        yVar2.C(i28);
        return r32;
    }

    @Override
    public final void c(m3.m mVar) {
        this.f48502k = mVar;
    }

    @Override
    public final boolean f(m3.l r7) {
        throw new UnsupportedOperationException("Method not decompiled: w3.b0.f(m3.l):boolean");
    }

    @Override
    public final void g(long j10, long j11) {
        boolean z10;
        p3.a aVar;
        boolean z11;
        if (this.f48494a != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.i(z10);
        List list = this.f48495b;
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            d5.e0 e0Var = (d5.e0) list.get(i9);
            if (e0Var.d() == -9223372036854775807L) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                long c10 = e0Var.c();
                if (c10 != -9223372036854775807L && c10 != 0 && c10 != j11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            if (z11) {
                e0Var.e(j11);
            }
        }
        if (j11 != 0 && (aVar = this.f48501j) != null) {
            aVar.d(j11);
        }
        this.f48496c.z(0);
        this.d.clear();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f48498f;
            if (i10 < sparseArray.size()) {
                ((e0) sparseArray.valueAt(i10)).h();
                i10++;
            } else {
                this.f48508q = 0;
                return;
            }
        }
    }

    @Override
    public final void release() {
    }
}
