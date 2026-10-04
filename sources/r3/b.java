package r3;

import e2.d0;
import j$.util.Objects;
import java.util.Locale;
public final class b {
    public final long f45783a;
    public final long f45784b;
    public final int f45785c;

    public b(long j3, long j10, int i10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f45783a = j3;
        this.f45784b = j10;
        this.f45785c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f45783a == bVar.f45783a && this.f45784b == bVar.f45784b && this.f45785c == bVar.f45785c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f45783a), Long.valueOf(this.f45784b), Integer.valueOf(this.f45785c));
    }

    public final String toString() {
        String str = d0.f8537a;
        Locale locale = Locale.US;
        StringBuilder t10 = a4.a.t(this.f45783a, "Segment: startTimeMs=", ", endTimeMs=");
        t10.append(this.f45784b);
        t10.append(", speedDivisor=");
        t10.append(this.f45785c);
        return t10.toString();
    }
}
