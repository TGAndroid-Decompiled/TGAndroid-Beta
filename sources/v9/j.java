package v9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class j implements Executor {
    public static final j f57187a;
    public static final Handler f57188b;
    public static final j[] f57189c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f57187a = r02;
        f57189c = new j[]{r02};
        f57188b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f57189c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f57188b.post(runnable);
    }
}
