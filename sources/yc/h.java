package yc;

import java.io.IOException;
public final class h extends Exception {
    public final f f46846a;

    public h(String str) {
        super(str);
        this.f46846a = f.BAD_REQUEST;
    }

    public final f a() {
        return this.f46846a;
    }

    public h(String str, IOException iOException) {
        super(str, iOException);
        this.f46846a = f.INTERNAL_ERROR;
    }
}
