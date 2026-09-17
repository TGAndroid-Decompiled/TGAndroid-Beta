package r3;

import e2.d0;
import j$.util.Objects;
import java.util.Locale;
public final class b {
    public final long f42034a;
    public final long f42035b;
    public final int f42036c;

    public b(long j3, long j10, int i10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f42034a = j3;
        this.f42035b = j10;
        this.f42036c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f42034a == bVar.f42034a && this.f42035b == bVar.f42035b && this.f42036c == bVar.f42036c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f42034a), Long.valueOf(this.f42035b), Integer.valueOf(this.f42036c));
    }

    public final String toString() {
        String str = d0.f7888a;
        Locale locale = Locale.US;
        StringBuilder t10 = a4.a.t(this.f42034a, "Segment: startTimeMs=", ", endTimeMs=");
        t10.append(this.f42035b);
        t10.append(", speedDivisor=");
        t10.append(this.f42036c);
        return t10.toString();
    }
}
