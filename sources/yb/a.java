package yb;

import java.util.Arrays;
import n6.l;
public final class a {
    public final String f48732a;
    public final float f48733b;
    public final int f48734c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f48579a;
        this.f48732a = str == null ? "" : str;
        this.f48733b = f7;
        this.f48734c = i10;
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
        if (l.l(this.f48732a, aVar.f48732a) && Float.compare(this.f48733b, aVar.f48733b) == 0 && this.f48734c == aVar.f48734c && l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48732a, Float.valueOf(this.f48733b), Integer.valueOf(this.f48734c), this.d});
    }

    public final String toString() {
        u2.c cVar = new u2.c(a.class.getSimpleName(), 14);
        u2.c cVar2 = new u2.c(13, false);
        ((u2.c) cVar.d).d = cVar2;
        cVar.d = cVar2;
        cVar2.f45876c = this.f48732a;
        cVar2.f45875b = "text";
        String valueOf = String.valueOf(this.f48733b);
        u2.c cVar3 = new u2.c(13, false);
        ((u2.c) cVar.d).d = cVar3;
        cVar.d = cVar3;
        cVar3.f45876c = valueOf;
        cVar3.f45875b = "confidence";
        String valueOf2 = String.valueOf(this.f48734c);
        u2.c cVar4 = new u2.c(13, false);
        ((u2.c) cVar.d).d = cVar4;
        cVar4.f45876c = valueOf2;
        cVar4.f45875b = "index";
        u2.c cVar5 = new u2.c(13, false);
        cVar4.d = cVar5;
        cVar.d = cVar5;
        cVar5.f45876c = this.d;
        cVar5.f45875b = "mid";
        return cVar.toString();
    }
}
