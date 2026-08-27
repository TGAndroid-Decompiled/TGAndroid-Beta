package pa;

import java.io.IOException;

public class d1 extends ma.u {
    @Override
    public final Object read(ua.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        try {
            return Integer.valueOf(aVar.p());
        } catch (NumberFormatException e9) {
            throw new ma.j(e9);
        }
    }

    @Override
    public final void write(ua.b bVar, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            bVar.i();
        } else {
            bVar.o(number.intValue());
        }
    }
}
