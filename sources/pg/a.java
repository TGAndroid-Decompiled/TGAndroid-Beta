package pg;

import org.telegram.ui.Components.p6;
public final class a {
    public final CharSequence f55593a;
    public final int f55594b = 2;
    public final Runnable f55595c;
    public final float d;
    public final float f55596e;
    public final p6 f55597f;

    public a(String str, Runnable runnable) {
        this.f55593a = str;
        this.f55595c = runnable;
    }

    public a(String str) {
        this.f55593a = str;
    }

    public a(String str, float f10, float f11, p6 p6Var) {
        this.f55593a = str;
        this.d = f10;
        this.f55596e = f11;
        this.f55597f = p6Var;
    }
}
