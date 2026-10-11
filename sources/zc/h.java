package zc;

import java.io.IOException;
public final class h extends Exception {
    public final f f54476a;

    public h(String str) {
        super(str);
        this.f54476a = f.BAD_REQUEST;
    }

    public final f a() {
        return this.f54476a;
    }

    public h(String str, IOException iOException) {
        super(str, iOException);
        this.f54476a = f.INTERNAL_ERROR;
    }
}
