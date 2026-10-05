package r9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class j implements Executor {
    public static final j f45972a;
    public static final Handler f45973b;
    public static final j[] f45974c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f45972a = r02;
        f45974c = new j[]{r02};
        f45973b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f45974c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f45973b.post(runnable);
    }
}
