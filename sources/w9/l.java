package w9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.c1;
public final class l implements Callable {
    public final long f50329a;
    public final m f50330b;

    public l(m mVar, long j3) {
        this.f50330b = mVar;
        this.f50329a = j3;
    }

    @Override
    public final Object call() {
        Bundle f7 = c1.f(1, "fatal");
        f7.putLong("timestamp", this.f50329a);
        this.f50330b.f50340k.P(f7);
        return null;
    }
}
