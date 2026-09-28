package r9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class j implements Executor {
    public static final j f42457a;
    public static final Handler f42458b;
    public static final j[] f42459c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f42457a = r02;
        f42459c = new j[]{r02};
        f42458b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f42459c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f42458b.post(runnable);
    }
}
