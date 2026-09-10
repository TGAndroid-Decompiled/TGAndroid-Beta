package xb;

import java.util.Arrays;
import n6.l;
import v7.a6;
public final class a {
    public final String f45078a;
    public final float f45079b;
    public final int f45080c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f46482a;
        this.f45078a = str == null ? "" : str;
        this.f45079b = f7;
        this.f45080c = i10;
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
        if (l.l(this.f45078a, aVar.f45078a) && Float.compare(this.f45079b, aVar.f45079b) == 0 && this.f45080c == aVar.f45080c && l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45078a, Float.valueOf(this.f45079b), Integer.valueOf(this.f45080c), this.d});
    }

    public final String toString() {
        a6 a6Var = new a6(a.class.getSimpleName());
        a6 a6Var2 = new a6(8, false);
        ((a6) a6Var.d).d = a6Var2;
        a6Var.d = a6Var2;
        a6Var2.f42935c = this.f45078a;
        a6Var2.f42934b = "text";
        String valueOf = String.valueOf(this.f45079b);
        a6 a6Var3 = new a6(8, false);
        ((a6) a6Var.d).d = a6Var3;
        a6Var.d = a6Var3;
        a6Var3.f42935c = valueOf;
        a6Var3.f42934b = "confidence";
        String valueOf2 = String.valueOf(this.f45080c);
        a6 a6Var4 = new a6(8, false);
        ((a6) a6Var.d).d = a6Var4;
        a6Var4.f42935c = valueOf2;
        a6Var4.f42934b = "index";
        a6 a6Var5 = new a6(8, false);
        a6Var4.d = a6Var5;
        a6Var.d = a6Var5;
        a6Var5.f42935c = this.d;
        a6Var5.f42934b = "mid";
        return a6Var.toString();
    }
}
