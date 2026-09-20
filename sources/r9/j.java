package r9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class j implements Executor {
    public static final j f42471a;
    public static final Handler f42472b;
    public static final j[] f42473c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f42471a = r02;
        f42473c = new j[]{r02};
        f42472b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f42473c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f42472b.post(runnable);
    }
}
