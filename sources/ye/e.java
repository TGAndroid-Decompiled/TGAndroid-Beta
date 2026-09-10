package ye;

import bf.p;
import t7.s;
public final class e extends df.a {
    public final bf.h f46881a;
    public String f46882b;
    public final StringBuilder f46883c;

    public e(char c10, int i10, int i11) {
        ?? pVar = new p();
        this.f46881a = pVar;
        this.f46883c = new StringBuilder();
        pVar.f2233g = c10;
        pVar.h = i10;
        pVar.f2234i = i11;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f46882b == null) {
            this.f46882b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f46883c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        String a2 = af.a.a(this.f46882b.trim());
        bf.h hVar = this.f46881a;
        hVar.f2235j = a2;
        hVar.f2236k = this.f46883c.toString();
    }

    @Override
    public final bf.a e() {
        return this.f46881a;
    }

    @Override
    public final q3.h h(d dVar) {
        int i10 = dVar.e;
        int i11 = dVar.f46870b;
        CharSequence charSequence = dVar.f46869a;
        int i12 = dVar.f46873g;
        bf.h hVar = this.f46881a;
        if (i12 < 4) {
            char c10 = hVar.f2233g;
            int i13 = hVar.h;
            int b10 = s.b(c10, charSequence, i10, charSequence.length()) - i10;
            if (b10 >= i13 && s.c(i10 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new q3.h(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i14 = hVar.f2234i; i14 > 0 && i11 < length && charSequence.charAt(i11) == ' '; i14--) {
            i11++;
        }
        return q3.h.a(i11);
    }
}
