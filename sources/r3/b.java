package r3;

import e2.d0;
import j$.util.Objects;
import java.util.Locale;
public final class b {
    public final long f44884a;
    public final long f44885b;
    public final int f44886c;

    public b(long j3, long j10, int i10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f44884a = j3;
        this.f44885b = j10;
        this.f44886c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f44884a == bVar.f44884a && this.f44885b == bVar.f44885b && this.f44886c == bVar.f44886c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f44884a), Long.valueOf(this.f44885b), Integer.valueOf(this.f44886c));
    }

    public final String toString() {
        String str = d0.f8737a;
        Locale locale = Locale.US;
        StringBuilder t10 = a4.a.t(this.f44884a, "Segment: startTimeMs=", ", endTimeMs=");
        t10.append(this.f44885b);
        t10.append(", speedDivisor=");
        t10.append(this.f44886c);
        return t10.toString();
    }
}
