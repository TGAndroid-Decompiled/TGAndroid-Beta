package zc;

import java.io.IOException;
public final class h extends Exception {
    public final f f54355a;

    public h(String str) {
        super(str);
        this.f54355a = f.BAD_REQUEST;
    }

    public final f a() {
        return this.f54355a;
    }

    public h(String str, IOException iOException) {
        super(str, iOException);
        this.f54355a = f.INTERNAL_ERROR;
    }
}
