package w9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.c1;
public final class l implements Callable {
    public final long f50286a;
    public final m f50287b;

    public l(m mVar, long j3) {
        this.f50287b = mVar;
        this.f50286a = j3;
    }

    @Override
    public final Object call() {
        Bundle f7 = c1.f(1, "fatal");
        f7.putLong("timestamp", this.f50286a);
        this.f50287b.f50297k.P(f7);
        return null;
    }
}
