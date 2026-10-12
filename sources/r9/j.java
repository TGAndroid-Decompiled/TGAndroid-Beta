package r9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class j implements Executor {
    public static final j f47338a;
    public static final Handler f47339b;
    public static final j[] f47340c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f47338a = r02;
        f47340c = new j[]{r02};
        f47339b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f47340c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f47339b.post(runnable);
    }
}
