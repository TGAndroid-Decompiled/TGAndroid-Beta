package qa;

import java.util.concurrent.atomic.AtomicInteger;
public class e1 extends na.u {
    @Override
    public final Object read(va.a aVar) {
        try {
            return new AtomicInteger(aVar.p());
        } catch (NumberFormatException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public final void write(va.b bVar, Object obj) {
        bVar.o(((AtomicInteger) obj).get());
    }
}
