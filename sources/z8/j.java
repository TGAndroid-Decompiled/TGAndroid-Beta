package z8;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class j implements Executor {
    public static final j f50384a;
    public static final Handler f50385b;
    public static final j[] f50386c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f50384a = r02;
        f50386c = new j[]{r02};
        f50385b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f50386c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f50385b.post(runnable);
    }
}
