package z3;

import f3.g0;
public final class i implements g0 {
    public static final i f61529b = new i(true);
    public static final i f61530c = new i(false);
    public final boolean f61531a;

    public i(boolean z10) {
        this.f61531a = z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IncorrectFragmentation{expected=");
        sb2.append(!this.f61531a);
        sb2.append("}");
        return sb2.toString();
    }
}
