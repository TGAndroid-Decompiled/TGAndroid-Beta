package pg;

import org.telegram.ui.Components.q6;
public final class a {
    public final CharSequence f55603a;
    public final int f55604b = 2;
    public final Runnable f55605c;
    public final float d;
    public final float f55606e;
    public final q6 f55607f;

    public a(String str, Runnable runnable) {
        this.f55603a = str;
        this.f55605c = runnable;
    }

    public a(String str) {
        this.f55603a = str;
    }

    public a(String str, float f10, float f11, q6 q6Var) {
        this.f55603a = str;
        this.d = f10;
        this.f55606e = f11;
        this.f55607f = q6Var;
    }
}
