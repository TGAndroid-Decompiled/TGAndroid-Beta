package w9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.c1;
public final class l implements Callable {
    public final long f45231a;
    public final m f45232b;

    public l(m mVar, long j3) {
        this.f45232b = mVar;
        this.f45231a = j3;
    }

    @Override
    public final Object call() {
        Bundle g10 = c1.g(1, "fatal");
        g10.putLong("timestamp", this.f45231a);
        this.f45232b.f45241k.J(g10);
        return null;
    }
}
