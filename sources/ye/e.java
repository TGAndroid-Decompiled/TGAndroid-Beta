package ye;

import bf.p;
import t7.s;
public final class e extends df.a {
    public final bf.h f46754a;
    public String f46755b;
    public final StringBuilder f46756c;

    public e(char c10, int i10, int i11) {
        ?? pVar = new p();
        this.f46754a = pVar;
        this.f46756c = new StringBuilder();
        pVar.f3540g = c10;
        pVar.h = i10;
        pVar.f3541i = i11;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f46755b == null) {
            this.f46755b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f46756c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        String a2 = af.a.a(this.f46755b.trim());
        bf.h hVar = this.f46754a;
        hVar.f3542j = a2;
        hVar.f3543k = this.f46756c.toString();
    }

    @Override
    public final bf.a e() {
        return this.f46754a;
    }

    @Override
    public final q3.h h(d dVar) {
        int i10 = dVar.e;
        int i11 = dVar.f46743b;
        CharSequence charSequence = dVar.f46742a;
        int i12 = dVar.f46746g;
        bf.h hVar = this.f46754a;
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
