package xb;

import java.util.Arrays;
import n6.l;
import v7.k;
public final class a {
    public final String f49822a;
    public final float f49823b;
    public final int f49824c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f50449a;
        this.f49822a = str == null ? "" : str;
        this.f49823b = f7;
        this.f49824c = i10;
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
        if (l.l(this.f49822a, aVar.f49822a) && Float.compare(this.f49823b, aVar.f49823b) == 0 && this.f49824c == aVar.f49824c && l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49822a, Float.valueOf(this.f49823b), Integer.valueOf(this.f49824c), this.d});
    }

    public final String toString() {
        k kVar = new k(a.class.getSimpleName(), 12);
        k kVar2 = new k(11, false);
        ((k) kVar.d).d = kVar2;
        kVar.d = kVar2;
        kVar2.f47987c = this.f49822a;
        kVar2.f47986b = "text";
        String valueOf = String.valueOf(this.f49823b);
        k kVar3 = new k(11, false);
        ((k) kVar.d).d = kVar3;
        kVar.d = kVar3;
        kVar3.f47987c = valueOf;
        kVar3.f47986b = "confidence";
        String valueOf2 = String.valueOf(this.f49824c);
        k kVar4 = new k(11, false);
        ((k) kVar.d).d = kVar4;
        kVar4.f47987c = valueOf2;
        kVar4.f47986b = "index";
        k kVar5 = new k(11, false);
        kVar4.d = kVar5;
        kVar.d = kVar5;
        kVar5.f47987c = this.d;
        kVar5.f47986b = "mid";
        return kVar.toString();
    }
}
