package y9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Components.b10;
public final class m implements Callable {
    public final long f52439a;
    public final n f52440b;

    public m(n nVar, long j10) {
        this.f52440b = nVar;
        this.f52439a = j10;
    }

    @Override
    public final Object call() {
        Bundle g7 = b10.g(1, "fatal");
        g7.putLong("timestamp", this.f52439a);
        this.f52440b.f52449k.b(g7);
        return null;
    }
}
