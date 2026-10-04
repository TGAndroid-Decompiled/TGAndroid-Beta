package yc;

import java.io.IOException;
public final class h extends Exception {
    public final f f50850a;

    public h(String str) {
        super(str);
        this.f50850a = f.BAD_REQUEST;
    }

    public final f a() {
        return this.f50850a;
    }

    public h(String str, IOException iOException) {
        super(str, iOException);
        this.f50850a = f.INTERNAL_ERROR;
    }
}
