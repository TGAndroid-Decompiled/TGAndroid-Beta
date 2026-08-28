package rb;

import com.google.firebase.messaging.l;
public final class e {
    public final pb.d f47118a;
    public final int f47119b;
    public final int f47120c;
    public final int d;
    public final e f47121e;
    public final int f47122f;

    public e(l lVar, pb.d dVar, int i9, int i10, int i11, e eVar, pb.e eVar2) {
        int i12;
        int i13;
        this.f47118a = dVar;
        this.f47119b = i9;
        pb.d dVar2 = pb.d.BYTE;
        if (dVar != dVar2 && eVar != null) {
            i12 = eVar.f47120c;
        } else {
            i12 = i10;
        }
        this.f47120c = i12;
        this.d = i11;
        this.f47121e = eVar;
        boolean z10 = false;
        if (eVar != null) {
            i13 = eVar.f47122f;
        } else {
            i13 = 0;
        }
        if ((dVar == dVar2 && eVar == null && i12 != 0) || (eVar != null && i12 != eVar.f47120c)) {
            z10 = true;
        }
        int i14 = 4;
        i13 = (eVar == null || dVar != eVar.f47118a || z10) ? i13 + dVar.a(eVar2) + 4 : i13;
        int ordinal = dVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        i13 += 13;
                    }
                } else {
                    i13 += ((String) lVar.f4158b).substring(i9, i11 + i9).getBytes(((lb.e) lVar.f4159c).f16749a[i10].charset()).length * 8;
                    if (z10) {
                        i13 += 12;
                    }
                }
                this.f47122f = i13;
            } else if (i11 == 1) {
                i14 = 6;
            } else {
                i14 = 11;
            }
        } else if (i11 != 1) {
            if (i11 == 2) {
                i14 = 7;
            } else {
                i14 = 10;
            }
        }
        i13 += i14;
        this.f47122f = i13;
    }
}
