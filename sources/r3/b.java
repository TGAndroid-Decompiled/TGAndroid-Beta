package r3;

import e2.d0;
import j$.util.Objects;
import java.util.Locale;
public final class b {
    public final long f42296a;
    public final long f42297b;
    public final int f42298c;

    public b(long j3, long j10, int i10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f42296a = j3;
        this.f42297b = j10;
        this.f42298c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f42296a == bVar.f42296a && this.f42297b == bVar.f42297b && this.f42298c == bVar.f42298c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f42296a), Long.valueOf(this.f42297b), Integer.valueOf(this.f42298c));
    }

    public final String toString() {
        String str = d0.f7870a;
        Locale locale = Locale.US;
        StringBuilder u10 = a4.a.u(this.f42296a, "Segment: startTimeMs=", ", endTimeMs=");
        u10.append(this.f42297b);
        u10.append(", speedDivisor=");
        u10.append(this.f42298c);
        return u10.toString();
    }
}
