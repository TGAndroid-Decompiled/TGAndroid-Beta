package yb;

import java.util.Arrays;
import n6.l;
public final class a {
    public final String f50137a;
    public final float f50138b;
    public final int f50139c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f49984a;
        this.f50137a = str == null ? "" : str;
        this.f50138b = f7;
        this.f50139c = i10;
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
        if (l.l(this.f50137a, aVar.f50137a) && Float.compare(this.f50138b, aVar.f50138b) == 0 && this.f50139c == aVar.f50139c && l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50137a, Float.valueOf(this.f50138b), Integer.valueOf(this.f50139c), this.d});
    }

    public final String toString() {
        u2.c cVar = new u2.c(a.class.getSimpleName(), 14);
        u2.c cVar2 = new u2.c(13, false);
        ((u2.c) cVar.d).d = cVar2;
        cVar.d = cVar2;
        cVar2.f47283c = this.f50137a;
        cVar2.f47282b = "text";
        String valueOf = String.valueOf(this.f50138b);
        u2.c cVar3 = new u2.c(13, false);
        ((u2.c) cVar.d).d = cVar3;
        cVar.d = cVar3;
        cVar3.f47283c = valueOf;
        cVar3.f47282b = "confidence";
        String valueOf2 = String.valueOf(this.f50139c);
        u2.c cVar4 = new u2.c(13, false);
        ((u2.c) cVar.d).d = cVar4;
        cVar4.f47283c = valueOf2;
        cVar4.f47282b = "index";
        u2.c cVar5 = new u2.c(13, false);
        cVar4.d = cVar5;
        cVar.d = cVar5;
        cVar5.f47283c = this.d;
        cVar5.f47282b = "mid";
        return cVar.toString();
    }
}
