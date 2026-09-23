package r9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class j implements Executor {
    public static final j f42124a;
    public static final Handler f42125b;
    public static final j[] f42126c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f42124a = r02;
        f42126c = new j[]{r02};
        f42125b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f42126c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f42125b.post(runnable);
    }
}
