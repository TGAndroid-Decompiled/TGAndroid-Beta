package yc;

import java.io.IOException;
public final class h extends Exception {
    public final f f47083a;

    public h(String str) {
        super(str);
        this.f47083a = f.BAD_REQUEST;
    }

    public final f a() {
        return this.f47083a;
    }

    public h(String str, IOException iOException) {
        super(str, iOException);
        this.f47083a = f.INTERNAL_ERROR;
    }
}
