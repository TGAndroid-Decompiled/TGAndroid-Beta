package r3;

import e2.d0;
import j$.util.Objects;
import java.util.Locale;
public final class b {
    public final long f42299a;
    public final long f42300b;
    public final int f42301c;

    public b(long j3, long j10, int i10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f42299a = j3;
        this.f42300b = j10;
        this.f42301c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f42299a == bVar.f42299a && this.f42300b == bVar.f42300b && this.f42301c == bVar.f42301c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f42299a), Long.valueOf(this.f42300b), Integer.valueOf(this.f42301c));
    }

    public final String toString() {
        String str = d0.f7870a;
        Locale locale = Locale.US;
        StringBuilder u10 = a4.a.u(this.f42299a, "Segment: startTimeMs=", ", endTimeMs=");
        u10.append(this.f42300b);
        u10.append(", speedDivisor=");
        u10.append(this.f42301c);
        return u10.toString();
    }
}
