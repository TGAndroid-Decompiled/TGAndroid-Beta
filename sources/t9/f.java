package t9;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.ui.Components.he0;
public final class f implements ta.b {
    public final int f55049a;

    public f(int i3) {
        this.f55049a = i3;
    }

    @Override
    public final Object get() {
        switch (this.f55049a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                return ExecutorsRegistrar.a();
            case 3:
                n nVar = ExecutorsRegistrar.f7932a;
                return new u9.g(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new u9.b("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                n nVar2 = ExecutorsRegistrar.f7932a;
                return new u9.g(Executors.newCachedThreadPool(new u9.b("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 5:
                n nVar3 = ExecutorsRegistrar.f7932a;
                return Executors.newSingleThreadScheduledExecutor(new u9.b("Firebase Scheduler", 0, null));
            default:
                he0 he0Var = FirebaseMessaging.f7941m;
                return null;
        }
    }
}
