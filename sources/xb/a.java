package xb;

import java.util.Arrays;
import n6.l;
import v7.k;
public final class a {
    public final String f49814a;
    public final float f49815b;
    public final int f49816c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f50441a;
        this.f49814a = str == null ? "" : str;
        this.f49815b = f7;
        this.f49816c = i10;
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
        if (l.l(this.f49814a, aVar.f49814a) && Float.compare(this.f49815b, aVar.f49815b) == 0 && this.f49816c == aVar.f49816c && l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49814a, Float.valueOf(this.f49815b), Integer.valueOf(this.f49816c), this.d});
    }

    public final String toString() {
        k kVar = new k(a.class.getSimpleName(), 12);
        k kVar2 = new k(11, false);
        ((k) kVar.d).d = kVar2;
        kVar.d = kVar2;
        kVar2.f47979c = this.f49814a;
        kVar2.f47978b = "text";
        String valueOf = String.valueOf(this.f49815b);
        k kVar3 = new k(11, false);
        ((k) kVar.d).d = kVar3;
        kVar.d = kVar3;
        kVar3.f47979c = valueOf;
        kVar3.f47978b = "confidence";
        String valueOf2 = String.valueOf(this.f49816c);
        k kVar4 = new k(11, false);
        ((k) kVar.d).d = kVar4;
        kVar4.f47979c = valueOf2;
        kVar4.f47978b = "index";
        k kVar5 = new k(11, false);
        kVar4.d = kVar5;
        kVar.d = kVar5;
        kVar5.f47979c = this.d;
        kVar5.f47978b = "mid";
        return kVar.toString();
    }
}
