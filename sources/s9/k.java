package s9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class k implements Executor {
    public static final k f46150a;
    public static final Handler f46151b;
    public static final k[] f46152c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f46150a = r02;
        f46152c = new k[]{r02};
        f46151b = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f46152c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f46151b.post(runnable);
    }
}
