package xb;

import java.util.Arrays;
import n6.l;
import v7.a6;
public final class a {
    public final String f49333a;
    public final float f49334b;
    public final int f49335c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f49560a;
        this.f49333a = str == null ? "" : str;
        this.f49334b = f7;
        this.f49335c = i10;
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
        if (l.l(this.f49333a, aVar.f49333a) && Float.compare(this.f49334b, aVar.f49334b) == 0 && this.f49335c == aVar.f49335c && l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49333a, Float.valueOf(this.f49334b), Integer.valueOf(this.f49335c), this.d});
    }

    public final String toString() {
        a6 a6Var = new a6(a.class.getSimpleName());
        a6 a6Var2 = new a6(8, false);
        ((a6) a6Var.d).d = a6Var2;
        a6Var.d = a6Var2;
        a6Var2.f47380c = this.f49333a;
        a6Var2.f47379b = "text";
        String valueOf = String.valueOf(this.f49334b);
        a6 a6Var3 = new a6(8, false);
        ((a6) a6Var.d).d = a6Var3;
        a6Var.d = a6Var3;
        a6Var3.f47380c = valueOf;
        a6Var3.f47379b = "confidence";
        String valueOf2 = String.valueOf(this.f49335c);
        a6 a6Var4 = new a6(8, false);
        ((a6) a6Var.d).d = a6Var4;
        a6Var4.f47380c = valueOf2;
        a6Var4.f47379b = "index";
        a6 a6Var5 = new a6(8, false);
        a6Var4.d = a6Var5;
        a6Var.d = a6Var5;
        a6Var5.f47380c = this.d;
        a6Var5.f47379b = "mid";
        return a6Var.toString();
    }
}
