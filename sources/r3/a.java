package r3;

import a1.g;
import e2.l0;
import j$.util.Objects;
import java.util.Locale;
import v7.t6;
public final class a {
    public final long f46302a;
    public final long f46303b;
    public final int f46304c;

    public a(long j10, int i10, long j11) {
        boolean z10;
        if (j10 < j11) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.f(z10);
        this.f46302a = j10;
        this.f46303b = j11;
        this.f46304c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f46302a == aVar.f46302a && this.f46303b == aVar.f46303b && this.f46304c == aVar.f46304c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f46302a), Long.valueOf(this.f46303b), Integer.valueOf(this.f46304c));
    }

    public final String toString() {
        String str = l0.f6165a;
        Locale locale = Locale.US;
        StringBuilder s10 = g.s(this.f46302a, "Segment: startTimeMs=", ", endTimeMs=");
        s10.append(this.f46303b);
        s10.append(", speedDivisor=");
        s10.append(this.f46304c);
        return s10.toString();
    }
}
