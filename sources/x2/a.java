package x2;
public final class a {
    public final long f50502a;
    public final long f50503b;

    public a(long j3, long j10) {
        this.f50502a = j3;
        this.f50503b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f50502a == aVar.f50502a && this.f50503b == aVar.f50503b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f50502a) * 31) + ((int) this.f50503b);
    }
}
