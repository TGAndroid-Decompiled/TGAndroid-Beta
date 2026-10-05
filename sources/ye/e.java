package ye;

import bf.p;
import t7.s;
public final class e extends df.a {
    public final bf.h f50895a;
    public String f50896b;
    public final StringBuilder f50897c;

    public e(char c10, int i10, int i11) {
        ?? pVar = new p();
        this.f50895a = pVar;
        this.f50897c = new StringBuilder();
        pVar.f3819g = c10;
        pVar.h = i10;
        pVar.f3820i = i11;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f50896b == null) {
            this.f50896b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f50897c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        String a2 = af.a.a(this.f50896b.trim());
        bf.h hVar = this.f50895a;
        hVar.f3821j = a2;
        hVar.f3822k = this.f50897c.toString();
    }

    @Override
    public final bf.a e() {
        return this.f50895a;
    }

    @Override
    public final q3.h h(d dVar) {
        int i10 = dVar.f50885e;
        int i11 = dVar.f50883b;
        CharSequence charSequence = dVar.f50882a;
        int i12 = dVar.f50887g;
        bf.h hVar = this.f50895a;
        if (i12 < 4) {
            char c10 = hVar.f3819g;
            int i13 = hVar.h;
            int b10 = s.b(c10, charSequence, i10, charSequence.length()) - i10;
            if (b10 >= i13 && s.c(i10 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new q3.h(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i14 = hVar.f3820i; i14 > 0 && i11 < length && charSequence.charAt(i11) == ' '; i14--) {
            i11++;
        }
        return q3.h.a(i11);
    }
}
