package u5;

import java.util.HashMap;
public final class a {
    public final x5.a f56250a;
    public final HashMap f56251b;

    public a(x5.a aVar, HashMap hashMap) {
        this.f56250a = aVar;
        this.f56251b = hashMap;
    }

    public final long a(l5.d dVar, long j3, int i7) {
        long j10;
        long s5 = j3 - this.f56250a.s();
        b bVar = (b) this.f56251b.get(dVar);
        long j11 = bVar.f56252a;
        int i10 = i7 - 1;
        if (j11 > 1) {
            j10 = j11;
        } else {
            j10 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i10) * j11 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j10 * i10))), s5), bVar.f56253b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f56250a.equals(aVar.f56250a) && this.f56251b.equals(aVar.f56251b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f56250a.hashCode() ^ 1000003) * 1000003) ^ this.f56251b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f56250a + ", values=" + this.f56251b + "}";
    }
}
