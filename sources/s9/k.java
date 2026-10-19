package s9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class k implements Executor {
    public static final k f46145a;
    public static final Handler f46146b;
    public static final k[] f46147c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f46145a = r02;
        f46147c = new k[]{r02};
        f46146b = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f46147c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f46146b.post(runnable);
    }
}
