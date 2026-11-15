package pg;

import org.telegram.ui.Components.j6;
public final class a {
    public final CharSequence f55017a;
    public final int f55018b = 2;
    public final Runnable f55019c;
    public final float d;
    public final float f55020e;
    public final j6 f55021f;

    public a(String str, Runnable runnable) {
        this.f55017a = str;
        this.f55019c = runnable;
    }

    public a(String str) {
        this.f55017a = str;
    }

    public a(String str, float f10, float f11, j6 j6Var) {
        this.f55017a = str;
        this.d = f10;
        this.f55020e = f11;
        this.f55021f = j6Var;
    }
}
