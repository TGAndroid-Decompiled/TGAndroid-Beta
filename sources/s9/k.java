package s9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class k implements Executor {
    public static final k f46171a;
    public static final Handler f46172b;
    public static final k[] f46173c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f46171a = r02;
        f46173c = new k[]{r02};
        f46172b = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f46173c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f46172b.post(runnable);
    }
}
