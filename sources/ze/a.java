package ze;

import cf.p;
public final class a extends ef.a {
    public final cf.b f54593a = new p();

    public static boolean i(d dVar, int i10) {
        CharSequence charSequence = dVar.f54604a;
        if (dVar.f54609g < 4 && i10 < charSequence.length() && charSequence.charAt(i10) == '>') {
            return true;
        }
        return false;
    }

    @Override
    public final cf.a e() {
        return this.f54593a;
    }

    @Override
    public final q3.h h(d dVar) {
        char charAt;
        int i10 = dVar.f54607e;
        if (i(dVar, i10)) {
            int i11 = dVar.f54606c + dVar.f54609g;
            int i12 = i11 + 1;
            CharSequence charSequence = dVar.f54604a;
            int i13 = i10 + 1;
            if (i13 < charSequence.length() && ((charAt = charSequence.charAt(i13)) == '\t' || charAt == ' ')) {
                i12 = i11 + 2;
            }
            return new q3.h(-1, i12, false);
        }
        return null;
    }
}
