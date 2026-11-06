package u4;

import android.view.Choreographer;
import bg.y;
public abstract class e {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new y(runnable, 1));
    }
}
