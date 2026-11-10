package yc;

import java.io.IOException;
public final class h extends Exception {
    public final f f59395a;

    public h(String str) {
        super(str);
        this.f59395a = f.BAD_REQUEST;
    }

    public final f a() {
        return this.f59395a;
    }

    public h(String str, IOException iOException) {
        super(str, iOException);
        this.f59395a = f.INTERNAL_ERROR;
    }
}
