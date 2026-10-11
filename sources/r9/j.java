package r9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class j implements Executor {
    public static final j f47248a;
    public static final Handler f47249b;
    public static final j[] f47250c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f47248a = r02;
        f47250c = new j[]{r02};
        f47249b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f47250c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f47249b.post(runnable);
    }
}
