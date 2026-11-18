package v9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class j implements Executor {
    public static final j f59331a;
    public static final Handler f59332b;
    public static final j[] f59333c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f59331a = r02;
        f59333c = new j[]{r02};
        f59332b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f59333c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f59332b.post(runnable);
    }
}
