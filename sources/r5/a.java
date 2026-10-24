package r5;

import java.util.HashMap;
public final class a {
    public final u5.a f45434a;
    public final HashMap f45435b;

    public a(u5.a aVar, HashMap hashMap) {
        this.f45434a = aVar;
        this.f45435b = hashMap;
    }

    public final long a(i5.d dVar, long j10, int i10) {
        long j11;
        long d = j10 - this.f45434a.d();
        b bVar = (b) this.f45435b.get(dVar);
        long j12 = bVar.f45436a;
        int i11 = i10 - 1;
        if (j12 > 1) {
            j11 = j12;
        } else {
            j11 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j12 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j11 * i11))), d), bVar.f45437b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f45434a.equals(aVar.f45434a) && this.f45435b.equals(aVar.f45435b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f45434a.hashCode() ^ 1000003) * 1000003) ^ this.f45435b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f45434a + ", values=" + this.f45435b + "}";
    }
}
