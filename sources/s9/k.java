package s9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class k implements Executor {
    public static final k f46154a;
    public static final Handler f46155b;
    public static final k[] f46156c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f46154a = r02;
        f46156c = new k[]{r02};
        f46155b = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f46156c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f46155b.post(runnable);
    }
}
