package y9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Components.b10;
public final class m implements Callable {
    public final long f52436a;
    public final n f52437b;

    public m(n nVar, long j10) {
        this.f52437b = nVar;
        this.f52436a = j10;
    }

    @Override
    public final Object call() {
        Bundle g7 = b10.g(1, "fatal");
        g7.putLong("timestamp", this.f52436a);
        this.f52437b.f52446k.b(g7);
        return null;
    }
}
