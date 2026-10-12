package r3;

import a1.g;
import e2.d0;
import j$.util.Objects;
import java.util.Locale;
public final class b {
    public final long f47170a;
    public final long f47171b;
    public final int f47172c;

    public b(long j3, long j10, int i10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f47170a = j3;
        this.f47171b = j10;
        this.f47172c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f47170a == bVar.f47170a && this.f47171b == bVar.f47171b && this.f47172c == bVar.f47172c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f47170a), Long.valueOf(this.f47171b), Integer.valueOf(this.f47172c));
    }

    public final String toString() {
        String str = d0.f8529a;
        Locale locale = Locale.US;
        StringBuilder u10 = g.u(this.f47170a, "Segment: startTimeMs=", ", endTimeMs=");
        u10.append(this.f47171b);
        u10.append(", speedDivisor=");
        u10.append(this.f47172c);
        return u10.toString();
    }
}
