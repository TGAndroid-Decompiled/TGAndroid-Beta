package pg;

import org.telegram.ui.Components.l6;
public final class a {
    public final CharSequence f53597a;
    public final int f53598b = 2;
    public final Runnable f53599c;
    public final float d;
    public final float f53600e;
    public final l6 f53601f;

    public a(String str, Runnable runnable) {
        this.f53597a = str;
        this.f53599c = runnable;
    }

    public a(String str) {
        this.f53597a = str;
    }

    public a(String str, float f10, float f11, l6 l6Var) {
        this.f53597a = str;
        this.d = f10;
        this.f53600e = f11;
        this.f53601f = l6Var;
    }
}
