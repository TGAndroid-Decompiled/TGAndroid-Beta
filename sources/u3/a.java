package u3;

import a8.ma;
import a8.p0;
import h2.l0;
import j$.util.Objects;
import java.util.Locale;
public final class a {
    public final long f58513a;
    public final long f58514b;
    public final int f58515c;

    public a(long j3, int i7, long j10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.f(z10);
        this.f58513a = j3;
        this.f58514b = j10;
        this.f58515c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f58513a == aVar.f58513a && this.f58514b == aVar.f58514b && this.f58515c == aVar.f58515c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f58513a), Long.valueOf(this.f58514b), Integer.valueOf(this.f58515c));
    }

    public final String toString() {
        String str = l0.f13778a;
        Locale locale = Locale.US;
        StringBuilder t6 = p0.t(this.f58513a, "Segment: startTimeMs=", ", endTimeMs=");
        t6.append(this.f58514b);
        t6.append(", speedDivisor=");
        t6.append(this.f58515c);
        return t6.toString();
    }
}
