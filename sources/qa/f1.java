package qa;

import java.util.concurrent.atomic.AtomicBoolean;
public class f1 extends na.u {
    @Override
    public final Object read(va.a aVar) {
        return new AtomicBoolean(aVar.n());
    }

    @Override
    public final void write(va.b bVar, Object obj) {
        bVar.s(((AtomicBoolean) obj).get());
    }
}
