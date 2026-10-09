package r9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class j implements Executor {
    public static final j f47122a;
    public static final Handler f47123b;
    public static final j[] f47124c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f47122a = r02;
        f47124c = new j[]{r02};
        f47123b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f47124c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f47123b.post(runnable);
    }
}
