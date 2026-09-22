package r9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class k implements Executor {
    public static final k f42169a;
    public static final Handler f42170b;
    public static final k[] f42171c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f42169a = r02;
        f42171c = new k[]{r02};
        f42170b = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f42171c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f42170b.post(runnable);
    }
}
