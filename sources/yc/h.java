package yc;

import java.io.IOException;
public final class h extends Exception {
    public final f f49960a;

    public h(String str) {
        super(str);
        this.f49960a = f.BAD_REQUEST;
    }

    public final f a() {
        return this.f49960a;
    }

    public h(String str, IOException iOException) {
        super(str, iOException);
        this.f49960a = f.INTERNAL_ERROR;
    }
}
