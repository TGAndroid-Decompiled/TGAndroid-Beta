package sb;

import com.google.firebase.messaging.l;

public final class e {

    public final qb.d f47838a;

    public final int f47839b;

    public final int f47840c;
    public final int d;

    public final e f47841e;

    public final int f47842f;

    public e(l lVar, qb.d dVar, int i10, int i11, int i12, e eVar, qb.e eVar2) {
        this.f47838a = dVar;
        this.f47839b = i10;
        qb.d dVar2 = qb.d.BYTE;
        int i13 = (dVar == dVar2 || eVar == null) ? i11 : eVar.f47840c;
        this.f47840c = i13;
        this.d = i12;
        this.f47841e = eVar;
        boolean z10 = false;
        int iA = eVar != null ? eVar.f47842f : 0;
        if ((dVar == dVar2 && eVar == null && i13 != 0) || (eVar != null && i13 != eVar.f47840c)) {
            z10 = true;
        }
        iA = (eVar == null || dVar != eVar.f47838a || z10) ? iA + dVar.a(eVar2) + 4 : iA;
        int iOrdinal = dVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                iA += i12 != 1 ? 11 : 6;
            } else if (iOrdinal == 4) {
                iA += ((String) lVar.f4600b).substring(i10, i12 + i10).getBytes(((mb.e) lVar.f4601c).f17933a[i11].charset()).length * 8;
                if (z10) {
                    iA += 12;
                }
            } else if (iOrdinal == 6) {
                iA += 13;
            }
        } else {
            iA += i12 != 1 ? i12 == 2 ? 7 : 10 : 4;
        }
        this.f47842f = iA;
    }
}
