package r9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class j implements Executor {
    public static final j f42562a;
    public static final Handler f42563b;
    public static final j[] f42564c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f42562a = r02;
        f42564c = new j[]{r02};
        f42563b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f42564c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f42563b.post(runnable);
    }
}
