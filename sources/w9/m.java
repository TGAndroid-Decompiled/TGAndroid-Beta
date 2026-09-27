package w9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.c1;
public final class m implements Callable {
    public final long f45260a;
    public final n f45261b;

    public m(n nVar, long j3) {
        this.f45261b = nVar;
        this.f45260a = j3;
    }

    @Override
    public final Object call() {
        Bundle g10 = c1.g(1, "fatal");
        g10.putLong("timestamp", this.f45260a);
        this.f45261b.f45270k.J(g10);
        return null;
    }
}
