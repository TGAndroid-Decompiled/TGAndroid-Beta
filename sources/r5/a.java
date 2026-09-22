package r5;

import java.util.HashMap;
public final class a {
    public final u5.a f42036a;
    public final HashMap f42037b;

    public a(u5.a aVar, HashMap hashMap) {
        this.f42036a = aVar;
        this.f42037b = hashMap;
    }

    public final long a(i5.d dVar, long j3, int i10) {
        long j10;
        long q6 = j3 - this.f42036a.q();
        b bVar = (b) this.f42037b.get(dVar);
        long j11 = bVar.f42038a;
        int i11 = i10 - 1;
        if (j11 > 1) {
            j10 = j11;
        } else {
            j10 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j11 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j10 * i11))), q6), bVar.f42039b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f42036a.equals(aVar.f42036a) && this.f42037b.equals(aVar.f42037b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f42036a.hashCode() ^ 1000003) * 1000003) ^ this.f42037b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f42036a + ", values=" + this.f42037b + "}";
    }
}
