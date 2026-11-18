package x3;

import j$.util.Objects;
public final class c implements Comparable {
    public final long f60308a;
    public final long f60309b;
    public final long f60310c;

    public c(long j3, long j10, long j11) {
        this.f60308a = j3;
        this.f60309b = j10;
        this.f60310c = j11;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f60308a, ((c) obj).f60308a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f60308a == cVar.f60308a && this.f60309b == cVar.f60309b && this.f60310c == cVar.f60310c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f60308a), Long.valueOf(this.f60309b), Long.valueOf(this.f60310c));
    }
}
