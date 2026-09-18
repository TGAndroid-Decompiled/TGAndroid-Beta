package r5;

import java.util.HashMap;
public final class a {
    public final u5.a f42295a;
    public final HashMap f42296b;

    public a(u5.a aVar, HashMap hashMap) {
        this.f42295a = aVar;
        this.f42296b = hashMap;
    }

    public final long a(i5.d dVar, long j3, int i10) {
        long j10;
        long q6 = j3 - this.f42295a.q();
        b bVar = (b) this.f42296b.get(dVar);
        long j11 = bVar.f42297a;
        int i11 = i10 - 1;
        if (j11 > 1) {
            j10 = j11;
        } else {
            j10 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j11 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j10 * i11))), q6), bVar.f42298b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f42295a.equals(aVar.f42295a) && this.f42296b.equals(aVar.f42296b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f42295a.hashCode() ^ 1000003) * 1000003) ^ this.f42296b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f42295a + ", values=" + this.f42296b + "}";
    }
}
