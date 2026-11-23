package u5;

import java.util.HashMap;
public final class a {
    public final x5.a f58463a;
    public final HashMap f58464b;

    public a(x5.a aVar, HashMap hashMap) {
        this.f58463a = aVar;
        this.f58464b = hashMap;
    }

    public final long a(l5.d dVar, long j3, int i7) {
        long j10;
        long r10 = j3 - this.f58463a.r();
        b bVar = (b) this.f58464b.get(dVar);
        long j11 = bVar.f58465a;
        int i10 = i7 - 1;
        if (j11 > 1) {
            j10 = j11;
        } else {
            j10 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i10) * j11 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j10 * i10))), r10), bVar.f58466b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f58463a.equals(aVar.f58463a) && this.f58464b.equals(aVar.f58464b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f58463a.hashCode() ^ 1000003) * 1000003) ^ this.f58464b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f58463a + ", values=" + this.f58464b + "}";
    }
}
