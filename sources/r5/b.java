package r5;

import java.util.HashMap;
public final class b {
    public final u5.a f46331a;
    public final HashMap f46332b;

    public b(u5.a aVar, HashMap hashMap) {
        this.f46331a = aVar;
        this.f46332b = hashMap;
    }

    public final long a(i5.d dVar, long j10, int i10) {
        long j11;
        long g10 = j10 - this.f46331a.g();
        c cVar = (c) this.f46332b.get(dVar);
        long j12 = cVar.f46333a;
        int i11 = i10 - 1;
        if (j12 > 1) {
            j11 = j12;
        } else {
            j11 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j12 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j11 * i11))), g10), cVar.f46334b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f46331a.equals(bVar.f46331a) && this.f46332b.equals(bVar.f46332b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f46331a.hashCode() ^ 1000003) * 1000003) ^ this.f46332b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f46331a + ", values=" + this.f46332b + "}";
    }
}
