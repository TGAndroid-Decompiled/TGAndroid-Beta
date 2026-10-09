package r9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class j implements Executor {
    public static final j f47124a;
    public static final Handler f47125b;
    public static final j[] f47126c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f47124a = r02;
        f47126c = new j[]{r02};
        f47125b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f47126c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f47125b.post(runnable);
    }
}
