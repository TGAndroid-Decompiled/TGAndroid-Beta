package xb;

import java.util.Arrays;
import n6.l;
import v7.r1;
public final class a {
    public final String f45761a;
    public final float f45762b;
    public final int f45763c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f46355a;
        this.f45761a = str == null ? "" : str;
        this.f45762b = f7;
        this.f45763c = i10;
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
        if (l.l(this.f45761a, aVar.f45761a) && Float.compare(this.f45762b, aVar.f45762b) == 0 && this.f45763c == aVar.f45763c && l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45761a, Float.valueOf(this.f45762b), Integer.valueOf(this.f45763c), this.d});
    }

    public final String toString() {
        r1 r1Var = new r1(a.class.getSimpleName(), 11);
        r1 r1Var2 = new r1(10, false);
        ((r1) r1Var.f44102c).f44102c = r1Var2;
        r1Var.f44102c = r1Var2;
        r1Var2.d = this.f45761a;
        r1Var2.f44101b = "text";
        String valueOf = String.valueOf(this.f45762b);
        r1 r1Var3 = new r1(10, false);
        ((r1) r1Var.f44102c).f44102c = r1Var3;
        r1Var.f44102c = r1Var3;
        r1Var3.d = valueOf;
        r1Var3.f44101b = "confidence";
        String valueOf2 = String.valueOf(this.f45763c);
        r1 r1Var4 = new r1(10, false);
        ((r1) r1Var.f44102c).f44102c = r1Var4;
        r1Var4.d = valueOf2;
        r1Var4.f44101b = "index";
        r1 r1Var5 = new r1(10, false);
        r1Var4.f44102c = r1Var5;
        r1Var.f44102c = r1Var5;
        r1Var5.d = this.d;
        r1Var5.f44101b = "mid";
        return r1Var.toString();
    }
}
