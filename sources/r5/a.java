package r5;

import java.util.HashMap;
public final class a {
    public final u5.a f45813a;
    public final HashMap f45814b;

    public a(u5.a aVar, HashMap hashMap) {
        this.f45813a = aVar;
        this.f45814b = hashMap;
    }

    public final long a(i5.d dVar, long j3, int i10) {
        long j10;
        long q6 = j3 - this.f45813a.q();
        b bVar = (b) this.f45814b.get(dVar);
        long j11 = bVar.f45815a;
        int i11 = i10 - 1;
        if (j11 > 1) {
            j10 = j11;
        } else {
            j10 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j11 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j10 * i11))), q6), bVar.f45816b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f45813a.equals(aVar.f45813a) && this.f45814b.equals(aVar.f45814b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f45813a.hashCode() ^ 1000003) * 1000003) ^ this.f45814b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f45813a + ", values=" + this.f45814b + "}";
    }
}
