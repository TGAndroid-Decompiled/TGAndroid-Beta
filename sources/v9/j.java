package v9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class j implements Executor {
    public static final j f57280a;
    public static final Handler f57281b;
    public static final j[] f57282c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f57280a = r02;
        f57282c = new j[]{r02};
        f57281b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f57282c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f57281b.post(runnable);
    }
}
