package tb;

import ab.m;
public final class e {
    public final rb.d f48201a;
    public final int f48202b;
    public final int f48203c;
    public final int d;
    public final e f48204e;
    public final int f48205f;

    public e(m mVar, rb.d dVar, int i10, int i11, int i12, e eVar, rb.e eVar2) {
        int i13;
        int i14;
        this.f48201a = dVar;
        this.f48202b = i10;
        rb.d dVar2 = rb.d.BYTE;
        if (dVar != dVar2 && eVar != null) {
            i13 = eVar.f48203c;
        } else {
            i13 = i11;
        }
        this.f48203c = i13;
        this.d = i12;
        this.f48204e = eVar;
        boolean z10 = false;
        if (eVar != null) {
            i14 = eVar.f48205f;
        } else {
            i14 = 0;
        }
        if ((dVar == dVar2 && eVar == null && i13 != 0) || (eVar != null && i13 != eVar.f48203c)) {
            z10 = true;
        }
        int i15 = 4;
        i14 = (eVar == null || dVar != eVar.f48201a || z10) ? i14 + dVar.a(eVar2) + 4 : i14;
        int ordinal = dVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        i14 += 13;
                    }
                } else {
                    i14 += ((String) mVar.f325b).substring(i10, i12 + i10).getBytes(((nb.e) mVar.f326c).f17216a[i11].charset()).length * 8;
                    if (z10) {
                        i14 += 12;
                    }
                }
                this.f48205f = i14;
            } else if (i12 == 1) {
                i15 = 6;
            } else {
                i15 = 11;
            }
        } else if (i12 != 1) {
            if (i12 == 2) {
                i15 = 7;
            } else {
                i15 = 10;
            }
        }
        i14 += i15;
        this.f48205f = i14;
    }
}
