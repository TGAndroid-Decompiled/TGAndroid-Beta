package pg;

import org.telegram.ui.Components.q6;
public final class a {
    public final CharSequence f55634a;
    public final int f55635b = 2;
    public final Runnable f55636c;
    public final float d;
    public final float f55637e;
    public final q6 f55638f;

    public a(String str, Runnable runnable) {
        this.f55634a = str;
        this.f55636c = runnable;
    }

    public a(String str) {
        this.f55634a = str;
    }

    public a(String str, float f10, float f11, q6 q6Var) {
        this.f55634a = str;
        this.d = f10;
        this.f55637e = f11;
        this.f55638f = q6Var;
    }
}
