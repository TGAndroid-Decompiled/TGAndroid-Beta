package xb;

import java.util.Arrays;
import n6.m;
import v7.k;
public final class a {
    public final String f51229a;
    public final float f51230b;
    public final int f51231c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f51858a;
        this.f51229a = str == null ? "" : str;
        this.f51230b = f7;
        this.f51231c = i10;
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
        if (m.l(this.f51229a, aVar.f51229a) && Float.compare(this.f51230b, aVar.f51230b) == 0 && this.f51231c == aVar.f51231c && m.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51229a, Float.valueOf(this.f51230b), Integer.valueOf(this.f51231c), this.d});
    }

    public final String toString() {
        k kVar = new k(a.class.getSimpleName(), 13);
        k kVar2 = new k(12, false);
        ((k) kVar.d).d = kVar2;
        kVar.d = kVar2;
        kVar2.f49368c = this.f51229a;
        kVar2.f49367b = "text";
        String valueOf = String.valueOf(this.f51230b);
        k kVar3 = new k(12, false);
        ((k) kVar.d).d = kVar3;
        kVar.d = kVar3;
        kVar3.f49368c = valueOf;
        kVar3.f49367b = "confidence";
        String valueOf2 = String.valueOf(this.f51231c);
        k kVar4 = new k(12, false);
        ((k) kVar.d).d = kVar4;
        kVar4.f49368c = valueOf2;
        kVar4.f49367b = "index";
        k kVar5 = new k(12, false);
        kVar4.d = kVar5;
        kVar.d = kVar5;
        kVar5.f49368c = this.d;
        kVar5.f49367b = "mid";
        return kVar.toString();
    }
}
