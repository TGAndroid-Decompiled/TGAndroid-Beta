package r3;

import a1.g;
import e2.d0;
import j$.util.Objects;
import java.util.Locale;
public final class b {
    public final long f46948a;
    public final long f46949b;
    public final int f46950c;

    public b(long j3, long j10, int i10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f46948a = j3;
        this.f46949b = j10;
        this.f46950c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f46948a == bVar.f46948a && this.f46949b == bVar.f46949b && this.f46950c == bVar.f46950c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f46948a), Long.valueOf(this.f46949b), Integer.valueOf(this.f46950c));
    }

    public final String toString() {
        String str = d0.f8532a;
        Locale locale = Locale.US;
        StringBuilder u10 = g.u(this.f46948a, "Segment: startTimeMs=", ", endTimeMs=");
        u10.append(this.f46949b);
        u10.append(", speedDivisor=");
        u10.append(this.f46950c);
        return u10.toString();
    }
}
