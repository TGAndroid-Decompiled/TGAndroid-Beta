package pa;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class e1 extends ma.u {
    @Override
    public final Object read(ua.a aVar) {
        try {
            return new AtomicInteger(aVar.p());
        } catch (NumberFormatException e9) {
            throw new ma.j(e9);
        }
    }

    @Override
    public final void write(ua.b bVar, Object obj) throws IOException {
        bVar.o(((AtomicInteger) obj).get());
    }
}
