package ye;

import bf.p;
import t7.s;
public final class e extends df.a {
    public final bf.h f50028a;
    public String f50029b;
    public final StringBuilder f50030c;

    public e(char c10, int i10, int i11) {
        ?? pVar = new p();
        this.f50028a = pVar;
        this.f50030c = new StringBuilder();
        pVar.f2653g = c10;
        pVar.h = i10;
        pVar.f2654i = i11;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f50029b == null) {
            this.f50029b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f50030c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        String a2 = af.a.a(this.f50029b.trim());
        bf.h hVar = this.f50028a;
        hVar.f2655j = a2;
        hVar.f2656k = this.f50030c.toString();
    }

    @Override
    public final bf.a e() {
        return this.f50028a;
    }

    @Override
    public final q3.h h(d dVar) {
        int i10 = dVar.f50018e;
        int i11 = dVar.f50016b;
        CharSequence charSequence = dVar.f50015a;
        int i12 = dVar.f50020g;
        bf.h hVar = this.f50028a;
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
