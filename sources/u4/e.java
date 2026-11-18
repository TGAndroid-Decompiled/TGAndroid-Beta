package u4;

import android.view.Choreographer;
import bg.z;
public abstract class e {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new z(runnable, 1));
    }
}
