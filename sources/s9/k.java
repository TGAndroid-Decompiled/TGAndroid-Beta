package s9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class k implements Executor {
    public static final k f46191a;
    public static final Handler f46192b;
    public static final k[] f46193c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f46191a = r02;
        f46193c = new k[]{r02};
        f46192b = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f46193c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f46192b.post(runnable);
    }
}
