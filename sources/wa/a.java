package wa;

import z5.l;
public final class a extends Exception {
    public final int f49801a;

    public a(String str, int i10) {
        super(str);
        l.g(str, "Provided message must not be empty.");
        this.f49801a = i10;
    }

    public a(String str, Throwable th2) {
        super(str, th2);
        l.g(str, "Provided message must not be empty.");
        this.f49801a = 13;
    }
}
