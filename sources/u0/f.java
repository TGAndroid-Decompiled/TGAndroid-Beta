package u0;

import androidx.core.widget.NestedScrollView;
public abstract class f {
    public static void a(NestedScrollView nestedScrollView, float f7) {
        try {
            nestedScrollView.setFrameContentVelocity(f7);
        } catch (LinkageError unused) {
        }
    }
}
