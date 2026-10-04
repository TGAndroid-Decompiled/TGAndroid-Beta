package xb;

import java.util.Arrays;
import n6.l;
import v7.k;
public final class a {
    public final String f49813a;
    public final float f49814b;
    public final int f49815c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f50440a;
        this.f49813a = str == null ? "" : str;
        this.f49814b = f7;
        this.f49815c = i10;
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
        if (l.l(this.f49813a, aVar.f49813a) && Float.compare(this.f49814b, aVar.f49814b) == 0 && this.f49815c == aVar.f49815c && l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49813a, Float.valueOf(this.f49814b), Integer.valueOf(this.f49815c), this.d});
    }

    public final String toString() {
        k kVar = new k(a.class.getSimpleName(), 12);
        k kVar2 = new k(11, false);
        ((k) kVar.d).d = kVar2;
        kVar.d = kVar2;
        kVar2.f47978c = this.f49813a;
        kVar2.f47977b = "text";
        String valueOf = String.valueOf(this.f49814b);
        k kVar3 = new k(11, false);
        ((k) kVar.d).d = kVar3;
        kVar.d = kVar3;
        kVar3.f47978c = valueOf;
        kVar3.f47977b = "confidence";
        String valueOf2 = String.valueOf(this.f49815c);
        k kVar4 = new k(11, false);
        ((k) kVar.d).d = kVar4;
        kVar4.f47978c = valueOf2;
        kVar4.f47977b = "index";
        k kVar5 = new k(11, false);
        kVar4.d = kVar5;
        kVar.d = kVar5;
        kVar5.f47978c = this.d;
        kVar5.f47977b = "mid";
        return kVar.toString();
    }
}
