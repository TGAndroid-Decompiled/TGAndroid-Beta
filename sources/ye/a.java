package ye;

import bf.p;
public final class a extends df.a {
    public final bf.b f47032a = new p();

    public static boolean i(d dVar, int i10) {
        CharSequence charSequence = dVar.f47042a;
        if (dVar.f47046g < 4 && i10 < charSequence.length() && charSequence.charAt(i10) == '>') {
            return true;
        }
        return false;
    }

    @Override
    public final bf.a e() {
        return this.f47032a;
    }

    @Override
    public final q3.h h(d dVar) {
        char charAt;
        int i10 = dVar.e;
        if (i(dVar, i10)) {
            int i11 = dVar.f47044c + dVar.f47046g;
            int i12 = i11 + 1;
            CharSequence charSequence = dVar.f47042a;
            int i13 = i10 + 1;
            if (i13 < charSequence.length() && ((charAt = charSequence.charAt(i13)) == '\t' || charAt == ' ')) {
                i12 = i11 + 2;
            }
            return new q3.h(-1, i12, false);
        }
        return null;
    }
}
