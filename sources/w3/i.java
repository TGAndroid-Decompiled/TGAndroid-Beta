package w3;

import c3.f0;
public final class i implements f0 {
    public static final i f52400b = new i(true);
    public static final i f52401c = new i(false);
    public final boolean f52402a;

    public i(boolean z10) {
        this.f52402a = z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IncorrectFragmentation{expected=");
        sb2.append(!this.f52402a);
        sb2.append("}");
        return sb2.toString();
    }
}
