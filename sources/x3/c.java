package x3;

import j$.util.Objects;
public final class c implements Comparable {
    public final long f60307a;
    public final long f60308b;
    public final long f60309c;

    public c(long j3, long j10, long j11) {
        this.f60307a = j3;
        this.f60308b = j10;
        this.f60309c = j11;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f60307a, ((c) obj).f60307a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f60307a == cVar.f60307a && this.f60308b == cVar.f60308b && this.f60309c == cVar.f60309c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f60307a), Long.valueOf(this.f60308b), Long.valueOf(this.f60309c));
    }
}
