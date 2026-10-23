package r5;

import java.util.HashMap;
public final class a {
    public final u5.a f45435a;
    public final HashMap f45436b;

    public a(u5.a aVar, HashMap hashMap) {
        this.f45435a = aVar;
        this.f45436b = hashMap;
    }

    public final long a(i5.d dVar, long j10, int i10) {
        long j11;
        long d = j10 - this.f45435a.d();
        b bVar = (b) this.f45436b.get(dVar);
        long j12 = bVar.f45437a;
        int i11 = i10 - 1;
        if (j12 > 1) {
            j11 = j12;
        } else {
            j11 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j12 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j11 * i11))), d), bVar.f45438b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f45435a.equals(aVar.f45435a) && this.f45436b.equals(aVar.f45436b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f45435a.hashCode() ^ 1000003) * 1000003) ^ this.f45436b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f45435a + ", values=" + this.f45436b + "}";
    }
}
