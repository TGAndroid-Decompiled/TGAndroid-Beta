package yc;

import java.io.IOException;
public final class h extends Exception {
    public final f f60602a;

    public h(String str) {
        super(str);
        this.f60602a = f.BAD_REQUEST;
    }

    public final f a() {
        return this.f60602a;
    }

    public h(String str, IOException iOException) {
        super(str, iOException);
        this.f60602a = f.INTERNAL_ERROR;
    }
}
