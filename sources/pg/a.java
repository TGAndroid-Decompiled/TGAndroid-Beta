package pg;

import org.telegram.ui.Components.l6;
public final class a {
    public final CharSequence f53480a;
    public final int f53481b = 2;
    public final Runnable f53482c;
    public final float d;
    public final float f53483e;
    public final l6 f53484f;

    public a(String str, Runnable runnable) {
        this.f53480a = str;
        this.f53482c = runnable;
    }

    public a(String str) {
        this.f53480a = str;
    }

    public a(String str, float f10, float f11, l6 l6Var) {
        this.f53480a = str;
        this.d = f10;
        this.f53483e = f11;
        this.f53484f = l6Var;
    }
}
