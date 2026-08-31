package sa;

import java.util.concurrent.atomic.AtomicInteger;
public class e1 extends pa.u {
    @Override
    public final Object read(xa.a aVar) {
        try {
            return new AtomicInteger(aVar.p());
        } catch (NumberFormatException e6) {
            throw new RuntimeException(e6);
        }
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        bVar.o(((AtomicInteger) obj).get());
    }
}
