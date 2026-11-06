package yc;

import java.io.IOException;
public final class h extends Exception {
    public final f f59268a;

    public h(String str) {
        super(str);
        this.f59268a = f.BAD_REQUEST;
    }

    public final f a() {
        return this.f59268a;
    }

    public h(String str, IOException iOException) {
        super(str, iOException);
        this.f59268a = f.INTERNAL_ERROR;
    }
}
