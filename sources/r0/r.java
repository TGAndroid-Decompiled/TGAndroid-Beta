package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
public final class r {
    public final q f46145a;

    public r(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f46145a = new p(nestedScrollView);
        } else {
            this.f46145a = new jb.b(18);
        }
    }
}
