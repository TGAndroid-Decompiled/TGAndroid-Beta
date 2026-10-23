package u3;

import j$.util.Objects;
public final class c implements Comparable {
    public final long f47518a;
    public final long f47519b;
    public final long f47520c;

    public c(long j10, long j11, long j12) {
        this.f47518a = j10;
        this.f47519b = j11;
        this.f47520c = j12;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f47518a, ((c) obj).f47518a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f47518a == cVar.f47518a && this.f47519b == cVar.f47519b && this.f47520c == cVar.f47520c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f47518a), Long.valueOf(this.f47519b), Long.valueOf(this.f47520c));
    }
}
