package xb;

import java.util.Arrays;
import n6.l;
import v7.k;
public final class a {
    public final String f46062a;
    public final float f46063b;
    public final int f46064c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f46656a;
        this.f46062a = str == null ? "" : str;
        this.f46063b = f7;
        this.f46064c = i10;
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
        if (l.l(this.f46062a, aVar.f46062a) && Float.compare(this.f46063b, aVar.f46063b) == 0 && this.f46064c == aVar.f46064c && l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46062a, Float.valueOf(this.f46063b), Integer.valueOf(this.f46064c), this.d});
    }

    public final String toString() {
        k kVar = new k(a.class.getSimpleName(), 12);
        k kVar2 = new k(11, false);
        ((k) kVar.d).d = kVar2;
        kVar.d = kVar2;
        kVar2.f44350c = this.f46062a;
        kVar2.f44349b = "text";
        String valueOf = String.valueOf(this.f46063b);
        k kVar3 = new k(11, false);
        ((k) kVar.d).d = kVar3;
        kVar.d = kVar3;
        kVar3.f44350c = valueOf;
        kVar3.f44349b = "confidence";
        String valueOf2 = String.valueOf(this.f46064c);
        k kVar4 = new k(11, false);
        ((k) kVar.d).d = kVar4;
        kVar4.f44350c = valueOf2;
        kVar4.f44349b = "index";
        k kVar5 = new k(11, false);
        kVar4.d = kVar5;
        kVar.d = kVar5;
        kVar5.f44350c = this.d;
        kVar5.f44349b = "mid";
        return kVar.toString();
    }
}
