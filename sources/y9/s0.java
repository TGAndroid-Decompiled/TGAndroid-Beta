package y9;
public final class s0 extends q1 {
    public final long f52054a;
    public final String f52055b;
    public final String f52056c;
    public final long d;
    public final int f52057e;

    public s0(long j3, String str, String str2, long j10, int i10) {
        this.f52054a = j3;
        this.f52055b = str;
        this.f52056c = str2;
        this.d = j10;
        this.f52057e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q1) {
            s0 s0Var = (s0) ((q1) obj);
            String str2 = s0Var.f52056c;
            if (this.f52054a == s0Var.f52054a && this.f52055b.equals(s0Var.f52055b) && ((str = this.f52056c) != null ? str.equals(str2) : str2 == null) && this.d == s0Var.d && this.f52057e == s0Var.f52057e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f52054a;
        int hashCode2 = (((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f52055b.hashCode()) * 1000003;
        String str = this.f52056c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.d;
        return ((((hashCode2 ^ hashCode) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f52057e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f52054a);
        sb2.append(", symbol=");
        sb2.append(this.f52055b);
        sb2.append(", file=");
        sb2.append(this.f52056c);
        sb2.append(", offset=");
        sb2.append(this.d);
        sb2.append(", importance=");
        return a1.g.o(this.f52057e, "}", sb2);
    }
}
