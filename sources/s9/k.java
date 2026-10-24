package s9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class k implements Executor {
    public static final k f46575a;
    public static final Handler f46576b;
    public static final k[] f46577c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f46575a = r02;
        f46577c = new k[]{r02};
        f46576b = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f46577c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f46576b.post(runnable);
    }
}
