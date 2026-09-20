package xb;

import java.util.Arrays;
import n6.l;
import v7.s1;
public final class a {
    public final String f46036a;
    public final float f46037b;
    public final int f46038c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f46634a;
        this.f46036a = str == null ? "" : str;
        this.f46037b = f7;
        this.f46038c = i10;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (l.l(this.f46036a, aVar.f46036a) && Float.compare(this.f46037b, aVar.f46037b) == 0 && this.f46038c == aVar.f46038c && l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46036a, Float.valueOf(this.f46037b), Integer.valueOf(this.f46038c), this.d});
    }

    public final String toString() {
        s1 s1Var = new s1(a.class.getSimpleName(), 11);
        s1 s1Var2 = new s1(10, false);
        ((s1) s1Var.f44384c).f44384c = s1Var2;
        s1Var.f44384c = s1Var2;
        s1Var2.d = this.f46036a;
        s1Var2.f44383b = "text";
        String valueOf = String.valueOf(this.f46037b);
        s1 s1Var3 = new s1(10, false);
        ((s1) s1Var.f44384c).f44384c = s1Var3;
        s1Var.f44384c = s1Var3;
        s1Var3.d = valueOf;
        s1Var3.f44383b = "confidence";
        String valueOf2 = String.valueOf(this.f46038c);
        s1 s1Var4 = new s1(10, false);
        ((s1) s1Var.f44384c).f44384c = s1Var4;
        s1Var4.d = valueOf2;
        s1Var4.f44383b = "index";
        s1 s1Var5 = new s1(10, false);
        s1Var4.f44384c = s1Var5;
        s1Var.f44384c = s1Var5;
        s1Var5.d = this.d;
        s1Var5.f44383b = "mid";
        return s1Var.toString();
    }
}
