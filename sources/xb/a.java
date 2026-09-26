package xb;

import java.util.Arrays;
import n6.l;
public final class a {
    public final String f46015a;
    public final float f46016b;
    public final int f46017c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f46610a;
        this.f46015a = str == null ? "" : str;
        this.f46016b = f7;
        this.f46017c = i10;
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
        if (l.l(this.f46015a, aVar.f46015a) && Float.compare(this.f46016b, aVar.f46016b) == 0 && this.f46017c == aVar.f46017c && l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46015a, Float.valueOf(this.f46016b), Integer.valueOf(this.f46017c), this.d});
    }

    public final String toString() {
        v7.l lVar = new v7.l(a.class.getSimpleName(), 12);
        v7.l lVar2 = new v7.l(11, false);
        ((v7.l) lVar.d).d = lVar2;
        lVar.d = lVar2;
        lVar2.f44313c = this.f46015a;
        lVar2.f44312b = "text";
        String valueOf = String.valueOf(this.f46016b);
        v7.l lVar3 = new v7.l(11, false);
        ((v7.l) lVar.d).d = lVar3;
        lVar.d = lVar3;
        lVar3.f44313c = valueOf;
        lVar3.f44312b = "confidence";
        String valueOf2 = String.valueOf(this.f46017c);
        v7.l lVar4 = new v7.l(11, false);
        ((v7.l) lVar.d).d = lVar4;
        lVar4.f44313c = valueOf2;
        lVar4.f44312b = "index";
        v7.l lVar5 = new v7.l(11, false);
        lVar4.d = lVar5;
        lVar.d = lVar5;
        lVar5.f44313c = this.d;
        lVar5.f44312b = "mid";
        return lVar.toString();
    }
}
