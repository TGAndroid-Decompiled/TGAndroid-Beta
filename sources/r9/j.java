package r9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class j implements Executor {
    public static final j f42443a;
    public static final Handler f42444b;
    public static final j[] f42445c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f42443a = r02;
        f42445c = new j[]{r02};
        f42444b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f42445c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f42444b.post(runnable);
    }
}
