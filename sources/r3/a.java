package r3;

import a1.g;
import e2.l0;
import j$.util.Objects;
import java.util.Locale;
import v7.t6;
public final class a {
    public final long f46291a;
    public final long f46292b;
    public final int f46293c;

    public a(long j10, int i10, long j11) {
        boolean z10;
        if (j10 < j11) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.f(z10);
        this.f46291a = j10;
        this.f46292b = j11;
        this.f46293c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f46291a == aVar.f46291a && this.f46292b == aVar.f46292b && this.f46293c == aVar.f46293c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f46291a), Long.valueOf(this.f46292b), Integer.valueOf(this.f46293c));
    }

    public final String toString() {
        String str = l0.f6165a;
        Locale locale = Locale.US;
        StringBuilder s10 = g.s(this.f46291a, "Segment: startTimeMs=", ", endTimeMs=");
        s10.append(this.f46292b);
        s10.append(", speedDivisor=");
        s10.append(this.f46293c);
        return s10.toString();
    }
}
