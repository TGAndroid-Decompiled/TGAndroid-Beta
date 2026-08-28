package ua;

import x5.l;
public final class a extends Exception {
    public final int f48141a;

    public a(String str, int i9) {
        super(str);
        l.g(str, "Provided message must not be empty.");
        this.f48141a = i9;
    }

    public a(String str, Throwable th) {
        super(str, th);
        l.g(str, "Provided message must not be empty.");
        this.f48141a = 13;
    }
}
