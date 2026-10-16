package x9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.c1;
public final class m implements Callable {
    public final long f48301a;
    public final n f48302b;

    public m(n nVar, long j10) {
        this.f48302b = nVar;
        this.f48301a = j10;
    }

    @Override
    public final Object call() {
        Bundle f7 = c1.f(1, "fatal");
        f7.putLong("timestamp", this.f48301a);
        this.f48302b.f48311k.d(f7);
        return null;
    }
}
