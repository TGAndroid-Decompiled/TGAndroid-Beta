package pg;

import org.telegram.ui.Components.l6;
public final class a {
    public final CharSequence f53506a;
    public final int f53507b = 2;
    public final Runnable f53508c;
    public final float d;
    public final float f53509e;
    public final l6 f53510f;

    public a(String str, Runnable runnable) {
        this.f53506a = str;
        this.f53508c = runnable;
    }

    public a(String str) {
        this.f53506a = str;
    }

    public a(String str, float f10, float f11, l6 l6Var) {
        this.f53506a = str;
        this.d = f10;
        this.f53509e = f11;
        this.f53510f = l6Var;
    }
}
