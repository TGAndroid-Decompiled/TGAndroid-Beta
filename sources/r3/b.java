package r3;

import a1.g;
import e2.d0;
import j$.util.Objects;
import java.util.Locale;
public final class b {
    public final long f46946a;
    public final long f46947b;
    public final int f46948c;

    public b(long j3, long j10, int i10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f46946a = j3;
        this.f46947b = j10;
        this.f46948c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f46946a == bVar.f46946a && this.f46947b == bVar.f46947b && this.f46948c == bVar.f46948c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f46946a), Long.valueOf(this.f46947b), Integer.valueOf(this.f46948c));
    }

    public final String toString() {
        String str = d0.f8532a;
        Locale locale = Locale.US;
        StringBuilder u10 = g.u(this.f46946a, "Segment: startTimeMs=", ", endTimeMs=");
        u10.append(this.f46947b);
        u10.append(", speedDivisor=");
        u10.append(this.f46948c);
        return u10.toString();
    }
}
