package zf;

import org.telegram.ui.Components.m6;
public final class a {
    public final CharSequence f47402a;
    public final int f47403b = 2;
    public final Runnable f47404c;
    public final float d;
    public final float e;
    public final m6 f47405f;

    public a(String str, Runnable runnable) {
        this.f47402a = str;
        this.f47404c = runnable;
    }

    public a(String str) {
        this.f47402a = str;
    }

    public a(String str, float f10, float f11, m6 m6Var) {
        this.f47402a = str;
        this.d = f10;
        this.e = f11;
        this.f47405f = m6Var;
    }
}
