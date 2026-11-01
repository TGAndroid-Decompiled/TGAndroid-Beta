package x9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.f1;
public final class m implements Callable {
    public final long f53483a;
    public final n f53484b;

    public m(n nVar, long j10) {
        this.f53484b = nVar;
        this.f53483a = j10;
    }

    @Override
    public final Object call() {
        Bundle i10 = f1.i(1, "fatal");
        i10.putLong("timestamp", this.f53483a);
        this.f53484b.f53493k.I(i10);
        return null;
    }
}
