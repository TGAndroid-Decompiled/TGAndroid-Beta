package x2;
public final class a {
    public final long f50687a;
    public final long f50688b;

    public a(long j3, long j10) {
        this.f50687a = j3;
        this.f50688b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f50687a == aVar.f50687a && this.f50688b == aVar.f50688b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f50687a) * 31) + ((int) this.f50688b);
    }
}
