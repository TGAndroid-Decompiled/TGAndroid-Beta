package ze;

import cf.p;
import v7.i0;
public final class e extends ef.a {
    public final cf.h f54393a;
    public String f54394b;
    public final StringBuilder f54395c;

    public e(char c10, int i10, int i11) {
        ?? pVar = new p();
        this.f54393a = pVar;
        this.f54395c = new StringBuilder();
        pVar.f4640g = c10;
        pVar.h = i10;
        pVar.f4641i = i11;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f54394b == null) {
            this.f54394b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f54395c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        String a2 = bf.a.a(this.f54394b.trim());
        cf.h hVar = this.f54393a;
        hVar.f4642j = a2;
        hVar.f4643k = this.f54395c.toString();
    }

    @Override
    public final cf.a e() {
        return this.f54393a;
    }

    @Override
    public final q3.h h(d dVar) {
        int i10 = dVar.f54383e;
        int i11 = dVar.f54381b;
        CharSequence charSequence = dVar.f54380a;
        int i12 = dVar.f54385g;
        cf.h hVar = this.f54393a;
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
