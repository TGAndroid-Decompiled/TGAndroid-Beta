package s9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class k implements Executor {
    public static final k f46153a;
    public static final Handler f46154b;
    public static final k[] f46155c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f46153a = r02;
        f46155c = new k[]{r02};
        f46154b = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f46155c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f46154b.post(runnable);
    }
}
