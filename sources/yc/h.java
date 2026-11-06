package yc;

import java.io.IOException;
public final class h extends Exception {
    public final f f59293a;

    public h(String str) {
        super(str);
        this.f59293a = f.BAD_REQUEST;
    }

    public final f a() {
        return this.f59293a;
    }

    public h(String str, IOException iOException) {
        super(str, iOException);
        this.f59293a = f.INTERNAL_ERROR;
    }
}
