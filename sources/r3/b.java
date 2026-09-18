package r3;

import e2.d0;
import j$.util.Objects;
import java.util.Locale;
public final class b {
    public final long f42039a;
    public final long f42040b;
    public final int f42041c;

    public b(long j3, long j10, int i10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f42039a = j3;
        this.f42040b = j10;
        this.f42041c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f42039a == bVar.f42039a && this.f42040b == bVar.f42040b && this.f42041c == bVar.f42041c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f42039a), Long.valueOf(this.f42040b), Integer.valueOf(this.f42041c));
    }

    public final String toString() {
        String str = d0.f7888a;
        Locale locale = Locale.US;
        StringBuilder t10 = a4.a.t(this.f42039a, "Segment: startTimeMs=", ", endTimeMs=");
        t10.append(this.f42040b);
        t10.append(", speedDivisor=");
        t10.append(this.f42041c);
        return t10.toString();
    }
}
