package w3;

import c3.g0;
public final class i implements g0 {
    public static final i f48555b = new i(true);
    public static final i f48556c = new i(false);
    public final boolean f48557a;

    public i(boolean z10) {
        this.f48557a = z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IncorrectFragmentation{expected=");
        sb2.append(!this.f48557a);
        sb2.append("}");
        return sb2.toString();
    }
}
