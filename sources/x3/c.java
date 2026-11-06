package x3;

import j$.util.Objects;
public final class c implements Comparable {
    public final long f58427a;
    public final long f58428b;
    public final long f58429c;

    public c(long j3, long j10, long j11) {
        this.f58427a = j3;
        this.f58428b = j10;
        this.f58429c = j11;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f58427a, ((c) obj).f58427a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f58427a == cVar.f58427a && this.f58428b == cVar.f58428b && this.f58429c == cVar.f58429c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f58427a), Long.valueOf(this.f58428b), Long.valueOf(this.f58429c));
    }
}
