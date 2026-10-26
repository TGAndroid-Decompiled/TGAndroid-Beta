package t9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class k implements Executor {
    public static final k f48755a;
    public static final Handler f48756b;
    public static final k[] f48757c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f48755a = r02;
        f48757c = new k[]{r02};
        f48756b = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f48757c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f48756b.post(runnable);
    }
}
