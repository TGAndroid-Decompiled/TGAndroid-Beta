package vb;

import cb.m;
public final class e {
    public final tb.d f45656a;
    public final int f45657b;
    public final int f45658c;
    public final int d;
    public final e e;
    public final int f45659f;

    public e(m mVar, tb.d dVar, int i10, int i11, int i12, e eVar, tb.e eVar2) {
        int i13;
        int i14;
        this.f45656a = dVar;
        this.f45657b = i10;
        tb.d dVar2 = tb.d.BYTE;
        if (dVar != dVar2 && eVar != null) {
            i13 = eVar.f45658c;
        } else {
            i13 = i11;
        }
        this.f45658c = i13;
        this.d = i12;
        this.e = eVar;
        boolean z4 = false;
        if (eVar != null) {
            i14 = eVar.f45659f;
        } else {
            i14 = 0;
        }
        if ((dVar == dVar2 && eVar == null && i13 != 0) || (eVar != null && i13 != eVar.f45658c)) {
            z4 = true;
        }
        int i15 = 4;
        i14 = (eVar == null || dVar != eVar.f45656a || z4) ? i14 + dVar.a(eVar2) + 4 : i14;
        int ordinal = dVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        i14 += 13;
                    }
                } else {
                    i14 += ((String) mVar.f2233b).substring(i10, i12 + i10).getBytes(((pb.e) mVar.f2234c).f41108a[i11].charset()).length * 8;
                    if (z4) {
                        i14 += 12;
                    }
                }
                this.f45659f = i14;
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
        this.f45659f = i14;
    }
}
