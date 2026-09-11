package r3;

import e2.d0;
import j$.util.Objects;
import java.util.Locale;
public final class b {
    public final long f44883a;
    public final long f44884b;
    public final int f44885c;

    public b(long j3, long j10, int i10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f44883a = j3;
        this.f44884b = j10;
        this.f44885c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f44883a == bVar.f44883a && this.f44884b == bVar.f44884b && this.f44885c == bVar.f44885c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f44883a), Long.valueOf(this.f44884b), Integer.valueOf(this.f44885c));
    }

    public final String toString() {
        String str = d0.f8737a;
        Locale locale = Locale.US;
        StringBuilder t10 = a4.a.t(this.f44883a, "Segment: startTimeMs=", ", endTimeMs=");
        t10.append(this.f44884b);
        t10.append(", speedDivisor=");
        t10.append(this.f44885c);
        return t10.toString();
    }
}
