package ze;

import cf.p;
import v7.i0;
public final class e extends ef.a {
    public final cf.h f54480a;
    public String f54481b;
    public final StringBuilder f54482c;

    public e(char c10, int i10, int i11) {
        ?? pVar = new p();
        this.f54480a = pVar;
        this.f54482c = new StringBuilder();
        pVar.f4639g = c10;
        pVar.h = i10;
        pVar.f4640i = i11;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f54481b == null) {
            this.f54481b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f54482c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        String a2 = bf.a.a(this.f54481b.trim());
        cf.h hVar = this.f54480a;
        hVar.f4641j = a2;
        hVar.f4642k = this.f54482c.toString();
    }

    @Override
    public final cf.a e() {
        return this.f54480a;
    }

    @Override
    public final q3.h h(d dVar) {
        int i10 = dVar.f54470e;
        int i11 = dVar.f54468b;
        CharSequence charSequence = dVar.f54467a;
        int i12 = dVar.f54472g;
        cf.h hVar = this.f54480a;
        if (i12 < 4) {
            char c10 = hVar.f4639g;
            int i13 = hVar.h;
            int b10 = i0.b(c10, charSequence, i10, charSequence.length()) - i10;
            if (b10 >= i13 && i0.c(i10 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new q3.h(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i14 = hVar.f4640i; i14 > 0 && i11 < length && charSequence.charAt(i11) == ' '; i14--) {
            i11++;
        }
        return q3.h.a(i11);
    }
}
