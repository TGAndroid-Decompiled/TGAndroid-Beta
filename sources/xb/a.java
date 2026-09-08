package xb;

import java.util.Arrays;
import n6.l;
import v7.a6;
public final class a {
    public final String f49361a;
    public final float f49362b;
    public final int f49363c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f49588a;
        this.f49361a = str == null ? "" : str;
        this.f49362b = f7;
        this.f49363c = i10;
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
        if (l.l(this.f49361a, aVar.f49361a) && Float.compare(this.f49362b, aVar.f49362b) == 0 && this.f49363c == aVar.f49363c && l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49361a, Float.valueOf(this.f49362b), Integer.valueOf(this.f49363c), this.d});
    }

    public final String toString() {
        a6 a6Var = new a6(a.class.getSimpleName());
        a6 a6Var2 = new a6(8, false);
        ((a6) a6Var.d).d = a6Var2;
        a6Var.d = a6Var2;
        a6Var2.f47407c = this.f49361a;
        a6Var2.f47406b = "text";
        String valueOf = String.valueOf(this.f49362b);
        a6 a6Var3 = new a6(8, false);
        ((a6) a6Var.d).d = a6Var3;
        a6Var.d = a6Var3;
        a6Var3.f47407c = valueOf;
        a6Var3.f47406b = "confidence";
        String valueOf2 = String.valueOf(this.f49363c);
        a6 a6Var4 = new a6(8, false);
        ((a6) a6Var.d).d = a6Var4;
        a6Var4.f47407c = valueOf2;
        a6Var4.f47406b = "index";
        a6 a6Var5 = new a6(8, false);
        a6Var4.d = a6Var5;
        a6Var.d = a6Var5;
        a6Var5.f47407c = this.d;
        a6Var5.f47406b = "mid";
        return a6Var.toString();
    }
}
