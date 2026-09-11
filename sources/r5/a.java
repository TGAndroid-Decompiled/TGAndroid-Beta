package r5;

import java.util.HashMap;
public final class a {
    public final u5.a f44913a;
    public final HashMap f44914b;

    public a(u5.a aVar, HashMap hashMap) {
        this.f44913a = aVar;
        this.f44914b = hashMap;
    }

    public final long a(i5.d dVar, long j3, int i10) {
        long j10;
        long l4 = j3 - this.f44913a.l();
        b bVar = (b) this.f44914b.get(dVar);
        long j11 = bVar.f44915a;
        int i11 = i10 - 1;
        if (j11 > 1) {
            j10 = j11;
        } else {
            j10 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j11 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j10 * i11))), l4), bVar.f44916b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f44913a.equals(aVar.f44913a) && this.f44914b.equals(aVar.f44914b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f44913a.hashCode() ^ 1000003) * 1000003) ^ this.f44914b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f44913a + ", values=" + this.f44914b + "}";
    }
}
