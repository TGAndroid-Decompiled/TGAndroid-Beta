package zc;

import c8.x0;
import gf.h;
import kf.p;
public final class b extends mf.a {
    public final a f59939a = new p();
    public final StringBuilder f59940b = new StringBuilder();
    public final int f59941c;

    public b(int i7) {
        this.f59941c = i7;
    }

    @Override
    public final void a(CharSequence charSequence) {
        StringBuilder sb2 = this.f59940b;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        this.f59939a.f59938g = this.f59940b.toString();
    }

    @Override
    public final kf.a e() {
        return this.f59939a;
    }

    @Override
    public final gf.a h(h hVar) {
        int i7;
        int i10 = hVar.f13895e;
        CharSequence charSequence = hVar.f13892a;
        int length = charSequence.length();
        if (hVar.f13897g < 4) {
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
            int i12 = this.f59941c;
            if (i7 == i12 && x0.b(' ', i10 + i12, length, charSequence) == length) {
                return new gf.a(-1, -1, true);
            }
        }
        return gf.a.a(hVar.f13893b);
    }
}
