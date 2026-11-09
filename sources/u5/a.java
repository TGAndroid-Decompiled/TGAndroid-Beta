package u5;

import java.util.HashMap;
public final class a {
    public final x5.a f56352a;
    public final HashMap f56353b;

    public a(x5.a aVar, HashMap hashMap) {
        this.f56352a = aVar;
        this.f56353b = hashMap;
    }

    public final long a(l5.d dVar, long j3, int i7) {
        long j10;
        long s5 = j3 - this.f56352a.s();
        b bVar = (b) this.f56353b.get(dVar);
        long j11 = bVar.f56354a;
        int i10 = i7 - 1;
        if (j11 > 1) {
            j10 = j11;
        } else {
            j10 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i10) * j11 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j10 * i10))), s5), bVar.f56355b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f56352a.equals(aVar.f56352a) && this.f56353b.equals(aVar.f56353b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f56352a.hashCode() ^ 1000003) * 1000003) ^ this.f56353b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f56352a + ", values=" + this.f56353b + "}";
    }
}
