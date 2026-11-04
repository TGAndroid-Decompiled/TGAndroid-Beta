package t5;

import java.util.HashMap;
public final class a {
    public final w5.a f54932a;
    public final HashMap f54933b;

    public a(w5.a aVar, HashMap hashMap) {
        this.f54932a = aVar;
        this.f54933b = hashMap;
    }

    public final long a(k5.d dVar, long j10, int i3) {
        long j11;
        long o10 = j10 - this.f54932a.o();
        b bVar = (b) this.f54933b.get(dVar);
        long j12 = bVar.f54934a;
        int i10 = i3 - 1;
        if (j12 > 1) {
            j11 = j12;
        } else {
            j11 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i10) * j12 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j11 * i10))), o10), bVar.f54935b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f54932a.equals(aVar.f54932a) && this.f54933b.equals(aVar.f54933b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f54932a.hashCode() ^ 1000003) * 1000003) ^ this.f54933b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f54932a + ", values=" + this.f54933b + "}";
    }
}
