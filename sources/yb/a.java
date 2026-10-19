package yb;

import java.util.Arrays;
import n6.l;
public final class a {
    public final String f50115a;
    public final float f50116b;
    public final int f50117c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f49961a;
        this.f50115a = str == null ? "" : str;
        this.f50116b = f7;
        this.f50117c = i10;
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
        if (l.l(this.f50115a, aVar.f50115a) && Float.compare(this.f50116b, aVar.f50116b) == 0 && this.f50117c == aVar.f50117c && l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50115a, Float.valueOf(this.f50116b), Integer.valueOf(this.f50117c), this.d});
    }

    public final String toString() {
        u2.c cVar = new u2.c(a.class.getSimpleName(), 14);
        u2.c cVar2 = new u2.c(13, false);
        ((u2.c) cVar.d).d = cVar2;
        cVar.d = cVar2;
        cVar2.f47260c = this.f50115a;
        cVar2.f47259b = "text";
        String valueOf = String.valueOf(this.f50116b);
        u2.c cVar3 = new u2.c(13, false);
        ((u2.c) cVar.d).d = cVar3;
        cVar.d = cVar3;
        cVar3.f47260c = valueOf;
        cVar3.f47259b = "confidence";
        String valueOf2 = String.valueOf(this.f50117c);
        u2.c cVar4 = new u2.c(13, false);
        ((u2.c) cVar.d).d = cVar4;
        cVar4.f47260c = valueOf2;
        cVar4.f47259b = "index";
        u2.c cVar5 = new u2.c(13, false);
        cVar4.d = cVar5;
        cVar.d = cVar5;
        cVar5.f47260c = this.d;
        cVar5.f47259b = "mid";
        return cVar.toString();
    }
}
