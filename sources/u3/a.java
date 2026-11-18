package u3;

import a8.la;
import a8.p0;
import h2.l0;
import j$.util.Objects;
import java.util.Locale;
public final class a {
    public final long f58388a;
    public final long f58389b;
    public final int f58390c;

    public a(long j3, int i7, long j10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.f(z10);
        this.f58388a = j3;
        this.f58389b = j10;
        this.f58390c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f58388a == aVar.f58388a && this.f58389b == aVar.f58389b && this.f58390c == aVar.f58390c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f58388a), Long.valueOf(this.f58389b), Integer.valueOf(this.f58390c));
    }

    public final String toString() {
        String str = l0.f13783a;
        Locale locale = Locale.US;
        StringBuilder t6 = p0.t(this.f58388a, "Segment: startTimeMs=", ", endTimeMs=");
        t6.append(this.f58389b);
        t6.append(", speedDivisor=");
        t6.append(this.f58390c);
        return t6.toString();
    }
}
