package t9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class k implements Executor {
    public static final k f48752a;
    public static final Handler f48753b;
    public static final k[] f48754c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f48752a = r02;
        f48754c = new k[]{r02};
        f48753b = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f48754c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f48753b.post(runnable);
    }
}
