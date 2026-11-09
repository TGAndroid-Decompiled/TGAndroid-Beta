package u3;

import a8.ia;
import a8.p0;
import h2.m0;
import j$.util.Objects;
import java.util.Locale;
public final class a {
    public final long f56322a;
    public final long f56323b;
    public final int f56324c;

    public a(long j3, int i7, long j10) {
        boolean z9;
        if (j3 < j10) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        this.f56322a = j3;
        this.f56323b = j10;
        this.f56324c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f56322a == aVar.f56322a && this.f56323b == aVar.f56323b && this.f56324c == aVar.f56324c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f56322a), Long.valueOf(this.f56323b), Integer.valueOf(this.f56324c));
    }

    public final String toString() {
        String str = m0.f14112a;
        Locale locale = Locale.US;
        StringBuilder t6 = p0.t(this.f56322a, "Segment: startTimeMs=", ", endTimeMs=");
        t6.append(this.f56323b);
        t6.append(", speedDivisor=");
        t6.append(this.f56324c);
        return t6.toString();
    }
}
