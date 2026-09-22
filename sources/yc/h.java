package yc;

import java.io.IOException;
public final class h extends Exception {
    public final f f47019a;

    public h(String str) {
        super(str);
        this.f47019a = f.BAD_REQUEST;
    }

    public final f a() {
        return this.f47019a;
    }

    public h(String str, IOException iOException) {
        super(str, iOException);
        this.f47019a = f.INTERNAL_ERROR;
    }
}
