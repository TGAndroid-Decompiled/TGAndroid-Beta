package sc;

import java.io.IOException;
public final class i extends Exception {
    public final g f48174a;

    public i(String str) {
        super(str);
        this.f48174a = g.BAD_REQUEST;
    }

    public final g a() {
        return this.f48174a;
    }

    public i(String str, IOException iOException) {
        super(str, iOException);
        this.f48174a = g.INTERNAL_ERROR;
    }
}
