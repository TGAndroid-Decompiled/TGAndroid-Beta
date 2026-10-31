package r5;

import java.util.HashMap;
public final class b {
    public final u5.a f46320a;
    public final HashMap f46321b;

    public b(u5.a aVar, HashMap hashMap) {
        this.f46320a = aVar;
        this.f46321b = hashMap;
    }

    public final long a(i5.d dVar, long j10, int i10) {
        long j11;
        long g10 = j10 - this.f46320a.g();
        c cVar = (c) this.f46321b.get(dVar);
        long j12 = cVar.f46322a;
        int i11 = i10 - 1;
        if (j12 > 1) {
            j11 = j12;
        } else {
            j11 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j12 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j11 * i11))), g10), cVar.f46323b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f46320a.equals(bVar.f46320a) && this.f46321b.equals(bVar.f46321b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f46320a.hashCode() ^ 1000003) * 1000003) ^ this.f46321b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f46320a + ", values=" + this.f46321b + "}";
    }
}
