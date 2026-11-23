package u3;

import a8.la;
import a8.p0;
import h2.l0;
import j$.util.Objects;
import java.util.Locale;
public final class a {
    public final long f58433a;
    public final long f58434b;
    public final int f58435c;

    public a(long j3, int i7, long j10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.f(z10);
        this.f58433a = j3;
        this.f58434b = j10;
        this.f58435c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f58433a == aVar.f58433a && this.f58434b == aVar.f58434b && this.f58435c == aVar.f58435c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f58433a), Long.valueOf(this.f58434b), Integer.valueOf(this.f58435c));
    }

    public final String toString() {
        String str = l0.f13815a;
        Locale locale = Locale.US;
        StringBuilder t6 = p0.t(this.f58433a, "Segment: startTimeMs=", ", endTimeMs=");
        t6.append(this.f58434b);
        t6.append(", speedDivisor=");
        t6.append(this.f58435c);
        return t6.toString();
    }
}
