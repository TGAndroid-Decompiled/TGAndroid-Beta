package pg;

import org.telegram.ui.Components.p6;
public final class a {
    public final CharSequence f55716a;
    public final int f55717b = 2;
    public final Runnable f55718c;
    public final float d;
    public final float f55719e;
    public final p6 f55720f;

    public a(String str, Runnable runnable) {
        this.f55716a = str;
        this.f55718c = runnable;
    }

    public a(String str) {
        this.f55716a = str;
    }

    public a(String str, float f10, float f11, p6 p6Var) {
        this.f55716a = str;
        this.d = f10;
        this.f55719e = f11;
        this.f55720f = p6Var;
    }
}
