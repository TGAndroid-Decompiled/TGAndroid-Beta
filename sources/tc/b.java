package tc;

import q3.h;
import w7.e8;
public final class b extends xe.a {
    public final a f48593a = new df.c();
    public final StringBuilder f48594b = new StringBuilder();
    public final int f48595c;

    public b(int i10) {
        this.f48595c = i10;
    }

    @Override
    public final void a(CharSequence charSequence) {
        StringBuilder sb2 = this.f48594b;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        this.f48593a.f48592g = this.f48594b.toString();
    }

    @Override
    public final ve.a e() {
        return this.f48593a;
    }

    @Override
    public final h h(se.d dVar) {
        int i10;
        int i11 = dVar.e;
        CharSequence charSequence = dVar.f48197a;
        int length = charSequence.length();
        if (dVar.f48201g < 4) {
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
            int i13 = this.f48595c;
            if (i10 == i13 && e8.b(' ', charSequence, i11 + i13, length) == length) {
                return new h(-1, -1, true);
            }
        }
        return h.a(dVar.f48198b);
    }
}
