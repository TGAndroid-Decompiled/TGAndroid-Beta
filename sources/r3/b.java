package r3;

import e2.d0;
import j$.util.Objects;
import java.util.Locale;
public final class b {
    public final long f42402a;
    public final long f42403b;
    public final int f42404c;

    public b(long j3, long j10, int i10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f42402a = j3;
        this.f42403b = j10;
        this.f42404c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f42402a == bVar.f42402a && this.f42403b == bVar.f42403b && this.f42404c == bVar.f42404c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f42402a), Long.valueOf(this.f42403b), Integer.valueOf(this.f42404c));
    }

    public final String toString() {
        String str = d0.f7882a;
        Locale locale = Locale.US;
        StringBuilder u10 = a4.a.u(this.f42402a, "Segment: startTimeMs=", ", endTimeMs=");
        u10.append(this.f42403b);
        u10.append(", speedDivisor=");
        u10.append(this.f42404c);
        return u10.toString();
    }
}
