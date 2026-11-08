package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
public final class r {
    public final q f54216a;

    public r(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f54216a = new p(nestedScrollView);
        } else {
            this.f54216a = new pb.b(22);
        }
    }
}
