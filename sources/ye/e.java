package ye;

import bf.p;
import t7.s;
public final class e extends df.a {
    public final bf.h f47033a;
    public String f47034b;
    public final StringBuilder f47035c;

    public e(char c10, int i10, int i11) {
        ?? pVar = new p();
        this.f47033a = pVar;
        this.f47035c = new StringBuilder();
        pVar.f3540g = c10;
        pVar.h = i10;
        pVar.f3541i = i11;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f47034b == null) {
            this.f47034b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f47035c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        String a2 = af.a.a(this.f47034b.trim());
        bf.h hVar = this.f47033a;
        hVar.f3542j = a2;
        hVar.f3543k = this.f47035c.toString();
    }

    @Override
    public final bf.a e() {
        return this.f47033a;
    }

    @Override
    public final q3.h h(d dVar) {
        int i10 = dVar.e;
        int i11 = dVar.f47022b;
        CharSequence charSequence = dVar.f47021a;
        int i12 = dVar.f47025g;
        bf.h hVar = this.f47033a;
        if (i12 < 4) {
            char c10 = hVar.f3540g;
            int i13 = hVar.h;
            int b10 = s.b(c10, charSequence, i10, charSequence.length()) - i10;
            if (b10 >= i13 && s.c(i10 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new q3.h(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i14 = hVar.f3541i; i14 > 0 && i11 < length && charSequence.charAt(i11) == ' '; i14--) {
            i11++;
        }
        return q3.h.a(i11);
    }
}
