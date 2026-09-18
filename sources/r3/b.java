package r3;

import e2.d0;
import j$.util.Objects;
import java.util.Locale;
public final class b {
    public final long f42267a;
    public final long f42268b;
    public final int f42269c;

    public b(long j3, long j10, int i10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f42267a = j3;
        this.f42268b = j10;
        this.f42269c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f42267a == bVar.f42267a && this.f42268b == bVar.f42268b && this.f42269c == bVar.f42269c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f42267a), Long.valueOf(this.f42268b), Integer.valueOf(this.f42269c));
    }

    public final String toString() {
        String str = d0.f7887a;
        Locale locale = Locale.US;
        StringBuilder t10 = a4.a.t(this.f42267a, "Segment: startTimeMs=", ", endTimeMs=");
        t10.append(this.f42268b);
        t10.append(", speedDivisor=");
        t10.append(this.f42269c);
        return t10.toString();
    }
}
