package pg;

import org.telegram.ui.Components.l6;
public final class a {
    public final CharSequence f53610a;
    public final int f53611b = 2;
    public final Runnable f53612c;
    public final float d;
    public final float f53613e;
    public final l6 f53614f;

    public a(String str, Runnable runnable) {
        this.f53610a = str;
        this.f53612c = runnable;
    }

    public a(String str) {
        this.f53610a = str;
    }

    public a(String str, float f10, float f11, l6 l6Var) {
        this.f53610a = str;
        this.d = f10;
        this.f53613e = f11;
        this.f53614f = l6Var;
    }
}
