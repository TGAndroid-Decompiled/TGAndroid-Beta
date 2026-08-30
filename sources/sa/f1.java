package sa;

import java.util.concurrent.atomic.AtomicBoolean;
public class f1 extends pa.u {
    @Override
    public final Object read(xa.a aVar) {
        return new AtomicBoolean(aVar.n());
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        bVar.s(((AtomicBoolean) obj).get());
    }
}
