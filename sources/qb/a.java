package qb;

import java.util.Arrays;
import n6.l;
import q5.d;
public final class a {
    public final String f45506a;
    public final float f45507b;
    public final int f45508c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f54201a;
        this.f45506a = str == null ? "" : str;
        this.f45507b = f7;
        this.f45508c = i10;
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
        if (l.k(this.f45506a, aVar.f45506a) && Float.compare(this.f45507b, aVar.f45507b) == 0 && this.f45508c == aVar.f45508c && l.k(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45506a, Float.valueOf(this.f45507b), Integer.valueOf(this.f45508c), this.d});
    }

    public final String toString() {
        d dVar = new d(a.class.getSimpleName(), 24);
        d dVar2 = new d(23, false);
        ((d) dVar.d).d = dVar2;
        dVar.d = dVar2;
        dVar2.f45488c = this.f45506a;
        dVar2.f45487b = "text";
        String valueOf = String.valueOf(this.f45507b);
        d dVar3 = new d(23, false);
        ((d) dVar.d).d = dVar3;
        dVar.d = dVar3;
        dVar3.f45488c = valueOf;
        dVar3.f45487b = "confidence";
        String valueOf2 = String.valueOf(this.f45508c);
        d dVar4 = new d(23, false);
        ((d) dVar.d).d = dVar4;
        dVar4.f45488c = valueOf2;
        dVar4.f45487b = "index";
        d dVar5 = new d(23, false);
        dVar4.d = dVar5;
        dVar.d = dVar5;
        dVar5.f45488c = this.d;
        dVar5.f45487b = "mid";
        return dVar.toString();
    }
}
