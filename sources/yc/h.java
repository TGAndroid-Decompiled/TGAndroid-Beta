package yc;

import java.io.IOException;
public final class h extends Exception {
    public final f f49989a;

    public h(String str) {
        super(str);
        this.f49989a = f.BAD_REQUEST;
    }

    public final f a() {
        return this.f49989a;
    }

    public h(String str, IOException iOException) {
        super(str, iOException);
        this.f49989a = f.INTERNAL_ERROR;
    }
}
