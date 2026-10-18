package r3;

import a1.g;
import e2.m0;
import j$.util.Objects;
import java.util.Locale;
import v7.u6;
public final class a {
    public final long f45027a;
    public final long f45028b;
    public final int f45029c;

    public a(long j10, long j11, int i10) {
        boolean z10;
        if (j10 < j11) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        this.f45027a = j10;
        this.f45028b = j11;
        this.f45029c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f45027a == aVar.f45027a && this.f45028b == aVar.f45028b && this.f45029c == aVar.f45029c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f45027a), Long.valueOf(this.f45028b), Integer.valueOf(this.f45029c));
    }

    public final String toString() {
        String str = m0.f8255a;
        Locale locale = Locale.US;
        StringBuilder t10 = g.t(this.f45027a, "Segment: startTimeMs=", ", endTimeMs=");
        t10.append(this.f45028b);
        t10.append(", speedDivisor=");
        t10.append(this.f45029c);
        return t10.toString();
    }
}
