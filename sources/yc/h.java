package yc;

import java.io.IOException;
public final class h extends Exception {
    public final f f46975a;

    public h(String str) {
        super(str);
        this.f46975a = f.BAD_REQUEST;
    }

    public final f a() {
        return this.f46975a;
    }

    public h(String str, IOException iOException) {
        super(str, iOException);
        this.f46975a = f.INTERNAL_ERROR;
    }
}
