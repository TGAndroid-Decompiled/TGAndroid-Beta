package xb;

import java.util.Arrays;
import n6.m;
import v7.k;
public final class a {
    public final String f51336a;
    public final float f51337b;
    public final int f51338c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f51961a;
        this.f51336a = str == null ? "" : str;
        this.f51337b = f7;
        this.f51338c = i10;
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
        if (m.l(this.f51336a, aVar.f51336a) && Float.compare(this.f51337b, aVar.f51337b) == 0 && this.f51338c == aVar.f51338c && m.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51336a, Float.valueOf(this.f51337b), Integer.valueOf(this.f51338c), this.d});
    }

    public final String toString() {
        k kVar = new k(a.class.getSimpleName(), 13);
        k kVar2 = new k(12, false);
        ((k) kVar.d).d = kVar2;
        kVar.d = kVar2;
        kVar2.f49475c = this.f51336a;
        kVar2.f49474b = "text";
        String valueOf = String.valueOf(this.f51337b);
        k kVar3 = new k(12, false);
        ((k) kVar.d).d = kVar3;
        kVar.d = kVar3;
        kVar3.f49475c = valueOf;
        kVar3.f49474b = "confidence";
        String valueOf2 = String.valueOf(this.f51338c);
        k kVar4 = new k(12, false);
        ((k) kVar.d).d = kVar4;
        kVar4.f49475c = valueOf2;
        kVar4.f49474b = "index";
        k kVar5 = new k(12, false);
        kVar4.d = kVar5;
        kVar.d = kVar5;
        kVar5.f49475c = this.d;
        kVar5.f49474b = "mid";
        return kVar.toString();
    }
}
