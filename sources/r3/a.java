package r3;

import a1.g;
import e2.m0;
import j$.util.Objects;
import java.util.Locale;
import v7.u6;
public final class a {
    public final long f45007a;
    public final long f45008b;
    public final int f45009c;

    public a(long j10, long j11, int i10) {
        boolean z10;
        if (j10 < j11) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        this.f45007a = j10;
        this.f45008b = j11;
        this.f45009c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f45007a == aVar.f45007a && this.f45008b == aVar.f45008b && this.f45009c == aVar.f45009c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f45007a), Long.valueOf(this.f45008b), Integer.valueOf(this.f45009c));
    }

    public final String toString() {
        String str = m0.f8254a;
        Locale locale = Locale.US;
        StringBuilder t10 = g.t(this.f45007a, "Segment: startTimeMs=", ", endTimeMs=");
        t10.append(this.f45008b);
        t10.append(", speedDivisor=");
        t10.append(this.f45009c);
        return t10.toString();
    }
}
