package pg;

import org.telegram.ui.Components.q6;
public final class a {
    public final CharSequence f55638a;
    public final int f55639b = 2;
    public final Runnable f55640c;
    public final float d;
    public final float f55641e;
    public final q6 f55642f;

    public a(String str, Runnable runnable) {
        this.f55638a = str;
        this.f55640c = runnable;
    }

    public a(String str) {
        this.f55638a = str;
    }

    public a(String str, float f10, float f11, q6 q6Var) {
        this.f55638a = str;
        this.d = f10;
        this.f55641e = f11;
        this.f55642f = q6Var;
    }
}
