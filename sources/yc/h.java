package yc;

import java.io.IOException;
public final class h extends Exception {
    public final f f47020a;

    public h(String str) {
        super(str);
        this.f47020a = f.BAD_REQUEST;
    }

    public final f a() {
        return this.f47020a;
    }

    public h(String str, IOException iOException) {
        super(str, iOException);
        this.f47020a = f.INTERNAL_ERROR;
    }
}
