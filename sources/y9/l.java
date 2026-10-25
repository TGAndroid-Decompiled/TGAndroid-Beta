package y9;

import android.content.ComponentName;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;
public final class l implements SuccessContinuation {
    public final Object f52434a;
    public final Object f52435b;

    public l() {
        this.f52434a = new AtomicInteger();
        this.f52435b = new AtomicInteger();
    }

    @Override
    public Task then(Object obj) {
        return ((n) this.f52435b).e.G(new u4.f(1, this, (Boolean) obj));
    }

    public l(yf.b bVar, ComponentName componentName) {
        this.f52434a = bVar;
        this.f52435b = componentName;
    }

    public l(n nVar, Task task) {
        this.f52435b = nVar;
        this.f52434a = task;
    }
}
