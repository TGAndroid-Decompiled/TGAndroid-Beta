package r5;

import java.util.HashMap;
public final class a {
    public final u5.a f47192a;
    public final HashMap f47193b;

    public a(u5.a aVar, HashMap hashMap) {
        this.f47192a = aVar;
        this.f47193b = hashMap;
    }

    public final long a(i5.d dVar, long j3, int i10) {
        long j10;
        long W = j3 - this.f47192a.W();
        b bVar = (b) this.f47193b.get(dVar);
        long j11 = bVar.f47194a;
        int i11 = i10 - 1;
        if (j11 > 1) {
            j10 = j11;
        } else {
            j10 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j11 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j10 * i11))), W), bVar.f47195b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f47192a.equals(aVar.f47192a) && this.f47193b.equals(aVar.f47193b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f47192a.hashCode() ^ 1000003) * 1000003) ^ this.f47193b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f47192a + ", values=" + this.f47193b + "}";
    }
}
