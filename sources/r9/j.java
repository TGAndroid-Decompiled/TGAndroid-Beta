package r9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class j implements Executor {
    public static final j f45957a;
    public static final Handler f45958b;
    public static final j[] f45959c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f45957a = r02;
        f45959c = new j[]{r02};
        f45958b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f45959c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f45958b.post(runnable);
    }
}
