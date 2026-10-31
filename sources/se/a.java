package se;
public final class a extends xe.a {
    public final ve.b f48187a = new df.c();

    public static boolean i(d dVar, int i10) {
        CharSequence charSequence = dVar.f48197a;
        if (dVar.f48201g < 4 && i10 < charSequence.length() && charSequence.charAt(i10) == '>') {
            return true;
        }
        return false;
    }

    @Override
    public final ve.a e() {
        return this.f48187a;
    }

    @Override
    public final q3.h h(d dVar) {
        char charAt;
        int i10 = dVar.e;
        if (i(dVar, i10)) {
            int i11 = dVar.f48199c + dVar.f48201g;
            int i12 = i11 + 1;
            CharSequence charSequence = dVar.f48197a;
            int i13 = i10 + 1;
            if (i13 < charSequence.length() && ((charAt = charSequence.charAt(i13)) == '\t' || charAt == ' ')) {
                i12 = i11 + 2;
            }
            return new q3.h(-1, i12, false);
        }
        return null;
    }
}
