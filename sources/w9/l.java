package w9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.r6;
public final class l implements Callable {
    public final long f43892a;
    public final m f43893b;

    public l(m mVar, long j3) {
        this.f43893b = mVar;
        this.f43892a = j3;
    }

    @Override
    public final Object call() {
        Bundle e = r6.e(1, "fatal");
        e.putLong("timestamp", this.f43892a);
        this.f43893b.f43902k.p(e);
        return null;
    }
}
