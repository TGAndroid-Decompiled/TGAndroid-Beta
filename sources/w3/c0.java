package w3;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import h3.t1;
import h7.z7;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class c0 implements m3.k {

    public final int f49003a;

    public final List f49004b;

    public final d5.z f49005c;
    public final SparseIntArray d;

    public final o0.i f49006e;

    public final SparseArray f49007f;

    public final SparseBooleanArray f49008g;
    public final SparseBooleanArray h;

    public final v f49009i;

    public p3.a f49010j;

    public m3.m f49011k;

    public int f49012l;

    public boolean f49013m;

    public boolean f49014n;

    public boolean f49015o;

    public f0 f49016p;

    public int f49017q;

    public int f49018r;

    public c0(int i10, d5.f0 f0Var, o0.i iVar) {
        this.f49006e = iVar;
        this.f49003a = i10;
        if (i10 == 1 || i10 == 2) {
            this.f49004b = Collections.singletonList(f0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f49004b = arrayList;
            arrayList.add(f0Var);
        }
        this.f49005c = new d5.z(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f49008g = sparseBooleanArray;
        this.h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f49007f = sparseArray;
        this.d = new SparseIntArray();
        this.f49009i = new v(1);
        this.f49011k = m3.m.f17619t;
        this.f49018r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i11 = 0; i11 < size; i11++) {
            sparseArray.put(sparseArray2.keyAt(i11), (f0) sparseArray2.valueAt(i11));
        }
        sparseArray.put(0, new z(new b0(this)));
        this.f49016p = null;
    }

    @Override
    public final int b(m3.l lVar, m3.n nVar) throws t1, EOFException, InterruptedIOException {
        m3.l lVar2;
        int i10;
        ?? r10;
        int i11;
        long j10;
        boolean z10;
        int i12;
        long j11 = ((m3.h) lVar).f17612c;
        boolean z11 = this.f49013m;
        int i13 = this.f49003a;
        if (z11) {
            long j12 = -9223372036854775807L;
            v vVar = this.f49009i;
            if (j11 != -1 && i13 != 2 && !vVar.d) {
                int i14 = this.f49018r;
                d5.f0 f0Var = vVar.f49215b;
                d5.z zVar = vVar.f49216c;
                if (i14 <= 0) {
                    vVar.a(lVar);
                    return 0;
                }
                if (!vVar.f49218f) {
                    m3.h hVar = (m3.h) lVar;
                    long j13 = hVar.f17612c;
                    int iMin = (int) Math.min(112800, j13);
                    long j14 = j13 - ((long) iMin);
                    if (hVar.d != j14) {
                        nVar.f17620a = j14;
                        return 1;
                    }
                    zVar.z(iMin);
                    hVar.f17614f = 0;
                    hVar.g(zVar.f4858a, 0, iMin, false);
                    int i15 = zVar.f4859b;
                    int i16 = zVar.f4860c;
                    for (int i17 = i16 - 188; i17 >= i15; i17--) {
                        byte[] bArr = zVar.f4858a;
                        int i18 = 0;
                        for (int i19 = -4; i19 <= 4; i19++) {
                            int i20 = (i19 * 188) + i17;
                            if (i20 >= i15 && i20 < i16 && bArr[i20] == 71) {
                                i18++;
                                if (i18 == 5) {
                                    long jA = z7.a(zVar, i17, i14);
                                    if (jA == -9223372036854775807L) {
                                        break;
                                    }
                                    j12 = jA;
                                    break;
                                }
                            } else {
                                i18 = 0;
                            }
                        }
                    }
                    vVar.h = j12;
                    vVar.f49218f = true;
                    return 0;
                }
                if (vVar.h == -9223372036854775807L) {
                    vVar.a(lVar);
                    return 0;
                }
                if (vVar.f49217e) {
                    long j15 = vVar.f49219g;
                    if (j15 == -9223372036854775807L) {
                        vVar.a(lVar);
                        return 0;
                    }
                    long jB = f0Var.b(vVar.h) - f0Var.b(j15);
                    vVar.f49220i = jB;
                    if (jB < 0) {
                        d5.a.K("TsDurationReader", "Invalid duration: " + vVar.f49220i + ". Using TIME_UNSET instead.");
                        vVar.f49220i = -9223372036854775807L;
                    }
                    vVar.a(lVar);
                    return 0;
                }
                m3.h hVar2 = (m3.h) lVar;
                int iMin2 = (int) Math.min(112800, hVar2.f17612c);
                long j16 = 0;
                if (hVar2.d != j16) {
                    nVar.f17620a = j16;
                    return 1;
                }
                zVar.z(iMin2);
                hVar2.f17614f = 0;
                hVar2.g(zVar.f4858a, 0, iMin2, false);
                int i21 = zVar.f4860c;
                for (int i22 = zVar.f4859b; i22 < i21; i22++) {
                    if (zVar.f4858a[i22] == 71) {
                        long jA2 = z7.a(zVar, i22, i14);
                        if (jA2 != -9223372036854775807L) {
                            j12 = jA2;
                            break;
                        }
                    }
                }
                vVar.f49219g = j12;
                vVar.f49217e = true;
                return 0;
            }
            if (this.f49014n) {
                i10 = i13;
                j10 = 0;
                z10 = false;
                i12 = 1;
            } else {
                this.f49014n = true;
                long j17 = vVar.f49220i;
                if (j17 != -9223372036854775807L) {
                    d5.f0 f0Var2 = vVar.f49215b;
                    i10 = i13;
                    j10 = 0;
                    z10 = false;
                    i12 = 1;
                    p3.a aVar = new p3.a(new e7.v(14), new b6.a(this.f49018r, f0Var2), j17, j17 + 1, 0L, j11, 188L, 940);
                    this.f49010j = aVar;
                    this.f49011k.n(aVar.f45345a);
                } else {
                    i10 = i13;
                    j10 = 0;
                    z10 = false;
                    i12 = 1;
                    this.f49011k.n(new m3.o(j17));
                }
            }
            if (this.f49015o) {
                this.f49015o = z10;
                g(j10, j10);
                if (((m3.h) lVar).d != j10) {
                    nVar.f17620a = j10;
                    return i12;
                }
            }
            p3.a aVar2 = this.f49010j;
            if (aVar2 != null && aVar2.f45347c != null) {
                return aVar2.b(lVar, nVar);
            }
            lVar2 = lVar;
            r10 = z10;
        } else {
            lVar2 = lVar;
            i10 = i13;
            r10 = 0;
        }
        d5.z zVar2 = this.f49005c;
        byte[] bArr2 = zVar2.f4858a;
        if (9400 - zVar2.f4859b < 188) {
            int iA = zVar2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, zVar2.f4859b, bArr2, r10, iA);
            }
            zVar2.A(iA, bArr2);
        }
        while (zVar2.a() < 188) {
            int i23 = zVar2.f4860c;
            int i24 = ((m3.h) lVar2).read(bArr2, i23, 9400 - i23);
            if (i24 == -1) {
                return -1;
            }
            zVar2.B(i23 + i24);
        }
        int i25 = zVar2.f4859b;
        int i26 = zVar2.f4860c;
        byte[] bArr3 = zVar2.f4858a;
        int i27 = i25;
        while (i27 < i26 && bArr3[i27] != 71) {
            i27++;
        }
        zVar2.C(i27);
        int i28 = i27 + 188;
        if (i28 > i26) {
            int i29 = (i27 - i25) + this.f49017q;
            this.f49017q = i29;
            i11 = i10;
            if (i11 == 2 && i29 > 376) {
                throw t1.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            i11 = i10;
            this.f49017q = r10;
        }
        int i30 = zVar2.f4860c;
        if (i28 > i30) {
            return r10;
        }
        int iE = zVar2.e();
        if ((8388608 & iE) != 0) {
            zVar2.C(i28);
            return r10;
        }
        int i31 = (4194304 & iE) != 0 ? 1 : 0;
        int i32 = (2096896 & iE) >> 8;
        boolean z12 = (iE & 32) != 0;
        f0 f0Var3 = (iE & 16) != 0 ? (f0) this.f49007f.get(i32) : null;
        if (f0Var3 == null) {
            zVar2.C(i28);
            return r10;
        }
        if (i11 != 2) {
            int i33 = iE & 15;
            SparseIntArray sparseIntArray = this.d;
            int i34 = sparseIntArray.get(i32, i33 - 1);
            sparseIntArray.put(i32, i33);
            if (i34 == i33) {
                zVar2.C(i28);
                return r10;
            }
            if (i33 != ((i34 + 1) & 15)) {
                f0Var3.c();
            }
        }
        if (z12) {
            int iR = zVar2.r();
            i31 |= (zVar2.r() & 64) != 0 ? 2 : 0;
            zVar2.D(iR - 1);
        }
        boolean z13 = this.f49013m;
        if (i11 == 2 || z13 || !this.h.get(i32, r10)) {
            zVar2.B(i28);
            f0Var3.b(i31, zVar2);
            zVar2.B(i30);
        }
        if (i11 != 2 && !z13 && this.f49013m && j11 != -1) {
            this.f49015o = true;
        }
        zVar2.C(i28);
        return r10;
    }

    @Override
    public final void c(m3.m mVar) {
        this.f49011k = mVar;
    }

    @Override
    public final boolean f(m3.l lVar) throws EOFException, InterruptedIOException {
        byte[] bArr = this.f49005c.f4858a;
        m3.h hVar = (m3.h) lVar;
        hVar.g(bArr, 0, 940, false);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    hVar.t(i10);
                    return true;
                }
                if (bArr[(i11 * 188) + i10] != 71) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    @Override
    public final void g(long j10, long j11) {
        p3.a aVar;
        d5.a.i(this.f49003a != 2);
        List list = this.f49004b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            d5.f0 f0Var = (d5.f0) list.get(i10);
            boolean z10 = f0Var.d() == -9223372036854775807L;
            if (!z10) {
                long jC = f0Var.c();
                z10 = (jC == -9223372036854775807L || jC == 0 || jC == j11) ? false : true;
            }
            if (z10) {
                f0Var.e(j11);
            }
        }
        if (j11 != 0 && (aVar = this.f49010j) != null) {
            aVar.d(j11);
        }
        this.f49005c.z(0);
        this.d.clear();
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.f49007f;
            if (i11 >= sparseArray.size()) {
                this.f49017q = 0;
                return;
            } else {
                ((f0) sparseArray.valueAt(i11)).c();
                i11++;
            }
        }
    }

    @Override
    public final void release() {
    }
}
