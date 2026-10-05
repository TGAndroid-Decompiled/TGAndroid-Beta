package xb;

import java.util.Arrays;
import n6.l;
import v7.k;
public final class a {
    public final String f49829a;
    public final float f49830b;
    public final int f49831c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f50456a;
        this.f49829a = str == null ? "" : str;
        this.f49830b = f7;
        this.f49831c = i10;
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
        if (l.l(this.f49829a, aVar.f49829a) && Float.compare(this.f49830b, aVar.f49830b) == 0 && this.f49831c == aVar.f49831c && l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49829a, Float.valueOf(this.f49830b), Integer.valueOf(this.f49831c), this.d});
    }

    public final String toString() {
        k kVar = new k(a.class.getSimpleName(), 12);
        k kVar2 = new k(11, false);
        ((k) kVar.d).d = kVar2;
        kVar.d = kVar2;
        kVar2.f47994c = this.f49829a;
        kVar2.f47993b = "text";
        String valueOf = String.valueOf(this.f49830b);
        k kVar3 = new k(11, false);
        ((k) kVar.d).d = kVar3;
        kVar.d = kVar3;
        kVar3.f47994c = valueOf;
        kVar3.f47993b = "confidence";
        String valueOf2 = String.valueOf(this.f49831c);
        k kVar4 = new k(11, false);
        ((k) kVar.d).d = kVar4;
        kVar4.f47994c = valueOf2;
        kVar4.f47993b = "index";
        k kVar5 = new k(11, false);
        kVar4.d = kVar5;
        kVar.d = kVar5;
        kVar5.f47994c = this.d;
        kVar5.f47993b = "mid";
        return kVar.toString();
    }
}
