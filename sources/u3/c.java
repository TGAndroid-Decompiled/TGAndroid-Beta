package u3;

import j$.util.Objects;
public final class c implements Comparable {
    public final long f47517a;
    public final long f47518b;
    public final long f47519c;

    public c(long j10, long j11, long j12) {
        this.f47517a = j10;
        this.f47518b = j11;
        this.f47519c = j12;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f47517a, ((c) obj).f47517a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f47517a == cVar.f47517a && this.f47518b == cVar.f47518b && this.f47519c == cVar.f47519c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f47517a), Long.valueOf(this.f47518b), Long.valueOf(this.f47519c));
    }
}
