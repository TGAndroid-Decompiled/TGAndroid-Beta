package y9;

import java.util.List;
public final class p0 extends o1 {
    public final String f50743a;
    public final String f50744b;
    public final List f50745c;
    public final o1 d;
    public final int f50746e;

    public p0(String str, String str2, List list, o1 o1Var, int i10) {
        this.f50743a = str;
        this.f50744b = str2;
        this.f50745c = list;
        this.d = o1Var;
        this.f50746e = i10;
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
            String str2 = p0Var.f50744b;
            if (this.f50743a.equals(p0Var.f50743a) && ((str = this.f50744b) != null ? str.equals(str2) : str2 == null) && this.f50745c.equals(p0Var.f50745c) && ((o1Var = this.d) != null ? o1Var.equals(o1Var2) : o1Var2 == null) && this.f50746e == p0Var.f50746e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f50743a.hashCode() ^ 1000003) * 1000003;
        int i10 = 0;
        String str = this.f50744b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f50745c.hashCode()) * 1000003;
        o1 o1Var = this.d;
        if (o1Var != null) {
            i10 = o1Var.hashCode();
        }
        return ((hashCode3 ^ i10) * 1000003) ^ this.f50746e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f50743a);
        sb2.append(", reason=");
        sb2.append(this.f50744b);
        sb2.append(", frames=");
        sb2.append(this.f50745c);
        sb2.append(", causedBy=");
        sb2.append(this.d);
        sb2.append(", overflowCount=");
        return a4.a.o(this.f50746e, "}", sb2);
    }
}
