package ye;

import bf.p;
public final class a extends df.a {
    public final bf.b f46663a = new p();

    public static boolean i(d dVar, int i10) {
        CharSequence charSequence = dVar.f46673a;
        if (dVar.f46677g < 4 && i10 < charSequence.length() && charSequence.charAt(i10) == '>') {
            return true;
        }
        return false;
    }

    @Override
    public final bf.a e() {
        return this.f46663a;
    }

    @Override
    public final q3.h h(d dVar) {
        char charAt;
        int i10 = dVar.e;
        if (i(dVar, i10)) {
            int i11 = dVar.f46675c + dVar.f46677g;
            int i12 = i11 + 1;
            CharSequence charSequence = dVar.f46673a;
            int i13 = i10 + 1;
            if (i13 < charSequence.length() && ((charAt = charSequence.charAt(i13)) == '\t' || charAt == ' ')) {
                i12 = i11 + 2;
            }
            return new q3.h(-1, i12, false);
        }
        return null;
    }
}
