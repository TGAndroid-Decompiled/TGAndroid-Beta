package w3;

import c3.i0;
public final class i implements i0 {
    public static final i f48957b = new i(true);
    public static final i f48958c = new i(false);
    public final boolean f48959a;

    public i(boolean z10) {
        this.f48959a = z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IncorrectFragmentation{expected=");
        sb2.append(!this.f48959a);
        sb2.append("}");
        return sb2.toString();
    }
}
