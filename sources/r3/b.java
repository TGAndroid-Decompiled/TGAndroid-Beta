package r3;

import a1.g;
import e2.d0;
import j$.util.Objects;
import java.util.Locale;
public final class b {
    public final long f47072a;
    public final long f47073b;
    public final int f47074c;

    public b(long j3, long j10, int i10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f47072a = j3;
        this.f47073b = j10;
        this.f47074c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f47072a == bVar.f47072a && this.f47073b == bVar.f47073b && this.f47074c == bVar.f47074c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f47072a), Long.valueOf(this.f47073b), Integer.valueOf(this.f47074c));
    }

    public final String toString() {
        String str = d0.f8531a;
        Locale locale = Locale.US;
        StringBuilder u10 = g.u(this.f47072a, "Segment: startTimeMs=", ", endTimeMs=");
        u10.append(this.f47073b);
        u10.append(", speedDivisor=");
        u10.append(this.f47074c);
        return u10.toString();
    }
}
