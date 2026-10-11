package r9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class j implements Executor {
    public static final j f47214a;
    public static final Handler f47215b;
    public static final j[] f47216c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f47214a = r02;
        f47216c = new j[]{r02};
        f47215b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f47216c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f47215b.post(runnable);
    }
}
