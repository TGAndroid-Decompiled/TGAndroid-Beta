package x9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.c1;
public final class l implements Callable {
    public final long f49733a;
    public final m f49734b;

    public l(m mVar, long j10) {
        this.f49734b = mVar;
        this.f49733a = j10;
    }

    @Override
    public final Object call() {
        Bundle i10 = c1.i(1, "fatal");
        i10.putLong("timestamp", this.f49733a);
        this.f49734b.f49743k.o(i10);
        return null;
    }
}
