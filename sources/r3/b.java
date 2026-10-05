package r3;

import e2.d0;
import j$.util.Objects;
import java.util.Locale;
public final class b {
    public final long f45798a;
    public final long f45799b;
    public final int f45800c;

    public b(long j3, long j10, int i10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f45798a = j3;
        this.f45799b = j10;
        this.f45800c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f45798a == bVar.f45798a && this.f45799b == bVar.f45799b && this.f45800c == bVar.f45800c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f45798a), Long.valueOf(this.f45799b), Integer.valueOf(this.f45800c));
    }

    public final String toString() {
        String str = d0.f8538a;
        Locale locale = Locale.US;
        StringBuilder u10 = a4.a.u(this.f45798a, "Segment: startTimeMs=", ", endTimeMs=");
        u10.append(this.f45799b);
        u10.append(", speedDivisor=");
        u10.append(this.f45800c);
        return u10.toString();
    }
}
