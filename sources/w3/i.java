package w3;

import c3.f0;
public final class i implements f0 {
    public static final i f50703b = new i(true);
    public static final i f50704c = new i(false);
    public final boolean f50705a;

    public i(boolean z10) {
        this.f50705a = z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IncorrectFragmentation{expected=");
        sb2.append(!this.f50705a);
        sb2.append("}");
        return sb2.toString();
    }
}
