package y9;
public final class o0 extends n1 {
    public final long f52257a;
    public final long f52258b;
    public final String f52259c;
    public final String d;

    public o0(String str, long j3, long j10, String str2) {
        this.f52257a = j3;
        this.f52258b = j10;
        this.f52259c = str;
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
            if (this.f52257a == o0Var.f52257a && this.f52258b == o0Var.f52258b && this.f52259c.equals(o0Var.f52259c) && ((str = this.d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f52257a;
        long j10 = this.f52258b;
        int hashCode2 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f52259c.hashCode()) * 1000003;
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
        sb2.append(this.f52257a);
        sb2.append(", size=");
        sb2.append(this.f52258b);
        sb2.append(", name=");
        sb2.append(this.f52259c);
        sb2.append(", uuid=");
        return a1.g.t(sb2, this.d, "}");
    }
}
