package s5;

import java.util.HashMap;
public final class a {
    public final v5.a f47911a;
    public final HashMap f47912b;

    public a(v5.a aVar, HashMap hashMap) {
        this.f47911a = aVar;
        this.f47912b = hashMap;
    }

    public final long a(j5.d dVar, long j10, int i10) {
        long j11;
        long o10 = j10 - this.f47911a.o();
        b bVar = (b) this.f47912b.get(dVar);
        long j12 = bVar.f47913a;
        int i11 = i10 - 1;
        if (j12 > 1) {
            j11 = j12;
        } else {
            j11 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j12 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j11 * i11))), o10), bVar.f47914b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f47911a.equals(aVar.f47911a) && this.f47912b.equals(aVar.f47912b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f47911a.hashCode() ^ 1000003) * 1000003) ^ this.f47912b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f47911a + ", values=" + this.f47912b + "}";
    }
}
