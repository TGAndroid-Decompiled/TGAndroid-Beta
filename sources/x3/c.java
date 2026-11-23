package x3;

import j$.util.Objects;
public final class c implements Comparable {
    public final long f60318a;
    public final long f60319b;
    public final long f60320c;

    public c(long j3, long j10, long j11) {
        this.f60318a = j3;
        this.f60319b = j10;
        this.f60320c = j11;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f60318a, ((c) obj).f60318a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f60318a == cVar.f60318a && this.f60319b == cVar.f60319b && this.f60320c == cVar.f60320c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f60318a), Long.valueOf(this.f60319b), Long.valueOf(this.f60320c));
    }
}
