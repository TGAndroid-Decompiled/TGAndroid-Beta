package u3;

import j$.util.Objects;
public final class c implements Comparable {
    public final long f47504a;
    public final long f47505b;
    public final long f47506c;

    public c(long j10, long j11, long j12) {
        this.f47504a = j10;
        this.f47505b = j11;
        this.f47506c = j12;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f47504a, ((c) obj).f47504a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f47504a == cVar.f47504a && this.f47505b == cVar.f47505b && this.f47506c == cVar.f47506c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f47504a), Long.valueOf(this.f47505b), Long.valueOf(this.f47506c));
    }
}
