package wb;

import android.support.v4.media.session.a0;
import java.util.Arrays;
import q6.m;
public final class a {
    public final String f59698a;
    public final float f59699b;
    public final int f59700c;
    public final String d;

    public a(float f10, int i7, String str, String str2) {
        int i10 = b8.b.f2981a;
        this.f59698a = str == null ? "" : str;
        this.f59699b = f10;
        this.f59700c = i7;
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
        if (m.l(this.f59698a, aVar.f59698a) && Float.compare(this.f59699b, aVar.f59699b) == 0 && this.f59700c == aVar.f59700c && m.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f59698a, Float.valueOf(this.f59699b), Integer.valueOf(this.f59700c), this.d});
    }

    public final String toString() {
        a0 a0Var = new a0(a.class.getSimpleName(), 12);
        a0 a0Var2 = new a0(11, false);
        ((a0) a0Var.d).d = a0Var2;
        a0Var.d = a0Var2;
        a0Var2.f1725c = this.f59698a;
        a0Var2.f1724b = "text";
        String valueOf = String.valueOf(this.f59699b);
        a0 a0Var3 = new a0(11, false);
        ((a0) a0Var.d).d = a0Var3;
        a0Var.d = a0Var3;
        a0Var3.f1725c = valueOf;
        a0Var3.f1724b = "confidence";
        String valueOf2 = String.valueOf(this.f59700c);
        a0 a0Var4 = new a0(11, false);
        ((a0) a0Var.d).d = a0Var4;
        a0Var4.f1725c = valueOf2;
        a0Var4.f1724b = "index";
        a0 a0Var5 = new a0(11, false);
        a0Var4.d = a0Var5;
        a0Var.d = a0Var5;
        a0Var5.f1725c = this.d;
        a0Var5.f1724b = "mid";
        return a0Var.toString();
    }
}
