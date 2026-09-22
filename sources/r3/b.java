package r3;

import e2.d0;
import j$.util.Objects;
import java.util.Locale;
public final class b {
    public final long f42008a;
    public final long f42009b;
    public final int f42010c;

    public b(long j3, long j10, int i10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f42008a = j3;
        this.f42009b = j10;
        this.f42010c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f42008a == bVar.f42008a && this.f42009b == bVar.f42009b && this.f42010c == bVar.f42010c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f42008a), Long.valueOf(this.f42009b), Integer.valueOf(this.f42010c));
    }

    public final String toString() {
        String str = d0.f7885a;
        Locale locale = Locale.US;
        StringBuilder u10 = a4.a.u(this.f42008a, "Segment: startTimeMs=", ", endTimeMs=");
        u10.append(this.f42009b);
        u10.append(", speedDivisor=");
        u10.append(this.f42010c);
        return u10.toString();
    }
}
