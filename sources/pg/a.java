package pg;

import org.telegram.ui.Components.l6;
public final class a {
    public final CharSequence f53598a;
    public final int f53599b = 2;
    public final Runnable f53600c;
    public final float d;
    public final float f53601e;
    public final l6 f53602f;

    public a(String str, Runnable runnable) {
        this.f53598a = str;
        this.f53600c = runnable;
    }

    public a(String str) {
        this.f53598a = str;
    }

    public a(String str, float f10, float f11, l6 l6Var) {
        this.f53598a = str;
        this.d = f10;
        this.f53601e = f11;
        this.f53602f = l6Var;
    }
}
