package yc;

import java.io.IOException;
public final class h extends Exception {
    public final f f61297a;

    public h(String str) {
        super(str);
        this.f61297a = f.BAD_REQUEST;
    }

    public final f a() {
        return this.f61297a;
    }

    public h(String str, IOException iOException) {
        super(str, iOException);
        this.f61297a = f.INTERNAL_ERROR;
    }
}
