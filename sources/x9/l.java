package x9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.c1;
public final class l implements Callable {
    public final long f49687a;
    public final m f49688b;

    public l(m mVar, long j10) {
        this.f49688b = mVar;
        this.f49687a = j10;
    }

    @Override
    public final Object call() {
        Bundle i10 = c1.i(1, "fatal");
        i10.putLong("timestamp", this.f49687a);
        this.f49688b.f49697k.o(i10);
        return null;
    }
}
