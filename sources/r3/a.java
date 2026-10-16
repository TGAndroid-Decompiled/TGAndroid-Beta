package r3;

import a1.g;
import e2.m0;
import j$.util.Objects;
import java.util.Locale;
import v7.u6;
public final class a {
    public final long f43651a;
    public final long f43652b;
    public final int f43653c;

    public a(long j10, long j11, int i10) {
        boolean z10;
        if (j10 < j11) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        this.f43651a = j10;
        this.f43652b = j11;
        this.f43653c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f43651a == aVar.f43651a && this.f43652b == aVar.f43652b && this.f43653c == aVar.f43653c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f43651a), Long.valueOf(this.f43652b), Integer.valueOf(this.f43653c));
    }

    public final String toString() {
        String str = m0.f8375a;
        Locale locale = Locale.US;
        StringBuilder t10 = g.t(this.f43651a, "Segment: startTimeMs=", ", endTimeMs=");
        t10.append(this.f43652b);
        t10.append(", speedDivisor=");
        t10.append(this.f43653c);
        return t10.toString();
    }
}
