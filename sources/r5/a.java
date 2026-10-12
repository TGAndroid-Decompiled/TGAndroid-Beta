package r5;

import java.util.HashMap;
public final class a {
    public final u5.a f43922a;
    public final HashMap f43923b;

    public a(u5.a aVar, HashMap hashMap) {
        this.f43922a = aVar;
        this.f43923b = hashMap;
    }

    public final long a(i5.d dVar, long j10, int i10) {
        long j11;
        long d = j10 - this.f43922a.d();
        b bVar = (b) this.f43923b.get(dVar);
        long j12 = bVar.f43924a;
        int i11 = i10 - 1;
        if (j12 > 1) {
            j11 = j12;
        } else {
            j11 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j12 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j11 * i11))), d), bVar.f43925b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f43922a.equals(aVar.f43922a) && this.f43923b.equals(aVar.f43923b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f43922a.hashCode() ^ 1000003) * 1000003) ^ this.f43923b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f43922a + ", values=" + this.f43923b + "}";
    }
}
