package yc;

import java.io.IOException;
public final class h extends Exception {
    public final f f61209a;

    public h(String str) {
        super(str);
        this.f61209a = f.BAD_REQUEST;
    }

    public final f a() {
        return this.f61209a;
    }

    public h(String str, IOException iOException) {
        super(str, iOException);
        this.f61209a = f.INTERNAL_ERROR;
    }
}
