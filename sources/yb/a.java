package yb;

import java.util.Arrays;
import n6.l;
public final class a {
    public final String f50117a;
    public final float f50118b;
    public final int f50119c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f49963a;
        this.f50117a = str == null ? "" : str;
        this.f50118b = f7;
        this.f50119c = i10;
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
        if (l.l(this.f50117a, aVar.f50117a) && Float.compare(this.f50118b, aVar.f50118b) == 0 && this.f50119c == aVar.f50119c && l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50117a, Float.valueOf(this.f50118b), Integer.valueOf(this.f50119c), this.d});
    }

    public final String toString() {
        u2.c cVar = new u2.c(a.class.getSimpleName(), 14);
        u2.c cVar2 = new u2.c(13, false);
        ((u2.c) cVar.d).d = cVar2;
        cVar.d = cVar2;
        cVar2.f47262c = this.f50117a;
        cVar2.f47261b = "text";
        String valueOf = String.valueOf(this.f50118b);
        u2.c cVar3 = new u2.c(13, false);
        ((u2.c) cVar.d).d = cVar3;
        cVar.d = cVar3;
        cVar3.f47262c = valueOf;
        cVar3.f47261b = "confidence";
        String valueOf2 = String.valueOf(this.f50119c);
        u2.c cVar4 = new u2.c(13, false);
        ((u2.c) cVar.d).d = cVar4;
        cVar4.f47262c = valueOf2;
        cVar4.f47261b = "index";
        u2.c cVar5 = new u2.c(13, false);
        cVar4.d = cVar5;
        cVar.d = cVar5;
        cVar5.f47262c = this.d;
        cVar5.f47261b = "mid";
        return cVar.toString();
    }
}
