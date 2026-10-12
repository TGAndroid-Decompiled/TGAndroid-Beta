package r3;

import a1.g;
import e2.d0;
import j$.util.Objects;
import java.util.Locale;
public final class b {
    public final long f47162a;
    public final long f47163b;
    public final int f47164c;

    public b(long j3, long j10, int i10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f47162a = j3;
        this.f47163b = j10;
        this.f47164c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f47162a == bVar.f47162a && this.f47163b == bVar.f47163b && this.f47164c == bVar.f47164c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f47162a), Long.valueOf(this.f47163b), Integer.valueOf(this.f47164c));
    }

    public final String toString() {
        String str = d0.f8529a;
        Locale locale = Locale.US;
        StringBuilder u10 = g.u(this.f47162a, "Segment: startTimeMs=", ", endTimeMs=");
        u10.append(this.f47163b);
        u10.append(", speedDivisor=");
        u10.append(this.f47164c);
        return u10.toString();
    }
}
