package v9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class j implements Executor {
    public static final j f59373a;
    public static final Handler f59374b;
    public static final j[] f59375c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f59373a = r02;
        f59375c = new j[]{r02};
        f59374b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f59375c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f59374b.post(runnable);
    }
}
