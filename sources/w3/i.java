package w3;

import c3.f0;
public final class i implements f0 {
    public static final i f47123b = new i(true);
    public static final i f47124c = new i(false);
    public final boolean f47125a;

    public i(boolean z10) {
        this.f47125a = z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IncorrectFragmentation{expected=");
        sb2.append(!this.f47125a);
        sb2.append("}");
        return sb2.toString();
    }
}
