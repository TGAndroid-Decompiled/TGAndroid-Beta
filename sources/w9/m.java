package w9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.c1;
public final class m implements Callable {
    public final long f50478a;
    public final n f50479b;

    public m(n nVar, long j3) {
        this.f50479b = nVar;
        this.f50478a = j3;
    }

    @Override
    public final Object call() {
        Bundle f7 = c1.f(1, "fatal");
        f7.putLong("timestamp", this.f50478a);
        this.f50479b.f50489k.x(f7);
        return null;
    }
}
