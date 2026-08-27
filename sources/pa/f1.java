package pa;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

public class f1 extends ma.u {
    @Override
    public final Object read(ua.a aVar) {
        return new AtomicBoolean(aVar.n());
    }

    @Override
    public final void write(ua.b bVar, Object obj) throws IOException {
        bVar.s(((AtomicBoolean) obj).get());
    }
}
