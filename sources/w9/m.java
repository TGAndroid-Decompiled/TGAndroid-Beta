package w9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.c1;
public final class m implements Callable {
    public final long f48961a;
    public final n f48962b;

    public m(n nVar, long j3) {
        this.f48962b = nVar;
        this.f48961a = j3;
    }

    @Override
    public final Object call() {
        Bundle h = c1.h(1, "fatal");
        h.putLong("timestamp", this.f48961a);
        this.f48962b.f48972k.H(h);
        return null;
    }
}
