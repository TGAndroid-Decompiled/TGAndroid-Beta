package w3;

import c3.g0;
public final class i implements g0 {
    public static final i f48510b = new i(true);
    public static final i f48511c = new i(false);
    public final boolean f48512a;

    public i(boolean z10) {
        this.f48512a = z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IncorrectFragmentation{expected=");
        sb2.append(!this.f48512a);
        sb2.append("}");
        return sb2.toString();
    }
}
