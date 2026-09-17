package r9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class k implements Executor {
    public static final k f45059a;
    public static final Handler f45060b;
    public static final k[] f45061c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f45059a = r02;
        f45061c = new k[]{r02};
        f45060b = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f45061c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f45060b.post(runnable);
    }
}
