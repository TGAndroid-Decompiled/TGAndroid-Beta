package z3;

import f3.f0;
public final class i implements f0 {
    public static final i f61441b = new i(true);
    public static final i f61442c = new i(false);
    public final boolean f61443a;

    public i(boolean z10) {
        this.f61443a = z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IncorrectFragmentation{expected=");
        sb2.append(!this.f61443a);
        sb2.append("}");
        return sb2.toString();
    }
}
