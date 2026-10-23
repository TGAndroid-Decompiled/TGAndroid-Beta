package yb;

import java.util.Arrays;
import n6.l;
public final class a {
    public final String f50126a;
    public final float f50127b;
    public final int f50128c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f49972a;
        this.f50126a = str == null ? "" : str;
        this.f50127b = f7;
        this.f50128c = i10;
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
        if (l.l(this.f50126a, aVar.f50126a) && Float.compare(this.f50127b, aVar.f50127b) == 0 && this.f50128c == aVar.f50128c && l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50126a, Float.valueOf(this.f50127b), Integer.valueOf(this.f50128c), this.d});
    }

    public final String toString() {
        u2.c cVar = new u2.c(a.class.getSimpleName(), 14);
        u2.c cVar2 = new u2.c(13, false);
        ((u2.c) cVar.d).d = cVar2;
        cVar.d = cVar2;
        cVar2.f47274c = this.f50126a;
        cVar2.f47273b = "text";
        String valueOf = String.valueOf(this.f50127b);
        u2.c cVar3 = new u2.c(13, false);
        ((u2.c) cVar.d).d = cVar3;
        cVar.d = cVar3;
        cVar3.f47274c = valueOf;
        cVar3.f47273b = "confidence";
        String valueOf2 = String.valueOf(this.f50128c);
        u2.c cVar4 = new u2.c(13, false);
        ((u2.c) cVar.d).d = cVar4;
        cVar4.f47274c = valueOf2;
        cVar4.f47273b = "index";
        u2.c cVar5 = new u2.c(13, false);
        cVar4.d = cVar5;
        cVar.d = cVar5;
        cVar5.f47274c = this.d;
        cVar5.f47273b = "mid";
        return cVar.toString();
    }
}
