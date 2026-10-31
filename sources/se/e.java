package se;

import w7.e8;
public final class e extends xe.a {
    public final ve.h f48209a;
    public String f48210b;
    public final StringBuilder f48211c;

    public e(char c10, int i10, int i11) {
        ?? cVar = new df.c();
        this.f48209a = cVar;
        this.f48211c = new StringBuilder();
        cVar.f50799g = c10;
        cVar.h = i10;
        cVar.f50800i = i11;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f48210b == null) {
            this.f48210b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f48211c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        String a2 = ue.a.a(this.f48210b.trim());
        ve.h hVar = this.f48209a;
        hVar.f50801j = a2;
        hVar.f50802k = this.f48211c.toString();
    }

    @Override
    public final ve.a e() {
        return this.f48209a;
    }

    @Override
    public final q3.h h(d dVar) {
        int i10 = dVar.e;
        int i11 = dVar.f48198b;
        CharSequence charSequence = dVar.f48197a;
        int i12 = dVar.f48201g;
        ve.h hVar = this.f48209a;
        if (i12 < 4) {
            char c10 = hVar.f50799g;
            int i13 = hVar.h;
            int b10 = e8.b(c10, charSequence, i10, charSequence.length()) - i10;
            if (b10 >= i13 && e8.c(i10 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new q3.h(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i14 = hVar.f50800i; i14 > 0 && i11 < length && charSequence.charAt(i11) == ' '; i14--) {
            i11++;
        }
        return q3.h.a(i11);
    }
}
