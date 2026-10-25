package zb;

import java.util.Arrays;
import o6.l;
import s4.d;
public final class a {
    public final String f52842a;
    public final float f52843b;
    public final int f52844c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = z7.b.f52689a;
        this.f52842a = str == null ? "" : str;
        this.f52843b = f7;
        this.f52844c = i10;
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
        if (l.l(this.f52842a, aVar.f52842a) && Float.compare(this.f52843b, aVar.f52843b) == 0 && this.f52844c == aVar.f52844c && l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52842a, Float.valueOf(this.f52843b), Integer.valueOf(this.f52844c), this.d});
    }

    public final String toString() {
        d dVar = new d(a.class.getSimpleName(), 19);
        d dVar2 = new d(18, false);
        ((d) dVar.d).d = dVar2;
        dVar.d = dVar2;
        dVar2.f47718c = this.f52842a;
        dVar2.f47717b = "text";
        String valueOf = String.valueOf(this.f52843b);
        d dVar3 = new d(18, false);
        ((d) dVar.d).d = dVar3;
        dVar.d = dVar3;
        dVar3.f47718c = valueOf;
        dVar3.f47717b = "confidence";
        String valueOf2 = String.valueOf(this.f52844c);
        d dVar4 = new d(18, false);
        ((d) dVar.d).d = dVar4;
        dVar4.f47718c = valueOf2;
        dVar4.f47717b = "index";
        d dVar5 = new d(18, false);
        dVar4.d = dVar5;
        dVar.d = dVar5;
        dVar5.f47718c = this.d;
        dVar5.f47717b = "mid";
        return dVar.toString();
    }
}
