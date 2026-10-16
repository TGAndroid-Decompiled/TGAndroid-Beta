package r5;

import java.util.HashMap;
public final class a {
    public final u5.a f43681a;
    public final HashMap f43682b;

    public a(u5.a aVar, HashMap hashMap) {
        this.f43681a = aVar;
        this.f43682b = hashMap;
    }

    public final long a(i5.d dVar, long j10, int i10) {
        long j11;
        long b10 = j10 - this.f43681a.b();
        b bVar = (b) this.f43682b.get(dVar);
        long j12 = bVar.f43683a;
        int i11 = i10 - 1;
        if (j12 > 1) {
            j11 = j12;
        } else {
            j11 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j12 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j11 * i11))), b10), bVar.f43684b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f43681a.equals(aVar.f43681a) && this.f43682b.equals(aVar.f43682b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f43681a.hashCode() ^ 1000003) * 1000003) ^ this.f43682b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f43681a + ", values=" + this.f43682b + "}";
    }
}
