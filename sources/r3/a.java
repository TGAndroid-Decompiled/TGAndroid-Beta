package r3;

import a1.g;
import e2.m0;
import j$.util.Objects;
import java.util.Locale;
import v7.u6;
public final class a {
    public final long f44989a;
    public final long f44990b;
    public final int f44991c;

    public a(long j10, long j11, int i10) {
        boolean z10;
        if (j10 < j11) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        this.f44989a = j10;
        this.f44990b = j11;
        this.f44991c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f44989a == aVar.f44989a && this.f44990b == aVar.f44990b && this.f44991c == aVar.f44991c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f44989a), Long.valueOf(this.f44990b), Integer.valueOf(this.f44991c));
    }

    public final String toString() {
        String str = m0.f8252a;
        Locale locale = Locale.US;
        StringBuilder t10 = g.t(this.f44989a, "Segment: startTimeMs=", ", endTimeMs=");
        t10.append(this.f44990b);
        t10.append(", speedDivisor=");
        t10.append(this.f44991c);
        return t10.toString();
    }
}
