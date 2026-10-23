package x9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.b1;
public final class l implements Callable {
    public final long f50138a;
    public final m f50139b;

    public l(m mVar, long j10) {
        this.f50139b = mVar;
        this.f50138a = j10;
    }

    @Override
    public final Object call() {
        Bundle i10 = b1.i(1, "fatal");
        i10.putLong("timestamp", this.f50138a);
        this.f50139b.f50148k.o(i10);
        return null;
    }
}
