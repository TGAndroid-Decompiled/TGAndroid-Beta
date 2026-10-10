package y9;

import java.util.List;
public final class p0 extends o1 {
    public final String f52075a;
    public final String f52076b;
    public final List f52077c;
    public final o1 d;
    public final int f52078e;

    public p0(String str, String str2, List list, o1 o1Var, int i10) {
        this.f52075a = str;
        this.f52076b = str2;
        this.f52077c = list;
        this.d = o1Var;
        this.f52078e = i10;
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
            String str2 = p0Var.f52076b;
            if (this.f52075a.equals(p0Var.f52075a) && ((str = this.f52076b) != null ? str.equals(str2) : str2 == null) && this.f52077c.equals(p0Var.f52077c) && ((o1Var = this.d) != null ? o1Var.equals(o1Var2) : o1Var2 == null) && this.f52078e == p0Var.f52078e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f52075a.hashCode() ^ 1000003) * 1000003;
        int i10 = 0;
        String str = this.f52076b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f52077c.hashCode()) * 1000003;
        o1 o1Var = this.d;
        if (o1Var != null) {
            i10 = o1Var.hashCode();
        }
        return ((hashCode3 ^ i10) * 1000003) ^ this.f52078e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f52075a);
        sb2.append(", reason=");
        sb2.append(this.f52076b);
        sb2.append(", frames=");
        sb2.append(this.f52077c);
        sb2.append(", causedBy=");
        sb2.append(this.d);
        sb2.append(", overflowCount=");
        return a1.g.o(this.f52078e, "}", sb2);
    }
}
