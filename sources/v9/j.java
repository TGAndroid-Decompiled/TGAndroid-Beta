package v9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class j implements Executor {
    public static final j f59369a;
    public static final Handler f59370b;
    public static final j[] f59371c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f59369a = r02;
        f59371c = new j[]{r02};
        f59370b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f59371c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f59370b.post(runnable);
    }
}
