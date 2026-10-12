package w9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.c1;
public final class m implements Callable {
    public final long f50470a;
    public final n f50471b;

    public m(n nVar, long j3) {
        this.f50471b = nVar;
        this.f50470a = j3;
    }

    @Override
    public final Object call() {
        Bundle f7 = c1.f(1, "fatal");
        f7.putLong("timestamp", this.f50470a);
        this.f50471b.f50481k.x(f7);
        return null;
    }
}
