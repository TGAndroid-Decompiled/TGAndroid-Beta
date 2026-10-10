package r9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class j implements Executor {
    public static final j f47168a;
    public static final Handler f47169b;
    public static final j[] f47170c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f47168a = r02;
        f47170c = new j[]{r02};
        f47169b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f47170c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f47169b.post(runnable);
    }
}
