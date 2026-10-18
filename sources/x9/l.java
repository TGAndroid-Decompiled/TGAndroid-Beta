package x9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.c1;
public final class l implements Callable {
    public final long f49686a;
    public final m f49687b;

    public l(m mVar, long j10) {
        this.f49687b = mVar;
        this.f49686a = j10;
    }

    @Override
    public final Object call() {
        Bundle i10 = c1.i(1, "fatal");
        i10.putLong("timestamp", this.f49686a);
        this.f49687b.f49696k.o(i10);
        return null;
    }
}
