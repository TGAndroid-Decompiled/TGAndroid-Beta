package s9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class l implements Executor {
    public static final l f45074a;
    public static final Handler f45075b;
    public static final l[] f45076c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f45074a = r02;
        f45076c = new l[]{r02};
        f45075b = new Handler(Looper.getMainLooper());
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f45076c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f45075b.post(runnable);
    }
}
