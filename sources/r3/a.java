package r3;

import a1.g;
import a8.yb;
import e2.n0;
import j$.util.Objects;
import java.util.Locale;
public final class a {
    public final long f47307a;
    public final long f47308b;
    public final int f47309c;

    public a(long j10, long j11, int i10) {
        boolean z10;
        if (j10 < j11) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        this.f47307a = j10;
        this.f47308b = j11;
        this.f47309c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f47307a == aVar.f47307a && this.f47308b == aVar.f47308b && this.f47309c == aVar.f47309c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f47307a), Long.valueOf(this.f47308b), Integer.valueOf(this.f47309c));
    }

    public final String toString() {
        String str = n0.f9691a;
        Locale locale = Locale.US;
        StringBuilder t10 = g.t(this.f47307a, "Segment: startTimeMs=", ", endTimeMs=");
        t10.append(this.f47308b);
        t10.append(", speedDivisor=");
        t10.append(this.f47309c);
        return t10.toString();
    }
}
