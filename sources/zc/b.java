package zc;

import bf.p;
import q3.h;
import t7.s;
public final class b extends df.a {
    public final a f49181a = new p();
    public final StringBuilder f49182b = new StringBuilder();
    public final int f49183c;

    public b(int i10) {
        this.f49183c = i10;
    }

    @Override
    public final void a(CharSequence charSequence) {
        StringBuilder sb2 = this.f49182b;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        this.f49181a.f49180g = this.f49182b.toString();
    }

    @Override
    public final bf.a e() {
        return this.f49181a;
    }

    @Override
    public final h h(ye.d dVar) {
        int i10;
        int i11 = dVar.e;
        CharSequence charSequence = dVar.f47042a;
        int length = charSequence.length();
        if (dVar.f47046g < 4) {
            int i12 = i11;
            while (true) {
                if (i12 < length) {
                    if ('$' != charSequence.charAt(i12)) {
                        i10 = i12 - i11;
                        break;
                    }
                    i12++;
                } else {
                    i10 = length - i11;
                    break;
                }
            }
            int i13 = this.f49183c;
            if (i10 == i13 && s.b(' ', charSequence, i11 + i13, length) == length) {
                return new h(-1, -1, true);
            }
        }
        return h.a(dVar.f47043b);
    }
}
