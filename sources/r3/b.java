package r3;

import e2.d0;
import j$.util.Objects;
import java.util.Locale;
public final class b {
    public final long f42012a;
    public final long f42013b;
    public final int f42014c;

    public b(long j3, long j10, int i10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f42012a = j3;
        this.f42013b = j10;
        this.f42014c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f42012a == bVar.f42012a && this.f42013b == bVar.f42013b && this.f42014c == bVar.f42014c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f42012a), Long.valueOf(this.f42013b), Integer.valueOf(this.f42014c));
    }

    public final String toString() {
        String str = d0.f7883a;
        Locale locale = Locale.US;
        StringBuilder t10 = a4.a.t(this.f42012a, "Segment: startTimeMs=", ", endTimeMs=");
        t10.append(this.f42013b);
        t10.append(", speedDivisor=");
        t10.append(this.f42014c);
        return t10.toString();
    }
}
