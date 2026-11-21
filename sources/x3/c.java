package x3;

import j$.util.Objects;
public final class c implements Comparable {
    public final long f60349a;
    public final long f60350b;
    public final long f60351c;

    public c(long j3, long j10, long j11) {
        this.f60349a = j3;
        this.f60350b = j10;
        this.f60351c = j11;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f60349a, ((c) obj).f60349a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f60349a == cVar.f60349a && this.f60350b == cVar.f60350b && this.f60351c == cVar.f60351c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f60349a), Long.valueOf(this.f60350b), Long.valueOf(this.f60351c));
    }
}
