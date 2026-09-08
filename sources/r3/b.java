package r3;

import e2.d0;
import j$.util.Objects;
import java.util.Locale;
public final class b {
    public final long f44911a;
    public final long f44912b;
    public final int f44913c;

    public b(long j3, long j10, int i10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f44911a = j3;
        this.f44912b = j10;
        this.f44913c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f44911a == bVar.f44911a && this.f44912b == bVar.f44912b && this.f44913c == bVar.f44913c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f44911a), Long.valueOf(this.f44912b), Integer.valueOf(this.f44913c));
    }

    public final String toString() {
        String str = d0.f8765a;
        Locale locale = Locale.US;
        StringBuilder t10 = a4.a.t(this.f44911a, "Segment: startTimeMs=", ", endTimeMs=");
        t10.append(this.f44912b);
        t10.append(", speedDivisor=");
        t10.append(this.f44913c);
        return t10.toString();
    }
}
