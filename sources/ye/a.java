package ye;

import bf.p;
public final class a extends df.a {
    public final bf.b f50856a = new p();

    public static boolean i(d dVar, int i10) {
        CharSequence charSequence = dVar.f50867a;
        if (dVar.f50872g < 4 && i10 < charSequence.length() && charSequence.charAt(i10) == '>') {
            return true;
        }
        return false;
    }

    @Override
    public final bf.a e() {
        return this.f50856a;
    }

    @Override
    public final q3.h h(d dVar) {
        char charAt;
        int i10 = dVar.f50870e;
        if (i(dVar, i10)) {
            int i11 = dVar.f50869c + dVar.f50872g;
            int i12 = i11 + 1;
            CharSequence charSequence = dVar.f50867a;
            int i13 = i10 + 1;
            if (i13 < charSequence.length() && ((charAt = charSequence.charAt(i13)) == '\t' || charAt == ' ')) {
                i12 = i11 + 2;
            }
            return new q3.h(-1, i12, false);
        }
        return null;
    }
}
