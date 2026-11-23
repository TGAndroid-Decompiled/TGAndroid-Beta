package z3;

import f3.f0;
public final class i implements f0 {
    public static final i f61410b = new i(true);
    public static final i f61411c = new i(false);
    public final boolean f61412a;

    public i(boolean z10) {
        this.f61412a = z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IncorrectFragmentation{expected=");
        sb2.append(!this.f61412a);
        sb2.append("}");
        return sb2.toString();
    }
}
