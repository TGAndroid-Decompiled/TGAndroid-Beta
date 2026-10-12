package xb;

import java.util.Arrays;
import n6.m;
import v7.k;
public final class a {
    public final String f51344a;
    public final float f51345b;
    public final int f51346c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f51969a;
        this.f51344a = str == null ? "" : str;
        this.f51345b = f7;
        this.f51346c = i10;
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
        if (m.l(this.f51344a, aVar.f51344a) && Float.compare(this.f51345b, aVar.f51345b) == 0 && this.f51346c == aVar.f51346c && m.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51344a, Float.valueOf(this.f51345b), Integer.valueOf(this.f51346c), this.d});
    }

    public final String toString() {
        k kVar = new k(a.class.getSimpleName(), 13);
        k kVar2 = new k(12, false);
        ((k) kVar.d).d = kVar2;
        kVar.d = kVar2;
        kVar2.f49483c = this.f51344a;
        kVar2.f49482b = "text";
        String valueOf = String.valueOf(this.f51345b);
        k kVar3 = new k(12, false);
        ((k) kVar.d).d = kVar3;
        kVar.d = kVar3;
        kVar3.f49483c = valueOf;
        kVar3.f49482b = "confidence";
        String valueOf2 = String.valueOf(this.f51346c);
        k kVar4 = new k(12, false);
        ((k) kVar.d).d = kVar4;
        kVar4.f49483c = valueOf2;
        kVar4.f49482b = "index";
        k kVar5 = new k(12, false);
        kVar4.d = kVar5;
        kVar.d = kVar5;
        kVar5.f49483c = this.d;
        kVar5.f49482b = "mid";
        return kVar.toString();
    }
}
