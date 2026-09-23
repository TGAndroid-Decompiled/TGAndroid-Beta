package r3;

import e2.d0;
import j$.util.Objects;
import java.util.Locale;
public final class b {
    public final long f41964a;
    public final long f41965b;
    public final int f41966c;

    public b(long j3, long j10, int i10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f41964a = j3;
        this.f41965b = j10;
        this.f41966c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f41964a == bVar.f41964a && this.f41965b == bVar.f41965b && this.f41966c == bVar.f41966c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f41964a), Long.valueOf(this.f41965b), Integer.valueOf(this.f41966c));
    }

    public final String toString() {
        String str = d0.f7871a;
        Locale locale = Locale.US;
        StringBuilder u10 = a4.a.u(this.f41964a, "Segment: startTimeMs=", ", endTimeMs=");
        u10.append(this.f41965b);
        u10.append(", speedDivisor=");
        u10.append(this.f41966c);
        return u10.toString();
    }
}
