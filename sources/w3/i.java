package w3;

import c3.g0;
public final class i implements g0 {
    public static final i f48518b = new i(true);
    public static final i f48519c = new i(false);
    public final boolean f48520a;

    public i(boolean z10) {
        this.f48520a = z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IncorrectFragmentation{expected=");
        sb2.append(!this.f48520a);
        sb2.append("}");
        return sb2.toString();
    }
}
