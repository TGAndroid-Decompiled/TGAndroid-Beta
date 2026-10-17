package x9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.t0;
public final class l implements Callable {
    public final long f49708a;
    public final m f49709b;

    public l(m mVar, long j10) {
        this.f49709b = mVar;
        this.f49708a = j10;
    }

    @Override
    public final Object call() {
        Bundle j10 = t0.j(1, "fatal");
        j10.putLong("timestamp", this.f49708a);
        this.f49709b.f49718k.o(j10);
        return null;
    }
}
