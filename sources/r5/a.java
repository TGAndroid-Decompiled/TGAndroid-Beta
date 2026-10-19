package r5;

import java.util.HashMap;
public final class a {
    public final u5.a f45011a;
    public final HashMap f45012b;

    public a(u5.a aVar, HashMap hashMap) {
        this.f45011a = aVar;
        this.f45012b = hashMap;
    }

    public final long a(i5.d dVar, long j10, int i10) {
        long j11;
        long d = j10 - this.f45011a.d();
        b bVar = (b) this.f45012b.get(dVar);
        long j12 = bVar.f45013a;
        int i11 = i10 - 1;
        if (j12 > 1) {
            j11 = j12;
        } else {
            j11 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j12 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j11 * i11))), d), bVar.f45014b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f45011a.equals(aVar.f45011a) && this.f45012b.equals(aVar.f45012b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f45011a.hashCode() ^ 1000003) * 1000003) ^ this.f45012b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f45011a + ", values=" + this.f45012b + "}";
    }
}
