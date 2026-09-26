package y9;
public final class o0 extends n1 {
    public final long f46875a;
    public final long f46876b;
    public final String f46877c;
    public final String d;

    public o0(String str, long j3, long j10, String str2) {
        this.f46875a = j3;
        this.f46876b = j10;
        this.f46877c = str;
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
            if (this.f46875a == o0Var.f46875a && this.f46876b == o0Var.f46876b && this.f46877c.equals(o0Var.f46877c) && ((str = this.d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f46875a;
        long j10 = this.f46876b;
        int hashCode2 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f46877c.hashCode()) * 1000003;
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
        sb2.append(this.f46875a);
        sb2.append(", size=");
        sb2.append(this.f46876b);
        sb2.append(", name=");
        sb2.append(this.f46877c);
        sb2.append(", uuid=");
        return a4.a.t(sb2, this.d, "}");
    }
}
