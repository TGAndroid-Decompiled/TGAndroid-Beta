package yc;

import java.io.IOException;
public final class h extends Exception {
    public final f f49961a;

    public h(String str) {
        super(str);
        this.f49961a = f.BAD_REQUEST;
    }

    public final f a() {
        return this.f49961a;
    }

    public h(String str, IOException iOException) {
        super(str, iOException);
        this.f49961a = f.INTERNAL_ERROR;
    }
}
