package y3;

import e3.f0;
public final class j implements f0 {
    public static final j f58952b = new j(true);
    public static final j f58953c = new j(false);
    public final boolean f58954a;

    public j(boolean z10) {
        this.f58954a = z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IncorrectFragmentation{expected=");
        sb2.append(!this.f58954a);
        sb2.append("}");
        return sb2.toString();
    }
}
