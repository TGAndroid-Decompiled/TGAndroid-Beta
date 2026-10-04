package r9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class j implements Executor {
    public static final j f45958a;
    public static final Handler f45959b;
    public static final j[] f45960c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f45958a = r02;
        f45960c = new j[]{r02};
        f45959b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f45960c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f45959b.post(runnable);
    }
}
