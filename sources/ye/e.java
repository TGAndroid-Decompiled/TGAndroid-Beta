package ye;

import bf.p;
import t7.s;
public final class e extends df.a {
    public final bf.h f47118a;
    public String f47119b;
    public final StringBuilder f47120c;

    public e(char c10, int i10, int i11) {
        ?? pVar = new p();
        this.f47118a = pVar;
        this.f47120c = new StringBuilder();
        pVar.f3539g = c10;
        pVar.h = i10;
        pVar.f3540i = i11;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f47119b == null) {
            this.f47119b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f47120c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        String a2 = af.a.a(this.f47119b.trim());
        bf.h hVar = this.f47118a;
        hVar.f3541j = a2;
        hVar.f3542k = this.f47120c.toString();
    }

    @Override
    public final bf.a e() {
        return this.f47118a;
    }

    @Override
    public final q3.h h(d dVar) {
        int i10 = dVar.e;
        int i11 = dVar.f47107b;
        CharSequence charSequence = dVar.f47106a;
        int i12 = dVar.f47110g;
        bf.h hVar = this.f47118a;
        if (i12 < 4) {
            char c10 = hVar.f3539g;
            int i13 = hVar.h;
            int b10 = s.b(c10, charSequence, i10, charSequence.length()) - i10;
            if (b10 >= i13 && s.c(i10 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new q3.h(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i14 = hVar.f3540i; i14 > 0 && i11 < length && charSequence.charAt(i11) == ' '; i14--) {
            i11++;
        }
        return q3.h.a(i11);
    }
}
