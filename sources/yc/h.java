package yc;

import java.io.IOException;
public final class h extends Exception {
    public final f f46692a;

    public h(String str) {
        super(str);
        this.f46692a = f.BAD_REQUEST;
    }

    public final f a() {
        return this.f46692a;
    }

    public h(String str, IOException iOException) {
        super(str, iOException);
        this.f46692a = f.INTERNAL_ERROR;
    }
}
