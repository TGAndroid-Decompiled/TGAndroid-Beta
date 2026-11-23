package v9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class k implements Executor {
    public static final k f59458a;
    public static final Handler f59459b;
    public static final k[] f59460c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f59458a = r02;
        f59460c = new k[]{r02};
        f59459b = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f59460c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f59459b.post(runnable);
    }
}
