package xb;

import java.util.Arrays;
import n6.l;
import v7.r1;
public final class a {
    public final String f45734a;
    public final float f45735b;
    public final int f45736c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f46328a;
        this.f45734a = str == null ? "" : str;
        this.f45735b = f7;
        this.f45736c = i10;
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
        if (l.l(this.f45734a, aVar.f45734a) && Float.compare(this.f45735b, aVar.f45735b) == 0 && this.f45736c == aVar.f45736c && l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45734a, Float.valueOf(this.f45735b), Integer.valueOf(this.f45736c), this.d});
    }

    public final String toString() {
        r1 r1Var = new r1(a.class.getSimpleName(), 11);
        r1 r1Var2 = new r1(10, false);
        ((r1) r1Var.f44075c).f44075c = r1Var2;
        r1Var.f44075c = r1Var2;
        r1Var2.d = this.f45734a;
        r1Var2.f44074b = "text";
        String valueOf = String.valueOf(this.f45735b);
        r1 r1Var3 = new r1(10, false);
        ((r1) r1Var.f44075c).f44075c = r1Var3;
        r1Var.f44075c = r1Var3;
        r1Var3.d = valueOf;
        r1Var3.f44074b = "confidence";
        String valueOf2 = String.valueOf(this.f45736c);
        r1 r1Var4 = new r1(10, false);
        ((r1) r1Var.f44075c).f44075c = r1Var4;
        r1Var4.d = valueOf2;
        r1Var4.f44074b = "index";
        r1 r1Var5 = new r1(10, false);
        r1Var4.f44075c = r1Var5;
        r1Var.f44075c = r1Var5;
        r1Var5.d = this.d;
        r1Var5.f44074b = "mid";
        return r1Var.toString();
    }
}
