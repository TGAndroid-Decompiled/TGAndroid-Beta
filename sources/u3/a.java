package u3;

import a8.ia;
import a8.p0;
import h2.m0;
import j$.util.Objects;
import java.util.Locale;
public final class a {
    public final long f56321a;
    public final long f56322b;
    public final int f56323c;

    public a(long j3, int i7, long j10) {
        boolean z9;
        if (j3 < j10) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        this.f56321a = j3;
        this.f56322b = j10;
        this.f56323c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f56321a == aVar.f56321a && this.f56322b == aVar.f56322b && this.f56323c == aVar.f56323c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f56321a), Long.valueOf(this.f56322b), Integer.valueOf(this.f56323c));
    }

    public final String toString() {
        String str = m0.f14114a;
        Locale locale = Locale.US;
        StringBuilder t6 = p0.t(this.f56321a, "Segment: startTimeMs=", ", endTimeMs=");
        t6.append(this.f56322b);
        t6.append(", speedDivisor=");
        t6.append(this.f56323c);
        return t6.toString();
    }
}
