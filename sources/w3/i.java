package w3;

import c3.g0;
public final class i implements g0 {
    public static final i f48515b = new i(true);
    public static final i f48516c = new i(false);
    public final boolean f48517a;

    public i(boolean z10) {
        this.f48517a = z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IncorrectFragmentation{expected=");
        sb2.append(!this.f48517a);
        sb2.append("}");
        return sb2.toString();
    }
}
