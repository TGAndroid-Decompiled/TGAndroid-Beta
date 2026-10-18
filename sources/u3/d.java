package u3;

import j$.util.Objects;
public final class d implements Comparable {
    public final long f47550a;
    public final long f47551b;
    public final long f47552c;

    public d(long j10, long j11, long j12) {
        this.f47550a = j10;
        this.f47551b = j11;
        this.f47552c = j12;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f47550a, ((d) obj).f47550a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f47550a == dVar.f47550a && this.f47551b == dVar.f47551b && this.f47552c == dVar.f47552c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f47550a), Long.valueOf(this.f47551b), Long.valueOf(this.f47552c));
    }
}
