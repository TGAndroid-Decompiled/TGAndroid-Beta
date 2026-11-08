package wb;

import android.support.v4.media.session.a0;
import java.util.Arrays;
import q6.m;
public final class a {
    public final String f57638a;
    public final float f57639b;
    public final int f57640c;
    public final String d;

    public a(float f10, int i7, String str, String str2) {
        int i10 = b8.b.f3010a;
        this.f57638a = str == null ? "" : str;
        this.f57639b = f10;
        this.f57640c = i7;
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
        if (m.k(this.f57638a, aVar.f57638a) && Float.compare(this.f57639b, aVar.f57639b) == 0 && this.f57640c == aVar.f57640c && m.k(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f57638a, Float.valueOf(this.f57639b), Integer.valueOf(this.f57640c), this.d});
    }

    public final String toString() {
        a0 a0Var = new a0(a.class.getSimpleName(), 12);
        a0 a0Var2 = new a0(11, false);
        ((a0) a0Var.d).d = a0Var2;
        a0Var.d = a0Var2;
        a0Var2.f1764c = this.f57638a;
        a0Var2.f1763b = "text";
        String valueOf = String.valueOf(this.f57639b);
        a0 a0Var3 = new a0(11, false);
        ((a0) a0Var.d).d = a0Var3;
        a0Var.d = a0Var3;
        a0Var3.f1764c = valueOf;
        a0Var3.f1763b = "confidence";
        String valueOf2 = String.valueOf(this.f57640c);
        a0 a0Var4 = new a0(11, false);
        ((a0) a0Var.d).d = a0Var4;
        a0Var4.f1764c = valueOf2;
        a0Var4.f1763b = "index";
        a0 a0Var5 = new a0(11, false);
        a0Var4.d = a0Var5;
        a0Var.d = a0Var5;
        a0Var5.f1764c = this.d;
        a0Var5.f1763b = "mid";
        return a0Var.toString();
    }
}
