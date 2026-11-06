package z3;

import f3.g0;
public final class i implements g0 {
    public static final i f59529b = new i(true);
    public static final i f59530c = new i(false);
    public final boolean f59531a;

    public i(boolean z9) {
        this.f59531a = z9;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IncorrectFragmentation{expected=");
        sb2.append(!this.f59531a);
        sb2.append("}");
        return sb2.toString();
    }
}
