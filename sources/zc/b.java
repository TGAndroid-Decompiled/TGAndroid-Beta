package zc;

import bf.p;
import q3.h;
import t7.s;
public final class b extends df.a {
    public final a f48884a = new p();
    public final StringBuilder f48885b = new StringBuilder();
    public final int f48886c;

    public b(int i10) {
        this.f48886c = i10;
    }

    @Override
    public final void a(CharSequence charSequence) {
        StringBuilder sb2 = this.f48885b;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        this.f48884a.f48883g = this.f48885b.toString();
    }

    @Override
    public final bf.a e() {
        return this.f48884a;
    }

    @Override
    public final h h(ye.d dVar) {
        int i10;
        int i11 = dVar.e;
        CharSequence charSequence = dVar.f46742a;
        int length = charSequence.length();
        if (dVar.f46746g < 4) {
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
            int i13 = this.f48886c;
            if (i10 == i13 && s.b(' ', charSequence, i11 + i13, length) == length) {
                return new h(-1, -1, true);
            }
        }
        return h.a(dVar.f46743b);
    }
}
