package r9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class j implements Executor {
    public static final j f42492a;
    public static final Handler f42493b;
    public static final j[] f42494c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f42492a = r02;
        f42494c = new j[]{r02};
        f42493b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f42494c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f42493b.post(runnable);
    }
}
