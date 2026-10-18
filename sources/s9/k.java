package s9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class k implements Executor {
    public static final k f46143a;
    public static final Handler f46144b;
    public static final k[] f46145c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f46143a = r02;
        f46145c = new k[]{r02};
        f46144b = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f46145c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f46144b.post(runnable);
    }
}
