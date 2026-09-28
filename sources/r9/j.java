package r9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class j implements Executor {
    public static final j f42458a;
    public static final Handler f42459b;
    public static final j[] f42460c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f42458a = r02;
        f42460c = new j[]{r02};
        f42459b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f42460c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f42459b.post(runnable);
    }
}
