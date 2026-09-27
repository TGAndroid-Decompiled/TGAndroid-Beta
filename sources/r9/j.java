package r9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class j implements Executor {
    public static final j f42502a;
    public static final Handler f42503b;
    public static final j[] f42504c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f42502a = r02;
        f42504c = new j[]{r02};
        f42503b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f42504c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f42503b.post(runnable);
    }
}
