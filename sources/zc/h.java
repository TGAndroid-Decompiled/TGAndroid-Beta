package zc;

import java.io.IOException;
public final class h extends Exception {
    public final f f54579a;

    public h(String str) {
        super(str);
        this.f54579a = f.BAD_REQUEST;
    }

    public final f a() {
        return this.f54579a;
    }

    public h(String str, IOException iOException) {
        super(str, iOException);
        this.f54579a = f.INTERNAL_ERROR;
    }
}
