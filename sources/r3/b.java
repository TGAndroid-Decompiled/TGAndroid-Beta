package r3;

import e2.d0;
import j$.util.Objects;
import java.util.Locale;
public final class b {
    public final long f42298a;
    public final long f42299b;
    public final int f42300c;

    public b(long j3, long j10, int i10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f42298a = j3;
        this.f42299b = j10;
        this.f42300c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f42298a == bVar.f42298a && this.f42299b == bVar.f42299b && this.f42300c == bVar.f42300c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f42298a), Long.valueOf(this.f42299b), Integer.valueOf(this.f42300c));
    }

    public final String toString() {
        String str = d0.f7870a;
        Locale locale = Locale.US;
        StringBuilder u10 = a4.a.u(this.f42298a, "Segment: startTimeMs=", ", endTimeMs=");
        u10.append(this.f42299b);
        u10.append(", speedDivisor=");
        u10.append(this.f42300c);
        return u10.toString();
    }
}
