package r9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class j implements Executor {
    public static final j f42456a;
    public static final Handler f42457b;
    public static final j[] f42458c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f42456a = r02;
        f42458c = new j[]{r02};
        f42457b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f42458c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f42457b.post(runnable);
    }
}
