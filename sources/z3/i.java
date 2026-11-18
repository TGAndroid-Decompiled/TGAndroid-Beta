package z3;

import f3.f0;
public final class i implements f0 {
    public static final i f61400b = new i(true);
    public static final i f61401c = new i(false);
    public final boolean f61402a;

    public i(boolean z10) {
        this.f61402a = z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IncorrectFragmentation{expected=");
        sb2.append(!this.f61402a);
        sb2.append("}");
        return sb2.toString();
    }
}
