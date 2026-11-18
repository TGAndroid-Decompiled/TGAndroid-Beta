package zc;

import c8.a1;
import gf.g;
import kf.p;
public final class b extends mf.a {
    public final a f61806a = new p();
    public final StringBuilder f61807b = new StringBuilder();
    public final int f61808c;

    public b(int i7) {
        this.f61808c = i7;
    }

    @Override
    public final void a(CharSequence charSequence) {
        StringBuilder sb2 = this.f61807b;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        this.f61806a.f61805g = this.f61807b.toString();
    }

    @Override
    public final kf.a e() {
        return this.f61806a;
    }

    @Override
    public final gf.a h(g gVar) {
        int i7;
        int i10 = gVar.f13549e;
        CharSequence charSequence = gVar.f13546a;
        int length = charSequence.length();
        if (gVar.f13551g < 4) {
            int i11 = i10;
            while (true) {
                if (i11 < length) {
                    if ('$' != charSequence.charAt(i11)) {
                        i7 = i11 - i10;
                        break;
                    }
                    i11++;
                } else {
                    i7 = length - i10;
                    break;
                }
            }
            int i12 = this.f61808c;
            if (i7 == i12 && a1.b(' ', i10 + i12, length, charSequence) == length) {
                return new gf.a(-1, -1, true);
            }
        }
        return gf.a.a(gVar.f13547b);
    }
}
