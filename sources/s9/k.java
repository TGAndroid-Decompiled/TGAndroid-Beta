package s9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class k implements Executor {
    public static final k f46576a;
    public static final Handler f46577b;
    public static final k[] f46578c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f46576a = r02;
        f46578c = new k[]{r02};
        f46577b = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f46578c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f46577b.post(runnable);
    }
}
