package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
public final class r {
    public final q f54228a;

    public r(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f54228a = new p(nestedScrollView);
        } else {
            this.f54228a = new pb.b(22);
        }
    }
}
