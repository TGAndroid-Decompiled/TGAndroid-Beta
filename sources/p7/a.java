package p7;

import android.os.Handler;
import android.os.Looper;
public final class a extends Handler {
    public a(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}
