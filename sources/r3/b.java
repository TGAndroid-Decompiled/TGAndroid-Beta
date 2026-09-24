package r3;

import e2.d0;
import j$.util.Objects;
import java.util.Locale;
public final class b {
    public final long f42283a;
    public final long f42284b;
    public final int f42285c;

    public b(long j3, long j10, int i10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f42283a = j3;
        this.f42284b = j10;
        this.f42285c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f42283a == bVar.f42283a && this.f42284b == bVar.f42284b && this.f42285c == bVar.f42285c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f42283a), Long.valueOf(this.f42284b), Integer.valueOf(this.f42285c));
    }

    public final String toString() {
        String str = d0.f7870a;
        Locale locale = Locale.US;
        StringBuilder u10 = a4.a.u(this.f42283a, "Segment: startTimeMs=", ", endTimeMs=");
        u10.append(this.f42284b);
        u10.append(", speedDivisor=");
        u10.append(this.f42285c);
        return u10.toString();
    }
}
