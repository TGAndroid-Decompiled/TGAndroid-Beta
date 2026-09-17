package r9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class k implements Executor {
    public static final k f45087a;
    public static final Handler f45088b;
    public static final k[] f45089c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f45087a = r02;
        f45089c = new k[]{r02};
        f45088b = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f45089c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f45088b.post(runnable);
    }
}
