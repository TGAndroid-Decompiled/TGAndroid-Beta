package r5;

import java.util.HashMap;
public final class a {
    public final u5.a f47022a;
    public final HashMap f47023b;

    public a(u5.a aVar, HashMap hashMap) {
        this.f47022a = aVar;
        this.f47023b = hashMap;
    }

    public final long a(i5.d dVar, long j3, int i10) {
        long j10;
        long Z = j3 - this.f47022a.Z();
        b bVar = (b) this.f47023b.get(dVar);
        long j11 = bVar.f47024a;
        int i11 = i10 - 1;
        if (j11 > 1) {
            j10 = j11;
        } else {
            j10 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j11 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j10 * i11))), Z), bVar.f47025b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f47022a.equals(aVar.f47022a) && this.f47023b.equals(aVar.f47023b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f47022a.hashCode() ^ 1000003) * 1000003) ^ this.f47023b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f47022a + ", values=" + this.f47023b + "}";
    }
}
