package r3;

import e2.d0;
import j$.util.Objects;
import java.util.Locale;
public final class b {
    public final long f41231a;
    public final long f41232b;
    public final int f41233c;

    public b(long j3, long j10, int i10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f41231a = j3;
        this.f41232b = j10;
        this.f41233c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f41231a == bVar.f41231a && this.f41232b == bVar.f41232b && this.f41233c == bVar.f41233c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f41231a), Long.valueOf(this.f41232b), Integer.valueOf(this.f41233c));
    }

    public final String toString() {
        String str = d0.f7188a;
        Locale locale = Locale.US;
        StringBuilder t10 = a4.a.t(this.f41231a, "Segment: startTimeMs=", ", endTimeMs=");
        t10.append(this.f41232b);
        t10.append(", speedDivisor=");
        t10.append(this.f41233c);
        return t10.toString();
    }
}
