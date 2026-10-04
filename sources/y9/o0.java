package y9;
public final class o0 extends n1 {
    public final long f50728a;
    public final long f50729b;
    public final String f50730c;
    public final String d;

    public o0(String str, long j3, long j10, String str2) {
        this.f50728a = j3;
        this.f50729b = j10;
        this.f50730c = str;
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
            if (this.f50728a == o0Var.f50728a && this.f50729b == o0Var.f50729b && this.f50730c.equals(o0Var.f50730c) && ((str = this.d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f50728a;
        long j10 = this.f50729b;
        int hashCode2 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f50730c.hashCode()) * 1000003;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ hashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.f50728a);
        sb2.append(", size=");
        sb2.append(this.f50729b);
        sb2.append(", name=");
        sb2.append(this.f50730c);
        sb2.append(", uuid=");
        return a4.a.s(sb2, this.d, "}");
    }
}
