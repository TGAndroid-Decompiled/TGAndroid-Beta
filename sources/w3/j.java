package w3;

import c3.f0;
public final class j implements f0 {
    public static final j f47124b = new j(true);
    public static final j f47125c = new j(false);
    public final boolean f47126a;

    public j(boolean z10) {
        this.f47126a = z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IncorrectFragmentation{expected=");
        sb2.append(!this.f47126a);
        sb2.append("}");
        return sb2.toString();
    }
}
