package w9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.c1;
public final class l implements Callable {
    public final long f45322a;
    public final m f45323b;

    public l(m mVar, long j3) {
        this.f45323b = mVar;
        this.f45322a = j3;
    }

    @Override
    public final Object call() {
        Bundle g10 = c1.g(1, "fatal");
        g10.putLong("timestamp", this.f45322a);
        this.f45323b.f45332k.J(g10);
        return null;
    }
}
