package xb;

import java.util.Arrays;
import n6.l;
import v7.r1;
public final class a {
    public final String f45766a;
    public final float f45767b;
    public final int f45768c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f46360a;
        this.f45766a = str == null ? "" : str;
        this.f45767b = f7;
        this.f45768c = i10;
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
        if (l.l(this.f45766a, aVar.f45766a) && Float.compare(this.f45767b, aVar.f45767b) == 0 && this.f45768c == aVar.f45768c && l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45766a, Float.valueOf(this.f45767b), Integer.valueOf(this.f45768c), this.d});
    }

    public final String toString() {
        r1 r1Var = new r1(a.class.getSimpleName(), 11);
        r1 r1Var2 = new r1(10, false);
        ((r1) r1Var.f44107c).f44107c = r1Var2;
        r1Var.f44107c = r1Var2;
        r1Var2.d = this.f45766a;
        r1Var2.f44106b = "text";
        String valueOf = String.valueOf(this.f45767b);
        r1 r1Var3 = new r1(10, false);
        ((r1) r1Var.f44107c).f44107c = r1Var3;
        r1Var.f44107c = r1Var3;
        r1Var3.d = valueOf;
        r1Var3.f44106b = "confidence";
        String valueOf2 = String.valueOf(this.f45768c);
        r1 r1Var4 = new r1(10, false);
        ((r1) r1Var.f44107c).f44107c = r1Var4;
        r1Var4.d = valueOf2;
        r1Var4.f44106b = "index";
        r1 r1Var5 = new r1(10, false);
        r1Var4.f44107c = r1Var5;
        r1Var.f44107c = r1Var5;
        r1Var5.d = this.d;
        r1Var5.f44106b = "mid";
        return r1Var.toString();
    }
}
