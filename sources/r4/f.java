package r4;

import android.view.Choreographer;
public abstract class f {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new e(runnable, 0));
    }
}
