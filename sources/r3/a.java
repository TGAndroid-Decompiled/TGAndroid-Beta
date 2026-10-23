package r3;

import a1.g;
import e2.m0;
import j$.util.Objects;
import java.util.Locale;
import v7.u6;
public final class a {
    public final long f45405a;
    public final long f45406b;
    public final int f45407c;

    public a(long j10, long j11, int i10) {
        boolean z10;
        if (j10 < j11) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        this.f45405a = j10;
        this.f45406b = j11;
        this.f45407c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f45405a == aVar.f45405a && this.f45406b == aVar.f45406b && this.f45407c == aVar.f45407c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f45405a), Long.valueOf(this.f45406b), Integer.valueOf(this.f45407c));
    }

    public final String toString() {
        String str = m0.f8259a;
        Locale locale = Locale.US;
        StringBuilder t10 = g.t(this.f45405a, "Segment: startTimeMs=", ", endTimeMs=");
        t10.append(this.f45406b);
        t10.append(", speedDivisor=");
        t10.append(this.f45407c);
        return t10.toString();
    }
}
