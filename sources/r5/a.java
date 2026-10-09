package r5;

import java.util.HashMap;
public final class a {
    public final u5.a f46976a;
    public final HashMap f46977b;

    public a(u5.a aVar, HashMap hashMap) {
        this.f46976a = aVar;
        this.f46977b = hashMap;
    }

    public final long a(i5.d dVar, long j3, int i10) {
        long j10;
        long Z = j3 - this.f46976a.Z();
        b bVar = (b) this.f46977b.get(dVar);
        long j11 = bVar.f46978a;
        int i11 = i10 - 1;
        if (j11 > 1) {
            j10 = j11;
        } else {
            j10 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j11 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j10 * i11))), Z), bVar.f46979b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f46976a.equals(aVar.f46976a) && this.f46977b.equals(aVar.f46977b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f46976a.hashCode() ^ 1000003) * 1000003) ^ this.f46977b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f46976a + ", values=" + this.f46977b + "}";
    }
}
