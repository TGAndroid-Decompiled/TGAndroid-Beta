package z9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.f1;
public final class l implements Callable {
    public final long f60191a;
    public final m f60192b;

    public l(m mVar, long j10) {
        this.f60192b = mVar;
        this.f60191a = j10;
    }

    @Override
    public final Object call() {
        Bundle k10 = f1.k(1, "fatal");
        k10.putLong("timestamp", this.f60191a);
        this.f60192b.f60203k.t(k10);
        return null;
    }
}
