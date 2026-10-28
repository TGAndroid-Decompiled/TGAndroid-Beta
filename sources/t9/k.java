package t9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class k implements Executor {
    public static final k f48790a;
    public static final Handler f48791b;
    public static final k[] f48792c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f48790a = r02;
        f48792c = new k[]{r02};
        f48791b = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f48792c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f48791b.post(runnable);
    }
}
