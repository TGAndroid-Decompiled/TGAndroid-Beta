package v9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class j implements Executor {
    public static final j f59336a;
    public static final Handler f59337b;
    public static final j[] f59338c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f59336a = r02;
        f59338c = new j[]{r02};
        f59337b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f59338c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f59337b.post(runnable);
    }
}
