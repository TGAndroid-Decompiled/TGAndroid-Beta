package u3;

import a8.la;
import a8.p0;
import h2.l0;
import j$.util.Objects;
import java.util.Locale;
public final class a {
    public final long f58429a;
    public final long f58430b;
    public final int f58431c;

    public a(long j3, int i7, long j10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.f(z10);
        this.f58429a = j3;
        this.f58430b = j10;
        this.f58431c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f58429a == aVar.f58429a && this.f58430b == aVar.f58430b && this.f58431c == aVar.f58431c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f58429a), Long.valueOf(this.f58430b), Integer.valueOf(this.f58431c));
    }

    public final String toString() {
        String str = l0.f13812a;
        Locale locale = Locale.US;
        StringBuilder t6 = p0.t(this.f58429a, "Segment: startTimeMs=", ", endTimeMs=");
        t6.append(this.f58430b);
        t6.append(", speedDivisor=");
        t6.append(this.f58431c);
        return t6.toString();
    }
}
