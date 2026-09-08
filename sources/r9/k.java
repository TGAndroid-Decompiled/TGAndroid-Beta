package r9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class k implements Executor {
    public static final k f45086a;
    public static final Handler f45087b;
    public static final k[] f45088c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f45086a = r02;
        f45088c = new k[]{r02};
        f45087b = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f45088c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f45087b.post(runnable);
    }
}
