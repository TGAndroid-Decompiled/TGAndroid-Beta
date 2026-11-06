package wb;

import android.support.v4.media.session.a0;
import java.util.Arrays;
import q6.m;
public final class a {
    public final String f57545a;
    public final float f57546b;
    public final int f57547c;
    public final String d;

    public a(float f10, int i7, String str, String str2) {
        int i10 = b8.b.f3010a;
        this.f57545a = str == null ? "" : str;
        this.f57546b = f10;
        this.f57547c = i7;
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
        if (m.k(this.f57545a, aVar.f57545a) && Float.compare(this.f57546b, aVar.f57546b) == 0 && this.f57547c == aVar.f57547c && m.k(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f57545a, Float.valueOf(this.f57546b), Integer.valueOf(this.f57547c), this.d});
    }

    public final String toString() {
        a0 a0Var = new a0(a.class.getSimpleName(), 12);
        a0 a0Var2 = new a0(11, false);
        ((a0) a0Var.d).d = a0Var2;
        a0Var.d = a0Var2;
        a0Var2.f1764c = this.f57545a;
        a0Var2.f1763b = "text";
        String valueOf = String.valueOf(this.f57546b);
        a0 a0Var3 = new a0(11, false);
        ((a0) a0Var.d).d = a0Var3;
        a0Var.d = a0Var3;
        a0Var3.f1764c = valueOf;
        a0Var3.f1763b = "confidence";
        String valueOf2 = String.valueOf(this.f57547c);
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
