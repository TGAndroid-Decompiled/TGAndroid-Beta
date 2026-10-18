package yb;

import java.util.Arrays;
import n6.l;
import t0.h;
public final class a {
    public final String f50162a;
    public final float f50163b;
    public final int f50164c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.f50009a;
        this.f50162a = str == null ? "" : str;
        this.f50163b = f7;
        this.f50164c = i10;
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
        if (l.l(this.f50162a, aVar.f50162a) && Float.compare(this.f50163b, aVar.f50163b) == 0 && this.f50164c == aVar.f50164c && l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50162a, Float.valueOf(this.f50163b), Integer.valueOf(this.f50164c), this.d});
    }

    public final String toString() {
        h hVar = new h(a.class.getSimpleName(), 15);
        h hVar2 = new h(14, false);
        ((h) hVar.d).d = hVar2;
        hVar.d = hVar2;
        hVar2.f46912c = this.f50162a;
        hVar2.f46911b = "text";
        String valueOf = String.valueOf(this.f50163b);
        h hVar3 = new h(14, false);
        ((h) hVar.d).d = hVar3;
        hVar.d = hVar3;
        hVar3.f46912c = valueOf;
        hVar3.f46911b = "confidence";
        String valueOf2 = String.valueOf(this.f50164c);
        h hVar4 = new h(14, false);
        ((h) hVar.d).d = hVar4;
        hVar4.f46912c = valueOf2;
        hVar4.f46911b = "index";
        h hVar5 = new h(14, false);
        hVar4.d = hVar5;
        hVar.d = hVar5;
        hVar5.f46912c = this.d;
        hVar5.f46911b = "mid";
        return hVar.toString();
    }
}
