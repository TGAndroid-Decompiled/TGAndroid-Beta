package r4;

import android.view.Choreographer;
public abstract class e {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new qf.b(runnable, 1));
    }
}
