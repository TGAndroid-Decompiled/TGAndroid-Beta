package w9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.p6;
public final class l implements Callable {
    public final long f44956a;
    public final m f44957b;

    public l(m mVar, long j3) {
        this.f44957b = mVar;
        this.f44956a = j3;
    }

    @Override
    public final Object call() {
        Bundle e = p6.e(1, "fatal");
        e.putLong("timestamp", this.f44956a);
        this.f44957b.f44966k.J(e);
        return null;
    }
}
