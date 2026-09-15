package w9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.p6;
public final class l implements Callable {
    public final long f44933a;
    public final m f44934b;

    public l(m mVar, long j3) {
        this.f44934b = mVar;
        this.f44933a = j3;
    }

    @Override
    public final Object call() {
        Bundle e = p6.e(1, "fatal");
        e.putLong("timestamp", this.f44933a);
        this.f44934b.f44943k.J(e);
        return null;
    }
}
