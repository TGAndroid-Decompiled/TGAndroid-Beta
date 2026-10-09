package xb;

import java.util.Arrays;
import n6.l;
import v7.k;
public final class a {
    public final String f51108a;
    public final float f51109b;
    public final int f51110c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f51737a;
        this.f51108a = str == null ? "" : str;
        this.f51109b = f7;
        this.f51110c = i10;
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
        if (l.l(this.f51108a, aVar.f51108a) && Float.compare(this.f51109b, aVar.f51109b) == 0 && this.f51110c == aVar.f51110c && l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51108a, Float.valueOf(this.f51109b), Integer.valueOf(this.f51110c), this.d});
    }

    public final String toString() {
        k kVar = new k(a.class.getSimpleName(), 13);
        k kVar2 = new k(12, false);
        ((k) kVar.d).d = kVar2;
        kVar.d = kVar2;
        kVar2.f49247c = this.f51108a;
        kVar2.f49246b = "text";
        String valueOf = String.valueOf(this.f51109b);
        k kVar3 = new k(12, false);
        ((k) kVar.d).d = kVar3;
        kVar.d = kVar3;
        kVar3.f49247c = valueOf;
        kVar3.f49246b = "confidence";
        String valueOf2 = String.valueOf(this.f51110c);
        k kVar4 = new k(12, false);
        ((k) kVar.d).d = kVar4;
        kVar4.f49247c = valueOf2;
        kVar4.f49246b = "index";
        k kVar5 = new k(12, false);
        kVar4.d = kVar5;
        kVar.d = kVar5;
        kVar5.f49247c = this.d;
        kVar5.f49246b = "mid";
        return kVar.toString();
    }
}
