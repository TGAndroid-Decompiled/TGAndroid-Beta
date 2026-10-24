package r3;

import a1.g;
import e2.m0;
import j$.util.Objects;
import java.util.Locale;
import v7.u6;
public final class a {
    public final long f45404a;
    public final long f45405b;
    public final int f45406c;

    public a(long j10, long j11, int i10) {
        boolean z10;
        if (j10 < j11) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        this.f45404a = j10;
        this.f45405b = j11;
        this.f45406c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f45404a == aVar.f45404a && this.f45405b == aVar.f45405b && this.f45406c == aVar.f45406c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f45404a), Long.valueOf(this.f45405b), Integer.valueOf(this.f45406c));
    }

    public final String toString() {
        String str = m0.f8259a;
        Locale locale = Locale.US;
        StringBuilder t10 = g.t(this.f45404a, "Segment: startTimeMs=", ", endTimeMs=");
        t10.append(this.f45405b);
        t10.append(", speedDivisor=");
        t10.append(this.f45406c);
        return t10.toString();
    }
}
