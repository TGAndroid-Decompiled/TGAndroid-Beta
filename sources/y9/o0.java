package y9;
public final class o0 extends n1 {
    public final long f46592a;
    public final long f46593b;
    public final String f46594c;
    public final String d;

    public o0(String str, long j3, long j10, String str2) {
        this.f46592a = j3;
        this.f46593b = j10;
        this.f46594c = str;
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
            if (this.f46592a == o0Var.f46592a && this.f46593b == o0Var.f46593b && this.f46594c.equals(o0Var.f46594c) && ((str = this.d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f46592a;
        long j10 = this.f46593b;
        int hashCode2 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f46594c.hashCode()) * 1000003;
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
        sb2.append(this.f46592a);
        sb2.append(", size=");
        sb2.append(this.f46593b);
        sb2.append(", name=");
        sb2.append(this.f46594c);
        sb2.append(", uuid=");
        return a4.a.t(sb2, this.d, "}");
    }
}
