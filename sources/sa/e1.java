package sa;

import java.util.concurrent.atomic.AtomicInteger;
public class e1 extends pa.u {
    @Override
    public final Object read(xa.a aVar) {
        try {
            return new AtomicInteger(aVar.p());
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        bVar.o(((AtomicInteger) obj).get());
    }
}
