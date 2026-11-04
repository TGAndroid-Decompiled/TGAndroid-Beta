package t3;

import a1.g;
import b8.zb;
import g2.n0;
import j$.util.Objects;
import java.util.Locale;
public final class a {
    public final long f54902a;
    public final long f54903b;
    public final int f54904c;

    public a(long j10, int i3, long j11) {
        boolean z10;
        if (j10 < j11) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        this.f54902a = j10;
        this.f54903b = j11;
        this.f54904c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f54902a == aVar.f54902a && this.f54903b == aVar.f54903b && this.f54904c == aVar.f54904c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f54902a), Long.valueOf(this.f54903b), Integer.valueOf(this.f54904c));
    }

    public final String toString() {
        String str = n0.f11873a;
        Locale locale = Locale.US;
        StringBuilder t10 = g.t(this.f54902a, "Segment: startTimeMs=", ", endTimeMs=");
        t10.append(this.f54903b);
        t10.append(", speedDivisor=");
        t10.append(this.f54904c);
        return t10.toString();
    }
}
