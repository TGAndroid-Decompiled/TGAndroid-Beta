package y9;

import java.util.List;
public final class p0 extends o1 {
    public final String f50734a;
    public final String f50735b;
    public final List f50736c;
    public final o1 d;
    public final int f50737e;

    public p0(String str, String str2, List list, o1 o1Var, int i10) {
        this.f50734a = str;
        this.f50735b = str2;
        this.f50736c = list;
        this.d = o1Var;
        this.f50737e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        o1 o1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof o1) {
            p0 p0Var = (p0) ((o1) obj);
            o1 o1Var2 = p0Var.d;
            String str2 = p0Var.f50735b;
            if (this.f50734a.equals(p0Var.f50734a) && ((str = this.f50735b) != null ? str.equals(str2) : str2 == null) && this.f50736c.equals(p0Var.f50736c) && ((o1Var = this.d) != null ? o1Var.equals(o1Var2) : o1Var2 == null) && this.f50737e == p0Var.f50737e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f50734a.hashCode() ^ 1000003) * 1000003;
        int i10 = 0;
        String str = this.f50735b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f50736c.hashCode()) * 1000003;
        o1 o1Var = this.d;
        if (o1Var != null) {
            i10 = o1Var.hashCode();
        }
        return ((hashCode3 ^ i10) * 1000003) ^ this.f50737e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f50734a);
        sb2.append(", reason=");
        sb2.append(this.f50735b);
        sb2.append(", frames=");
        sb2.append(this.f50736c);
        sb2.append(", causedBy=");
        sb2.append(this.d);
        sb2.append(", overflowCount=");
        return a4.a.n(this.f50737e, "}", sb2);
    }
}
