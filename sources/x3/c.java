package x3;

import j$.util.Objects;
public final class c implements Comparable {
    public final long f60436a;
    public final long f60437b;
    public final long f60438c;

    public c(long j3, long j10, long j11) {
        this.f60436a = j3;
        this.f60437b = j10;
        this.f60438c = j11;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f60436a, ((c) obj).f60436a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f60436a == cVar.f60436a && this.f60437b == cVar.f60437b && this.f60438c == cVar.f60438c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f60436a), Long.valueOf(this.f60437b), Long.valueOf(this.f60438c));
    }
}
