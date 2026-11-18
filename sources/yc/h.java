package yc;

import java.io.IOException;
public final class h extends Exception {
    public final f f61168a;

    public h(String str) {
        super(str);
        this.f61168a = f.BAD_REQUEST;
    }

    public final f a() {
        return this.f61168a;
    }

    public h(String str, IOException iOException) {
        super(str, iOException);
        this.f61168a = f.INTERNAL_ERROR;
    }
}
