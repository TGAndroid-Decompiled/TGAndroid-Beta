package v9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class j implements Executor {
    public static final j f57288a;
    public static final Handler f57289b;
    public static final j[] f57290c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f57288a = r02;
        f57290c = new j[]{r02};
        f57289b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f57290c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f57289b.post(runnable);
    }
}
