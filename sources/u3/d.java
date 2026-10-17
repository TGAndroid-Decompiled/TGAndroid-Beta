package u3;

import j$.util.Objects;
public final class d implements Comparable {
    public final long f47528a;
    public final long f47529b;
    public final long f47530c;

    public d(long j10, long j11, long j12) {
        this.f47528a = j10;
        this.f47529b = j11;
        this.f47530c = j12;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f47528a, ((d) obj).f47528a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f47528a == dVar.f47528a && this.f47529b == dVar.f47529b && this.f47530c == dVar.f47530c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f47528a), Long.valueOf(this.f47529b), Long.valueOf(this.f47530c));
    }
}
