package r9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class j implements Executor {
    public static final j f41389a;
    public static final Handler f41390b;
    public static final j[] f41391c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f41389a = r02;
        f41391c = new j[]{r02};
        f41390b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f41391c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f41390b.post(runnable);
    }
}
