package xb;

import java.util.Arrays;
import n6.l;
import v7.r2;
public final class a {
    public final String f45738a;
    public final float f45739b;
    public final int f45740c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f46332a;
        this.f45738a = str == null ? "" : str;
        this.f45739b = f7;
        this.f45740c = i10;
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
        if (l.l(this.f45738a, aVar.f45738a) && Float.compare(this.f45739b, aVar.f45739b) == 0 && this.f45740c == aVar.f45740c && l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45738a, Float.valueOf(this.f45739b), Integer.valueOf(this.f45740c), this.d});
    }

    public final String toString() {
        r2 r2Var = new r2(a.class.getSimpleName(), 10);
        r2 r2Var2 = new r2(9, false);
        ((r2) r2Var.d).d = r2Var2;
        r2Var.d = r2Var2;
        r2Var2.f44080c = this.f45738a;
        r2Var2.f44079b = "text";
        String valueOf = String.valueOf(this.f45739b);
        r2 r2Var3 = new r2(9, false);
        ((r2) r2Var.d).d = r2Var3;
        r2Var.d = r2Var3;
        r2Var3.f44080c = valueOf;
        r2Var3.f44079b = "confidence";
        String valueOf2 = String.valueOf(this.f45740c);
        r2 r2Var4 = new r2(9, false);
        ((r2) r2Var.d).d = r2Var4;
        r2Var4.f44080c = valueOf2;
        r2Var4.f44079b = "index";
        r2 r2Var5 = new r2(9, false);
        r2Var4.d = r2Var5;
        r2Var.d = r2Var5;
        r2Var5.f44080c = this.d;
        r2Var5.f44079b = "mid";
        return r2Var.toString();
    }
}
