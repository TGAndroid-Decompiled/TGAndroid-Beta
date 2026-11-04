package wc;

import b8.ec;
import df.g;
import gf.p;
public final class b extends jf.a {
    public final a f57452a = new p();
    public final StringBuilder f57453b = new StringBuilder();
    public final int f57454c;

    public b(int i3) {
        this.f57454c = i3;
    }

    @Override
    public final void a(CharSequence charSequence) {
        StringBuilder sb2 = this.f57453b;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        this.f57452a.f57451g = this.f57453b.toString();
    }

    @Override
    public final gf.a e() {
        return this.f57452a;
    }

    @Override
    public final df.a h(g gVar) {
        int i3;
        int i10 = gVar.f8865e;
        CharSequence charSequence = gVar.f8862a;
        int length = charSequence.length();
        if (gVar.f8867g < 4) {
            int i11 = i10;
            while (true) {
                if (i11 < length) {
                    if ('$' != charSequence.charAt(i11)) {
                        i3 = i11 - i10;
                        break;
                    }
                    i11++;
                } else {
                    i3 = length - i10;
                    break;
                }
            }
            int i12 = this.f57454c;
            if (i3 == i12 && ec.b(' ', i10 + i12, length, charSequence) == length) {
                return new df.a(-1, -1, true);
            }
        }
        return df.a.a(gVar.f8863b);
    }
}
