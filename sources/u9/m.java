package u9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f55776a;
    public static final Handler f55777b;
    public static final m[] f55778c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f55776a = r02;
        f55778c = new m[]{r02};
        f55777b = new Handler(Looper.getMainLooper());
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f55778c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f55777b.post(runnable);
    }
}
