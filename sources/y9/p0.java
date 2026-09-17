package y9;

import java.util.List;
public final class p0 extends o1 {
    public final String f49854a;
    public final String f49855b;
    public final List f49856c;
    public final o1 d;
    public final int f49857e;

    public p0(String str, String str2, List list, o1 o1Var, int i10) {
        this.f49854a = str;
        this.f49855b = str2;
        this.f49856c = list;
        this.d = o1Var;
        this.f49857e = i10;
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
            String str2 = p0Var.f49855b;
            if (this.f49854a.equals(p0Var.f49854a) && ((str = this.f49855b) != null ? str.equals(str2) : str2 == null) && this.f49856c.equals(p0Var.f49856c) && ((o1Var = this.d) != null ? o1Var.equals(o1Var2) : o1Var2 == null) && this.f49857e == p0Var.f49857e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f49854a.hashCode() ^ 1000003) * 1000003;
        int i10 = 0;
        String str = this.f49855b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f49856c.hashCode()) * 1000003;
        o1 o1Var = this.d;
        if (o1Var != null) {
            i10 = o1Var.hashCode();
        }
        return ((hashCode3 ^ i10) * 1000003) ^ this.f49857e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f49854a);
        sb2.append(", reason=");
        sb2.append(this.f49855b);
        sb2.append(", frames=");
        sb2.append(this.f49856c);
        sb2.append(", causedBy=");
        sb2.append(this.d);
        sb2.append(", overflowCount=");
        return a4.a.n(this.f49857e, "}", sb2);
    }
}
