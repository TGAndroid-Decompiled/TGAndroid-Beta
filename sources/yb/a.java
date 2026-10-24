package yb;

import java.util.Arrays;
import n6.l;
public final class a {
    public final String f50564a;
    public final float f50565b;
    public final int f50566c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f50411a;
        this.f50564a = str == null ? "" : str;
        this.f50565b = f7;
        this.f50566c = i10;
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
        if (l.l(this.f50564a, aVar.f50564a) && Float.compare(this.f50565b, aVar.f50565b) == 0 && this.f50566c == aVar.f50566c && l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50564a, Float.valueOf(this.f50565b), Integer.valueOf(this.f50566c), this.d});
    }

    public final String toString() {
        u2.c cVar = new u2.c(a.class.getSimpleName(), 14);
        u2.c cVar2 = new u2.c(13, false);
        ((u2.c) cVar.d).d = cVar2;
        cVar.d = cVar2;
        cVar2.f47712c = this.f50564a;
        cVar2.f47711b = "text";
        String valueOf = String.valueOf(this.f50565b);
        u2.c cVar3 = new u2.c(13, false);
        ((u2.c) cVar.d).d = cVar3;
        cVar.d = cVar3;
        cVar3.f47712c = valueOf;
        cVar3.f47711b = "confidence";
        String valueOf2 = String.valueOf(this.f50566c);
        u2.c cVar4 = new u2.c(13, false);
        ((u2.c) cVar.d).d = cVar4;
        cVar4.f47712c = valueOf2;
        cVar4.f47711b = "index";
        u2.c cVar5 = new u2.c(13, false);
        cVar4.d = cVar5;
        cVar.d = cVar5;
        cVar5.f47712c = this.d;
        cVar5.f47711b = "mid";
        return cVar.toString();
    }
}
