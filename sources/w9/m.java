package w9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.c1;
public final class m implements Callable {
    public final long f48954a;
    public final n f48955b;

    public m(n nVar, long j3) {
        this.f48955b = nVar;
        this.f48954a = j3;
    }

    @Override
    public final Object call() {
        Bundle h = c1.h(1, "fatal");
        h.putLong("timestamp", this.f48954a);
        this.f48955b.f48965k.H(h);
        return null;
    }
}
