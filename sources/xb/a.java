package xb;

import java.util.Arrays;
import n6.l;
import v7.k;
public final class a {
    public final String f51152a;
    public final float f51153b;
    public final int f51154c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f51781a;
        this.f51152a = str == null ? "" : str;
        this.f51153b = f7;
        this.f51154c = i10;
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
        if (l.l(this.f51152a, aVar.f51152a) && Float.compare(this.f51153b, aVar.f51153b) == 0 && this.f51154c == aVar.f51154c && l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51152a, Float.valueOf(this.f51153b), Integer.valueOf(this.f51154c), this.d});
    }

    public final String toString() {
        k kVar = new k(a.class.getSimpleName(), 13);
        k kVar2 = new k(12, false);
        ((k) kVar.d).d = kVar2;
        kVar.d = kVar2;
        kVar2.f49291c = this.f51152a;
        kVar2.f49290b = "text";
        String valueOf = String.valueOf(this.f51153b);
        k kVar3 = new k(12, false);
        ((k) kVar.d).d = kVar3;
        kVar.d = kVar3;
        kVar3.f49291c = valueOf;
        kVar3.f49290b = "confidence";
        String valueOf2 = String.valueOf(this.f51154c);
        k kVar4 = new k(12, false);
        ((k) kVar.d).d = kVar4;
        kVar4.f49291c = valueOf2;
        kVar4.f49290b = "index";
        k kVar5 = new k(12, false);
        kVar4.d = kVar5;
        kVar.d = kVar5;
        kVar5.f49291c = this.d;
        kVar5.f49290b = "mid";
        return kVar.toString();
    }
}
