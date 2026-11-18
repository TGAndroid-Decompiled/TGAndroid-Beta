package u3;

import a8.la;
import a8.p0;
import h2.l0;
import j$.util.Objects;
import java.util.Locale;
public final class a {
    public final long f58387a;
    public final long f58388b;
    public final int f58389c;

    public a(long j3, int i7, long j10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.f(z10);
        this.f58387a = j3;
        this.f58388b = j10;
        this.f58389c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f58387a == aVar.f58387a && this.f58388b == aVar.f58388b && this.f58389c == aVar.f58389c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f58387a), Long.valueOf(this.f58388b), Integer.valueOf(this.f58389c));
    }

    public final String toString() {
        String str = l0.f13786a;
        Locale locale = Locale.US;
        StringBuilder t6 = p0.t(this.f58387a, "Segment: startTimeMs=", ", endTimeMs=");
        t6.append(this.f58388b);
        t6.append(", speedDivisor=");
        t6.append(this.f58389c);
        return t6.toString();
    }
}
