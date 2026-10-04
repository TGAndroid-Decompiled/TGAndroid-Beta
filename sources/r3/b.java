package r3;

import e2.d0;
import j$.util.Objects;
import java.util.Locale;
public final class b {
    public final long f45791a;
    public final long f45792b;
    public final int f45793c;

    public b(long j3, long j10, int i10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f45791a = j3;
        this.f45792b = j10;
        this.f45793c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f45791a == bVar.f45791a && this.f45792b == bVar.f45792b && this.f45793c == bVar.f45793c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f45791a), Long.valueOf(this.f45792b), Integer.valueOf(this.f45793c));
    }

    public final String toString() {
        String str = d0.f8538a;
        Locale locale = Locale.US;
        StringBuilder u10 = a4.a.u(this.f45791a, "Segment: startTimeMs=", ", endTimeMs=");
        u10.append(this.f45792b);
        u10.append(", speedDivisor=");
        u10.append(this.f45793c);
        return u10.toString();
    }
}
