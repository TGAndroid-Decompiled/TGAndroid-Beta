package r3;

import a1.g;
import e2.m0;
import j$.util.Objects;
import java.util.Locale;
import v7.u6;
public final class a {
    public final long f44981a;
    public final long f44982b;
    public final int f44983c;

    public a(long j10, long j11, int i10) {
        boolean z10;
        if (j10 < j11) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        this.f44981a = j10;
        this.f44982b = j11;
        this.f44983c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f44981a == aVar.f44981a && this.f44982b == aVar.f44982b && this.f44983c == aVar.f44983c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f44981a), Long.valueOf(this.f44982b), Integer.valueOf(this.f44983c));
    }

    public final String toString() {
        String str = m0.f8253a;
        Locale locale = Locale.US;
        StringBuilder t10 = g.t(this.f44981a, "Segment: startTimeMs=", ", endTimeMs=");
        t10.append(this.f44982b);
        t10.append(", speedDivisor=");
        t10.append(this.f44983c);
        return t10.toString();
    }
}
