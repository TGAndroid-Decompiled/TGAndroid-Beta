package z3;

import f3.g0;
public final class i implements g0 {
    public static final i f59627b = new i(true);
    public static final i f59628c = new i(false);
    public final boolean f59629a;

    public i(boolean z9) {
        this.f59629a = z9;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IncorrectFragmentation{expected=");
        sb2.append(!this.f59629a);
        sb2.append("}");
        return sb2.toString();
    }
}
