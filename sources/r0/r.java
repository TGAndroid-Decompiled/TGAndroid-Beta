package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
public final class r {
    public final q f46156a;

    public r(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f46156a = new p(nestedScrollView);
        } else {
            this.f46156a = new jb.b(18);
        }
    }
}
