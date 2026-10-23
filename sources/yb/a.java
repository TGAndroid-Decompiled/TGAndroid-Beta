package yb;

import java.util.Arrays;
import n6.l;
public final class a {
    public final String f50565a;
    public final float f50566b;
    public final int f50567c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f50412a;
        this.f50565a = str == null ? "" : str;
        this.f50566b = f7;
        this.f50567c = i10;
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
        if (l.l(this.f50565a, aVar.f50565a) && Float.compare(this.f50566b, aVar.f50566b) == 0 && this.f50567c == aVar.f50567c && l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50565a, Float.valueOf(this.f50566b), Integer.valueOf(this.f50567c), this.d});
    }

    public final String toString() {
        u2.c cVar = new u2.c(a.class.getSimpleName(), 14);
        u2.c cVar2 = new u2.c(13, false);
        ((u2.c) cVar.d).d = cVar2;
        cVar.d = cVar2;
        cVar2.f47713c = this.f50565a;
        cVar2.f47712b = "text";
        String valueOf = String.valueOf(this.f50566b);
        u2.c cVar3 = new u2.c(13, false);
        ((u2.c) cVar.d).d = cVar3;
        cVar.d = cVar3;
        cVar3.f47713c = valueOf;
        cVar3.f47712b = "confidence";
        String valueOf2 = String.valueOf(this.f50567c);
        u2.c cVar4 = new u2.c(13, false);
        ((u2.c) cVar.d).d = cVar4;
        cVar4.f47713c = valueOf2;
        cVar4.f47712b = "index";
        u2.c cVar5 = new u2.c(13, false);
        cVar4.d = cVar5;
        cVar.d = cVar5;
        cVar5.f47713c = this.d;
        cVar5.f47712b = "mid";
        return cVar.toString();
    }
}
