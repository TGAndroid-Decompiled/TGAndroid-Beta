package r4;

import ag.d0;
import android.view.Choreographer;
public abstract class e {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new d0(runnable, 1));
    }
}
