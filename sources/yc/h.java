package yc;

import java.io.IOException;
public final class h extends Exception {
    public final f f59397a;

    public h(String str) {
        super(str);
        this.f59397a = f.BAD_REQUEST;
    }

    public final f a() {
        return this.f59397a;
    }

    public h(String str, IOException iOException) {
        super(str, iOException);
        this.f59397a = f.INTERNAL_ERROR;
    }
}
