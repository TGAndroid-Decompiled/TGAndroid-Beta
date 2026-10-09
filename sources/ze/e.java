package ze;

import cf.p;
import v7.i0;
public final class e extends ef.a {
    public final cf.h f54391a;
    public String f54392b;
    public final StringBuilder f54393c;

    public e(char c10, int i10, int i11) {
        ?? pVar = new p();
        this.f54391a = pVar;
        this.f54393c = new StringBuilder();
        pVar.f4640g = c10;
        pVar.h = i10;
        pVar.f4641i = i11;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f54392b == null) {
            this.f54392b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f54393c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        String a2 = bf.a.a(this.f54392b.trim());
        cf.h hVar = this.f54391a;
        hVar.f4642j = a2;
        hVar.f4643k = this.f54393c.toString();
    }

    @Override
    public final cf.a e() {
        return this.f54391a;
    }

    @Override
    public final q3.h h(d dVar) {
        int i10 = dVar.f54381e;
        int i11 = dVar.f54379b;
        CharSequence charSequence = dVar.f54378a;
        int i12 = dVar.f54383g;
        cf.h hVar = this.f54391a;
        if (i12 < 4) {
            char c10 = hVar.f4640g;
            int i13 = hVar.h;
            int b10 = i0.b(c10, charSequence, i10, charSequence.length()) - i10;
            if (b10 >= i13 && i0.c(i10 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new q3.h(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i14 = hVar.f4641i; i14 > 0 && i11 < length && charSequence.charAt(i11) == ' '; i14--) {
            i11++;
        }
        return q3.h.a(i11);
    }
}
