package s9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class k implements Executor {
    public static final k f48119a;
    public static final Handler f48120b;
    public static final k[] f48121c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f48119a = r02;
        f48121c = new k[]{r02};
        f48120b = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f48121c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f48120b.post(runnable);
    }
}
