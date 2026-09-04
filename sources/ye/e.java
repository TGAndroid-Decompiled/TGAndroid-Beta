package ye;

import bf.p;
import t7.s;
public final class e extends df.a {
    public final bf.h f49998a;
    public String f49999b;
    public final StringBuilder f50000c;

    public e(char c10, int i10, int i11) {
        ?? pVar = new p();
        this.f49998a = pVar;
        this.f50000c = new StringBuilder();
        pVar.f2626g = c10;
        pVar.h = i10;
        pVar.f2627i = i11;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f49999b == null) {
            this.f49999b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f50000c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        String a2 = af.a.a(this.f49999b.trim());
        bf.h hVar = this.f49998a;
        hVar.f2628j = a2;
        hVar.f2629k = this.f50000c.toString();
    }

    @Override
    public final bf.a e() {
        return this.f49998a;
    }

    @Override
    public final q3.h h(d dVar) {
        int i10 = dVar.f49988e;
        int i11 = dVar.f49986b;
        CharSequence charSequence = dVar.f49985a;
        int i12 = dVar.f49990g;
        bf.h hVar = this.f49998a;
        if (i12 < 4) {
            char c10 = hVar.f2626g;
            int i13 = hVar.h;
            int b10 = s.b(c10, charSequence, i10, charSequence.length()) - i10;
            if (b10 >= i13 && s.c(i10 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new q3.h(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i14 = hVar.f2627i; i14 > 0 && i11 < length && charSequence.charAt(i11) == ' '; i14--) {
            i11++;
        }
        return q3.h.a(i11);
    }
}
