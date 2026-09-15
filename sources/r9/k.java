package r9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class k implements Executor {
    public static final k f42173a;
    public static final Handler f42174b;
    public static final k[] f42175c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f42173a = r02;
        f42175c = new k[]{r02};
        f42174b = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f42175c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f42174b.post(runnable);
    }
}
