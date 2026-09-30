package xb;

import java.util.Arrays;
import n6.l;
public final class a {
    public final String f46124a;
    public final float f46125b;
    public final int f46126c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f46719a;
        this.f46124a = str == null ? "" : str;
        this.f46125b = f7;
        this.f46126c = i10;
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
        if (l.l(this.f46124a, aVar.f46124a) && Float.compare(this.f46125b, aVar.f46125b) == 0 && this.f46126c == aVar.f46126c && l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46124a, Float.valueOf(this.f46125b), Integer.valueOf(this.f46126c), this.d});
    }

    public final String toString() {
        v7.l lVar = new v7.l(a.class.getSimpleName(), 12);
        v7.l lVar2 = new v7.l(11, false);
        ((v7.l) lVar.d).d = lVar2;
        lVar.d = lVar2;
        lVar2.f44422c = this.f46124a;
        lVar2.f44421b = "text";
        String valueOf = String.valueOf(this.f46125b);
        v7.l lVar3 = new v7.l(11, false);
        ((v7.l) lVar.d).d = lVar3;
        lVar.d = lVar3;
        lVar3.f44422c = valueOf;
        lVar3.f44421b = "confidence";
        String valueOf2 = String.valueOf(this.f46126c);
        v7.l lVar4 = new v7.l(11, false);
        ((v7.l) lVar.d).d = lVar4;
        lVar4.f44422c = valueOf2;
        lVar4.f44421b = "index";
        v7.l lVar5 = new v7.l(11, false);
        lVar4.d = lVar5;
        lVar.d = lVar5;
        lVar5.f44422c = this.d;
        lVar5.f44421b = "mid";
        return lVar.toString();
    }
}
