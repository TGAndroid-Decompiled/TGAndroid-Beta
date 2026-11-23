package u3;

import a8.ma;
import a8.p0;
import h2.l0;
import j$.util.Objects;
import java.util.Locale;
public final class a {
    public final long f58398a;
    public final long f58399b;
    public final int f58400c;

    public a(long j3, int i7, long j10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.f(z10);
        this.f58398a = j3;
        this.f58399b = j10;
        this.f58400c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f58398a == aVar.f58398a && this.f58399b == aVar.f58399b && this.f58400c == aVar.f58400c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f58398a), Long.valueOf(this.f58399b), Integer.valueOf(this.f58400c));
    }

    public final String toString() {
        String str = l0.f13778a;
        Locale locale = Locale.US;
        StringBuilder t6 = p0.t(this.f58398a, "Segment: startTimeMs=", ", endTimeMs=");
        t6.append(this.f58399b);
        t6.append(", speedDivisor=");
        t6.append(this.f58400c);
        return t6.toString();
    }
}
