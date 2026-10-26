package r3;

import a1.g;
import a8.yb;
import e2.n0;
import j$.util.Objects;
import java.util.Locale;
public final class a {
    public final long f47272a;
    public final long f47273b;
    public final int f47274c;

    public a(long j10, long j11, int i10) {
        boolean z10;
        if (j10 < j11) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        this.f47272a = j10;
        this.f47273b = j11;
        this.f47274c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f47272a == aVar.f47272a && this.f47273b == aVar.f47273b && this.f47274c == aVar.f47274c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f47272a), Long.valueOf(this.f47273b), Integer.valueOf(this.f47274c));
    }

    public final String toString() {
        String str = n0.f9692a;
        Locale locale = Locale.US;
        StringBuilder t10 = g.t(this.f47272a, "Segment: startTimeMs=", ", endTimeMs=");
        t10.append(this.f47273b);
        t10.append(", speedDivisor=");
        t10.append(this.f47274c);
        return t10.toString();
    }
}
