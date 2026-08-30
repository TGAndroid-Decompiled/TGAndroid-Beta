package ya;

import b6.m;
public final class a extends Exception {
    public final int f47110a;

    public a(String str, int i10) {
        super(str);
        m.g(str, "Provided message must not be empty.");
        this.f47110a = i10;
    }

    public a(String str, Throwable th2) {
        super(str, th2);
        m.g(str, "Provided message must not be empty.");
        this.f47110a = 13;
    }
}
