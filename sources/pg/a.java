package pg;

import org.telegram.ui.Components.l6;
public final class a {
    public final CharSequence f53504a;
    public final int f53505b = 2;
    public final Runnable f53506c;
    public final float d;
    public final float f53507e;
    public final l6 f53508f;

    public a(String str, Runnable runnable) {
        this.f53504a = str;
        this.f53506c = runnable;
    }

    public a(String str) {
        this.f53504a = str;
    }

    public a(String str, float f10, float f11, l6 l6Var) {
        this.f53504a = str;
        this.d = f10;
        this.f53507e = f11;
        this.f53508f = l6Var;
    }
}
