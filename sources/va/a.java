package va;

import y5.l;

public final class a extends Exception {

    public final int f48826a;

    public a(String str, int i10) {
        super(str);
        l.g(str, "Provided message must not be empty.");
        this.f48826a = i10;
    }

    public a(String str, Throwable th) {
        super(str, th);
        l.g(str, "Provided message must not be empty.");
        this.f48826a = 13;
    }
}
