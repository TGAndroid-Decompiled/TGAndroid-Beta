package u3;

import a8.ia;
import a8.p0;
import h2.m0;
import j$.util.Objects;
import java.util.Locale;
public final class a {
    public final long f56310a;
    public final long f56311b;
    public final int f56312c;

    public a(long j3, int i7, long j10) {
        boolean z9;
        if (j3 < j10) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        this.f56310a = j3;
        this.f56311b = j10;
        this.f56312c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f56310a == aVar.f56310a && this.f56311b == aVar.f56311b && this.f56312c == aVar.f56312c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f56310a), Long.valueOf(this.f56311b), Integer.valueOf(this.f56312c));
    }

    public final String toString() {
        String str = m0.f14112a;
        Locale locale = Locale.US;
        StringBuilder t6 = p0.t(this.f56310a, "Segment: startTimeMs=", ", endTimeMs=");
        t6.append(this.f56311b);
        t6.append(", speedDivisor=");
        t6.append(this.f56312c);
        return t6.toString();
    }
}
