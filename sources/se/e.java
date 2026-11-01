package se;

import w7.e8;
public final class e extends xe.a {
    public final ve.h f48220a;
    public String f48221b;
    public final StringBuilder f48222c;

    public e(char c10, int i10, int i11) {
        ?? cVar = new df.c();
        this.f48220a = cVar;
        this.f48222c = new StringBuilder();
        cVar.f50813g = c10;
        cVar.h = i10;
        cVar.f50814i = i11;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f48221b == null) {
            this.f48221b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f48222c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        String a2 = ue.a.a(this.f48221b.trim());
        ve.h hVar = this.f48220a;
        hVar.f50815j = a2;
        hVar.f50816k = this.f48222c.toString();
    }

    @Override
    public final ve.a e() {
        return this.f48220a;
    }

    @Override
    public final q3.h h(d dVar) {
        int i10 = dVar.e;
        int i11 = dVar.f48209b;
        CharSequence charSequence = dVar.f48208a;
        int i12 = dVar.f48212g;
        ve.h hVar = this.f48220a;
        if (i12 < 4) {
            char c10 = hVar.f50813g;
            int i13 = hVar.h;
            int b10 = e8.b(c10, charSequence, i10, charSequence.length()) - i10;
            if (b10 >= i13 && e8.c(i10 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new q3.h(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i14 = hVar.f50814i; i14 > 0 && i11 < length && charSequence.charAt(i11) == ' '; i14--) {
            i11++;
        }
        return q3.h.a(i11);
    }
}
