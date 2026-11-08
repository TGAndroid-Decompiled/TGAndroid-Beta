package yc;

import java.io.IOException;
public final class h extends Exception {
    public final f f59388a;

    public h(String str) {
        super(str);
        this.f59388a = f.BAD_REQUEST;
    }

    public final f a() {
        return this.f59388a;
    }

    public h(String str, IOException iOException) {
        super(str, iOException);
        this.f59388a = f.INTERNAL_ERROR;
    }
}
