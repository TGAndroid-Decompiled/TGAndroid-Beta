package r9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class k implements Executor {
    public static final k f42195a;
    public static final Handler f42196b;
    public static final k[] f42197c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f42195a = r02;
        f42197c = new k[]{r02};
        f42196b = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f42197c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f42196b.post(runnable);
    }
}
