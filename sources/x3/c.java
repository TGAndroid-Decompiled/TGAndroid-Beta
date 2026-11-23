package x3;

import j$.util.Objects;
public final class c implements Comparable {
    public final long f60353a;
    public final long f60354b;
    public final long f60355c;

    public c(long j3, long j10, long j11) {
        this.f60353a = j3;
        this.f60354b = j10;
        this.f60355c = j11;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f60353a, ((c) obj).f60353a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f60353a == cVar.f60353a && this.f60354b == cVar.f60354b && this.f60355c == cVar.f60355c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f60353a), Long.valueOf(this.f60354b), Long.valueOf(this.f60355c));
    }
}
