package pg;

import org.telegram.ui.Components.k6;
public final class a {
    public final CharSequence f53609a;
    public final int f53610b = 2;
    public final Runnable f53611c;
    public final float d;
    public final float f53612e;
    public final k6 f53613f;

    public a(String str, Runnable runnable) {
        this.f53609a = str;
        this.f53611c = runnable;
    }

    public a(String str) {
        this.f53609a = str;
    }

    public a(String str, float f10, float f11, k6 k6Var) {
        this.f53609a = str;
        this.d = f10;
        this.f53612e = f11;
        this.f53613f = k6Var;
    }
}
