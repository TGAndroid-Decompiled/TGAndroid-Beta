package r3;

import a1.g;
import e2.d0;
import j$.util.Objects;
import java.util.Locale;
public final class b {
    public final long f46992a;
    public final long f46993b;
    public final int f46994c;

    public b(long j3, long j10, int i10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f46992a = j3;
        this.f46993b = j10;
        this.f46994c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f46992a == bVar.f46992a && this.f46993b == bVar.f46993b && this.f46994c == bVar.f46994c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f46992a), Long.valueOf(this.f46993b), Integer.valueOf(this.f46994c));
    }

    public final String toString() {
        String str = d0.f8532a;
        Locale locale = Locale.US;
        StringBuilder u10 = g.u(this.f46992a, "Segment: startTimeMs=", ", endTimeMs=");
        u10.append(this.f46993b);
        u10.append(", speedDivisor=");
        u10.append(this.f46994c);
        return u10.toString();
    }
}
