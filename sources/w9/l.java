package w9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.q3;
public final class l implements Callable {
    public final long f44883a;
    public final m f44884b;

    public l(m mVar, long j3) {
        this.f44884b = mVar;
        this.f44883a = j3;
    }

    @Override
    public final Object call() {
        Bundle e = q3.e(1, "fatal");
        e.putLong("timestamp", this.f44883a);
        this.f44884b.f44893k.J(e);
        return null;
    }
}
