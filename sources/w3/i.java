package w3;

import c3.f0;
public final class i implements f0 {
    public static final i f52382b = new i(true);
    public static final i f52383c = new i(false);
    public final boolean f52384a;

    public i(boolean z10) {
        this.f52384a = z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IncorrectFragmentation{expected=");
        sb2.append(!this.f52384a);
        sb2.append("}");
        return sb2.toString();
    }
}
