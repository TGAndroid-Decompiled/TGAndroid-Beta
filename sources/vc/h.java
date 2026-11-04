package vc;

import java.io.IOException;
public final class h extends Exception {
    public final f f56552a;

    public h(String str) {
        super(str);
        this.f56552a = f.BAD_REQUEST;
    }

    public final f a() {
        return this.f56552a;
    }

    public h(String str, IOException iOException) {
        super(str, iOException);
        this.f56552a = f.INTERNAL_ERROR;
    }
}
