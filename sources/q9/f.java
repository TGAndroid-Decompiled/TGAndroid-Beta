package q9;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
public final class f implements pa.b {
    public final int f40558a;

    public f(int i10) {
        this.f40558a = i10;
    }

    @Override
    public final Object get() {
        switch (this.f40558a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                return ExecutorsRegistrar.a();
            case 3:
                n nVar = ExecutorsRegistrar.f6034a;
                return new r9.f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new r9.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                n nVar2 = ExecutorsRegistrar.f6034a;
                return new r9.f(Executors.newCachedThreadPool(new r9.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            default:
                n nVar3 = ExecutorsRegistrar.f6034a;
                return Executors.newSingleThreadScheduledExecutor(new r9.a("Firebase Scheduler", 0, null));
        }
    }
}
