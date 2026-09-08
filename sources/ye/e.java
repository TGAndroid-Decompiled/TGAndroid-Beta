package ye;

import bf.p;
import t7.s;
public final class e extends df.a {
    public final bf.h f50027a;
    public String f50028b;
    public final StringBuilder f50029c;

    public e(char c10, int i10, int i11) {
        ?? pVar = new p();
        this.f50027a = pVar;
        this.f50029c = new StringBuilder();
        pVar.f2653g = c10;
        pVar.h = i10;
        pVar.f2654i = i11;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f50028b == null) {
            this.f50028b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f50029c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        String a2 = af.a.a(this.f50028b.trim());
        bf.h hVar = this.f50027a;
        hVar.f2655j = a2;
        hVar.f2656k = this.f50029c.toString();
    }

    @Override
    public final bf.a e() {
        return this.f50027a;
    }

    @Override
    public final q3.h h(d dVar) {
        int i10 = dVar.f50017e;
        int i11 = dVar.f50015b;
        CharSequence charSequence = dVar.f50014a;
        int i12 = dVar.f50019g;
        bf.h hVar = this.f50027a;
        if (i12 < 4) {
            char c10 = hVar.f2653g;
            int i13 = hVar.h;
            int b10 = s.b(c10, charSequence, i10, charSequence.length()) - i10;
            if (b10 >= i13 && s.c(i10 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new q3.h(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i14 = hVar.f2654i; i14 > 0 && i11 < length && charSequence.charAt(i11) == ' '; i14--) {
            i11++;
        }
        return q3.h.a(i11);
    }
}
