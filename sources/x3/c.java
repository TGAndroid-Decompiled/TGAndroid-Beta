package x3;

import j$.util.Objects;
public final class c implements Comparable {
    public final long f58457a;
    public final long f58458b;
    public final long f58459c;

    public c(long j3, long j10, long j11) {
        this.f58457a = j3;
        this.f58458b = j10;
        this.f58459c = j11;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f58457a, ((c) obj).f58457a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f58457a == cVar.f58457a && this.f58458b == cVar.f58458b && this.f58459c == cVar.f58459c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f58457a), Long.valueOf(this.f58458b), Long.valueOf(this.f58459c));
    }
}
