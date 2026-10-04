package w9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.c1;
public final class m implements Callable {
    public final long f48945a;
    public final n f48946b;

    public m(n nVar, long j3) {
        this.f48946b = nVar;
        this.f48945a = j3;
    }

    @Override
    public final Object call() {
        Bundle h = c1.h(1, "fatal");
        h.putLong("timestamp", this.f48945a);
        this.f48946b.f48956k.H(h);
        return null;
    }
}
