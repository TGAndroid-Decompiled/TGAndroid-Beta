package w9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.c1;
public final class m implements Callable {
    public final long f48946a;
    public final n f48947b;

    public m(n nVar, long j3) {
        this.f48947b = nVar;
        this.f48946a = j3;
    }

    @Override
    public final Object call() {
        Bundle h = c1.h(1, "fatal");
        h.putLong("timestamp", this.f48946a);
        this.f48947b.f48957k.H(h);
        return null;
    }
}
