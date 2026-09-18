package yc;

import java.io.IOException;
public final class h extends Exception {
    public final f f46951a;

    public h(String str) {
        super(str);
        this.f46951a = f.BAD_REQUEST;
    }

    public final f a() {
        return this.f46951a;
    }

    public h(String str, IOException iOException) {
        super(str, iOException);
        this.f46951a = f.INTERNAL_ERROR;
    }
}
