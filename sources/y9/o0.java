package y9;
public final class o0 extends n1 {
    public final long f52146a;
    public final long f52147b;
    public final String f52148c;
    public final String d;

    public o0(String str, long j3, long j10, String str2) {
        this.f52146a = j3;
        this.f52147b = j10;
        this.f52148c = str;
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
            if (this.f52146a == o0Var.f52146a && this.f52147b == o0Var.f52147b && this.f52148c.equals(o0Var.f52148c) && ((str = this.d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f52146a;
        long j10 = this.f52147b;
        int hashCode2 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f52148c.hashCode()) * 1000003;
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
        sb2.append(this.f52146a);
        sb2.append(", size=");
        sb2.append(this.f52147b);
        sb2.append(", name=");
        sb2.append(this.f52148c);
        sb2.append(", uuid=");
        return a1.g.t(sb2, this.d, "}");
    }
}
