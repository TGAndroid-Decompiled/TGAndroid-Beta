package x3;

import j$.util.Objects;
public final class c implements Comparable {
    public final long f58452a;
    public final long f58453b;
    public final long f58454c;

    public c(long j3, long j10, long j11) {
        this.f58452a = j3;
        this.f58453b = j10;
        this.f58454c = j11;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f58452a, ((c) obj).f58452a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f58452a == cVar.f58452a && this.f58453b == cVar.f58453b && this.f58454c == cVar.f58454c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f58452a), Long.valueOf(this.f58453b), Long.valueOf(this.f58454c));
    }
}
