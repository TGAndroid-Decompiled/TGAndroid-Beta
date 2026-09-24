package x2;
public final class a {
    public final long f45403a;
    public final long f45404b;

    public a(long j3, long j10) {
        this.f45403a = j3;
        this.f45404b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f45403a == aVar.f45403a && this.f45404b == aVar.f45404b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f45403a) * 31) + ((int) this.f45404b);
    }
}
