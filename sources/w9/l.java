package w9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.p6;
public final class l implements Callable {
    public final long f48429a;
    public final m f48430b;

    public l(m mVar, long j3) {
        this.f48430b = mVar;
        this.f48429a = j3;
    }

    @Override
    public final Object call() {
        Bundle e7 = p6.e(1, "fatal");
        e7.putLong("timestamp", this.f48429a);
        this.f48430b.f48440k.b0(e7);
        return null;
    }
}
