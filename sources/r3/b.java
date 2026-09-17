package r3;

import e2.d0;
import j$.util.Objects;
import java.util.Locale;
public final class b {
    public final long f44912a;
    public final long f44913b;
    public final int f44914c;

    public b(long j3, long j10, int i10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f44912a = j3;
        this.f44913b = j10;
        this.f44914c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f44912a == bVar.f44912a && this.f44913b == bVar.f44913b && this.f44914c == bVar.f44914c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f44912a), Long.valueOf(this.f44913b), Integer.valueOf(this.f44914c));
    }

    public final String toString() {
        String str = d0.f8765a;
        Locale locale = Locale.US;
        StringBuilder t10 = a4.a.t(this.f44912a, "Segment: startTimeMs=", ", endTimeMs=");
        t10.append(this.f44913b);
        t10.append(", speedDivisor=");
        t10.append(this.f44914c);
        return t10.toString();
    }
}
