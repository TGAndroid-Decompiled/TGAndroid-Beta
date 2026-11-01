package tc;

import q3.h;
import w7.e8;
public final class b extends xe.a {
    public final a f48604a = new df.c();
    public final StringBuilder f48605b = new StringBuilder();
    public final int f48606c;

    public b(int i10) {
        this.f48606c = i10;
    }

    @Override
    public final void a(CharSequence charSequence) {
        StringBuilder sb2 = this.f48605b;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        this.f48604a.f48603g = this.f48605b.toString();
    }

    @Override
    public final ve.a e() {
        return this.f48604a;
    }

    @Override
    public final h h(se.d dVar) {
        int i10;
        int i11 = dVar.e;
        CharSequence charSequence = dVar.f48208a;
        int length = charSequence.length();
        if (dVar.f48212g < 4) {
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
            int i13 = this.f48606c;
            if (i10 == i13 && e8.b(' ', charSequence, i11 + i13, length) == length) {
                return new h(-1, -1, true);
            }
        }
        return h.a(dVar.f48209b);
    }
}
