package wb;

import android.support.v4.media.session.a0;
import java.util.Arrays;
import q6.m;
public final class a {
    public final String f59655a;
    public final float f59656b;
    public final int f59657c;
    public final String d;

    public a(float f10, int i7, String str, String str2) {
        int i10 = b8.b.f2961a;
        this.f59655a = str == null ? "" : str;
        this.f59656b = f10;
        this.f59657c = i7;
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
        if (m.l(this.f59655a, aVar.f59655a) && Float.compare(this.f59656b, aVar.f59656b) == 0 && this.f59657c == aVar.f59657c && m.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f59655a, Float.valueOf(this.f59656b), Integer.valueOf(this.f59657c), this.d});
    }

    public final String toString() {
        a0 a0Var = new a0(a.class.getSimpleName(), 12);
        a0 a0Var2 = new a0(11, false);
        ((a0) a0Var.d).d = a0Var2;
        a0Var.d = a0Var2;
        a0Var2.f1705c = this.f59655a;
        a0Var2.f1704b = "text";
        String valueOf = String.valueOf(this.f59656b);
        a0 a0Var3 = new a0(11, false);
        ((a0) a0Var.d).d = a0Var3;
        a0Var.d = a0Var3;
        a0Var3.f1705c = valueOf;
        a0Var3.f1704b = "confidence";
        String valueOf2 = String.valueOf(this.f59657c);
        a0 a0Var4 = new a0(11, false);
        ((a0) a0Var.d).d = a0Var4;
        a0Var4.f1705c = valueOf2;
        a0Var4.f1704b = "index";
        a0 a0Var5 = new a0(11, false);
        a0Var4.d = a0Var5;
        a0Var.d = a0Var5;
        a0Var5.f1705c = this.d;
        a0Var5.f1704b = "mid";
        return a0Var.toString();
    }
}
