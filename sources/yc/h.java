package yc;

import java.io.IOException;
public final class h extends Exception {
    public final f f49990a;

    public h(String str) {
        super(str);
        this.f49990a = f.BAD_REQUEST;
    }

    public final f a() {
        return this.f49990a;
    }

    public h(String str, IOException iOException) {
        super(str, iOException);
        this.f49990a = f.INTERNAL_ERROR;
    }
}
