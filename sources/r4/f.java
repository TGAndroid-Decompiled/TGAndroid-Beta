package r4;

import android.os.Handler;
import android.os.Looper;
public abstract class f {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
