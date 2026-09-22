package w9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.q3;
public final class l implements Callable {
    public final long f44929a;
    public final m f44930b;

    public l(m mVar, long j3) {
        this.f44930b = mVar;
        this.f44929a = j3;
    }

    @Override
    public final Object call() {
        Bundle e = q3.e(1, "fatal");
        e.putLong("timestamp", this.f44929a);
        this.f44930b.f44939k.J(e);
        return null;
    }
}
