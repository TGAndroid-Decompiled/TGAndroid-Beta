package z3;

import f3.g0;
public final class i implements g0 {
    public static final i f59626b = new i(true);
    public static final i f59627c = new i(false);
    public final boolean f59628a;

    public i(boolean z9) {
        this.f59628a = z9;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IncorrectFragmentation{expected=");
        sb2.append(!this.f59628a);
        sb2.append("}");
        return sb2.toString();
    }
}
