package r5;

import java.util.HashMap;
public final class a {
    public final u5.a f47102a;
    public final HashMap f47103b;

    public a(u5.a aVar, HashMap hashMap) {
        this.f47102a = aVar;
        this.f47103b = hashMap;
    }

    public final long a(i5.d dVar, long j3, int i10) {
        long j10;
        long Z = j3 - this.f47102a.Z();
        b bVar = (b) this.f47103b.get(dVar);
        long j11 = bVar.f47104a;
        int i11 = i10 - 1;
        if (j11 > 1) {
            j10 = j11;
        } else {
            j10 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j11 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j10 * i11))), Z), bVar.f47105b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f47102a.equals(aVar.f47102a) && this.f47103b.equals(aVar.f47103b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f47102a.hashCode() ^ 1000003) * 1000003) ^ this.f47103b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f47102a + ", values=" + this.f47103b + "}";
    }
}
