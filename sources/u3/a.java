package u3;

import a8.ja;
import a8.p0;
import h2.l0;
import j$.util.Objects;
import java.util.Locale;
public final class a {
    public final long f57820a;
    public final long f57821b;
    public final int f57822c;

    public a(long j3, int i7, long j10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.f(z10);
        this.f57820a = j3;
        this.f57821b = j10;
        this.f57822c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f57820a == aVar.f57820a && this.f57821b == aVar.f57821b && this.f57822c == aVar.f57822c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f57820a), Long.valueOf(this.f57821b), Integer.valueOf(this.f57822c));
    }

    public final String toString() {
        String str = l0.f13471a;
        Locale locale = Locale.US;
        StringBuilder t6 = p0.t(this.f57820a, "Segment: startTimeMs=", ", endTimeMs=");
        t6.append(this.f57821b);
        t6.append(", speedDivisor=");
        t6.append(this.f57822c);
        return t6.toString();
    }
}
