package xb;

import java.util.Arrays;
import n6.l;
import v7.k;
public final class a {
    public final String f51106a;
    public final float f51107b;
    public final int f51108c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f51735a;
        this.f51106a = str == null ? "" : str;
        this.f51107b = f7;
        this.f51108c = i10;
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
        if (l.l(this.f51106a, aVar.f51106a) && Float.compare(this.f51107b, aVar.f51107b) == 0 && this.f51108c == aVar.f51108c && l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51106a, Float.valueOf(this.f51107b), Integer.valueOf(this.f51108c), this.d});
    }

    public final String toString() {
        k kVar = new k(a.class.getSimpleName(), 13);
        k kVar2 = new k(12, false);
        ((k) kVar.d).d = kVar2;
        kVar.d = kVar2;
        kVar2.f49245c = this.f51106a;
        kVar2.f49244b = "text";
        String valueOf = String.valueOf(this.f51107b);
        k kVar3 = new k(12, false);
        ((k) kVar.d).d = kVar3;
        kVar.d = kVar3;
        kVar3.f49245c = valueOf;
        kVar3.f49244b = "confidence";
        String valueOf2 = String.valueOf(this.f51108c);
        k kVar4 = new k(12, false);
        ((k) kVar.d).d = kVar4;
        kVar4.f49245c = valueOf2;
        kVar4.f49244b = "index";
        k kVar5 = new k(12, false);
        kVar4.d = kVar5;
        kVar.d = kVar5;
        kVar5.f49245c = this.d;
        kVar5.f49244b = "mid";
        return kVar.toString();
    }
}
