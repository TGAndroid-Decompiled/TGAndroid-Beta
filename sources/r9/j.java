package r9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class j implements Executor {
    public static final j f45965a;
    public static final Handler f45966b;
    public static final j[] f45967c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f45965a = r02;
        f45967c = new j[]{r02};
        f45966b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f45967c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f45966b.post(runnable);
    }
}
