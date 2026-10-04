package r5;

import java.util.HashMap;
public final class a {
    public final u5.a f45814a;
    public final HashMap f45815b;

    public a(u5.a aVar, HashMap hashMap) {
        this.f45814a = aVar;
        this.f45815b = hashMap;
    }

    public final long a(i5.d dVar, long j3, int i10) {
        long j10;
        long q6 = j3 - this.f45814a.q();
        b bVar = (b) this.f45815b.get(dVar);
        long j11 = bVar.f45816a;
        int i11 = i10 - 1;
        if (j11 > 1) {
            j10 = j11;
        } else {
            j10 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j11 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j10 * i11))), q6), bVar.f45817b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f45814a.equals(aVar.f45814a) && this.f45815b.equals(aVar.f45815b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f45814a.hashCode() ^ 1000003) * 1000003) ^ this.f45815b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f45814a + ", values=" + this.f45815b + "}";
    }
}
