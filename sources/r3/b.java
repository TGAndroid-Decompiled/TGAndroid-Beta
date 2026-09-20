package r3;

import e2.d0;
import j$.util.Objects;
import java.util.Locale;
public final class b {
    public final long f42311a;
    public final long f42312b;
    public final int f42313c;

    public b(long j3, long j10, int i10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f42311a = j3;
        this.f42312b = j10;
        this.f42313c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f42311a == bVar.f42311a && this.f42312b == bVar.f42312b && this.f42313c == bVar.f42313c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f42311a), Long.valueOf(this.f42312b), Integer.valueOf(this.f42313c));
    }

    public final String toString() {
        String str = d0.f7888a;
        Locale locale = Locale.US;
        StringBuilder t10 = a4.a.t(this.f42311a, "Segment: startTimeMs=", ", endTimeMs=");
        t10.append(this.f42312b);
        t10.append(", speedDivisor=");
        t10.append(this.f42313c);
        return t10.toString();
    }
}
