package zb;

import java.util.Arrays;
import o6.l;
import s4.d;
public final class a {
    public final String f52903a;
    public final float f52904b;
    public final int f52905c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = z7.b.f52750a;
        this.f52903a = str == null ? "" : str;
        this.f52904b = f7;
        this.f52905c = i10;
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
        if (l.l(this.f52903a, aVar.f52903a) && Float.compare(this.f52904b, aVar.f52904b) == 0 && this.f52905c == aVar.f52905c && l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52903a, Float.valueOf(this.f52904b), Integer.valueOf(this.f52905c), this.d});
    }

    public final String toString() {
        d dVar = new d(a.class.getSimpleName(), 20);
        d dVar2 = new d(19, false);
        ((d) dVar.d).d = dVar2;
        dVar.d = dVar2;
        dVar2.f47756c = this.f52903a;
        dVar2.f47755b = "text";
        String valueOf = String.valueOf(this.f52904b);
        d dVar3 = new d(19, false);
        ((d) dVar.d).d = dVar3;
        dVar.d = dVar3;
        dVar3.f47756c = valueOf;
        dVar3.f47755b = "confidence";
        String valueOf2 = String.valueOf(this.f52905c);
        d dVar4 = new d(19, false);
        ((d) dVar.d).d = dVar4;
        dVar4.f47756c = valueOf2;
        dVar4.f47755b = "index";
        d dVar5 = new d(19, false);
        dVar4.d = dVar5;
        dVar.d = dVar5;
        dVar5.f47756c = this.d;
        dVar5.f47755b = "mid";
        return dVar.toString();
    }
}
