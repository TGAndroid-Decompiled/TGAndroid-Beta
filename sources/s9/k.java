package s9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class k implements Executor {
    public static final k f48130a;
    public static final Handler f48131b;
    public static final k[] f48132c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f48130a = r02;
        f48132c = new k[]{r02};
        f48131b = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f48132c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f48131b.post(runnable);
    }
}
