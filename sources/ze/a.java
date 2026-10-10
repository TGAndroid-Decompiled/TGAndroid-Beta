package ze;

import cf.p;
public final class a extends ef.a {
    public final cf.b f54413a = new p();

    public static boolean i(d dVar, int i10) {
        CharSequence charSequence = dVar.f54424a;
        if (dVar.f54429g < 4 && i10 < charSequence.length() && charSequence.charAt(i10) == '>') {
            return true;
        }
        return false;
    }

    @Override
    public final cf.a e() {
        return this.f54413a;
    }

    @Override
    public final q3.h h(d dVar) {
        char charAt;
        int i10 = dVar.f54427e;
        if (i(dVar, i10)) {
            int i11 = dVar.f54426c + dVar.f54429g;
            int i12 = i11 + 1;
            CharSequence charSequence = dVar.f54424a;
            int i13 = i10 + 1;
            if (i13 < charSequence.length() && ((charAt = charSequence.charAt(i13)) == '\t' || charAt == ' ')) {
                i12 = i11 + 2;
            }
            return new q3.h(-1, i12, false);
        }
        return null;
    }
}
