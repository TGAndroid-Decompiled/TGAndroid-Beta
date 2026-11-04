package tb;

import android.support.v4.media.session.a0;
import java.util.Arrays;
import p6.m;
public final class a {
    public final String f55077a;
    public final float f55078b;
    public final int f55079c;
    public final String d;

    public a(float f10, int i3, String str, String str2) {
        int i10 = a8.b.f157a;
        this.f55077a = str == null ? "" : str;
        this.f55078b = f10;
        this.f55079c = i3;
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
        if (m.k(this.f55077a, aVar.f55077a) && Float.compare(this.f55078b, aVar.f55078b) == 0 && this.f55079c == aVar.f55079c && m.k(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f55077a, Float.valueOf(this.f55078b), Integer.valueOf(this.f55079c), this.d});
    }

    public final String toString() {
        a0 a0Var = new a0(a.class.getSimpleName(), 2);
        a0 a0Var2 = new a0(1, false);
        ((a0) a0Var.d).d = a0Var2;
        a0Var.d = a0Var2;
        a0Var2.f1187c = this.f55077a;
        a0Var2.f1186b = "text";
        String valueOf = String.valueOf(this.f55078b);
        a0 a0Var3 = new a0(1, false);
        ((a0) a0Var.d).d = a0Var3;
        a0Var.d = a0Var3;
        a0Var3.f1187c = valueOf;
        a0Var3.f1186b = "confidence";
        String valueOf2 = String.valueOf(this.f55079c);
        a0 a0Var4 = new a0(1, false);
        ((a0) a0Var.d).d = a0Var4;
        a0Var4.f1187c = valueOf2;
        a0Var4.f1186b = "index";
        a0 a0Var5 = new a0(1, false);
        a0Var4.d = a0Var5;
        a0Var.d = a0Var5;
        a0Var5.f1187c = this.d;
        a0Var5.f1186b = "mid";
        return a0Var.toString();
    }
}
