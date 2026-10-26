package zb;

import java.util.Arrays;
import o6.l;
import s4.d;
public final class a {
    public final String f52845a;
    public final float f52846b;
    public final int f52847c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = z7.b.f52692a;
        this.f52845a = str == null ? "" : str;
        this.f52846b = f7;
        this.f52847c = i10;
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
        if (l.l(this.f52845a, aVar.f52845a) && Float.compare(this.f52846b, aVar.f52846b) == 0 && this.f52847c == aVar.f52847c && l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52845a, Float.valueOf(this.f52846b), Integer.valueOf(this.f52847c), this.d});
    }

    public final String toString() {
        d dVar = new d(a.class.getSimpleName(), 19);
        d dVar2 = new d(18, false);
        ((d) dVar.d).d = dVar2;
        dVar.d = dVar2;
        dVar2.f47721c = this.f52845a;
        dVar2.f47720b = "text";
        String valueOf = String.valueOf(this.f52846b);
        d dVar3 = new d(18, false);
        ((d) dVar.d).d = dVar3;
        dVar.d = dVar3;
        dVar3.f47721c = valueOf;
        dVar3.f47720b = "confidence";
        String valueOf2 = String.valueOf(this.f52847c);
        d dVar4 = new d(18, false);
        ((d) dVar.d).d = dVar4;
        dVar4.f47721c = valueOf2;
        dVar4.f47720b = "index";
        d dVar5 = new d(18, false);
        dVar4.d = dVar5;
        dVar.d = dVar5;
        dVar5.f47721c = this.d;
        dVar5.f47720b = "mid";
        return dVar.toString();
    }
}
