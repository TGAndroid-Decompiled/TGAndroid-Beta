package r3;

import e2.d0;
import j$.util.Objects;
import java.util.Locale;
public final class b {
    public final long f42332a;
    public final long f42333b;
    public final int f42334c;

    public b(long j3, long j10, int i10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f42332a = j3;
        this.f42333b = j10;
        this.f42334c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f42332a == bVar.f42332a && this.f42333b == bVar.f42333b && this.f42334c == bVar.f42334c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f42332a), Long.valueOf(this.f42333b), Integer.valueOf(this.f42334c));
    }

    public final String toString() {
        String str = d0.f7887a;
        Locale locale = Locale.US;
        StringBuilder t10 = a4.a.t(this.f42332a, "Segment: startTimeMs=", ", endTimeMs=");
        t10.append(this.f42333b);
        t10.append(", speedDivisor=");
        t10.append(this.f42334c);
        return t10.toString();
    }
}
