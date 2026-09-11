package r9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class k implements Executor {
    public static final k f45058a;
    public static final Handler f45059b;
    public static final k[] f45060c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f45058a = r02;
        f45060c = new k[]{r02};
        f45059b = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f45060c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f45059b.post(runnable);
    }
}
