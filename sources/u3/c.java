package u3;

import j$.util.Objects;
public final class c implements Comparable {
    public final long f46120a;
    public final long f46121b;
    public final long f46122c;

    public c(long j10, long j11, long j12) {
        this.f46120a = j10;
        this.f46121b = j11;
        this.f46122c = j12;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f46120a, ((c) obj).f46120a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f46120a == cVar.f46120a && this.f46121b == cVar.f46121b && this.f46122c == cVar.f46122c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f46120a), Long.valueOf(this.f46121b), Long.valueOf(this.f46122c));
    }
}
