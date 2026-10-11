package xb;

import java.util.Arrays;
import n6.m;
import v7.k;
public final class a {
    public final String f51195a;
    public final float f51196b;
    public final int f51197c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f51824a;
        this.f51195a = str == null ? "" : str;
        this.f51196b = f7;
        this.f51197c = i10;
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
        if (m.l(this.f51195a, aVar.f51195a) && Float.compare(this.f51196b, aVar.f51196b) == 0 && this.f51197c == aVar.f51197c && m.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51195a, Float.valueOf(this.f51196b), Integer.valueOf(this.f51197c), this.d});
    }

    public final String toString() {
        k kVar = new k(a.class.getSimpleName(), 13);
        k kVar2 = new k(12, false);
        ((k) kVar.d).d = kVar2;
        kVar.d = kVar2;
        kVar2.f49334c = this.f51195a;
        kVar2.f49333b = "text";
        String valueOf = String.valueOf(this.f51196b);
        k kVar3 = new k(12, false);
        ((k) kVar.d).d = kVar3;
        kVar.d = kVar3;
        kVar3.f49334c = valueOf;
        kVar3.f49333b = "confidence";
        String valueOf2 = String.valueOf(this.f51197c);
        k kVar4 = new k(12, false);
        ((k) kVar.d).d = kVar4;
        kVar4.f49334c = valueOf2;
        kVar4.f49333b = "index";
        k kVar5 = new k(12, false);
        kVar4.d = kVar5;
        kVar.d = kVar5;
        kVar5.f49334c = this.d;
        kVar5.f49333b = "mid";
        return kVar.toString();
    }
}
