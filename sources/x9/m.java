package x9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.f1;
public final class m implements Callable {
    public final long f53465a;
    public final n f53466b;

    public m(n nVar, long j10) {
        this.f53466b = nVar;
        this.f53465a = j10;
    }

    @Override
    public final Object call() {
        Bundle i10 = f1.i(1, "fatal");
        i10.putLong("timestamp", this.f53465a);
        this.f53466b.f53475k.I(i10);
        return null;
    }
}
