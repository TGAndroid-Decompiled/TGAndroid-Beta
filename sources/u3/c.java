package u3;

import j$.util.Objects;
public final class c implements Comparable {
    public final long f49537a;
    public final long f49538b;
    public final long f49539c;

    public c(long j10, long j11, long j12) {
        this.f49537a = j10;
        this.f49538b = j11;
        this.f49539c = j12;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f49537a, ((c) obj).f49537a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f49537a == cVar.f49537a && this.f49538b == cVar.f49538b && this.f49539c == cVar.f49539c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f49537a), Long.valueOf(this.f49538b), Long.valueOf(this.f49539c));
    }
}
