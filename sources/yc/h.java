package yc;

import java.io.IOException;
public final class h extends Exception {
    public final f f46977a;

    public h(String str) {
        super(str);
        this.f46977a = f.BAD_REQUEST;
    }

    public final f a() {
        return this.f46977a;
    }

    public h(String str, IOException iOException) {
        super(str, iOException);
        this.f46977a = f.INTERNAL_ERROR;
    }
}
