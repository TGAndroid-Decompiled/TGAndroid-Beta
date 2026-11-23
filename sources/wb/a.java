package wb;

import android.support.v4.media.session.a0;
import java.util.Arrays;
import q6.m;
public final class a {
    public final String f59783a;
    public final float f59784b;
    public final int f59785c;
    public final String d;

    public a(float f10, int i7, String str, String str2) {
        int i10 = b8.b.f2933a;
        this.f59783a = str == null ? "" : str;
        this.f59784b = f10;
        this.f59785c = i7;
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
        if (m.l(this.f59783a, aVar.f59783a) && Float.compare(this.f59784b, aVar.f59784b) == 0 && this.f59785c == aVar.f59785c && m.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f59783a, Float.valueOf(this.f59784b), Integer.valueOf(this.f59785c), this.d});
    }

    public final String toString() {
        a0 a0Var = new a0(a.class.getSimpleName(), 12);
        a0 a0Var2 = new a0(11, false);
        ((a0) a0Var.d).d = a0Var2;
        a0Var.d = a0Var2;
        a0Var2.f1677c = this.f59783a;
        a0Var2.f1676b = "text";
        String valueOf = String.valueOf(this.f59784b);
        a0 a0Var3 = new a0(11, false);
        ((a0) a0Var.d).d = a0Var3;
        a0Var.d = a0Var3;
        a0Var3.f1677c = valueOf;
        a0Var3.f1676b = "confidence";
        String valueOf2 = String.valueOf(this.f59785c);
        a0 a0Var4 = new a0(11, false);
        ((a0) a0Var.d).d = a0Var4;
        a0Var4.f1677c = valueOf2;
        a0Var4.f1676b = "index";
        a0 a0Var5 = new a0(11, false);
        a0Var4.d = a0Var5;
        a0Var.d = a0Var5;
        a0Var5.f1677c = this.d;
        a0Var5.f1676b = "mid";
        return a0Var.toString();
    }
}
