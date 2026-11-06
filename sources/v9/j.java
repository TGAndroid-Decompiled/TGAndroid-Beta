package v9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class j implements Executor {
    public static final j f57163a;
    public static final Handler f57164b;
    public static final j[] f57165c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f57163a = r02;
        f57165c = new j[]{r02};
        f57164b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f57165c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f57164b.post(runnable);
    }
}
