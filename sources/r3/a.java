package r3;

import a1.g;
import e2.m0;
import j$.util.Objects;
import java.util.Locale;
import v7.u6;
public final class a {
    public final long f44979a;
    public final long f44980b;
    public final int f44981c;

    public a(long j10, long j11, int i10) {
        boolean z10;
        if (j10 < j11) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        this.f44979a = j10;
        this.f44980b = j11;
        this.f44981c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f44979a == aVar.f44979a && this.f44980b == aVar.f44980b && this.f44981c == aVar.f44981c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f44979a), Long.valueOf(this.f44980b), Integer.valueOf(this.f44981c));
    }

    public final String toString() {
        String str = m0.f8254a;
        Locale locale = Locale.US;
        StringBuilder t10 = g.t(this.f44979a, "Segment: startTimeMs=", ", endTimeMs=");
        t10.append(this.f44980b);
        t10.append(", speedDivisor=");
        t10.append(this.f44981c);
        return t10.toString();
    }
}
