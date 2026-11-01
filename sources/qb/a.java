package qb;

import java.util.Arrays;
import n6.l;
import q5.d;
public final class a {
    public final String f45517a;
    public final float f45518b;
    public final int f45519c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f54222a;
        this.f45517a = str == null ? "" : str;
        this.f45518b = f7;
        this.f45519c = i10;
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
        if (l.k(this.f45517a, aVar.f45517a) && Float.compare(this.f45518b, aVar.f45518b) == 0 && this.f45519c == aVar.f45519c && l.k(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45517a, Float.valueOf(this.f45518b), Integer.valueOf(this.f45519c), this.d});
    }

    public final String toString() {
        d dVar = new d(a.class.getSimpleName(), 24);
        d dVar2 = new d(23, false);
        ((d) dVar.d).d = dVar2;
        dVar.d = dVar2;
        dVar2.f45499c = this.f45517a;
        dVar2.f45498b = "text";
        String valueOf = String.valueOf(this.f45518b);
        d dVar3 = new d(23, false);
        ((d) dVar.d).d = dVar3;
        dVar.d = dVar3;
        dVar3.f45499c = valueOf;
        dVar3.f45498b = "confidence";
        String valueOf2 = String.valueOf(this.f45519c);
        d dVar4 = new d(23, false);
        ((d) dVar.d).d = dVar4;
        dVar4.f45499c = valueOf2;
        dVar4.f45498b = "index";
        d dVar5 = new d(23, false);
        dVar4.d = dVar5;
        dVar.d = dVar5;
        dVar5.f45499c = this.d;
        dVar5.f45498b = "mid";
        return dVar.toString();
    }
}
