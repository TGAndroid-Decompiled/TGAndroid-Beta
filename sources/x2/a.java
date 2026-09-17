package x2;
public final class a {
    public final long f45162a;
    public final long f45163b;

    public a(long j3, long j10) {
        this.f45162a = j3;
        this.f45163b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f45162a == aVar.f45162a && this.f45163b == aVar.f45163b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f45162a) * 31) + ((int) this.f45163b);
    }
}
