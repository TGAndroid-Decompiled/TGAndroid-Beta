package r3;

import a1.g;
import e2.d0;
import j$.util.Objects;
import java.util.Locale;
public final class b {
    public final long f47038a;
    public final long f47039b;
    public final int f47040c;

    public b(long j3, long j10, int i10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f47038a = j3;
        this.f47039b = j10;
        this.f47040c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f47038a == bVar.f47038a && this.f47039b == bVar.f47039b && this.f47040c == bVar.f47040c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f47038a), Long.valueOf(this.f47039b), Integer.valueOf(this.f47040c));
    }

    public final String toString() {
        String str = d0.f8531a;
        Locale locale = Locale.US;
        StringBuilder u10 = g.u(this.f47038a, "Segment: startTimeMs=", ", endTimeMs=");
        u10.append(this.f47039b);
        u10.append(", speedDivisor=");
        u10.append(this.f47040c);
        return u10.toString();
    }
}
