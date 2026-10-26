package x2;
public final class a {
    public final long f51291a;
    public final long f51292b;

    public a(long j10, long j11) {
        this.f51291a = j10;
        this.f51292b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f51291a == aVar.f51291a && this.f51292b == aVar.f51292b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f51291a) * 31) + ((int) this.f51292b);
    }
}
