package w3;

import c3.i0;
public final class i implements i0 {
    public static final i f48956b = new i(true);
    public static final i f48957c = new i(false);
    public final boolean f48958a;

    public i(boolean z10) {
        this.f48958a = z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IncorrectFragmentation{expected=");
        sb2.append(!this.f48958a);
        sb2.append("}");
        return sb2.toString();
    }
}
