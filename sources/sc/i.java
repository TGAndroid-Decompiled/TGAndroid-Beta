package sc;

import java.io.IOException;
public final class i extends Exception {
    public final g f48185a;

    public i(String str) {
        super(str);
        this.f48185a = g.BAD_REQUEST;
    }

    public final g a() {
        return this.f48185a;
    }

    public i(String str, IOException iOException) {
        super(str, iOException);
        this.f48185a = g.INTERNAL_ERROR;
    }
}
