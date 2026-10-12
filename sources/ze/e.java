package ze;

import cf.p;
import v7.i0;
public final class e extends ef.a {
    public final cf.h f54617a;
    public String f54618b;
    public final StringBuilder f54619c;

    public e(char c10, int i10, int i11) {
        ?? pVar = new p();
        this.f54617a = pVar;
        this.f54619c = new StringBuilder();
        pVar.f4638g = c10;
        pVar.h = i10;
        pVar.f4639i = i11;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f54618b == null) {
            this.f54618b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f54619c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        String a2 = bf.a.a(this.f54618b.trim());
        cf.h hVar = this.f54617a;
        hVar.f4640j = a2;
        hVar.f4641k = this.f54619c.toString();
    }

    @Override
    public final cf.a e() {
        return this.f54617a;
    }

    @Override
    public final q3.h h(d dVar) {
        int i10 = dVar.f54607e;
        int i11 = dVar.f54605b;
        CharSequence charSequence = dVar.f54604a;
        int i12 = dVar.f54609g;
        cf.h hVar = this.f54617a;
        if (i12 < 4) {
            char c10 = hVar.f4638g;
            int i13 = hVar.h;
            int b10 = i0.b(c10, charSequence, i10, charSequence.length()) - i10;
            if (b10 >= i13 && i0.c(i10 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new q3.h(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i14 = hVar.f4639i; i14 > 0 && i11 < length && charSequence.charAt(i11) == ' '; i14--) {
            i11++;
        }
        return q3.h.a(i11);
    }
}
