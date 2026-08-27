package u0;

import androidx.core.widget.NestedScrollView;

public abstract class f {
    public static void a(NestedScrollView nestedScrollView, float f10) {
        try {
            nestedScrollView.setFrameContentVelocity(f10);
        } catch (LinkageError unused) {
        }
    }
}
