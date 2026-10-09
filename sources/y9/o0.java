package y9;
public final class o0 extends n1 {
    public final long f52023a;
    public final long f52024b;
    public final String f52025c;
    public final String d;

    public o0(String str, long j3, long j10, String str2) {
        this.f52023a = j3;
        this.f52024b = j10;
        this.f52025c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof n1) {
            o0 o0Var = (o0) ((n1) obj);
            String str2 = o0Var.d;
            if (this.f52023a == o0Var.f52023a && this.f52024b == o0Var.f52024b && this.f52025c.equals(o0Var.f52025c) && ((str = this.d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f52023a;
        long j10 = this.f52024b;
        int hashCode2 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f52025c.hashCode()) * 1000003;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.f52023a);
        sb2.append(", size=");
        sb2.append(this.f52024b);
        sb2.append(", name=");
        sb2.append(this.f52025c);
        sb2.append(", uuid=");
        return a1.g.t(sb2, this.d, "}");
    }
}
