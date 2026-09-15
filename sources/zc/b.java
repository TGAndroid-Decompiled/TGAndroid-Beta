package zc;

import bf.p;
import q3.h;
import t7.s;
public final class b extends df.a {
    public final a f48861a = new p();
    public final StringBuilder f48862b = new StringBuilder();
    public final int f48863c;

    public b(int i10) {
        this.f48863c = i10;
    }

    @Override
    public final void a(CharSequence charSequence) {
        StringBuilder sb2 = this.f48862b;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        this.f48861a.f48860g = this.f48862b.toString();
    }

    @Override
    public final bf.a e() {
        return this.f48861a;
    }

    @Override
    public final h h(ye.d dVar) {
        int i10;
        int i11 = dVar.e;
        CharSequence charSequence = dVar.f46719a;
        int length = charSequence.length();
        if (dVar.f46723g < 4) {
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
            int i13 = this.f48863c;
            if (i10 == i13 && s.b(' ', charSequence, i11 + i13, length) == length) {
                return new h(-1, -1, true);
            }
        }
        return h.a(dVar.f46720b);
    }
}
