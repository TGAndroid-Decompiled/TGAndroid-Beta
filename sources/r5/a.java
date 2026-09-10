package r5;

import java.util.HashMap;
public final class a {
    public final u5.a f41259a;
    public final HashMap f41260b;

    public a(u5.a aVar, HashMap hashMap) {
        this.f41259a = aVar;
        this.f41260b = hashMap;
    }

    public final long a(i5.d dVar, long j3, int i10) {
        long j10;
        long u10 = j3 - this.f41259a.u();
        b bVar = (b) this.f41260b.get(dVar);
        long j11 = bVar.f41261a;
        int i11 = i10 - 1;
        if (j11 > 1) {
            j10 = j11;
        } else {
            j10 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j11 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j10 * i11))), u10), bVar.f41262b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f41259a.equals(aVar.f41259a) && this.f41260b.equals(aVar.f41260b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f41259a.hashCode() ^ 1000003) * 1000003) ^ this.f41260b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f41259a + ", values=" + this.f41260b + "}";
    }
}
