package t4;

import android.view.Choreographer;
import cg.x;
public abstract class f {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new x(runnable, 1));
    }
}
