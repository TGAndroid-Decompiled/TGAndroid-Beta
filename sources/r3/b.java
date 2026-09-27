package r3;

import e2.d0;
import j$.util.Objects;
import java.util.Locale;
public final class b {
    public final long f42342a;
    public final long f42343b;
    public final int f42344c;

    public b(long j3, long j10, int i10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f42342a = j3;
        this.f42343b = j10;
        this.f42344c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f42342a == bVar.f42342a && this.f42343b == bVar.f42343b && this.f42344c == bVar.f42344c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f42342a), Long.valueOf(this.f42343b), Integer.valueOf(this.f42344c));
    }

    public final String toString() {
        String str = d0.f7872a;
        Locale locale = Locale.US;
        StringBuilder t10 = a4.a.t(this.f42342a, "Segment: startTimeMs=", ", endTimeMs=");
        t10.append(this.f42343b);
        t10.append(", speedDivisor=");
        t10.append(this.f42344c);
        return t10.toString();
    }
}
