package r9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class j implements Executor {
    public static final j f42427a;
    public static final Handler f42428b;
    public static final j[] f42429c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f42427a = r02;
        f42429c = new j[]{r02};
        f42428b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f42429c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f42428b.post(runnable);
    }
}
