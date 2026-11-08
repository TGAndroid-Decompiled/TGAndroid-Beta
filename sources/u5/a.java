package u5;

import java.util.HashMap;
public final class a {
    public final x5.a f56339a;
    public final HashMap f56340b;

    public a(x5.a aVar, HashMap hashMap) {
        this.f56339a = aVar;
        this.f56340b = hashMap;
    }

    public final long a(l5.d dVar, long j3, int i7) {
        long j10;
        long s5 = j3 - this.f56339a.s();
        b bVar = (b) this.f56340b.get(dVar);
        long j11 = bVar.f56341a;
        int i10 = i7 - 1;
        if (j11 > 1) {
            j10 = j11;
        } else {
            j10 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i10) * j11 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j10 * i10))), s5), bVar.f56342b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f56339a.equals(aVar.f56339a) && this.f56340b.equals(aVar.f56340b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f56339a.hashCode() ^ 1000003) * 1000003) ^ this.f56340b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f56339a + ", values=" + this.f56340b + "}";
    }
}
