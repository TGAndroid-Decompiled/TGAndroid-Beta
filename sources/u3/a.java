package u3;

import a8.ia;
import a8.p0;
import h2.m0;
import j$.util.Objects;
import java.util.Locale;
public final class a {
    public final long f56309a;
    public final long f56310b;
    public final int f56311c;

    public a(long j3, int i7, long j10) {
        boolean z9;
        if (j3 < j10) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        this.f56309a = j3;
        this.f56310b = j10;
        this.f56311c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f56309a == aVar.f56309a && this.f56310b == aVar.f56310b && this.f56311c == aVar.f56311c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f56309a), Long.valueOf(this.f56310b), Integer.valueOf(this.f56311c));
    }

    public final String toString() {
        String str = m0.f14112a;
        Locale locale = Locale.US;
        StringBuilder t6 = p0.t(this.f56309a, "Segment: startTimeMs=", ", endTimeMs=");
        t6.append(this.f56310b);
        t6.append(", speedDivisor=");
        t6.append(this.f56311c);
        return t6.toString();
    }
}
