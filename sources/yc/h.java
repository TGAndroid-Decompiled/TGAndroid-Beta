package yc;

import java.io.IOException;
public final class h extends Exception {
    public final f f46998a;

    public h(String str) {
        super(str);
        this.f46998a = f.BAD_REQUEST;
    }

    public final f a() {
        return this.f46998a;
    }

    public h(String str, IOException iOException) {
        super(str, iOException);
        this.f46998a = f.INTERNAL_ERROR;
    }
}
