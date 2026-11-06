package v9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class j implements Executor {
    public static final j f57188a;
    public static final Handler f57189b;
    public static final j[] f57190c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f57188a = r02;
        f57190c = new j[]{r02};
        f57189b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f57190c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f57189b.post(runnable);
    }
}
