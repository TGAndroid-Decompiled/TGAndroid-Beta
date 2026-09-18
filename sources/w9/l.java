package w9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.c1;
public final class l implements Callable {
    public final long f45187a;
    public final m f45188b;

    public l(m mVar, long j3) {
        this.f45188b = mVar;
        this.f45187a = j3;
    }

    @Override
    public final Object call() {
        Bundle f7 = c1.f(1, "fatal");
        f7.putLong("timestamp", this.f45187a);
        this.f45188b.f45197k.J(f7);
        return null;
    }
}
