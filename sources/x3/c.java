package x3;

import j$.util.Objects;
public final class c implements Comparable {
    public final long f58546a;
    public final long f58547b;
    public final long f58548c;

    public c(long j3, long j10, long j11) {
        this.f58546a = j3;
        this.f58547b = j10;
        this.f58548c = j11;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f58546a, ((c) obj).f58546a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f58546a == cVar.f58546a && this.f58547b == cVar.f58547b && this.f58548c == cVar.f58548c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f58546a), Long.valueOf(this.f58547b), Long.valueOf(this.f58548c));
    }
}
