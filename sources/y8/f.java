package y8;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
public final class f implements x9.b {
    public final int f49630a;

    public f(int i9) {
        this.f49630a = i9;
    }

    @Override
    public final Object get() {
        switch (this.f49630a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                return ExecutorsRegistrar.a();
            case 3:
                n nVar = ExecutorsRegistrar.f4089a;
                return new z8.f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new z8.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                n nVar2 = ExecutorsRegistrar.f4089a;
                return new z8.f(Executors.newCachedThreadPool(new z8.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            default:
                n nVar3 = ExecutorsRegistrar.f4089a;
                return Executors.newSingleThreadScheduledExecutor(new z8.a("Firebase Scheduler", 0, null));
        }
    }
}
