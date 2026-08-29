package u0;

import androidx.core.widget.NestedScrollView;
public abstract class f {
    public static void a(NestedScrollView nestedScrollView, float f9) {
        try {
            nestedScrollView.setFrameContentVelocity(f9);
        } catch (LinkageError unused) {
        }
    }
}
