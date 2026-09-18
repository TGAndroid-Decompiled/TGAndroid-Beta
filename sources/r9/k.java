package r9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class k implements Executor {
    public static final k f42200a;
    public static final Handler f42201b;
    public static final k[] f42202c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f42200a = r02;
        f42202c = new k[]{r02};
        f42201b = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f42202c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f42201b.post(runnable);
    }
}
