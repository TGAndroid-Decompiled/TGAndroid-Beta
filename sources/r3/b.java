package r3;

import e2.d0;
import j$.util.Objects;
import java.util.Locale;
public final class b {
    public final long f45784a;
    public final long f45785b;
    public final int f45786c;

    public b(long j3, long j10, int i10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f45784a = j3;
        this.f45785b = j10;
        this.f45786c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f45784a == bVar.f45784a && this.f45785b == bVar.f45785b && this.f45786c == bVar.f45786c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f45784a), Long.valueOf(this.f45785b), Integer.valueOf(this.f45786c));
    }

    public final String toString() {
        String str = d0.f8537a;
        Locale locale = Locale.US;
        StringBuilder t10 = a4.a.t(this.f45784a, "Segment: startTimeMs=", ", endTimeMs=");
        t10.append(this.f45785b);
        t10.append(", speedDivisor=");
        t10.append(this.f45786c);
        return t10.toString();
    }
}
