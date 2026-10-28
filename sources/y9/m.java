package y9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Components.b10;
public final class m implements Callable {
    public final long f52497a;
    public final n f52498b;

    public m(n nVar, long j10) {
        this.f52498b = nVar;
        this.f52497a = j10;
    }

    @Override
    public final Object call() {
        Bundle g7 = b10.g(1, "fatal");
        g7.putLong("timestamp", this.f52497a);
        this.f52498b.f52507k.b(g7);
        return null;
    }
}
