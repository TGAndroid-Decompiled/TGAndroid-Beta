package u3;

import j$.util.Objects;
public final class d implements Comparable {
    public final long f47506a;
    public final long f47507b;
    public final long f47508c;

    public d(long j10, long j11, long j12) {
        this.f47506a = j10;
        this.f47507b = j11;
        this.f47508c = j12;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f47506a, ((d) obj).f47506a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f47506a == dVar.f47506a && this.f47507b == dVar.f47507b && this.f47508c == dVar.f47508c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f47506a), Long.valueOf(this.f47507b), Long.valueOf(this.f47508c));
    }
}
