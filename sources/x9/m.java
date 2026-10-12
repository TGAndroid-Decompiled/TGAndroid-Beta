package x9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.d0;
public final class m implements Callable {
    public final long f48302a;
    public final n f48303b;

    public m(n nVar, long j10) {
        this.f48303b = nVar;
        this.f48302a = j10;
    }

    @Override
    public final Object call() {
        Bundle g10 = d0.g(1, "fatal");
        g10.putLong("timestamp", this.f48302a);
        this.f48303b.f48312k.l(g10);
        return null;
    }
}
